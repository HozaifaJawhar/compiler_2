package Visitor;

import AST.ASTNode;
import AST.Program;
import java.util.*;
import java.util.stream.Collectors;
import AST.Statement.*;
import AST.Expression.*;
import AST.Types.*;
import AST.Declarations.*;
import AST.Properties.*;
import Helpers.CycleDetector;
import Semantic.*;
import SymbolTable.SymbolTableInfo;
import SymbolTable.SymbolTable;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import Helpers.ScopeManager;

public class AngularCompVisitor extends AngularParserBaseVisitor<Object>
{
    public SymbolTable s = new SymbolTable();
    public SemanticErrorReporter errorReporter = new SemanticErrorReporter();
    private final ScopeManager scopeManager = new ScopeManager();
    private final Map<String, List<String>> dependencyGraph = new HashMap<>();
    private final Set<String> importedIdentifiers = new HashSet<>();

    private String currentModule = null;

    // ====================== Utilities ======================

    private Object resolveVariableValue(String varName) {
        SymbolTableInfo info = s.getSymbolInfo(varName);
        if (info != null && info.getValue() != null) {
            try {
                return Integer.parseInt(info.getValue().toString());
            } catch (NumberFormatException ignored) {}
        }
        return null;
    }

    /** لا نستخدم أي getPrimaryType غير موجود */
    private String extractTypeNameSafe(TypeAnnotation typeAnn, String fallback) {
        if (typeAnn == null) return fallback;
        String str = String.valueOf(typeAnn);
        return (str != null && !str.isEmpty()) ? str : fallback;
    }

    // ====================== Program ======================

    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {
        // imports
        List<ImportStatement> importStatements = new ArrayList<>();
        for (AngularParser.ImportStatementContext importCtx : ctx.importStatement()) {
            importStatements.add((ImportStatement) visit(importCtx));
        }

        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine() + 1;

        if (!importedIdentifiers.contains("Component")) {
            errorReporter.report(new ComponentImportMissingError("ComponentImportMissingError", line, column));
        }

        // components
        List<ComponentDefinition> components = new ArrayList<>();
        for (AngularParser.ComponentDefinitionContext compCtx : ctx.componentDefinition()) {
            components.add((ComponentDefinition) visit(compCtx));
        }

        CycleDetector detector = new CycleDetector(dependencyGraph);
        if (detector.hasCycle()) {
            errorReporter.report(new CircularDependencyError());
        }

        return new Program(importStatements, components);
    }

    // ====================== Imports ======================

    @Override
    public Object visitImportStmt(AngularParser.ImportStmtContext ctx) {
        List<ImportItem> items = (List<ImportItem>) visit(ctx.importItems());
        String modulePath = (String) visit(ctx.modulePath());

        for (ImportItem item : items) {
            importedIdentifiers.add(item.getIdentifier());
        }

        if (currentModule != null) {
            List<String> importedModules = items.stream()
                    .map(ImportItem::getIdentifier)
                    .filter(id -> !id.equals(currentModule))
                    .collect(Collectors.toList());

            dependencyGraph.putIfAbsent(currentModule, new ArrayList<>());
            dependencyGraph.get(currentModule).addAll(importedModules);
        }

        return new ImportStatement(items, modulePath);
    }

    @Override
    public Object visitImportItemList(AngularParser.ImportItemListContext ctx) {
        List<ImportItem> items = new ArrayList<>();
        for (AngularParser.ImportItemContext itemCtx : ctx.importItem()) {
            items.add((ImportItem) visit(itemCtx));
        }
        return items;
    }

    @Override
    public Object visitImportName(AngularParser.ImportNameContext ctx) {
        return new ImportItem(ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitModulePathString(AngularParser.ModulePathStringContext ctx) {
        String textWithQuotes = ctx.STRING_LITERAL().getText();
        return textWithQuotes.substring(1, textWithQuotes.length() - 1);
    }

    // ====================== Component ======================

    @Override
    public Object visitComponentDef(AngularParser.ComponentDefContext ctx) {
        ComponentConfig config = (ComponentConfig) visit(ctx.componentConfig());
        ClassDeclaration classDeclaration = (ClassDeclaration) visit(ctx.classDeclaration());
        return new ComponentDefinition(config, classDeclaration);
    }

    @Override
    public Object visitComponentConfigObj(AngularParser.ComponentConfigObjContext ctx) {
        boolean hasTemplate = false;
        boolean hasSelector = false;

        List<ComponentProperty> properties = new ArrayList<>();

        for (AngularParser.ComponentPropertyContext propCtx : ctx.componentProperty()) {
            ComponentProperty property = (ComponentProperty) visit(propCtx);
            properties.add(property);

            if (property instanceof ImportsProperty) {
                s.addVariable("Imports", "ImportsProperty", ((ImportsProperty) property).getImports(), "Global");
            }
            if (property instanceof StandaloneProperty) {
                s.addVariable("Standalone", "StandaloneProperty", ((StandaloneProperty) property).getValue(), "Global");
            }
            if (property instanceof StylesProperty) {
                s.addVariable("Styles", "StylesProperty", new StylesProperty(((StylesProperty) property).getStyles()), "Global");
            }
            if (property instanceof SelectorProperty) {
                hasSelector = true;
                s.addVariable("Selector", "SelectorProperty", ((SelectorProperty) property).getValue(), "Global");
            }
            if (property instanceof TemplateProperty) {
                hasTemplate = true;
                s.addVariable("Template", "TemplateProperty", new TemplateProperty(((TemplateProperty) property).getTemplate()), "Global");
            }
        }

        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        if (!hasSelector) {
            errorReporter.report(new MissingComponentPropertyError("Selector", line, column));
        }
        if (!hasTemplate) {
            errorReporter.report(new MissingComponentPropertyError("Template", line, column));
        }

        return new ComponentConfig(properties);
    }

    @Override
    public Object visitSelectorProp(AngularParser.SelectorPropContext ctx) {
        String raw = ctx.STRING_LITERAL().getText();
        return new SelectorProperty(raw.substring(1, raw.length() - 1));
    }

    @Override
    public Object visitStandaloneProp(AngularParser.StandalonePropContext ctx) {
        boolean value = Boolean.parseBoolean(ctx.booleanLiteral().getText());
        return new StandaloneProperty(value);
    }

    @Override
    public Object visitImportsProp(AngularParser.ImportsPropContext ctx) {
        List<ASTNode> importsList = (List<ASTNode>) visit(ctx.arrayLiteral());
        return new ImportsProperty(importsList);
    }

    @Override
    public Object visitTemplateProp(AngularParser.TemplatePropContext ctx) {
        String raw = ctx.BACKTICK_LITERAL().getText();
        return new TemplateProperty(raw.substring(1, raw.length() - 1));
    }

    @Override
    public Object visitStylesProp(AngularParser.StylesPropContext ctx) {
        List<String> stylesList = (List<String>) visit(ctx.arrayLiteral());
        return new StylesProperty(stylesList);
    }

    // ====================== Array literal items ======================

    @Override
    public Object visitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx) {
        List<Object> items = new ArrayList<>();
        if (ctx.arrayItem() != null) {
            for (AngularParser.ArrayItemContext itemCtx : ctx.arrayItem()) {
                items.add(visit(itemCtx));
            }
        }
        return items;
    }

    @Override
    public Object visitTemplateItem(AngularParser.TemplateItemContext ctx) {
        String raw = ctx.BACKTICK_LITERAL().getText();
        return raw.substring(1, raw.length() - 1);
    }

    @Override
    public Object visitStringItem(AngularParser.StringItemContext ctx) {
        String raw = ctx.STRING_LITERAL().getText();
        return raw.substring(1, raw.length() - 1);
    }

    @Override
    public Object visitIdentifierItem(AngularParser.IdentifierItemContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public Object visitObjectItem(AngularParser.ObjectItemContext ctx) {
        return visit(ctx.objectLiteral());
    }

    // ====================== Class ======================

    @Override
    public Object visitClassDecl(AngularParser.ClassDeclContext ctx) {
        boolean isExported = ctx.EXPORT() != null;
        String className = ctx.IDENTIFIER().getText();

        currentModule = className;
        dependencyGraph.putIfAbsent(currentModule, new ArrayList<>());

        scopeManager.enterScope(className);
        ClassBody classBody = (ClassBody) visit(ctx.classBody());
        scopeManager.exitScope();

        s.addVariable(className, "Class", " ", "Global");
        return new ClassDeclaration(isExported, className, classBody);
    }

    @Override
    public Object visitClassBodyMembers(AngularParser.ClassBodyMembersContext ctx) {
        List<ClassMember> members = new ArrayList<>();

        for (AngularParser.ClassMemberContext memberCtx : ctx.classMember()) {
            ClassMember member = (ClassMember) visit(memberCtx);
            int line = memberCtx.start.getLine();
            int column = memberCtx.start.getCharPositionInLine();

            if (member instanceof MethodDeclaration) {
                MethodDeclaration method = (MethodDeclaration) member;
                String methodName = method.getMethodName();

                if (s.getValue(methodName) != null) {
                    SymbolTableInfo info = s.getSymbolInfo(methodName);
                    if (info != null && info.getScope().equals(scopeManager.getCurrentScope())) {
                        errorReporter.report(new DuplicateDeclarationError(methodName, line, column));
                    }
                } else {
                    s.addVariable(methodName, "Method", null, scopeManager.getCurrentScope());
                }
            } else if (member instanceof FieldDeclaration) {
                FieldDeclaration field = (FieldDeclaration) member;
                String fieldName = field.getName();

                if (s.getValue(fieldName) != null) {
                    errorReporter.report(new DuplicateDeclarationError(fieldName, line, column));
                } else {
                    String fieldType = extractTypeNameSafe(field.getType(), "any");
                    s.addVariable(fieldName, fieldType, field.getInitializer(), scopeManager.getCurrentScope());
                }
            }
            members.add(member);
        }
        return new ClassBody(members);
    }

    @Override
    public Object visitFieldMember(AngularParser.FieldMemberContext ctx) {
        return visit(ctx.fieldDeclaration());
    }

    @Override
    public Object visitMethodMember(AngularParser.MethodMemberContext ctx) {
        return visit(ctx.methodDeclaration());
    }

    @Override
    public Object visitFieldDecl(AngularParser.FieldDeclContext ctx) {
        String name = ctx.IDENTIFIER().getText();

        TypeAnnotation type = null;
        if (ctx.typeAnnotation() != null) {
            type = (TypeAnnotation) visit(ctx.typeAnnotation());
        }

        Expression initializer = null;
        if (ctx.expression() != null) {
            initializer = (Expression) visit(ctx.expression());
        }

        if (currentModule != null && type != null) {
            String fieldTypeName = extractTypeNameSafe(type, null);
            if (fieldTypeName != null && fieldTypeName.equals(currentModule)) {
                dependencyGraph.putIfAbsent(currentModule, new ArrayList<>());
                List<String> deps = dependencyGraph.get(currentModule);
                if (!deps.contains(fieldTypeName)) {
                    deps.add(fieldTypeName);
                }
            }
        }

        return new FieldDeclaration(name, type, initializer);
    }

    @Override
    public Object visitMethodDecl(AngularParser.MethodDeclContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        scopeManager.enterScope(methodName);

        List<Parameter> parameters = new ArrayList<>();
        if (ctx.parameterList() != null) {
            parameters = (List<Parameter>) visit(ctx.parameterList());
        }

        TypeAnnotation returnType = null;
        if (ctx.typeAnnotation() != null) {
            returnType = (TypeAnnotation) visit(ctx.typeAnnotation());
        }

        BlockStatement block = (BlockStatement) visit(ctx.block());
        scopeManager.exitScope();

        return new MethodDeclaration(methodName, returnType, block, parameters);
    }

    @Override
    public Object visitParamList(AngularParser.ParamListContext ctx) {
        List<Parameter> parameters = new ArrayList<>();
        for (AngularParser.ParameterContext p : ctx.parameter()) {
            parameters.add((Parameter) visit(p));
        }
        return parameters;
    }

    @Override
    public Object visitParam(AngularParser.ParamContext ctx) {
        String paramName = ctx.IDENTIFIER().getText();
        TypeAnnotation type = (TypeAnnotation) visit(ctx.typeAnnotation());

        String typeName = "Parameter";
        if (ctx.typeAnnotation() != null) {
            typeName = ctx.typeAnnotation().getText();
        }

        if (s.getValue(paramName) == null) {
            s.addVariable(paramName, "Parameter", typeName, scopeManager.getCurrentScope());
        }

        return new Parameter(paramName, type);
    }

    // ====================== Types ======================

    // typeAnnotation : typeExpr (LBRACKET RBRACKET)? #typeAnnotated ;
    @Override
    public Object visitTypeAnnotated(antlr.AngularParser.TypeAnnotatedContext ctx) {
        boolean isArray = ctx.LBRACKET() != null && ctx.RBRACKET() != null;
        // سنبني TypeAnnotation من typeExpr
        TypeAnnotation ann = (TypeAnnotation) visit(ctx.typeExpr());
        // ann هنا يحمل terms فقط بدون isArray — نُضيف العلم isArray ونُعيد نسخة جديدة
        return TypeAnnotation.union(ann.getTerms(), isArray);
    }

    // typeExpr : typeTerm (PIPE typeTerm)* ;
    @Override
    public Object visitTypeExpr(antlr.AngularParser.TypeExprContext ctx) {
        List<String> terms = new ArrayList<>();
        int n = ctx.typeTerm().size();
        for (int i = 0; i < n; i++) {
            // نأخذ النص الأصلي لكل term كما هو من القواعد (يحافظ على علامات الاقتباس لأنواع string literal)
            String termTs = ctx.typeTerm(i).getText().trim();
            terms.add(termTs);
        }
        // لا نحدد الـ array هنا — يتم في visitTypeAnnotated أعلاه
        return TypeAnnotation.union(terms, false);
    }

    // typeTerm : typePrimary | STRING_LITERAL ;
    @Override
    public Object visitTypeTerm(antlr.AngularParser.TypeTermContext ctx) {
        // هذه الدالة لن تُستدعى الآن لأننا بنينا الـ terms نصيًا في visitTypeExpr
        // ولكن نتركها آمنة لو استُدعيت.
        if (ctx.STRING_LITERAL() != null) {
            return TypeAnnotation.single(ctx.STRING_LITERAL().getText().trim(), false);
        }
        // لو عندك typePrimary → نسترجع نصه:
        if (ctx.typePrimary() != null) {
            String raw = ctx.typePrimary().getText().trim();
            return TypeAnnotation.single(raw, false);
        }
        return TypeAnnotation.single("", false);
    }

    @Override
    public Object visitTypeIdent(AngularParser.TypeIdentContext ctx) {
        return new IdentifierType(ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitTypeAny(AngularParser.TypeAnyContext ctx) {
        return new IdentifierType("any");
    }

    @Override
    public Object visitInlineObj(AngularParser.InlineObjContext ctx) {
        List<ObjectTypeMember> members = ctx.objectTypeMember().stream()
                .map(c -> (ObjectTypeMember) visit(c))
                .collect(Collectors.toList());
        return new InlineObjectType(members);
    }

    @Override
    public Object visitObjectTypeMemberRule(AngularParser.ObjectTypeMemberRuleContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        TypeAnnotation type = (TypeAnnotation) visit(ctx.typeAnnotation());
        return new ObjectTypeMember(name, type);
    }

    // ====================== Statements / Block ======================

    @Override
    public Object visitCodeBlock(AngularParser.CodeBlockContext ctx) {
        List<Statement> statements = ctx.statement().stream()
                .map(st -> (Statement) visit(st))
                .collect(Collectors.toList());
        return new BlockStatement(statements);
    }

    @Override
    public Object visitVarDeclStmt(AngularParser.VarDeclStmtContext ctx) { return visit(ctx.variableDeclaration()); }

    @Override
    public Object visitExprStmt(AngularParser.ExprStmtContext ctx) { return visit(ctx.expressionStatement()); }

    @Override
    public Object visitReturnStmt(AngularParser.ReturnStmtContext ctx) { return visit(ctx.returnStatement()); }

    @Override
    public Object visitIfStmt(AngularParser.IfStmtContext ctx) { return visit(ctx.ifStatement()); }

    @Override
    public Object visitForStmt(AngularParser.ForStmtContext ctx) { return visit(ctx.forStatement()); }

    @Override
    public Object visitWhileStmt(AngularParser.WhileStmtContext ctx) { return visit(ctx.whileStatement()); }

    @Override
    public Object visitBlockStmt(AngularParser.BlockStmtContext ctx) { return visit(ctx.block()); }

    @Override
    public Object visitEmptyStmt(AngularParser.EmptyStmtContext ctx) { return new EmptyStatement(); }

    @Override
    public Object visitVarDecl(AngularParser.VarDeclContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        int line = ctx.IDENTIFIER().getSymbol().getLine();
        int column = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        String typeString = "any";
        TypeAnnotation typeAnnotation = null;
        if (ctx.typeAnnotation() != null) {
            typeAnnotation = (TypeAnnotation) visit(ctx.typeAnnotation());
            typeString = ctx.typeAnnotation().getText();
        }

        Expression initializer = null;
        String valueString = null;
        if (ctx.expression() != null) {
            initializer = (Expression) visit(ctx.expression());
            valueString = ctx.expression().getText();
        }

        if (s.getValue(varName) != null) {
            errorReporter.report(new DuplicateDeclarationError(varName, line, column));
        } else {
            s.addVariable(varName, typeString, valueString, scopeManager.getCurrentScope());
        }

        return new VariableDeclarationStatement(varName, typeAnnotation, initializer);
    }

    // ====================== Expressions ======================

    @Override
    public Object visitExprStatement(AngularParser.ExprStatementContext ctx) {
        return new ExpressionStatement((Expression) visit(ctx.expression()));
    }

    @Override
    public Object visitReturnStatementExpr(AngularParser.ReturnStatementExprContext ctx) {
        Expression expr = (ctx.expression() != null) ? (Expression) visit(ctx.expression()) : null;
        return new ReturnStatement(expr);
    }

    @Override
    public Object visitIfElseStmt(AngularParser.IfElseStmtContext ctx) {
        Expression condition = (Expression) visit(ctx.expression());

        scopeManager.enterScope("if");
        BlockStatement thenBranch = (BlockStatement) visit(ctx.statement(0));
        scopeManager.exitScope();

        BlockStatement elseBranch = null;
        if (ctx.statement().size() > 1) {
            scopeManager.enterScope("else");
            elseBranch = (BlockStatement) visit(ctx.statement(1));
            scopeManager.exitScope();
        }

        return new IfStatement(condition, thenBranch, elseBranch);
    }

    @Override
    public Object visitForLoop(AngularParser.ForLoopContext ctx) {
        scopeManager.enterScope("for");
        Statement init = (Statement) visit(ctx.forInit());
        Expression condition = ctx.expression() != null ? (Expression) visit((ParseTree) ctx.expression()) : null;
        Expression update = ctx.expression(1) != null ? (Expression) visit(ctx.expression(1)) : null;
        Statement body = (Statement) visit(ctx.statement());
        scopeManager.exitScope();
        return new ForStatement(init, condition, update, body);
    }

    @Override
    public Object visitForVarInit(AngularParser.ForVarInitContext ctx) { return visit(ctx.variableDeclaration()); }

    @Override
    public Object visitForExprInit(AngularParser.ForExprInitContext ctx) { return visit(ctx.expression()); }

    @Override
    public Object visitEmptyForInit(AngularParser.EmptyForInitContext ctx) { return null; }

    @Override
    public Object visitWhileLoop(AngularParser.WhileLoopContext ctx) {
        scopeManager.enterScope("while");
        Expression condition = (Expression) visit(ctx.expression());
        Statement body = (Statement) visit(ctx.statement());
        scopeManager.exitScope();
        return new WhileStatement(condition, body);
    }

    @Override
    public Object visitExprAssignment(AngularParser.ExprAssignmentContext ctx) { return visit(ctx.assignmentExpression()); }

    @Override
    public Object visitAssignExpr(AngularParser.AssignExprContext ctx) {
        Expression left = (Expression) visit(ctx.conditionalExpression());
        if (ctx.EQUALS() != null) {
            Expression right = (Expression) visit(ctx.assignmentExpression());
            return new BinaryExpression(left, "=", right);
        }
        return left;
    }

    @Override
    public Object visitCondExpr(AngularParser.CondExprContext ctx) {
        Expression condition = (Expression) visit(ctx.logicalOrExpression());
        if (ctx.QUESTION() != null) {
            Expression t = (Expression) visit(ctx.expression(0));
            Expression f = (Expression) visit(ctx.expression(1));
            return new ConditionalExpression(condition, t, f);
        }
        return condition;
    }

    @Override
    public Object visitLogicalOrExpr(AngularParser.LogicalOrExprContext ctx) {
        Expression left = (Expression) visit(ctx.logicalAndExpression(0));
        if (ctx.logicalAndExpression().size() == 1) return left;

        Expression result = left;
        for (int i = 1; i < ctx.logicalAndExpression().size(); i++) {
            Expression right = (Expression) visit(ctx.logicalAndExpression(i));
            result = new BinaryExpression(result, "||", right);
        }
        return result;
    }

    @Override
    public Object visitLogicalAndExpr(AngularParser.LogicalAndExprContext ctx) {
        Expression left = (Expression) visit(ctx.equalityExpression(0));
        for (int i = 1; i < ctx.equalityExpression().size(); i++) {
            Expression right = (Expression) visit(ctx.equalityExpression(i));
            left = new BinaryExpression(left, "&&", right);
        }
        return left;
    }

    @Override
    public Object visitEqualityExpr(AngularParser.EqualityExprContext ctx) {
        Expression left = (Expression) visit(ctx.relationalExpression(0));
        for (int i = 1; i < ctx.relationalExpression().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.relationalExpression(i));
            left = new BinaryExpression(left, op, right);
        }
        return left;
    }

    @Override
    public Object visitRelationalExpr(AngularParser.RelationalExprContext ctx) {
        Expression left = (Expression) visit(ctx.additiveExpression(0));
        for (int i = 1; i < ctx.additiveExpression().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            Expression right = (Expression) visit(ctx.additiveExpression(i));
            left = new BinaryExpression(left, op, right);
        }
        return left;
    }

    @Override
    public Object visitAddExpr(AngularParser.AddExprContext ctx) {
        Expression left = (Expression) visit(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            Expression right = (Expression) visit(ctx.multiplicativeExpression(i));
            String op = ctx.getChild(2 * i - 1).getText();
            left = new BinaryExpression(left, op, right);
        }
        return left;
    }

    @Override
    public Object visitMultExpr(AngularParser.MultExprContext ctx) {
        Expression left = (Expression) visit(ctx.unaryExpression(0));
        for (int i = 1; i < ctx.unaryExpression().size(); i++) {
            Expression right = (Expression) visit(ctx.unaryExpression(i));
            String op = ctx.getChild(2 * i - 1).getText();

            if (op.equals("/") || op.equals("%")) {
                Object value = null;

                if (right instanceof LiteralExpression) {
                    value = ((LiteralExpression) right).getValue();
                } else if (right instanceof IdentifierExpression) {
                    String varName = ((IdentifierExpression) right).getName();
                    value = resolveVariableValue(varName);
                } else if (right instanceof PostfixExpression post
                        && post.getParts().isEmpty()
                        && post.getBase() instanceof IdentifierExpression) {
                    String varName = ((IdentifierExpression) post.getBase()).getName();
                    value = resolveVariableValue(varName);
                }

                if (value instanceof Integer && ((Integer) value) == 0) {
                    int l = ctx.unaryExpression(i).getStart().getLine();
                    int c = ctx.unaryExpression(i).getStart().getCharPositionInLine();
                    errorReporter.report(new DivisionByZeroError(op, l, c));
                }
            }

            left = new BinaryExpression(left, op, right);
        }
        return left;
    }

    @Override
    public Object visitUnaryExpr(AngularParser.UnaryExprContext ctx) {
        if (ctx.postfixExpression() != null) {
            Expression expr = (Expression) visit(ctx.postfixExpression());
            if (ctx.NOT() != null) return new UnaryExpression("!", expr);
            if (ctx.MINUS() != null) return new UnaryExpression("-", expr);
            return expr;
        }
        return super.visitUnaryExpr(ctx);
    }

    @Override
    public Object visitPostfixExpr(antlr.AngularParser.PostfixExprContext ctx) {
        AST.Expression.Expression base = (AST.Expression.Expression) visit(ctx.primaryExpression());

        java.util.List<AST.Expression.PostfixPart> parts = new java.util.ArrayList<>();
        for (antlr.AngularParser.PostfixPartContext partCtx : ctx.postfixPart()) {
            Object v = visit(partCtx);
            if (v instanceof AST.Expression.PostfixPart p) {
                parts.add(p);
            } else {
                // fallback آمن: لا تدخل null إلى القائمة
                parts.add(new AST.Expression.PostfixUnknown(partCtx.getText()));
            }
        }
        return new AST.Expression.PostfixExpression(base, parts);
    }


    @Override
    public Object visitFuncCall(antlr.AngularParser.FunctCallContext ctx) {
        java.util.List<AST.Expression.Expression> args = new java.util.ArrayList<>();
        if (ctx.expression() != null) {
            for (var e : ctx.expression()) {
                args.add((AST.Expression.Expression) visit(e));
            }
        }
        return new AST.Expression.FunctionCallPostfix(args);
    }

    @Override
    public Object visitPropertyAccessing(antlr.AngularParser.PropertyAccessingContext ctx) {
        String propertyName = ctx.IDENTIFIER().getText();
        return new AST.Expression.PropertyAccess(propertyName);
    }

    @Override
    public Object visitPostfixInc(antlr.AngularParser.PostfixIncContext ctx) {
        return new AST.Expression.PostfixIncrement();
    }

    @Override
    public Object visitLiteralExpr(AngularParser.LiteralExprContext ctx) { return visit(ctx.literal()); }

    @Override
    public Object visitThisExpr(AngularParser.ThisExprContext ctx) { return new ThisExpression(); }

    // ====================== Break ======================

    @Override
    public Object visitBreakStmt(AngularParser.BreakStmtContext ctx) { return visit(ctx.breakStatement()); }

    @Override
    public Object visitBreakStatement(AngularParser.BreakStatementContext ctx) { return new BreakStatement(); }

    // ====================== Identifiers / new / arrow / objects / arrays ======================

    @Override
    public Object visitIdentifierExpr(AngularParser.IdentifierExprContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        int line = ctx.IDENTIFIER().getSymbol().getLine();
        int column = ctx.IDENTIFIER().getSymbol().getCharPositionInLine();

        SymbolTableInfo obj = s.getSymbolInfo(varName);
        if (obj == null) {
            errorReporter.report(new UndeclaredVariableError(varName, line, column));
        } else if (!obj.getScope().equals(scopeManager.getCurrentScope())
                && !obj.getScope().equals("Global")
                && !obj.getType().equals("Method")) {
            errorReporter.report(new UndeclaredVariableError(varName, line, column));
        }

        return new IdentifierExpression(varName);
    }

    @Override
    public Object visitGroupedExpr(AngularParser.GroupedExprContext ctx) { return visit(ctx.expression()); }

    @Override
    public Object visitNewExpr(AngularParser.NewExprContext ctx) { return visit(ctx.newExpression()); }

    @Override
    public Object visitArrowFuncExpr(AngularParser.ArrowFuncExprContext ctx) { return visit(ctx.arrowFunction()); }

    @Override
    public Object visitObjectExpr(AngularParser.ObjectExprContext ctx) { return visit(ctx.objectLiteral()); }

    @Override
    public Object visitArrayExpr(AngularParser.ArrayExprContext ctx) {
        // ارجع دائمًا Expression حتى لا يحصل ClassCast لاحقًا
        List<Object> items = (List<Object>) visit(ctx.arrayLiteral());
        if (items == null || items.isEmpty()) return new LiteralExpression("[]");
        return new LiteralExpression("<array>");
    }

    @Override
    public Object visitNewCallExpr(AngularParser.NewCallExprContext ctx) {
        QualifiedName qn = visitQualifiedNameExpr((AngularParser.QualifiedNameExprContext) ctx.qualifiedName());
        String className = qn.toString();

        List<Expression> args = new ArrayList<>();
        if (ctx.expression() != null) {
            for (AngularParser.ExpressionContext e : ctx.expression()) {
                args.add((Expression) visit(e));
            }
        }
        return new NewExpression(className, args);
    }

    @Override
    public Object visitArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx) {
        List<String> params = new ArrayList<>();
        if (ctx.arrowParams() != null) {
            for (ParseTree child : ctx.arrowParams().children) {
                if (child instanceof TerminalNode node &&
                        node.getSymbol().getType() == AngularParser.IDENTIFIER) {
                    params.add(node.getText());
                }
            }
        }
        Expression body = (Expression) visit(ctx.expression());
        return new ArrowFunctionExpression(params, body);
    }

    @Override
    public Object visitArrowParamsList(AngularParser.ArrowParamsListContext ctx) {
        List<String> params = new ArrayList<>();
        for (TerminalNode id : ctx.IDENTIFIER()) params.add(id.getText());
        return params;
    }

    // ====================== Object literal ======================

    @Override
    public Object visitObjLiteral(AngularParser.ObjLiteralContext ctx)
    {
        // Grammar: objectLiteral : LBRACE (objectElement (COMMA objectElement)*)? RBRACE ;
        // ✅ وفق الـ AST: ObjectExpression(List<ObjectExpression.Element>)
        List<ObjectExpression.Element> elements = new ArrayList<>();

        if (ctx.objectElement() != null) {
            for (AngularParser.ObjectElementContext elCtx : ctx.objectElement()) {
                if (elCtx instanceof AngularParser.KeyValContext) {
                    AngularParser.KeyValueContext kv = ((AngularParser.KeyValContext) elCtx).keyValue();
                    if (kv instanceof AngularParser.KeyValuePairContext) {
                        AngularParser.KeyValuePairContext pair = (AngularParser.KeyValuePairContext) kv;
                        String key = pair.IDENTIFIER().getText();
                        Expression value = (Expression) visit(pair.expression());
                        ObjectProperty prop = new ObjectProperty(key, value);
                        elements.add(new ObjectExpression.PropertyElement(prop));
                    }
                } else if (elCtx instanceof AngularParser.SpreadElemContext) {
                    // إن كان عندك SpreadElement في ObjectExpression يمكنك تفعيله:
                    // Expression spreadExpr = (Expression) visit(((AngularParser.SpreadElemContext) elCtx).expression());
                    // elements.add(new ObjectExpression.SpreadElement(spreadExpr));
                }
            }
        }

        return new ObjectExpression(elements);
    }

    @Override
    public Object visitKeyValuePair(AngularParser.KeyValuePairContext ctx) {
        String key = ctx.IDENTIFIER().getText();
        Expression value = (Expression) visit(ctx.expression());
        return new ObjectProperty(key, value);
    }

    // ====================== Literals & QualifiedName ======================

    @Override
    public Object visitStringLiteral(AngularParser.StringLiteralContext ctx) {
        String raw = ctx.STRING_LITERAL().getText();
        return new LiteralExpression(raw.substring(1, raw.length() - 1));
    }

    @Override
    public Object visitTemplateLiteral(AngularParser.TemplateLiteralContext ctx) {
        String raw = ctx.BACKTICK_LITERAL().getText();
        return new LiteralExpression(raw.substring(1, raw.length() - 1));
    }

    @Override
    public Object visitNumberLiteral(AngularParser.NumberLiteralContext ctx) {
        return new LiteralExpression(ctx.NUMBER().getText());
    }

    @Override
    public Object visitBoolLiteral(AngularParser.BoolLiteralContext ctx) { return visit(ctx.booleanLiteral()); }

    @Override
    public Object visitTrueLiteral(AngularParser.TrueLiteralContext ctx) { return new BooleanLiteral(true); }

    @Override
    public Object visitFalseLiteral(AngularParser.FalseLiteralContext ctx) { return new BooleanLiteral(false); }

    @Override
    public QualifiedName visitQualifiedNameExpr(AngularParser.QualifiedNameExprContext ctx) {
        List<String> parts = new ArrayList<>();
        for (TerminalNode id : ctx.IDENTIFIER()) parts.add(id.getText());
        return new QualifiedName(parts);
    }
}

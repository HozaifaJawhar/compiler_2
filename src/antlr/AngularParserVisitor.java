// Generated from C:/Users/pc/IdeaProjects/AngularCompiler/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importStmt}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(AngularParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importItemList}
	 * labeled alternative in {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItemList(AngularParser.ImportItemListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importName}
	 * labeled alternative in {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(AngularParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulePathString}
	 * labeled alternative in {@link AngularParser#modulePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulePathString(AngularParser.ModulePathStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentDef}
	 * labeled alternative in {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentConfigObj}
	 * labeled alternative in {@link AngularParser#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfigObj(AngularParser.ComponentConfigObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectorProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorProp(AngularParser.SelectorPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code standaloneProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProp(AngularParser.StandalonePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importsProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProp(AngularParser.ImportsPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProp(AngularParser.TemplatePropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stylesProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesProp(AngularParser.StylesPropContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateItem(AngularParser.TemplateItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringItem(AngularParser.StringItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierItem(AngularParser.IdentifierItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectItem(AngularParser.ObjectItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDecl}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classBodyMembers}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyMembers(AngularParser.ClassBodyMembersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldMember(AngularParser.FieldMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMember(AngularParser.MethodMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldDecl}
	 * labeled alternative in {@link AngularParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(AngularParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(AngularParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramList}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(AngularParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(AngularParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAnnotated}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnotated(AngularParser.TypeAnnotatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeIdent}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdent(AngularParser.TypeIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAny}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAny(AngularParser.TypeAnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineObjType}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineObjType(AngularParser.InlineObjTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineObj}
	 * labeled alternative in {@link AngularParser#inlineObjectType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineObj(AngularParser.InlineObjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectTypeMemberRule}
	 * labeled alternative in {@link AngularParser#objectTypeMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeMemberRule(AngularParser.ObjectTypeMemberRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(AngularParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(AngularParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(AngularParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(AngularParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(AngularParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(AngularParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(AngularParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(AngularParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(AngularParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(AngularParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(AngularParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementExpr}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementExpr(AngularParser.ReturnStatementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(AngularParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forVarInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarInit(AngularParser.ForVarInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forExprInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExprInit(AngularParser.ForExprInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyForInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyForInit(AngularParser.EmptyForInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssignment(AngularParser.ExprAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(AngularParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(AngularParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpr}
	 * labeled alternative in {@link AngularParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpr}
	 * labeled alternative in {@link AngularParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link AngularParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(AngularParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(AngularParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link AngularParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(AngularParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(AngularParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyAcc}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAcc(AngularParser.PropertyAccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postFixIncr}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFixIncr(AngularParser.PostFixIncrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functCall}
	 * labeled alternative in {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctCall(AngularParser.FunctCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyAccessing}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessing(AngularParser.PropertyAccessingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixInc}
	 * labeled alternative in {@link AngularParser#postfixIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixInc(AngularParser.PostfixIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(AngularParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupedExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupedExpr(AngularParser.GroupedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(AngularParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowFuncExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFuncExpr(AngularParser.ArrowFuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(AngularParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(AngularParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newCallExpr}
	 * labeled alternative in {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewCallExpr(AngularParser.NewCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowFunctionExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrowParamsList}
	 * labeled alternative in {@link AngularParser#arrowParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowParamsList(AngularParser.ArrowParamsListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objLiteral}
	 * labeled alternative in {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjLiteral(AngularParser.ObjLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keyValuePair}
	 * labeled alternative in {@link AngularParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePair(AngularParser.KeyValuePairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(AngularParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link AngularParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(AngularParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link AngularParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(AngularParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualifiedNameExpr}
	 * labeled alternative in {@link AngularParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameExpr(AngularParser.QualifiedNameExprContext ctx);
}
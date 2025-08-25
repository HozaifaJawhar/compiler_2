// Generated from C:/Users/pc/IdeaProjects/AngularCompiler/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importStmt}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(AngularParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importStmt}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(AngularParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importItemList}
	 * labeled alternative in {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 */
	void enterImportItemList(AngularParser.ImportItemListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importItemList}
	 * labeled alternative in {@link AngularParser#importItems}.
	 * @param ctx the parse tree
	 */
	void exitImportItemList(AngularParser.ImportItemListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importName}
	 * labeled alternative in {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void enterImportName(AngularParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importName}
	 * labeled alternative in {@link AngularParser#importItem}.
	 * @param ctx the parse tree
	 */
	void exitImportName(AngularParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulePathString}
	 * labeled alternative in {@link AngularParser#modulePath}.
	 * @param ctx the parse tree
	 */
	void enterModulePathString(AngularParser.ModulePathStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulePathString}
	 * labeled alternative in {@link AngularParser#modulePath}.
	 * @param ctx the parse tree
	 */
	void exitModulePathString(AngularParser.ModulePathStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentDef}
	 * labeled alternative in {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentDef}
	 * labeled alternative in {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentConfigObj}
	 * labeled alternative in {@link AngularParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfigObj(AngularParser.ComponentConfigObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentConfigObj}
	 * labeled alternative in {@link AngularParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfigObj(AngularParser.ComponentConfigObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectorProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorProp(AngularParser.SelectorPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectorProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorProp(AngularParser.SelectorPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code standaloneProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProp(AngularParser.StandalonePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code standaloneProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProp(AngularParser.StandalonePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importsProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsProp(AngularParser.ImportsPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importsProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsProp(AngularParser.ImportsPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProp(AngularParser.TemplatePropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProp(AngularParser.TemplatePropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stylesProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStylesProp(AngularParser.StylesPropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stylesProp}
	 * labeled alternative in {@link AngularParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStylesProp(AngularParser.StylesPropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLiteralExpr}
	 * labeled alternative in {@link AngularParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpr(AngularParser.ArrayLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void enterTemplateItem(AngularParser.TemplateItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void exitTemplateItem(AngularParser.TemplateItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void enterStringItem(AngularParser.StringItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void exitStringItem(AngularParser.StringItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierItem(AngularParser.IdentifierItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierItem(AngularParser.IdentifierItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void enterObjectItem(AngularParser.ObjectItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectItem}
	 * labeled alternative in {@link AngularParser#arrayItem}.
	 * @param ctx the parse tree
	 */
	void exitObjectItem(AngularParser.ObjectItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDecl}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDecl}
	 * labeled alternative in {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classBodyMembers}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyMembers(AngularParser.ClassBodyMembersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classBodyMembers}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyMembers(AngularParser.ClassBodyMembersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterFieldMember(AngularParser.FieldMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitFieldMember(AngularParser.FieldMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodMember(AngularParser.MethodMemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodMember}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodMember(AngularParser.MethodMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldDecl}
	 * labeled alternative in {@link AngularParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(AngularParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldDecl}
	 * labeled alternative in {@link AngularParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(AngularParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(AngularParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDecl}
	 * labeled alternative in {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(AngularParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramList}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(AngularParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramList}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(AngularParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParam(AngularParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParam(AngularParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAnnotated}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotated(AngularParser.TypeAnnotatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAnnotated}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotated(AngularParser.TypeAnnotatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeIdent}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdent(AngularParser.TypeIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeIdent}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdent(AngularParser.TypeIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAny}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 */
	void enterTypeAny(AngularParser.TypeAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAny}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 */
	void exitTypeAny(AngularParser.TypeAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineObjType}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineObjType(AngularParser.InlineObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineObjType}
	 * labeled alternative in {@link AngularParser#typePrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineObjType(AngularParser.InlineObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineObj}
	 * labeled alternative in {@link AngularParser#inlineObjectType}.
	 * @param ctx the parse tree
	 */
	void enterInlineObj(AngularParser.InlineObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineObj}
	 * labeled alternative in {@link AngularParser#inlineObjectType}.
	 * @param ctx the parse tree
	 */
	void exitInlineObj(AngularParser.InlineObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectTypeMemberRule}
	 * labeled alternative in {@link AngularParser#objectTypeMember}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeMemberRule(AngularParser.ObjectTypeMemberRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectTypeMemberRule}
	 * labeled alternative in {@link AngularParser#objectTypeMember}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeMemberRule(AngularParser.ObjectTypeMemberRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(AngularParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeBlock}
	 * labeled alternative in {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(AngularParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(AngularParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(AngularParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(AngularParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(AngularParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(AngularParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(AngularParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(AngularParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(AngularParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(AngularParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(AngularParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(AngularParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(AngularParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(AngularParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(AngularParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(AngularParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(AngularParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AngularParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDecl}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AngularParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(AngularParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link AngularParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(AngularParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementExpr}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementExpr(AngularParser.ReturnStatementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementExpr}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementExpr(AngularParser.ReturnStatementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(AngularParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(AngularParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link AngularParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(AngularParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forVarInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForVarInit(AngularParser.ForVarInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forVarInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForVarInit(AngularParser.ForVarInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forExprInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForExprInit(AngularParser.ForExprInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forExprInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForExprInit(AngularParser.ForExprInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyForInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterEmptyForInit(AngularParser.EmptyForInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyForInit}
	 * labeled alternative in {@link AngularParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitEmptyForInit(AngularParser.EmptyForInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprAssignment(AngularParser.ExprAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAssignment}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprAssignment(AngularParser.ExprAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(AngularParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link AngularParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(AngularParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(AngularParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link AngularParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(AngularParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpr}
	 * labeled alternative in {@link AngularParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpr}
	 * labeled alternative in {@link AngularParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpr(AngularParser.LogicalOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpr}
	 * labeled alternative in {@link AngularParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpr}
	 * labeled alternative in {@link AngularParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpr(AngularParser.LogicalAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link AngularParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(AngularParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link AngularParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link AngularParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(AngularParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(AngularParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link AngularParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(AngularParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(AngularParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link AngularParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(AngularParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AngularParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(AngularParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link AngularParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(AngularParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link AngularParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(AngularParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(AngularParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(AngularParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyAcc}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAcc(AngularParser.PropertyAccContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyAcc}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAcc(AngularParser.PropertyAccContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postFixIncr}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void enterPostFixIncr(AngularParser.PostFixIncrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postFixIncr}
	 * labeled alternative in {@link AngularParser#postfixPart}.
	 * @param ctx the parse tree
	 */
	void exitPostFixIncr(AngularParser.PostFixIncrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functCall}
	 * labeled alternative in {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctCall(AngularParser.FunctCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functCall}
	 * labeled alternative in {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctCall(AngularParser.FunctCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyAccessing}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessing(AngularParser.PropertyAccessingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyAccessing}
	 * labeled alternative in {@link AngularParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessing(AngularParser.PropertyAccessingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixInc}
	 * labeled alternative in {@link AngularParser#postfixIncrement}.
	 * @param ctx the parse tree
	 */
	void enterPostfixInc(AngularParser.PostfixIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixInc}
	 * labeled alternative in {@link AngularParser#postfixIncrement}.
	 * @param ctx the parse tree
	 */
	void exitPostfixInc(AngularParser.PostfixIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(AngularParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(AngularParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(AngularParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupedExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpr(AngularParser.GroupedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupedExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpr(AngularParser.GroupedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(AngularParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(AngularParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowFuncExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrowFuncExpr(AngularParser.ArrowFuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowFuncExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrowFuncExpr(AngularParser.ArrowFuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(AngularParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(AngularParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(AngularParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link AngularParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(AngularParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newCallExpr}
	 * labeled alternative in {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewCallExpr(AngularParser.NewCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newCallExpr}
	 * labeled alternative in {@link AngularParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewCallExpr(AngularParser.NewCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowFunctionExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowFunctionExpr}
	 * labeled alternative in {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionExpr(AngularParser.ArrowFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrowParamsList}
	 * labeled alternative in {@link AngularParser#arrowParams}.
	 * @param ctx the parse tree
	 */
	void enterArrowParamsList(AngularParser.ArrowParamsListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrowParamsList}
	 * labeled alternative in {@link AngularParser#arrowParams}.
	 * @param ctx the parse tree
	 */
	void exitArrowParamsList(AngularParser.ArrowParamsListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objLiteral}
	 * labeled alternative in {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjLiteral(AngularParser.ObjLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objLiteral}
	 * labeled alternative in {@link AngularParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjLiteral(AngularParser.ObjLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyValuePair}
	 * labeled alternative in {@link AngularParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(AngularParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyValuePair}
	 * labeled alternative in {@link AngularParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(AngularParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTemplateLiteral(AngularParser.TemplateLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(AngularParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(AngularParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link AngularParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(AngularParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueLiteral}
	 * labeled alternative in {@link AngularParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(AngularParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link AngularParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(AngularParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseLiteral}
	 * labeled alternative in {@link AngularParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(AngularParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualifiedNameExpr}
	 * labeled alternative in {@link AngularParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameExpr(AngularParser.QualifiedNameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualifiedNameExpr}
	 * labeled alternative in {@link AngularParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameExpr(AngularParser.QualifiedNameExprContext ctx);
}
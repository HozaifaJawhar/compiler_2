parser grammar AngularParser;

options {
    tokenVocab = AngularLexer;
}

program
    : importStatement* componentDefinition+ EOF
    ;

importStatement
    : IMPORT importItems FROM modulePath SEMI?                  #importStmt
    ;

importItems
    : LBRACE importItem (COMMA importItem)* RBRACE              #importItemList
    ;

importItem
    : IDENTIFIER                                                #importName
    ;

modulePath
    : STRING_LITERAL                                            #modulePathString
    ;

componentDefinition
    : COMPONENT LPAREN componentConfig RPAREN classDeclaration  #componentDef
    ;

componentConfig
    : LBRACE componentProperty (COMMA componentProperty)* RBRACE  #componentConfigObj
    ;

componentProperty
    : SELECTOR COLON STRING_LITERAL       #selectorProp
    | STANDALONE COLON booleanLiteral     #standaloneProp
    | IMPORTS COLON arrayLiteral          #importsProp
    | TEMPLATE COLON BACKTICK_LITERAL     #templateProp
    | STYLES COLON arrayLiteral           #stylesProp
    ;

arrayLiteral
    : LBRACKET (arrayItem (COMMA arrayItem)*)? RBRACKET         #arrayLiteralExpr
    ;

arrayItem
    : BACKTICK_LITERAL    #templateItem
    | STRING_LITERAL      #stringItem
    | IDENTIFIER          #identifierItem
    | objectLiteral       #objectItem
    ;

classDeclaration
    : EXPORT? CLASS IDENTIFIER LBRACE classBody RBRACE          #classDecl
    ;

classBody
    : classMember*         #classBodyMembers
    ;

classMember
    : fieldDeclaration     #fieldMember
    | methodDeclaration    #methodMember
    ;

fieldDeclaration
    : IDENTIFIER (COLON typeAnnotation)? (EQUALS expression)? SEMI? #fieldDecl
    ;

methodDeclaration
    : IDENTIFIER LPAREN parameterList? RPAREN (COLON typeAnnotation)? block #methodDecl
    ;

parameterList
    : parameter (COMMA parameter)*                              #paramList
    ;

parameter
    : IDENTIFIER COLON typeAnnotation                           #param
    ;

typeAnnotation
    : typePrimary (LBRACKET RBRACKET)?                          #typeAnnotated
    ;

typePrimary
    : IDENTIFIER              #typeIdent
    | ANY                     #typeAny
    | inlineObjectType        #inlineObjType
    ;

inlineObjectType
    : LBRACE members+=objectTypeMember (SEMI members+=objectTypeMember)* SEMI? RBRACE #inlineObj
    ;

objectTypeMember
    : IDENTIFIER COLON typeAnnotation                           #objectTypeMemberRule
    ;

block
    : LBRACE statement* RBRACE                                  #codeBlock
    ;

statement
    : variableDeclaration   #varDeclStmt
    | expressionStatement   #exprStmt
    | returnStatement       #returnStmt
    | ifStatement           #ifStmt
    | forStatement          #forStmt
    | whileStatement        #whileStmt
    | breakStatement        #breakStmt
    | block                 #blockStmt
    | SEMI                  #emptyStmt
    ;

variableDeclaration
    : LET IDENTIFIER (COLON typeAnnotation)? (EQUALS expression)? SEMI #varDecl
    ;

expressionStatement
    : expression SEMI                                           #exprStatement
    ;

returnStatement
    : RETURN expression? SEMI                                   #returnStatementExpr
    ;

ifStatement
    : IF LPAREN expression RPAREN statement (ELSE statement)?   #ifElseStmt
    ;

forStatement
    : FOR LPAREN forInit SEMI expression? SEMI expression? RPAREN statement #forLoop
    ;

breakStatement
    : BREAK SEMI?
    ;

forInit
    : variableDeclaration   #forVarInit
    | expression            #forExprInit
    |                       #emptyForInit
    ;

whileStatement
    : WHILE LPAREN expression RPAREN statement                  #whileLoop
    ;

expression
    : assignmentExpression                                      #exprAssignment
    ;

assignmentExpression
    : conditionalExpression (EQUALS assignmentExpression)?      #assignExpr
    ;

conditionalExpression
    : logicalOrExpression (QUESTION expression COLON expression)? #condExpr
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*           #logicalOrExpr
    ;

logicalAndExpression
    : equalityExpression (AND equalityExpression)*              #logicalAndExpr
    ;

equalityExpression
    : relationalExpression ((EQ | NEQ) relationalExpression)*   #equalityExpr
    ;

relationalExpression
    : additiveExpression ((LT | LE | GT | GE) additiveExpression)* #relationalExpr
    ;

additiveExpression
    : multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)* #addExpr
    ;

multiplicativeExpression
    : unaryExpression ((MULT | DIV | MOD) unaryExpression)*     #multExpr
    ;

unaryExpression
    : (NOT | MINUS)? postfixExpression                          #unaryExpr
    ;

postfixExpression
    : primaryExpression postfixPart*                            #postfixExpr
    ;

postfixPart
    : functionCall                                              #funcCall
    | propertyAccess                                            #propertyAcc
    | postfixIncrement                                          #postFixIncr
    ;

functionCall
    : LPAREN (expression (COMMA expression)*)? RPAREN           #functCall
    ;

propertyAccess
    : DOT IDENTIFIER                                            #propertyAccessing
    ;

postfixIncrement
    : INCREMENT                                                 #postfixInc
    ;

primaryExpression
    : literal                    #literalExpr
    | THIS                       #thisExpr
    | IDENTIFIER                 #identifierExpr
    | LPAREN expression RPAREN   #groupedExpr
    | newExpression              #newExpr
    | arrowFunction              #arrowFuncExpr
    | objectLiteral              #objectExpr
    | arrayLiteral               #arrayExpr
    ;

newExpression
    : NEW qualifiedName LPAREN (expression (COMMA expression)*)? RPAREN #newCallExpr
    ;

arrowFunction
    : LPAREN arrowParams? RPAREN ARROW expression               #arrowFunctionExpr
    ;

arrowParams
    : IDENTIFIER (COMMA IDENTIFIER)*                            #arrowParamsList
    ;

objectLiteral
    : LBRACE (keyValue (COMMA keyValue)*)? RBRACE               #objLiteral
    ;

keyValue
    : IDENTIFIER COLON expression                               #keyValuePair
    ;

literal
    : STRING_LITERAL         #stringLiteral
    | BACKTICK_LITERAL       #templateLiteral
    | NUMBER                 #numberLiteral
    | booleanLiteral         #boolLiteral
    ;

booleanLiteral
    : TRUE                  #trueLiteral
    | FALSE                 #falseLiteral
    ;

qualifiedName
    : IDENTIFIER (DOT IDENTIFIER)*             #qualifiedNameExpr
    ;

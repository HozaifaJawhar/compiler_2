lexer grammar AngularLexer;

IMPORT      : 'import';
FROM        : 'from';
NEW         : 'new';
COMPONENT   : '@Component';
SELECTOR    : 'selector';
STANDALONE  : 'standalone';
TRUE        : 'true';
FALSE       : 'false';
IMPORTS     : 'imports';
STYLES      : 'styles';
TEMPLATE    : 'template';
EXPORT      : 'export';
CLASS       : 'class';
THIS        : 'this';
ANY         : 'any';
RETURN      : 'return';
BREAK       : 'break';
INTERFACE   : 'interface';

IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
LET         : 'let';

ELLIPSIS    : '...';
QDOT        : '?.';
PIPE        : '|';

LBRACE      : '{';
RBRACE      : '}';
LBRACKET    : '[';
RBRACKET    : ']';
LPAREN      : '(';
RPAREN      : ')';
COLON       : ':';
COMMA       : ',';
SEMI        : ';';
DOT         : '.';
HASH        : '#';
DQUOTE      : '"';
SQUOTE      : '\'';
BACKTICK    : '`';
EQUALS      : '=';
INCREMENT   : '++';
ARROW       : '=>';
QUESTION    : '?';
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
MOD         : '%';
LT          : '<';
GT          : '>';
LE          : '<=';
GE          : '>=';
EQ          : '==';
NEQ         : '!=';
AND         : '&&';
OR          : '||';
NOT         : '!';

STRING_LITERAL
  : '\'' ( '\\' . | ~('\\'|'\'') )* '\''
  ;

BACKTICK_LITERAL
  : '`' ( '\\' . | ~'`' )* '`'
  ;

NUMBER            : [0-9]+;
IDENTIFIER        : [a-zA-Z_][a-zA-Z0-9_]*;

WS                : [ \t\r\n]+ -> skip;
COMMENT           : '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT : '/*' .*? '*/' -> skip;

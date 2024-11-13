lexer grammar ExprLexer;

FLOAT: [0-9]+ '.' [0-9]* | [0-9]* '.' [0-9]+;  // Números de ponto flutuante
INT: [0-9]+;                       // Números inteiros
ID: [a-zA-Z_][a-zA-Z0-9_]*;        // Identificadores (permitir letras minúsculas também)
OPSUM: '+';                        // Adição
OPSUB: '-';                        // Subtração
OPMUL: '*';                        // Multiplicação
OPDIV: '/';                        // Divisão
OPEXP: '^';                        // Exponenciação
LPAREN: '(';                       // Parêntese esquerdo
RPAREN: ')';                       // Parêntese direito
SEMICOLON: ';';                    // Ponto e vírgula

// Outros Tokens
IF: 'if';                          // Condicional if
WHILE: 'while';                    // Loop while
PRINT: 'print';                    // Saída print
INPUT: 'input';                    // Entrada input

// Operadores relacionais e lógicos
EQ: '==' ;                         // Igualdade
NEQ: '!=';                         // Diferença
LT: '<';                           // Menor que
LE: '<=';                          // Menor ou igual
GT: '>';                           // Maior que
GE: '>=';                          // Maior ou igual
AND: 'and';                        // Operador lógico AND
OR: 'or';                          // Operador lógico OR

// Ignorar espaços em branco
WS: [ \t\n\r]+ -> skip;

// Comentários (opcional)
LINE_COMMENT: '//' ~[\n\r]* -> skip;  // Comentários de linha

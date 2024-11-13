lexer grammar ExprLexer;

// Números
FLOAT: [0-9]+ '.' [0-9]* | [0-9]* '.' [0-9]+;  // Números de ponto flutuante
INT: [0-9]+;                       // Números inteiros

// Identificadores
ID: [a-zA-Z_][a-zA-Z0-9_]*;        // Identificadores (permitir letras minúsculas também)

// Operadores Aritméticos
OPSUM: '+';                        // Adição
OPSUB: '-';                        // Subtração
OPMUL: '*';                        // Multiplicação
OPDIV: '/';                        // Divisão
OPEXP: '^';                        // Exponenciação

// Parênteses e ponto e vírgula
LPAREN: '(';                       // Parêntese esquerdo
RPAREN: ')';                       // Parêntese direito
SEMICOLON: ';';                    // Ponto e vírgula

// Delimitadores
ASSIGN: '=';                       // Atribuição
LBRACE: '{';                       // Chave esquerda
RBRACE: '}';                       // Chave direita

// Palavras-chave (controle de fluxo e I/O)
IF: 'if';                          // Condicional if
WHILE: 'while';                    // Loop while
PRINT: 'print';                    // Saída print
INPUT: 'input';                    // Entrada input
VAR: 'var';                        // Palavra-chave var

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
WS: [ \t\n\r]+ -> skip;            // Ignora espaços em branco

// Comentários de linha
LINE_COMMENT: '//' ~[\n\r]* -> skip;  // Comentários de linha
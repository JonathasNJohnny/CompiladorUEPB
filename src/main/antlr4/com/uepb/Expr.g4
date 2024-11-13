grammar Expr;

// A regra inicial que pode conter qualquer conjunto de instruções
prog: (stat)* EOF;

// Regras para declarações e instruções
stat: varDecl
    | varAssign
    | printStat
    | inputStat
    | ifStat
    | whileStat
    | expr SEMICOLON
    ;

// Declaração de variáveis (com ou sem atribuição)
varDecl: VAR ID (ASSIGN expr)? SEMICOLON;

// Atribuição de valor para variáveis
varAssign: ID ASSIGN expr SEMICOLON;

// Instrução de print (impressão na tela)
printStat: PRINT LPAREN expr RPAREN SEMICOLON;

// Instrução de input (entrada de dados)
inputStat: INPUT LPAREN ID RPAREN SEMICOLON;

// Estrutura condicional (if)
ifStat: IF LPAREN boolExpr RPAREN LBRACE (stat)* RBRACE;

// Estrutura de repetição (while)
whileStat: WHILE LPAREN boolExpr RPAREN LBRACE (stat)* RBRACE;

// Expressão booleana que inclui comparações
boolExpr: expr (relop expr)?;

// Expressão principal
expr: termo (op1 termo)*;   // Soma e subtração

// Termo que pode ter multiplicação e divisão
termo: fator (op2 fator)*;   // Multiplicação e divisão

// Fatores podem ser potências ou outros valores
fator: (op3 fator)? | LPAREN expr RPAREN | INT | FLOAT | ID;

// Operadores relacionais e lógicos
relop: EQ | NEQ | LT | LE | GT | GE;

// Operadores
op1: OPSUM | OPSUB;   // Adição e subtração
op2: OPMUL | OPDIV;   // Multiplicação e divisão
op3: OPEXP;           // Potência

// Tokens

// Palavras-chave (controle de fluxo e I/O)
VAR: 'var';
PRINT: 'print';
INPUT: 'input';
IF: 'if';
WHILE: 'while';

// Operadores relacionais e lógicos
EQ: '==';
NEQ: '!=';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';

// Operadores aritméticos
OPSUM: '+';
OPSUB: '-';
OPMUL: '*';
OPDIV: '/';
OPEXP: '^';

// Números
FLOAT: [0-9]+ '.' [0-9]* | [0-9]* '.' [0-9]+;
INT: [0-9]+;

// Identificadores
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Parênteses e ponto e vírgula
LPAREN: '(';
RPAREN: ')';
SEMICOLON: ';';

// Delimitadores
ASSIGN: '=';
LBRACE: '{';
RBRACE: '}';

// Ignorar espaços em branco
WS: [ \t\n\r]+ -> skip;

// Comentários de linha
LINE_COMMENT: '//' ~[\n\r]* -> skip;

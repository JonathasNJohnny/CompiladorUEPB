parser grammar Expr;

// Importando o Lexer para utilizar os tokens definidos no arquivo ExprLexer.g4
options { tokenVocab=ExprLexer; }

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
varDecl: VAR ID (ASSIGN expr)? SEMICOLON;  // Corrigido para garantir a palavra-chave 'var' e o ponto e vírgula

// Atribuição de valor para variáveis
varAssign: ID ASSIGN expr SEMICOLON;

// Instrução de print (impressão na tela)
printStat: PRINT LPAREN expr RPAREN SEMICOLON;

// Instrução de input (entrada de dados)
inputStat: INPUT LPAREN ID RPAREN SEMICOLON;

// Estrutura condicional (if)
ifStat: IF LPAREN expr RPAREN LBRACE prog RBRACE;

// Estrutura de repetição (while)
whileStat: WHILE LPAREN expr RPAREN LBRACE prog RBRACE;

// Expressão principal
expr: termo (op1 termo)*;   // Soma e subtração

// Termo que pode ter multiplicação e divisão
termo: fator (op2 fator)*;   // Multiplicação e divisão

// Fatores podem ser potências ou outros valores
fator: (op3 fator)? | LPAREN expr RPAREN | INT | FLOAT | ID;  // Potência ou valores literais

// Operadores
op1: OPSUM | OPSUB;   // Adição e subtração
op2: OPMUL | OPDIV;   // Multiplicação e divisão
op3: OPEXP;          // Potência

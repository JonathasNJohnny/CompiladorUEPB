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

    // Tokens

    // Números
    FLOAT: [0-9]+ '.' [0-9]* | [0-9]* '.' [0-9]+;  // Números de ponto flutuante
    INT: [0-9]+;                       // Números inteiros

    // Palavra-chave var
    VAR: 'var';                        // Palavra-chave var

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

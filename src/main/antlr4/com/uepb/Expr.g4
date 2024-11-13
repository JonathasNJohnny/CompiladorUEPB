grammar Expr;

// Regra inicial
prog: expr (SEMICOLON expr)* SEMICOLON?;

// Expressão principal
expr: termo restExpr?;

restExpr: op1 termo restExpr?;

// Termo
termo: potencia restTermo?;

// Termo adicional
restTermo: op2 fator restTermo?;

// Potência
potencia: fator (op3 potencia)?;

// Fator
fator: INT | FLOAT | ID | LPAREN expr RPAREN;

// Operadores
op1: OPSUM | OPSUB;
op2: OPMUL | OPDIV;
op3: OPEXP;

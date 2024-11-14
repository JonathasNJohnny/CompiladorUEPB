package com.uepb;

import org.antlr.v4.runtime.tree.ParseTree;
import com.uepb.ExprBaseListener;
import com.uepb.ExprParser;


public class ExprListenerImpl extends ExprBaseListener {

    // Armazenar variáveis e seus valores
    private final SymbolTable symbolTable = new SymbolTable();

    @Override
    public void enterVarDecl(ExprParser.VarDeclContext ctx) {
        String varName = ctx.ID().getText();
        if (ctx.expr() != null) {
            // Se tiver atribuição, avalia a expressão
            int value = evaluateExpr(ctx.expr());
            symbolTable.addVar(varName, value);
            System.out.println("P-Code: DECLARE " + varName);
            System.out.println("P-Code: ASSIGN " + value + " TO " + varName);
        } else {
            symbolTable.addVar(varName, 0); // Inicialização com 0
            System.out.println("P-Code: DECLARE " + varName);
        }
    }

    @Override
    public void enterVarAssign(ExprParser.VarAssignContext ctx) {
        String varName = ctx.ID().getText();
        int value = evaluateExpr(ctx.expr());
        symbolTable.updateVar(varName, value);
        System.out.println("P-Code: ASSIGN " + value + " TO " + varName);
    }

    @Override
    public void enterPrintStat(ExprParser.PrintStatContext ctx) {
        int value = evaluateExpr(ctx.expr());
        System.out.println("P-Code: PRINT " + value);
    }

    @Override
    public void enterInputStat(ExprParser.InputStatContext ctx) {
        String varName = ctx.ID().getText();
        // Simula a entrada de dados
        System.out.println("P-Code: INPUT " + varName);
        symbolTable.addVar(varName, 0); // Atribuir valor fictício, a entrada real é simulada
    }

    @Override
    public void enterIfStat(ExprParser.IfStatContext ctx) {
        int condition = evaluateBoolExpr(ctx.boolExpr());
        if (condition != 0) {
            System.out.println("P-Code: IF TRUE");
            executeStatements(ctx.stat());
        } else {
            System.out.println("P-Code: IF FALSE");
        }
    }

    @Override
    public void enterWhileStat(ExprParser.WhileStatContext ctx) {
        int condition = evaluateBoolExpr(ctx.boolExpr());
        while (condition != 0) {
            System.out.println("P-Code: WHILE TRUE");
            executeStatements(ctx.stat());
            condition = evaluateBoolExpr(ctx.boolExpr());
        }
    }

    // Avalia expressões aritméticas e retorna um valor
    private int evaluateExpr(ExprParser.ExprContext ctx) {
        if (ctx.termo().size() == 1) {
            String termo = ctx.termo(0).getText();
            if (symbolTable.containsVar(termo)) {
                return symbolTable.getVar(termo);
            } else {
                return Integer.parseInt(termo);
            }
        } else {
            int left = evaluateTermo(ctx.termo(0));
            for (int i = 1; i < ctx.termo().size(); i++) {
                int right = evaluateTermo(ctx.termo(i));
                // Acessa o operador usando ctx.op1().get(i - 1).getText()
                if (ctx.op1(i - 1).getText().equals("+")) {
                    left += right;
                } else if (ctx.op1(i - 1).getText().equals("-")) {
                    left -= right;
                }
            }
            return left;
        }
    }

    // Avalia um termo, considerando multiplicação e divisão
    private int evaluateTermo(ExprParser.TermoContext ctx) {
        int left = evaluateFator(ctx.fator(0));
        for (int i = 1; i < ctx.fator().size(); i++) {
            int right = evaluateFator(ctx.fator(i));
            // Acessa o operador usando ctx.op2().get(i - 1).getText()
            if (ctx.op2(i - 1).getText().equals("*")) {
                left *= right;
            } else if (ctx.op2(i - 1).getText().equals("/")) {
                left /= right;
            }
        }
        return left;
    }
    
    private int evaluateFator(ExprParser.FatorContext ctx) {
        String text = ctx.getText();
        if (symbolTable.containsVar(text)) {
            return symbolTable.getVar(text); // Retorna o valor da variável
        }
        return Integer.parseInt(text); // Caso contrário, trata como número literal
    }
    

    // Avalia a expressão booleana (relacional)
    private int evaluateBoolExpr(ExprParser.BoolExprContext ctx) {
        int left = evaluateExpr(ctx.expr(0));
        if (ctx.relop() != null) {
            int right = evaluateExpr(ctx.expr(1));
            switch (ctx.relop().getText()) {
                case "==": return (left == right) ? 1 : 0;
                case "!=": return (left != right) ? 1 : 0;
                case "<": return (left < right) ? 1 : 0;
                case "<=": return (left <= right) ? 1 : 0;
                case ">": return (left > right) ? 1 : 0;
                case ">=": return (left >= right) ? 1 : 0;
            }
        }
        return 0; // Caso base
    }

    // Executa os comandos dentro de um bloco (dentro de um 'if' ou 'while')
    private void executeStatements(java.util.List<ExprParser.StatContext> stats) {
        for (ExprParser.StatContext stat : stats) {
            if (stat.varDecl() != null) {
                enterVarDecl(stat.varDecl());
            } else if (stat.varAssign() != null) {
                enterVarAssign(stat.varAssign());
            } else if (stat.printStat() != null) {
                enterPrintStat(stat.printStat());
            } else if (stat.inputStat() != null) {
                enterInputStat(stat.inputStat());
            } else if (stat.ifStat() != null) {
                enterIfStat(stat.ifStat());
            } else if (stat.whileStat() != null) {
                enterWhileStat(stat.whileStat());
            }
        }
    }
}
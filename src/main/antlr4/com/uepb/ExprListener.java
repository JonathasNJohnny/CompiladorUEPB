// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ExprParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ExprParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(ExprParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(ExprParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(ExprParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(ExprParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#inputStat}.
	 * @param ctx the parse tree
	 */
	void enterInputStat(ExprParser.InputStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#inputStat}.
	 * @param ctx the parse tree
	 */
	void exitInputStat(ExprParser.InputStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(ExprParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(ExprParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(ExprParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(ExprParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(ExprParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(ExprParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(ExprParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(ExprParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(ExprParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(ExprParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(ExprParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(ExprParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(ExprParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(ExprParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(ExprParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(ExprParser.Op3Context ctx);
}
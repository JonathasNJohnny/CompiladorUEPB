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
	 * Enter a parse tree produced by {@link ExprParser#restExpr}.
	 * @param ctx the parse tree
	 */
	void enterRestExpr(ExprParser.RestExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#restExpr}.
	 * @param ctx the parse tree
	 */
	void exitRestExpr(ExprParser.RestExprContext ctx);
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
	 * Enter a parse tree produced by {@link ExprParser#restTermo}.
	 * @param ctx the parse tree
	 */
	void enterRestTermo(ExprParser.RestTermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#restTermo}.
	 * @param ctx the parse tree
	 */
	void exitRestTermo(ExprParser.RestTermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(ExprParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(ExprParser.PotenciaContext ctx);
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
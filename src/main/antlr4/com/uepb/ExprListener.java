// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Expr}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Expr#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Expr.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Expr.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Expr.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Expr.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(Expr.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(Expr.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(Expr.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(Expr.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(Expr.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(Expr.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#inputStat}.
	 * @param ctx the parse tree
	 */
	void enterInputStat(Expr.InputStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#inputStat}.
	 * @param ctx the parse tree
	 */
	void exitInputStat(Expr.InputStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(Expr.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(Expr.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(Expr.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(Expr.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Expr.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Expr.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(Expr.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(Expr.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(Expr.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(Expr.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(Expr.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(Expr.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(Expr.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(Expr.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(Expr.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(Expr.Op3Context ctx);
}
// Generated from com/uepb/Expr.g4 by ANTLR 4.13.2
package com.uepb;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(ExprParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(ExprParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#printStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(ExprParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#inputStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStat(ExprParser.InputStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(ExprParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(ExprParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(ExprParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(ExprParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(ExprParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(ExprParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(ExprParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(ExprParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(ExprParser.Op3Context ctx);
}
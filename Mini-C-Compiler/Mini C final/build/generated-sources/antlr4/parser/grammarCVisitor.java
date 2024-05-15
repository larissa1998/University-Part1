// Generated from /home/a120124/Área de Trabalho/Mini C/grammar/parser/grammarC.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(grammarCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link grammarCParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(grammarCParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmtElse}
	 * labeled alternative in {@link grammarCParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmtElse(grammarCParser.IfStmtElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExpr}
	 * labeled alternative in {@link grammarCParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(grammarCParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condRelop}
	 * labeled alternative in {@link grammarCParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondRelop(grammarCParser.CondRelopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPlus}
	 * labeled alternative in {@link grammarCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPlus(grammarCParser.ExprPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMin}
	 * labeled alternative in {@link grammarCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMin(grammarCParser.ExprMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTerm}
	 * labeled alternative in {@link grammarCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTerm(grammarCParser.ExprTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMult}
	 * labeled alternative in {@link grammarCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMult(grammarCParser.TermMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDiv}
	 * labeled alternative in {@link grammarCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDiv(grammarCParser.TermDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termFact}
	 * labeled alternative in {@link grammarCParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermFact(grammarCParser.TermFactContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr2par}
	 * labeled alternative in {@link grammarCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2par(grammarCParser.Expr2parContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link grammarCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(grammarCParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link grammarCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(grammarCParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link grammarCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(grammarCParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprChar}
	 * labeled alternative in {@link grammarCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprChar(grammarCParser.ExprCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link grammarCParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(grammarCParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTrue}
	 * labeled alternative in {@link grammarCParser#booleanb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTrue(grammarCParser.ExprTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFalse}
	 * labeled alternative in {@link grammarCParser#booleanb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFalse(grammarCParser.ExprFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSingle}
	 * labeled alternative in {@link grammarCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSingle(grammarCParser.BlockSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockCompose}
	 * labeled alternative in {@link grammarCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockCompose(grammarCParser.BlockComposeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtPrintf}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrintf(grammarCParser.StmtPrintfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtIf}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(grammarCParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAttr}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAttr(grammarCParser.StmtAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtExpr}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(grammarCParser.StmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtScan}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtScan(grammarCParser.StmtScanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmrDec}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmrDec(grammarCParser.StmrDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtWhile}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhile(grammarCParser.StmtWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtFor}
	 * labeled alternative in {@link grammarCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFor(grammarCParser.StmtForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whilex}
	 * labeled alternative in {@link grammarCParser#whilee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilex(grammarCParser.WhilexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foorx}
	 * labeled alternative in {@link grammarCParser#foor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFoorx(grammarCParser.FoorxContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#forzin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForzin(grammarCParser.ForzinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrScan}
	 * labeled alternative in {@link grammarCParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrScan(grammarCParser.AttrScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(grammarCParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link grammarCParser#printfin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(grammarCParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrExpr}
	 * labeled alternative in {@link grammarCParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrExpr(grammarCParser.AttrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrMinuMinus}
	 * labeled alternative in {@link grammarCParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrMinuMinus(grammarCParser.AttrMinuMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrPlusPlus}
	 * labeled alternative in {@link grammarCParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrPlusPlus(grammarCParser.AttrPlusPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declSimple}
	 * labeled alternative in {@link grammarCParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclSimple(grammarCParser.DeclSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declPointer}
	 * labeled alternative in {@link grammarCParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclPointer(grammarCParser.DeclPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declArray}
	 * labeled alternative in {@link grammarCParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArray(grammarCParser.DeclArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declVSimple}
	 * labeled alternative in {@link grammarCParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVSimple(grammarCParser.DeclVSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declValuePointer}
	 * labeled alternative in {@link grammarCParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclValuePointer(grammarCParser.DeclValuePointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declArrayS}
	 * labeled alternative in {@link grammarCParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArrayS(grammarCParser.DeclArraySContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammarCParser.TypeContext ctx);
}
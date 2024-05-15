/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semantic;


import java.util.Scanner;
import parser.grammarCBaseVisitor;
import parser.grammarCParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import parser.grammarCLexer;
/**
 *
 * @author Larissa
 */
public class Visitor extends grammarCBaseVisitor<Object> {
    @Override
    public Object visitIfStmt(grammarCParser.IfStmtContext ctx) {
        Boolean condicao = (Boolean) visit(ctx.cond());
        if (condicao) {
            return visit(ctx.b1);
        }
        return null;
    }
    
    @Override 
    public Object visitWhilex(grammarCParser.WhilexContext ctx) { 
        return visit(ctx.block());
    }
    
    @Override
    public Object visitFoorx(grammarCParser.FoorxContext ctx) {    
        Boolean cond = (Boolean) visit(ctx.cond());
        while(cond){
            cond = (Boolean) visit(ctx.cond());
            visit (ctx.block());
            visit (ctx.attr());
        }
        return 0d;
    }
    
    @Override
    public Object visitIfStmtElse(grammarCParser.IfStmtElseContext ctx) {
        Boolean condicao = (Boolean) visit(ctx.cond());
        
        if (condicao) {
            return visit(ctx.b1);
        } else {
            return visit(ctx.b2);
        }
    }
    @Override
    public Object visitCondExpr(grammarCParser.CondExprContext ctx) {
        Double d = (Double) visit(ctx.expr());
        return d > 0;
    }
    
    @Override
    public Object visitCondRelop(grammarCParser.CondRelopContext ctx) {
        Double a = (Double) visit(ctx.expr(0));
        Double b = (Double) visit(ctx.expr(1));
        
        int op = ctx.relop.getType();
        switch (op) {
            case grammarCLexer.EEQUALS:
                return a.equals(b);
            case grammarCLexer.MENOR:
                return a < b;
            case grammarCLexer.MAIOR:
                return a > b;
            case grammarCLexer.M_IGUAL:
                return a <= b;
            case grammarCLexer.Ma_IGUAL:
                return a >= b;
        }
        return null;
    }
    
    @Override
    public Object visitExprPlus(grammarCParser.ExprPlusContext ctx) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a + b;
    }

    @Override
    public Object visitExprMin(grammarCParser.ExprMinContext ctx) {
        Double a = (Double) visit(ctx.term());
        Double b = (Double) visit(ctx.expr());
        return a - b;
    }
    @Override
    public Object visitExprTerm(grammarCParser.ExprTermContext ctx) {
        return visit(ctx.term());
    }
    @Override
    public Object visitTermMult(grammarCParser.TermMultContext ctx) {
        Double a = (Double) visit(ctx.fact());
        Double b = (Double) visit(ctx.expr());
        return a * b;
    }

    @Override
    public Object visitTermDiv(grammarCParser.TermDivContext ctx) {
        Double a = (Double) visit(ctx.fact());
        Double b = (Double) visit(ctx.expr());
        return a / b;
    }
    @Override
    public Object visitTermFact(grammarCParser.TermFactContext ctx) {
        return visit(ctx.fact());
    }
    @Override
    public Object visitExpr2par(grammarCParser.Expr2parContext ctx) {
        return visit(ctx.expr());
    }
    @Override
    public Object visitExprNum(grammarCParser.ExprNumContext ctx) {
        return Double.parseDouble(ctx.NUM().getText());
    }
    @Override
    public Object visitExprId(grammarCParser.ExprIdContext ctx) {
        System.out.println(SymbolsTable.getInstance().getSymbol(ctx.ID().getText())[1]);
        return SymbolsTable.getInstance().getSymbol(ctx.ID().getText())[1];
    }
    
    @Override
    public Object visitAttrPlusPlus(grammarCParser.AttrPlusPlusContext ctx){
        Object[] var = SymbolsTable.getInstance().getSymbol(ctx.ID().getText());
        double x = (double) var[1];
        x = x+1;
        System.out.println(x);
        return 0;
    }
    
    @Override 
    public Object visitAttrExpr(grammarCParser.AttrExprContext ctx) {      
        if(SymbolsTable.getInstance().getSymbol(ctx.ID().getText())!= null){

            Object aux= visit(ctx.expr());
            if(aux == null){
                aux = ctx.expr().getText();
            } 
            Object[] var = SymbolsTable.getInstance().getSymbol(ctx.ID().getText());
            if(var[0].equals("int")){ 
                System.out.println("int");
                var[1] = (int)Double.parseDouble(aux.toString());
            }
            else if(var[0].equals("double")){           
                var[1] = Double.parseDouble(aux.toString());
            }
            else if(var[0].equals("boolean")){
                if(aux.toString().equals("true") || aux.toString().equals("false")){
                    var[1] = aux;
                }else{
                    throw new ParseCancellationException("Esperava um booleano");
                }
            }else if(var[0].equals("string")){
                if(aux.toString().startsWith("\"")){
                    var[1] = aux;
                }else{
                    throw new ParseCancellationException("Esperava uma string");
                }
            }
        }else{
            throw new ParseCancellationException("Variavel inexistente");
        }         
    return 0;
    }
    @Override
    public Object visitDeclSimple(grammarCParser.DeclSimpleContext ctx) {
        Object[] var = new Object[2];
        var[0] = ctx.type().getText();
        SymbolsTable.getInstance().addSymbol(ctx.ID().getText(), var);
        return 0d;
    }
    
    @Override
    public Object visitPrint(grammarCParser.PrintContext ctx){
        Object o = visit(ctx.expr());
        System.out.println(o);
        return o;
    }
    
    @Override
    public Object visitAttrScan(grammarCParser.AttrScanContext ctx) {
        Scanner s = new Scanner(System.in);
        Object[] value = new Object[2];
        value[1] = s.nextLine();
        SymbolsTable.getInstance().addSymbol(ctx.ID().getText(), value);
        return value;
    }
    
}

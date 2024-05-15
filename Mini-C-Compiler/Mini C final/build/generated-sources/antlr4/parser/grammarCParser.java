// Generated from /home/a120124/Área de Trabalho/Mini C/grammar/parser/grammarC.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, I=5, INT=6, DOUBLE=7, CHAR=8, SUM=9, DIV=10, 
		MULT=11, MINUS=12, PORC=13, TRUE=14, FALSE=15, EQUALS=16, B_EXPR=17, E_EXPR=18, 
		SWITCH=19, CASE=20, M_IGUAL=21, Ma_IGUAL=22, MAIOR=23, MENOR=24, EEQUALS=25, 
		DIF=26, WHILE=27, IF=28, DO=29, FOR=30, BREAK=31, DEFAULT=32, CHARC=33, 
		NUM=34, ID=35, STRING=36, ELSE=37, PRINTF=38, SCANF=39, B_BLOCK=40, E_BLOCK=41, 
		EOL=42, D=43, S=44, WS=45;
	public static final int
		RULE_prog = 0, RULE_ifstmt = 1, RULE_cond = 2, RULE_expr = 3, RULE_term = 4, 
		RULE_fact = 5, RULE_booleanb = 6, RULE_block = 7, RULE_stmt = 8, RULE_whilee = 9, 
		RULE_foor = 10, RULE_forzin = 11, RULE_scan = 12, RULE_types = 13, RULE_printfin = 14, 
		RULE_attr = 15, RULE_dec = 16, RULE_type = 17;
	public static final String[] ruleNames = {
		"prog", "ifstmt", "cond", "expr", "term", "fact", "booleanb", "block", 
		"stmt", "whilee", "foor", "forzin", "scan", "types", "printfin", "attr", 
		"dec", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'printf'", "'['", "']'", "'i'", "'int'", "'double'", "'char'", 
		"'+'", "'/'", "'*'", "'-'", "'%'", "'true'", "'false'", "'='", "'('", 
		"')'", "'switch'", "'case'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", 
		"'while'", "'if'", "'do'", "'for'", "'break'", "'default'", null, null, 
		null, null, "'else'", "'printfa'", "'scanf'", "'{'", "'}'", "';'", "'d'", 
		"'s'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "I", "INT", "DOUBLE", "CHAR", "SUM", "DIV", 
		"MULT", "MINUS", "PORC", "TRUE", "FALSE", "EQUALS", "B_EXPR", "E_EXPR", 
		"SWITCH", "CASE", "M_IGUAL", "Ma_IGUAL", "MAIOR", "MENOR", "EEQUALS", 
		"DIF", "WHILE", "IF", "DO", "FOR", "BREAK", "DEFAULT", "CHARC", "NUM", 
		"ID", "STRING", "ELSE", "PRINTF", "SCANF", "B_BLOCK", "E_BLOCK", "EOL", 
		"D", "S", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "grammarC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				stmt();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << TRUE) | (1L << FALSE) | (1L << B_EXPR) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << CHARC) | (1L << NUM) | (1L << ID) | (1L << STRING) | (1L << SCANF))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	 
		public IfstmtContext() { }
		public void copyFrom(IfstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfstmtContext {
		public BlockContext b1;
		public TerminalNode IF() { return getToken(grammarCParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtElseContext extends IfstmtContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(grammarCParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(grammarCParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtElseContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitIfStmtElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifstmt);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(IF);
				setState(42);
				match(B_EXPR);
				setState(43);
				cond();
				setState(44);
				match(E_EXPR);
				setState(45);
				block();
				setState(46);
				((IfStmtContext)_localctx).b1 = block();
				}
				break;
			case 2:
				_localctx = new IfStmtElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(IF);
				setState(49);
				match(B_EXPR);
				setState(50);
				cond();
				setState(51);
				match(E_EXPR);
				setState(52);
				((IfStmtElseContext)_localctx).b1 = block();
				setState(53);
				match(ELSE);
				setState(54);
				((IfStmtElseContext)_localctx).b2 = block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondRelopContext extends CondContext {
		public Token relop;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondRelopContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitCondRelop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExprContext extends CondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cond);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CondExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expr();
				}
				break;
			case 2:
				_localctx = new CondRelopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				expr();
				setState(60);
				((CondRelopContext)_localctx).relop = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << M_IGUAL) | (1L << Ma_IGUAL) | (1L << MAIOR) | (1L << MENOR) | (1L << EEQUALS))) != 0)) ) {
					((CondRelopContext)_localctx).relop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				term();
				setState(66);
				match(SUM);
				setState(67);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				term();
				setState(70);
				match(MINUS);
				setState(71);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermDivContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitTermDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermMultContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitTermMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermFactContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermFactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitTermFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				fact();
				setState(77);
				match(MULT);
				setState(78);
				expr();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				fact();
				setState(81);
				match(DIV);
				setState(82);
				expr();
				}
				break;
			case 3:
				_localctx = new TermFactContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				fact();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr2parContext extends FactContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr2parContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExpr2par(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStrContext extends FactContext {
		public TerminalNode STRING() { return getToken(grammarCParser.STRING, 0); }
		public ExprStrContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolContext extends FactContext {
		public BooleanbContext booleanb() {
			return getRuleContext(BooleanbContext.class,0);
		}
		public ExprBoolContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends FactContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprIdContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumContext extends FactContext {
		public TerminalNode NUM() { return getToken(grammarCParser.NUM, 0); }
		public ExprNumContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCharContext extends FactContext {
		public TerminalNode CHARC() { return getToken(grammarCParser.CHARC, 0); }
		public ExprCharContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fact);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case B_EXPR:
				_localctx = new Expr2parContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(B_EXPR);
				setState(88);
				expr();
				setState(89);
				match(E_EXPR);
				}
				break;
			case NUM:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new ExprIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new ExprStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(STRING);
				}
				break;
			case CHARC:
				_localctx = new ExprCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(CHARC);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new ExprBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				booleanb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanbContext extends ParserRuleContext {
		public BooleanbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanb; }
	 
		public BooleanbContext() { }
		public void copyFrom(BooleanbContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprFalseContext extends BooleanbContext {
		public TerminalNode FALSE() { return getToken(grammarCParser.FALSE, 0); }
		public ExprFalseContext(BooleanbContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTrueContext extends BooleanbContext {
		public TerminalNode TRUE() { return getToken(grammarCParser.TRUE, 0); }
		public ExprTrueContext(BooleanbContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanbContext booleanb() throws RecognitionException {
		BooleanbContext _localctx = new BooleanbContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_booleanb);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockSingleContext extends BlockContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockSingleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitBlockSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockComposeContext extends BlockContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockComposeContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitBlockCompose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BlockSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(102);
					stmt();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new BlockComposeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(B_BLOCK);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << TRUE) | (1L << FALSE) | (1L << B_EXPR) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << CHARC) | (1L << NUM) | (1L << ID) | (1L << STRING) | (1L << SCANF))) != 0)) {
					{
					{
					setState(106);
					stmt();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(E_BLOCK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtScanContext extends StmtContext {
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarCParser.EOL, 0); }
		public StmtScanContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtScan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtExprContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarCParser.EOL, 0); }
		public StmtExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtWhileContext extends StmtContext {
		public WhileeContext whilee() {
			return getRuleContext(WhileeContext.class,0);
		}
		public StmtWhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAttrContext extends StmtContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarCParser.EOL, 0); }
		public StmtAttrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtForContext extends StmtContext {
		public FoorContext foor() {
			return getRuleContext(FoorContext.class,0);
		}
		public StmtForContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfContext extends StmtContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public StmtIfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrintfContext extends StmtContext {
		public PrintfinContext printfin() {
			return getRuleContext(PrintfinContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarCParser.EOL, 0); }
		public StmtPrintfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtPrintf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmrDecContext extends StmtContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarCParser.EOL, 0); }
		public StmrDecContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmrDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StmtPrintfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				printfin();
				setState(116);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				ifstmt();
				}
				break;
			case 3:
				_localctx = new StmtAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				attr();
				setState(120);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new StmtExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				expr();
				setState(123);
				match(EOL);
				}
				break;
			case 5:
				_localctx = new StmtScanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				scan();
				setState(126);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new StmrDecContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				dec();
				setState(129);
				match(EOL);
				}
				break;
			case 7:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				whilee();
				}
				break;
			case 8:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				foor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileeContext extends ParserRuleContext {
		public WhileeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilee; }
	 
		public WhileeContext() { }
		public void copyFrom(WhileeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhilexContext extends WhileeContext {
		public TerminalNode WHILE() { return getToken(grammarCParser.WHILE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilexContext(WhileeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitWhilex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileeContext whilee() throws RecognitionException {
		WhileeContext _localctx = new WhileeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilee);
		try {
			_localctx = new WhilexContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WHILE);
			setState(136);
			match(B_EXPR);
			setState(137);
			cond();
			setState(138);
			match(E_EXPR);
			setState(139);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FoorContext extends ParserRuleContext {
		public FoorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foor; }
	 
		public FoorContext() { }
		public void copyFrom(FoorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FoorxContext extends FoorContext {
		public TerminalNode FOR() { return getToken(grammarCParser.FOR, 0); }
		public ForzinContext forzin() {
			return getRuleContext(ForzinContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(grammarCParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(grammarCParser.EOL, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FoorxContext(FoorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitFoorx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoorContext foor() throws RecognitionException {
		FoorContext _localctx = new FoorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_foor);
		try {
			_localctx = new FoorxContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FOR);
			setState(142);
			match(B_EXPR);
			setState(143);
			forzin();
			setState(144);
			match(EOL);
			setState(145);
			cond();
			setState(146);
			match(EOL);
			setState(147);
			attr();
			setState(148);
			match(E_EXPR);
			setState(149);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForzinContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public ForzinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forzin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitForzin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForzinContext forzin() throws RecognitionException {
		ForzinContext _localctx = new ForzinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forzin);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				attr();
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanContext extends ParserRuleContext {
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
	 
		public ScanContext() { }
		public void copyFrom(ScanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrScanContext extends ScanContext {
		public TerminalNode SCANF() { return getToken(grammarCParser.SCANF, 0); }
		public TerminalNode PORC() { return getToken(grammarCParser.PORC, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public AttrScanContext(ScanContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitAttrScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scan);
		try {
			_localctx = new AttrScanContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SCANF);
			setState(156);
			match(B_EXPR);
			setState(157);
			match(PORC);
			setState(158);
			types();
			setState(159);
			match(T__0);
			setState(160);
			match(ID);
			setState(161);
			match(E_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(grammarCParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(grammarCParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(grammarCParser.INT, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintfinContext extends ParserRuleContext {
		public PrintfinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printfin; }
	 
		public PrintfinContext() { }
		public void copyFrom(PrintfinContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends PrintfinContext {
		public TerminalNode B_EXPR() { return getToken(grammarCParser.B_EXPR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode E_EXPR() { return getToken(grammarCParser.E_EXPR, 0); }
		public PrintContext(PrintfinContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfinContext printfin() throws RecognitionException {
		PrintfinContext _localctx = new PrintfinContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printfin);
		try {
			_localctx = new PrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__1);
			setState(166);
			match(B_EXPR);
			setState(167);
			expr();
			setState(168);
			match(E_EXPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	 
		public AttrContext() { }
		public void copyFrom(AttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrMinuMinusContext extends AttrContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public AttrMinuMinusContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitAttrMinuMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrPlusPlusContext extends AttrContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public AttrPlusPlusContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitAttrPlusPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrExprContext extends AttrContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrExprContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitAttrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attr);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AttrExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				setState(171);
				match(EQUALS);
				setState(172);
				expr();
				}
				break;
			case 2:
				_localctx = new AttrMinuMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(ID);
				setState(174);
				match(MINUS);
				setState(175);
				match(MINUS);
				}
				break;
			case 3:
				_localctx = new AttrPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(ID);
				setState(177);
				match(SUM);
				setState(178);
				match(SUM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclArrayContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclArrayContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclVSimpleContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclVSimpleContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclVSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclArraySContext extends DecContext {
		public TerminalNode CHAR() { return getToken(grammarCParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public TerminalNode STRING() { return getToken(grammarCParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclArraySContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclArrayS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclValuePointerContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclValuePointerContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclValuePointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclSimpleContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public DeclSimpleContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclPointerContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public DeclPointerContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dec);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				type();
				setState(182);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclPointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				type();
				setState(185);
				match(MULT);
				setState(186);
				match(ID);
				}
				break;
			case 3:
				_localctx = new DeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				type();
				setState(189);
				match(ID);
				setState(190);
				match(T__2);
				setState(191);
				expr();
				setState(192);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new DeclVSimpleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				type();
				setState(195);
				match(ID);
				setState(196);
				match(EQUALS);
				setState(197);
				expr();
				}
				break;
			case 5:
				_localctx = new DeclValuePointerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				type();
				setState(200);
				match(MULT);
				setState(201);
				match(ID);
				setState(202);
				match(EQUALS);
				setState(203);
				expr();
				}
				break;
			case 6:
				_localctx = new DeclArraySContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(CHAR);
				setState(206);
				match(ID);
				setState(207);
				match(T__2);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << B_EXPR) | (1L << CHARC) | (1L << NUM) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					setState(208);
					expr();
					}
				}

				setState(211);
				match(T__3);
				setState(212);
				match(EQUALS);
				setState(213);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(grammarCParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(grammarCParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(grammarCParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(grammarCParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\5\b"+
		"g\n\b\3\t\5\tj\n\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\5\tt\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0088\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\5\r\u009c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00b6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\22\3\22\3\22\5\22\u00d9"+
		"\n\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$\2\5\3\2\27\33\3\2\b\n\4\2\b\n&&\u00ea\2\'\3\2\2\2\4:\3\2\2\2\6A\3\2"+
		"\2\2\bL\3\2\2\2\nW\3\2\2\2\fb\3\2\2\2\16f\3\2\2\2\20s\3\2\2\2\22\u0087"+
		"\3\2\2\2\24\u0089\3\2\2\2\26\u008f\3\2\2\2\30\u009b\3\2\2\2\32\u009d\3"+
		"\2\2\2\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00b5\3\2\2\2\"\u00d8\3\2\2"+
		"\2$\u00da\3\2\2\2&(\5\22\n\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*\3\3\2\2\2+,\7\36\2\2,-\7\23\2\2-.\5\6\4\2./\7\24\2\2/\60\5\20\t\2\60"+
		"\61\5\20\t\2\61;\3\2\2\2\62\63\7\36\2\2\63\64\7\23\2\2\64\65\5\6\4\2\65"+
		"\66\7\24\2\2\66\67\5\20\t\2\678\7\'\2\289\5\20\t\29;\3\2\2\2:+\3\2\2\2"+
		":\62\3\2\2\2;\5\3\2\2\2<B\5\b\5\2=>\5\b\5\2>?\t\2\2\2?@\5\b\5\2@B\3\2"+
		"\2\2A<\3\2\2\2A=\3\2\2\2B\7\3\2\2\2CD\5\n\6\2DE\7\13\2\2EF\5\b\5\2FM\3"+
		"\2\2\2GH\5\n\6\2HI\7\16\2\2IJ\5\b\5\2JM\3\2\2\2KM\5\n\6\2LC\3\2\2\2LG"+
		"\3\2\2\2LK\3\2\2\2M\t\3\2\2\2NO\5\f\7\2OP\7\r\2\2PQ\5\b\5\2QX\3\2\2\2"+
		"RS\5\f\7\2ST\7\f\2\2TU\5\b\5\2UX\3\2\2\2VX\5\f\7\2WN\3\2\2\2WR\3\2\2\2"+
		"WV\3\2\2\2X\13\3\2\2\2YZ\7\23\2\2Z[\5\b\5\2[\\\7\24\2\2\\c\3\2\2\2]c\7"+
		"$\2\2^c\7%\2\2_c\7&\2\2`c\7#\2\2ac\5\16\b\2bY\3\2\2\2b]\3\2\2\2b^\3\2"+
		"\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2dg\7\20\2\2eg\7\21\2\2fd"+
		"\3\2\2\2fe\3\2\2\2g\17\3\2\2\2hj\5\22\n\2ih\3\2\2\2ij\3\2\2\2jt\3\2\2"+
		"\2ko\7*\2\2ln\5\22\n\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2"+
		"\2qo\3\2\2\2rt\7+\2\2si\3\2\2\2sk\3\2\2\2t\21\3\2\2\2uv\5\36\20\2vw\7"+
		",\2\2w\u0088\3\2\2\2x\u0088\5\4\3\2yz\5 \21\2z{\7,\2\2{\u0088\3\2\2\2"+
		"|}\5\b\5\2}~\7,\2\2~\u0088\3\2\2\2\177\u0080\5\32\16\2\u0080\u0081\7,"+
		"\2\2\u0081\u0088\3\2\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7,\2\2\u0084"+
		"\u0088\3\2\2\2\u0085\u0088\5\24\13\2\u0086\u0088\5\26\f\2\u0087u\3\2\2"+
		"\2\u0087x\3\2\2\2\u0087y\3\2\2\2\u0087|\3\2\2\2\u0087\177\3\2\2\2\u0087"+
		"\u0082\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\23\3\2\2"+
		"\2\u0089\u008a\7\35\2\2\u008a\u008b\7\23\2\2\u008b\u008c\5\6\4\2\u008c"+
		"\u008d\7\24\2\2\u008d\u008e\5\20\t\2\u008e\25\3\2\2\2\u008f\u0090\7 \2"+
		"\2\u0090\u0091\7\23\2\2\u0091\u0092\5\30\r\2\u0092\u0093\7,\2\2\u0093"+
		"\u0094\5\6\4\2\u0094\u0095\7,\2\2\u0095\u0096\5 \21\2\u0096\u0097\7\24"+
		"\2\2\u0097\u0098\5\20\t\2\u0098\27\3\2\2\2\u0099\u009c\5 \21\2\u009a\u009c"+
		"\5\"\22\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\31\3\2\2\2\u009d"+
		"\u009e\7)\2\2\u009e\u009f\7\23\2\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\5"+
		"\34\17\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\7%\2\2\u00a3\u00a4\7\24\2\2\u00a4"+
		"\33\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8"+
		"\u00a9\7\23\2\2\u00a9\u00aa\5\b\5\2\u00aa\u00ab\7\24\2\2\u00ab\37\3\2"+
		"\2\2\u00ac\u00ad\7%\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00b6\5\b\5\2\u00af"+
		"\u00b0\7%\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b6\7\16\2\2\u00b2\u00b3\7"+
		"%\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b6\7\13\2\2\u00b5\u00ac\3\2\2\2\u00b5"+
		"\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6!\3\2\2\2\u00b7\u00b8\5$\23\2"+
		"\u00b8\u00b9\7%\2\2\u00b9\u00d9\3\2\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc"+
		"\7\r\2\2\u00bc\u00bd\7%\2\2\u00bd\u00d9\3\2\2\2\u00be\u00bf\5$\23\2\u00bf"+
		"\u00c0\7%\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3\7\6"+
		"\2\2\u00c3\u00d9\3\2\2\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\7%\2\2\u00c6"+
		"\u00c7\7\22\2\2\u00c7\u00c8\5\b\5\2\u00c8\u00d9\3\2\2\2\u00c9\u00ca\5"+
		"$\23\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\7%\2\2\u00cc\u00cd\7\22\2\2\u00cd"+
		"\u00ce\5\b\5\2\u00ce\u00d9\3\2\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\7%"+
		"\2\2\u00d1\u00d3\7\5\2\2\u00d2\u00d4\5\b\5\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\6\2\2\u00d6\u00d7\7\22"+
		"\2\2\u00d7\u00d9\7&\2\2\u00d8\u00b7\3\2\2\2\u00d8\u00ba\3\2\2\2\u00d8"+
		"\u00be\3\2\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00cf\3\2"+
		"\2\2\u00d9#\3\2\2\2\u00da\u00db\t\4\2\2\u00db%\3\2\2\2\21):ALWbfios\u0087"+
		"\u009b\u00b5\u00d3\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
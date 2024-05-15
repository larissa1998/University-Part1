// Generated from /home/a120124/Área de Trabalho/Mini C/grammar/parser/grammarC.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarCLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "I", "INT", "DOUBLE", "CHAR", "SUM", "DIV", 
		"MULT", "MINUS", "PORC", "TRUE", "FALSE", "EQUALS", "B_EXPR", "E_EXPR", 
		"SWITCH", "CASE", "M_IGUAL", "Ma_IGUAL", "MAIOR", "MENOR", "EEQUALS", 
		"DIF", "WHILE", "IF", "DO", "FOR", "BREAK", "DEFAULT", "CHARC", "NUM", 
		"ID", "STRING", "ELSE", "PRINTF", "SCANF", "B_BLOCK", "E_BLOCK", "EOL", 
		"D", "S", "WS"
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


	public grammarCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammarC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\6#\u00d7"+
		"\n#\r#\16#\u00d8\3$\3$\7$\u00dd\n$\f$\16$\u00e0\13$\3%\3%\7%\u00e4\n%"+
		"\f%\16%\u00e7\13%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\2\2/\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac"+
		"|\6\2\f\f\17\17$$^^\4\2\13\f\"\"\u010d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7f\3\2\2\2\th\3\2\2\2\13j\3\2\2\2\rl\3"+
		"\2\2\2\17p\3\2\2\2\21w\3\2\2\2\23|\3\2\2\2\25~\3\2\2\2\27\u0080\3\2\2"+
		"\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2\2"+
		"!\u0091\3\2\2\2#\u0093\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u009e\3"+
		"\2\2\2+\u00a3\3\2\2\2-\u00a6\3\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63"+
		"\u00ad\3\2\2\2\65\u00b0\3\2\2\2\67\u00b3\3\2\2\29\u00b9\3\2\2\2;\u00bc"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c3\3\2\2\2A\u00c9\3\2\2\2C\u00d1\3\2\2\2E"+
		"\u00d6\3\2\2\2G\u00da\3\2\2\2I\u00e1\3\2\2\2K\u00ea\3\2\2\2M\u00ef\3\2"+
		"\2\2O\u00f7\3\2\2\2Q\u00fd\3\2\2\2S\u00ff\3\2\2\2U\u0101\3\2\2\2W\u0103"+
		"\3\2\2\2Y\u0105\3\2\2\2[\u0107\3\2\2\2]^\7.\2\2^\4\3\2\2\2_`\7r\2\2`a"+
		"\7t\2\2ab\7k\2\2bc\7p\2\2cd\7v\2\2de\7h\2\2e\6\3\2\2\2fg\7]\2\2g\b\3\2"+
		"\2\2hi\7_\2\2i\n\3\2\2\2jk\7k\2\2k\f\3\2\2\2lm\7k\2\2mn\7p\2\2no\7v\2"+
		"\2o\16\3\2\2\2pq\7f\2\2qr\7q\2\2rs\7w\2\2st\7d\2\2tu\7n\2\2uv\7g\2\2v"+
		"\20\3\2\2\2wx\7e\2\2xy\7j\2\2yz\7c\2\2z{\7t\2\2{\22\3\2\2\2|}\7-\2\2}"+
		"\24\3\2\2\2~\177\7\61\2\2\177\26\3\2\2\2\u0080\u0081\7,\2\2\u0081\30\3"+
		"\2\2\2\u0082\u0083\7/\2\2\u0083\32\3\2\2\2\u0084\u0085\7\'\2\2\u0085\34"+
		"\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7w\2\2\u0089"+
		"\u008a\7g\2\2\u008a\36\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7n\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090 \3\2\2\2\u0091"+
		"\u0092\7?\2\2\u0092\"\3\2\2\2\u0093\u0094\7*\2\2\u0094$\3\2\2\2\u0095"+
		"\u0096\7+\2\2\u0096&\3\2\2\2\u0097\u0098\7u\2\2\u0098\u0099\7y\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7v\2\2\u009b\u009c\7e\2\2\u009c\u009d\7j\2\2"+
		"\u009d(\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7u\2"+
		"\2\u00a1\u00a2\7g\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\u00a5\7"+
		"?\2\2\u00a5,\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8\7?\2\2\u00a8.\3\2"+
		"\2\2\u00a9\u00aa\7@\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\62\3"+
		"\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7?\2\2\u00af\64\3\2\2\2\u00b0\u00b1"+
		"\7#\2\2\u00b1\u00b2\7?\2\2\u00b2\66\3\2\2\2\u00b3\u00b4\7y\2\2\u00b4\u00b5"+
		"\7j\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"8\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb:\3\2\2\2\u00bc\u00bd"+
		"\7f\2\2\u00bd\u00be\7q\2\2\u00be<\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c2\7t\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5"+
		"\7t\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7m\2\2\u00c8"+
		"@\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7h\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7v\2\2"+
		"\u00d0B\3\2\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\13\2\2\2\u00d3\u00d4\7"+
		")\2\2\u00d4D\3\2\2\2\u00d5\u00d7\t\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9F\3\2\2\2\u00da"+
		"\u00de\t\3\2\2\u00db\u00dd\t\4\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00dfH\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e5\7$\2\2\u00e2\u00e4\n\5\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9J\3\2\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee"+
		"L\3\2\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7p\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7h\2\2\u00f5\u00f6\7c\2\2"+
		"\u00f6N\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7c\2"+
		"\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7h\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7"+
		"}\2\2\u00feR\3\2\2\2\u00ff\u0100\7\177\2\2\u0100T\3\2\2\2\u0101\u0102"+
		"\7=\2\2\u0102V\3\2\2\2\u0103\u0104\7f\2\2\u0104X\3\2\2\2\u0105\u0106\7"+
		"u\2\2\u0106Z\3\2\2\2\u0107\u0108\t\6\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\b.\2\2\u010a\\\3\2\2\2\6\2\u00d8\u00de\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, PRINT=2, INPUT=3, IF=4, WHILE=5, EQ=6, NEQ=7, LT=8, LE=9, GT=10, 
		GE=11, OPSUM=12, OPSUB=13, OPMUL=14, OPDIV=15, OPEXP=16, FLOAT=17, INT=18, 
		ID=19, LPAREN=20, RPAREN=21, SEMICOLON=22, ASSIGN=23, LBRACE=24, RBRACE=25, 
		WS=26, LINE_COMMENT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VAR", "PRINT", "INPUT", "IF", "WHILE", "EQ", "NEQ", "LT", "LE", "GT", 
			"GE", "OPSUM", "OPSUB", "OPMUL", "OPDIV", "OPEXP", "FLOAT", "INT", "ID", 
			"LPAREN", "RPAREN", "SEMICOLON", "ASSIGN", "LBRACE", "RBRACE", "WS", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'print'", "'input'", "'if'", "'while'", "'=='", "'!='", 
			"'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'^'", null, 
			null, null, "'('", "')'", "';'", "'='", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "PRINT", "INPUT", "IF", "WHILE", "EQ", "NEQ", "LT", "LE", 
			"GT", "GE", "OPSUM", "OPSUB", "OPMUL", "OPDIV", "OPEXP", "FLOAT", "INT", 
			"ID", "LPAREN", "RPAREN", "SEMICOLON", "ASSIGN", "LBRACE", "RBRACE", 
			"WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001b\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010l\b\u0010\u000b\u0010\f\u0010m\u0001\u0010\u0001\u0010\u0005"+
		"\u0010r\b\u0010\n\u0010\f\u0010u\t\u0010\u0001\u0010\u0005\u0010x\b\u0010"+
		"\n\u0010\f\u0010{\t\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u007f\b"+
		"\u0010\u000b\u0010\f\u0010\u0080\u0003\u0010\u0083\b\u0010\u0001\u0011"+
		"\u0004\u0011\u0086\b\u0011\u000b\u0011\f\u0011\u0087\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u008c\b\u0012\n\u0012\f\u0012\u008f\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0004\u0019\u009e\b\u0019\u000b\u0019\f\u0019\u009f\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00a8"+
		"\b\u001a\n\u001a\f\u001a\u00ab\t\u001a\u0001\u001a\u0001\u001a\u0000\u0000"+
		"\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b\u0001\u0000\u0005\u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00b6"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000"+
		"\u0003;\u0001\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007G"+
		"\u0001\u0000\u0000\u0000\tJ\u0001\u0000\u0000\u0000\u000bP\u0001\u0000"+
		"\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000"+
		"\u0011X\u0001\u0000\u0000\u0000\u0013[\u0001\u0000\u0000\u0000\u0015]"+
		"\u0001\u0000\u0000\u0000\u0017`\u0001\u0000\u0000\u0000\u0019b\u0001\u0000"+
		"\u0000\u0000\u001bd\u0001\u0000\u0000\u0000\u001df\u0001\u0000\u0000\u0000"+
		"\u001fh\u0001\u0000\u0000\u0000!\u0082\u0001\u0000\u0000\u0000#\u0085"+
		"\u0001\u0000\u0000\u0000%\u0089\u0001\u0000\u0000\u0000\'\u0090\u0001"+
		"\u0000\u0000\u0000)\u0092\u0001\u0000\u0000\u0000+\u0094\u0001\u0000\u0000"+
		"\u0000-\u0096\u0001\u0000\u0000\u0000/\u0098\u0001\u0000\u0000\u00001"+
		"\u009a\u0001\u0000\u0000\u00003\u009d\u0001\u0000\u0000\u00005\u00a3\u0001"+
		"\u0000\u0000\u000078\u0005v\u0000\u000089\u0005a\u0000\u00009:\u0005r"+
		"\u0000\u0000:\u0002\u0001\u0000\u0000\u0000;<\u0005p\u0000\u0000<=\u0005"+
		"r\u0000\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000\u0000?@\u0005t\u0000"+
		"\u0000@\u0004\u0001\u0000\u0000\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000"+
		"\u0000CD\u0005p\u0000\u0000DE\u0005u\u0000\u0000EF\u0005t\u0000\u0000"+
		"F\u0006\u0001\u0000\u0000\u0000GH\u0005i\u0000\u0000HI\u0005f\u0000\u0000"+
		"I\b\u0001\u0000\u0000\u0000JK\u0005w\u0000\u0000KL\u0005h\u0000\u0000"+
		"LM\u0005i\u0000\u0000MN\u0005l\u0000\u0000NO\u0005e\u0000\u0000O\n\u0001"+
		"\u0000\u0000\u0000PQ\u0005=\u0000\u0000QR\u0005=\u0000\u0000R\f\u0001"+
		"\u0000\u0000\u0000ST\u0005!\u0000\u0000TU\u0005=\u0000\u0000U\u000e\u0001"+
		"\u0000\u0000\u0000VW\u0005<\u0000\u0000W\u0010\u0001\u0000\u0000\u0000"+
		"XY\u0005<\u0000\u0000YZ\u0005=\u0000\u0000Z\u0012\u0001\u0000\u0000\u0000"+
		"[\\\u0005>\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000]^\u0005>\u0000"+
		"\u0000^_\u0005=\u0000\u0000_\u0016\u0001\u0000\u0000\u0000`a\u0005+\u0000"+
		"\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005-\u0000\u0000c\u001a\u0001"+
		"\u0000\u0000\u0000de\u0005*\u0000\u0000e\u001c\u0001\u0000\u0000\u0000"+
		"fg\u0005/\u0000\u0000g\u001e\u0001\u0000\u0000\u0000hi\u0005^\u0000\u0000"+
		"i \u0001\u0000\u0000\u0000jl\u0007\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000os\u0005.\u0000\u0000pr\u0007\u0000"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0083\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vx\u0007\u0000\u0000\u0000wv\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|~\u0005.\u0000\u0000}\u007f\u0007\u0000\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082k\u0001\u0000\u0000\u0000\u0082y\u0001\u0000\u0000\u0000\u0083\""+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0007\u0000\u0000\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088$\u0001"+
		"\u0000\u0000\u0000\u0089\u008d\u0007\u0001\u0000\u0000\u008a\u008c\u0007"+
		"\u0002\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e&\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005(\u0000\u0000\u0091(\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005)\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005;\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096\u0097\u0005="+
		"\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0099\u0005{\u0000\u0000"+
		"\u00990\u0001\u0000\u0000\u0000\u009a\u009b\u0005}\u0000\u0000\u009b2"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0007\u0003\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006\u0019\u0000\u0000\u00a24\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005/\u0000\u0000\u00a4\u00a5\u0005/\u0000"+
		"\u0000\u00a5\u00a9\u0001\u0000\u0000\u0000\u00a6\u00a8\b\u0004\u0000\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0006\u001a\u0000\u0000\u00ad6\u0001\u0000\u0000\u0000\n"+
		"\u0000msy\u0080\u0082\u0087\u008d\u009f\u00a9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
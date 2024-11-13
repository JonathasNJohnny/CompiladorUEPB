// Generated from ExprLexer.g4 by ANTLR 4.13.2
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
		FLOAT=1, INT=2, ID=3, OPSUM=4, OPSUB=5, OPMUL=6, OPDIV=7, OPEXP=8, LPAREN=9, 
		RPAREN=10, SEMICOLON=11, IF=12, WHILE=13, PRINT=14, INPUT=15, EQ=16, NEQ=17, 
		LT=18, LE=19, GT=20, GE=21, AND=22, OR=23, WS=24, LINE_COMMENT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FLOAT", "INT", "ID", "OPSUM", "OPSUB", "OPMUL", "OPDIV", "OPEXP", "LPAREN", 
			"RPAREN", "SEMICOLON", "IF", "WHILE", "PRINT", "INPUT", "EQ", "NEQ", 
			"LT", "LE", "GT", "GE", "AND", "OR", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", 
			"';'", "'if'", "'while'", "'print'", "'input'", "'=='", "'!='", "'<'", 
			"'<='", "'>'", "'>='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "INT", "ID", "OPSUM", "OPSUB", "OPMUL", "OPDIV", "OPEXP", 
			"LPAREN", "RPAREN", "SEMICOLON", "IF", "WHILE", "PRINT", "INPUT", "EQ", 
			"NEQ", "LT", "LE", "GT", "GE", "AND", "OR", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "ExprLexer.g4"; }

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
		"\u0004\u0000\u0019\u00a7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0004\u00005\b\u0000\u000b\u0000"+
		"\f\u00006\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000"+
		">\t\u0000\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0004\u0000H\b\u0000\u000b\u0000\f\u0000I\u0003\u0000"+
		"L\b\u0000\u0001\u0001\u0004\u0001O\b\u0001\u000b\u0001\f\u0001P\u0001"+
		"\u0002\u0001\u0002\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0004\u0017\u0097\b\u0017\u000b\u0017\f\u0017\u0098\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u00a1\b\u0018\n\u0018\f\u0018\u00a4\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0005\u0001\u000009\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00af"+
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
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0001K\u0001\u0000"+
		"\u0000\u0000\u0003N\u0001\u0000\u0000\u0000\u0005R\u0001\u0000\u0000\u0000"+
		"\u0007Y\u0001\u0000\u0000\u0000\t[\u0001\u0000\u0000\u0000\u000b]\u0001"+
		"\u0000\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000fa\u0001\u0000\u0000"+
		"\u0000\u0011c\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000\u0015"+
		"g\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019l\u0001"+
		"\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001dx\u0001\u0000\u0000"+
		"\u0000\u001f~\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#"+
		"\u0084\u0001\u0000\u0000\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0089"+
		"\u0001\u0000\u0000\u0000)\u008b\u0001\u0000\u0000\u0000+\u008e\u0001\u0000"+
		"\u0000\u0000-\u0092\u0001\u0000\u0000\u0000/\u0096\u0001\u0000\u0000\u0000"+
		"1\u009c\u0001\u0000\u0000\u000035\u0007\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008<\u0005.\u0000\u00009;\u0007"+
		"\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=L\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?A\u0007\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"EG\u0005.\u0000\u0000FH\u0007\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JL\u0001\u0000\u0000\u0000K4\u0001\u0000\u0000\u0000KB\u0001\u0000"+
		"\u0000\u0000L\u0002\u0001\u0000\u0000\u0000MO\u0007\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u0004\u0001\u0000\u0000\u0000RV\u0007"+
		"\u0001\u0000\u0000SU\u0007\u0002\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W\u0006\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005"+
		"+\u0000\u0000Z\b\u0001\u0000\u0000\u0000[\\\u0005-\u0000\u0000\\\n\u0001"+
		"\u0000\u0000\u0000]^\u0005*\u0000\u0000^\f\u0001\u0000\u0000\u0000_`\u0005"+
		"/\u0000\u0000`\u000e\u0001\u0000\u0000\u0000ab\u0005^\u0000\u0000b\u0010"+
		"\u0001\u0000\u0000\u0000cd\u0005(\u0000\u0000d\u0012\u0001\u0000\u0000"+
		"\u0000ef\u0005)\u0000\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005;\u0000"+
		"\u0000h\u0016\u0001\u0000\u0000\u0000ij\u0005i\u0000\u0000jk\u0005f\u0000"+
		"\u0000k\u0018\u0001\u0000\u0000\u0000lm\u0005w\u0000\u0000mn\u0005h\u0000"+
		"\u0000no\u0005i\u0000\u0000op\u0005l\u0000\u0000pq\u0005e\u0000\u0000"+
		"q\u001a\u0001\u0000\u0000\u0000rs\u0005p\u0000\u0000st\u0005r\u0000\u0000"+
		"tu\u0005i\u0000\u0000uv\u0005n\u0000\u0000vw\u0005t\u0000\u0000w\u001c"+
		"\u0001\u0000\u0000\u0000xy\u0005i\u0000\u0000yz\u0005n\u0000\u0000z{\u0005"+
		"p\u0000\u0000{|\u0005u\u0000\u0000|}\u0005t\u0000\u0000}\u001e\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005=\u0000\u0000\u007f\u0080\u0005=\u0000\u0000"+
		"\u0080 \u0001\u0000\u0000\u0000\u0081\u0082\u0005!\u0000\u0000\u0082\u0083"+
		"\u0005=\u0000\u0000\u0083\"\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"<\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0087\u0005<\u0000"+
		"\u0000\u0087\u0088\u0005=\u0000\u0000\u0088&\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005>\u0000\u0000\u008a(\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		">\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d*\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005n\u0000\u0000\u0090"+
		"\u0091\u0005d\u0000\u0000\u0091,\u0001\u0000\u0000\u0000\u0092\u0093\u0005"+
		"o\u0000\u0000\u0093\u0094\u0005r\u0000\u0000\u0094.\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0007\u0003\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0006\u0017\u0000\u0000\u009b0\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005/\u0000\u0000\u009d\u009e\u0005/\u0000\u0000\u009e\u00a2"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\b\u0004\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0006"+
		"\u0018\u0000\u0000\u00a62\u0001\u0000\u0000\u0000\n\u00006<BIKPV\u0098"+
		"\u00a2\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
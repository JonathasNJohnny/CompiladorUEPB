// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, INT=2, FLOAT=3, ID=4, LPAREN=5, RPAREN=6, OPSUM=7, OPSUB=8, 
		OPMUL=9, OPDIV=10, OPEXP=11;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_restExpr = 2, RULE_termo = 3, RULE_restTermo = 4, 
		RULE_potencia = 5, RULE_fator = 6, RULE_op1 = 7, RULE_op2 = 8, RULE_op3 = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "restExpr", "termo", "restTermo", "potencia", "fator", 
			"op1", "op2", "op3"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "INT", "FLOAT", "ID", "LPAREN", "RPAREN", "OPSUM", 
			"OPSUB", "OPMUL", "OPDIV", "OPEXP"
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

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ExprParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ExprParser.SEMICOLON, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			expr();
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(21);
					match(SEMICOLON);
					setState(22);
					expr();
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(28);
				match(SEMICOLON);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public RestExprContext restExpr() {
			return getRuleContext(RestExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			termo();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPSUM || _la==OPSUB) {
				{
				setState(32);
				restExpr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestExprContext extends ParserRuleContext {
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public RestExprContext restExpr() {
			return getRuleContext(RestExprContext.class,0);
		}
		public RestExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRestExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRestExpr(this);
		}
	}

	public final RestExprContext restExpr() throws RecognitionException {
		RestExprContext _localctx = new RestExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_restExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			op1();
			setState(36);
			termo();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPSUM || _la==OPSUB) {
				{
				setState(37);
				restExpr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public RestTermoContext restTermo() {
			return getRuleContext(RestTermoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			potencia();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPMUL || _la==OPDIV) {
				{
				setState(41);
				restTermo();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestTermoContext extends ParserRuleContext {
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public RestTermoContext restTermo() {
			return getRuleContext(RestTermoContext.class,0);
		}
		public RestTermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restTermo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterRestTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitRestTermo(this);
		}
	}

	public final RestTermoContext restTermo() throws RecognitionException {
		RestTermoContext _localctx = new RestTermoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_restTermo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			op2();
			setState(45);
			fator();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPMUL || _la==OPDIV) {
				{
				setState(46);
				restTermo();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PotenciaContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Op3Context op3() {
			return getRuleContext(Op3Context.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPotencia(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_potencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			fator();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEXP) {
				{
				setState(50);
				op3();
				setState(51);
				potencia();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ExprParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fator);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				match(LPAREN);
				setState(59);
				expr();
				setState(60);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op1Context extends ParserRuleContext {
		public TerminalNode OPSUM() { return getToken(ExprParser.OPSUM, 0); }
		public TerminalNode OPSUB() { return getToken(ExprParser.OPSUB, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==OPSUM || _la==OPSUB) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op2Context extends ParserRuleContext {
		public TerminalNode OPMUL() { return getToken(ExprParser.OPMUL, 0); }
		public TerminalNode OPDIV() { return getToken(ExprParser.OPDIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==OPMUL || _la==OPDIV) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op3Context extends ParserRuleContext {
		public TerminalNode OPEXP() { return getToken(ExprParser.OPEXP, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOp3(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(OPEXP);
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
		"\u0004\u0001\u000bG\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0003\u0000\u001e"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00040\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00056\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006?\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0000\u0002\u0001\u0000\u0007\b\u0001\u0000\t\nF\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004"+
		"#\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b,\u0001\u0000"+
		"\u0000\u0000\n1\u0001\u0000\u0000\u0000\f>\u0001\u0000\u0000\u0000\u000e"+
		"@\u0001\u0000\u0000\u0000\u0010B\u0001\u0000\u0000\u0000\u0012D\u0001"+
		"\u0000\u0000\u0000\u0014\u0019\u0003\u0002\u0001\u0000\u0015\u0016\u0005"+
		"\u0001\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u0005"+
		"\u0001\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f!\u0003\u0006"+
		"\u0003\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#$\u0003\u000e\u0007"+
		"\u0000$&\u0003\u0006\u0003\u0000%\'\u0003\u0004\u0002\u0000&%\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000"+
		"(*\u0003\n\u0005\u0000)+\u0003\b\u0004\u0000*)\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+\u0007\u0001\u0000\u0000\u0000,-\u0003\u0010"+
		"\b\u0000-/\u0003\f\u0006\u0000.0\u0003\b\u0004\u0000/.\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000\t\u0001\u0000\u0000\u000015\u0003\f"+
		"\u0006\u000023\u0003\u0012\t\u000034\u0003\n\u0005\u000046\u0001\u0000"+
		"\u0000\u000052\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u000b"+
		"\u0001\u0000\u0000\u00007?\u0005\u0002\u0000\u00008?\u0005\u0003\u0000"+
		"\u00009?\u0005\u0004\u0000\u0000:;\u0005\u0005\u0000\u0000;<\u0003\u0002"+
		"\u0001\u0000<=\u0005\u0006\u0000\u0000=?\u0001\u0000\u0000\u0000>7\u0001"+
		"\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000\u0000"+
		">:\u0001\u0000\u0000\u0000?\r\u0001\u0000\u0000\u0000@A\u0007\u0000\u0000"+
		"\u0000A\u000f\u0001\u0000\u0000\u0000BC\u0007\u0001\u0000\u0000C\u0011"+
		"\u0001\u0000\u0000\u0000DE\u0005\u000b\u0000\u0000E\u0013\u0001\u0000"+
		"\u0000\u0000\b\u0019\u001d!&*/5>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Slack.g4 by ANTLR 4.9.1

package com.kambr.parser.slack.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SlackParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CLOCK=4, WORD=5, W_S=6, NL=7;
	public static final int
		RULE_conversation = 0, RULE_message = 1, RULE_sender = 2, RULE_time = 3, 
		RULE_text = 4, RULE_sentence = 5, RULE_amORpm = 6, RULE_emoji = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"conversation", "message", "sender", "time", "text", "sentence", "amORpm", 
			"emoji"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "':'", "')'", null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "CLOCK", "WORD", "W_S", "NL"
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
	public String getGrammarFileName() { return "Slack.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlackParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ConversationContext extends ParserRuleContext {
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public ConversationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterConversation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitConversation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitConversation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversationContext conversation() throws RecognitionException {
		ConversationContext _localctx = new ConversationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_conversation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				message();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
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

	public static class MessageContext extends ParserRuleContext {
		public SenderContext sender() {
			return getRuleContext(SenderContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode NL() { return getToken(SlackParser.NL, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			sender();
			setState(22);
			time();
			setState(23);
			match(NL);
			setState(24);
			text();
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

	public static class SenderContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(SlackParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SlackParser.WORD, i);
		}
		public SenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sender; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterSender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitSender(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitSender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenderContext sender() throws RecognitionException {
		SenderContext _localctx = new SenderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sender);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(WORD);
			setState(30); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(27);
					match(T__0);
					setState(28);
					match(WORD);
					setState(29);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(32); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(34);
			match(T__0);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode CLOCK() { return getToken(SlackParser.CLOCK, 0); }
		public AmORpmContext amORpm() {
			return getRuleContext(AmORpmContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(CLOCK);
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(37);
				match(T__0);
				setState(38);
				amORpm();
				}
				break;
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

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(SlackParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(SlackParser.NL, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					{
					setState(41);
					time();
					setState(42);
					match(NL);
					}
					}
					break;
				case 2:
					{
					setState(44);
					sentence();
					}
					break;
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CLOCK) | (1L << WORD))) != 0) );
			setState(49);
			match(NL);
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

	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SlackParser.NL, 0); }
		public List<TerminalNode> WORD() { return getTokens(SlackParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SlackParser.WORD, i);
		}
		public List<EmojiContext> emoji() {
			return getRuleContexts(EmojiContext.class);
		}
		public EmojiContext emoji(int i) {
			return getRuleContext(EmojiContext.class,i);
		}
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WORD:
					{
					setState(51);
					match(WORD);
					}
					break;
				case T__0:
					{
					setState(52);
					match(T__0);
					}
					break;
				case T__1:
					{
					setState(53);
					emoji();
					}
					break;
				case CLOCK:
					{
					setState(54);
					time();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << CLOCK) | (1L << WORD))) != 0) );
			setState(59);
			match(NL);
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

	public static class AmORpmContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SlackParser.WORD, 0); }
		public AmORpmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amORpm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterAmORpm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitAmORpm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitAmORpm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AmORpmContext amORpm() throws RecognitionException {
		AmORpmContext _localctx = new AmORpmContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_amORpm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(WORD);
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

	public static class EmojiContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SlackParser.WORD, 0); }
		public EmojiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emoji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).enterEmoji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlackListener ) ((SlackListener)listener).exitEmoji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SlackVisitor ) return ((SlackVisitor<? extends T>)visitor).visitEmoji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmojiContext emoji() throws RecognitionException {
		EmojiContext _localctx = new EmojiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_emoji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				{
				setState(64);
				match(WORD);
				setState(65);
				match(T__1);
				}
				}
				break;
			case T__2:
				{
				setState(66);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\tH\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2"+
		"\16\2\25\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4!\n\4\r\4\16\4\"\3\4\3"+
		"\4\3\5\3\5\3\5\5\5*\n\5\3\6\3\6\3\6\3\6\6\6\60\n\6\r\6\16\6\61\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\6\7:\n\7\r\7\16\7;\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5"+
		"\tF\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2I\2\23\3\2\2\2\4\27\3\2\2\2\6"+
		"\34\3\2\2\2\b&\3\2\2\2\n/\3\2\2\2\f9\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22"+
		"\24\5\4\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\3\3\2\2\2\27\30\5\6\4\2\30\31\5\b\5\2\31\32\7\t\2\2\32\33\5\n\6\2\33"+
		"\5\3\2\2\2\34 \7\7\2\2\35\36\7\3\2\2\36\37\7\7\2\2\37!\7\3\2\2 \35\3\2"+
		"\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\3\2\2%\7\3\2\2\2&"+
		")\7\6\2\2\'(\7\3\2\2(*\5\16\b\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2\2\2+,\5\b"+
		"\5\2,-\7\t\2\2-\60\3\2\2\2.\60\5\f\7\2/+\3\2\2\2/.\3\2\2\2\60\61\3\2\2"+
		"\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\t\2\2\64\13\3\2\2\2"+
		"\65:\7\7\2\2\66:\7\3\2\2\67:\5\20\t\28:\5\b\5\29\65\3\2\2\29\66\3\2\2"+
		"\29\67\3\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\t"+
		"\2\2>\r\3\2\2\2?@\7\7\2\2@\17\3\2\2\2AE\7\4\2\2BC\7\7\2\2CF\7\4\2\2DF"+
		"\7\5\2\2EB\3\2\2\2ED\3\2\2\2F\21\3\2\2\2\n\25\")/\619;E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
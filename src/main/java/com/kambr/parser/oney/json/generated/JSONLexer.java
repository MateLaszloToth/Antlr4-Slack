// Generated from JSON.g4 by ANTLR 4.8

package com.kambr.parser.oney.json.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, NUMBER=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRING", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "INT", 
			"EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUMBER", "WS"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13F\n"+
		"\13\r\13\16\13G\3\f\3\f\3\f\5\fM\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\5\20Z\n\20\3\20\3\20\3\20\6\20_\n\20\r\20\16\20`\5\20"+
		"c\n\20\3\20\5\20f\n\20\3\21\3\21\3\21\7\21k\n\21\f\21\16\21n\13\21\5\21"+
		"p\n\21\3\22\3\22\5\22t\n\22\3\22\3\22\3\23\6\23y\n\23\r\23\16\23z\3\23"+
		"\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33"+
		"\2\35\2\37\r!\2#\2%\16\3\2\n\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\t\2\2"+
		"!$$..<<]_}}\177\177\3\2\62;\3\2\63;\4\2GGgg\4\2--//\6\2\13\f\17\17\"\""+
		"$$\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\37"+
		"\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3"+
		"\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\218\3\2\2\2\23>\3\2\2\2\25E\3\2\2\2"+
		"\27I\3\2\2\2\31N\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37Y\3\2\2\2!o\3\2\2\2"+
		"#q\3\2\2\2%x\3\2\2\2\'(\7}\2\2(\4\3\2\2\2)*\7.\2\2*\6\3\2\2\2+,\7\177"+
		"\2\2,\b\3\2\2\2-.\7<\2\2.\n\3\2\2\2/\60\7]\2\2\60\f\3\2\2\2\61\62\7_\2"+
		"\2\62\16\3\2\2\2\63\64\7v\2\2\64\65\7t\2\2\65\66\7w\2\2\66\67\7g\2\2\67"+
		"\20\3\2\2\289\7h\2\29:\7c\2\2:;\7n\2\2;<\7u\2\2<=\7g\2\2=\22\3\2\2\2>"+
		"?\7p\2\2?@\7w\2\2@A\7n\2\2AB\7n\2\2B\24\3\2\2\2CF\5\27\f\2DF\5\35\17\2"+
		"EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\26\3\2\2\2IL\7^\2"+
		"\2JM\t\2\2\2KM\5\31\r\2LJ\3\2\2\2LK\3\2\2\2M\30\3\2\2\2NO\7w\2\2OP\5\33"+
		"\16\2PQ\5\33\16\2QR\5\33\16\2RS\5\33\16\2S\32\3\2\2\2TU\t\3\2\2U\34\3"+
		"\2\2\2VW\n\4\2\2W\36\3\2\2\2XZ\7/\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[b"+
		"\5!\21\2\\^\7\60\2\2]_\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"ac\3\2\2\2b\\\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5#\22\2ed\3\2\2\2ef\3\2\2"+
		"\2f \3\2\2\2gp\7\62\2\2hl\t\6\2\2ik\t\5\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2og\3\2\2\2oh\3\2\2\2p\"\3\2\2\2qs\t"+
		"\7\2\2rt\t\b\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\5!\21\2v$\3\2\2\2wy\t"+
		"\t\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\23\2\2}&"+
		"\3\2\2\2\16\2EGLY`belosz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
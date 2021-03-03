// Generated from JSON.g4 by ANTLR 4.9.1

package com.kambr.parser.oney.json.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10, STRING=11, NUMBER=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"WS", "STRING", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "INT", 
			"EXP"
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
			null, null, null, null, null, null, null, null, null, null, "WS", "STRING", 
			"NUMBER"
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
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\6\13E\n\13\r"+
		"\13\16\13F\3\13\3\13\3\f\3\f\6\fM\n\f\r\f\16\fN\3\r\3\r\3\r\5\rT\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\5\21a\n\21\3\21"+
		"\3\21\3\21\6\21f\n\21\r\21\16\21g\5\21j\n\21\3\21\5\21m\n\21\3\22\3\22"+
		"\3\22\7\22r\n\22\f\22\16\22u\13\22\5\22w\n\22\3\23\3\23\5\23{\n\23\3\23"+
		"\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33"+
		"\2\35\2\37\2!\16#\2%\2\3\2\n\6\2\13\f\17\17\"\"$$\n\2$$\61\61^^ddhhpp"+
		"ttvv\5\2\62;CHch\t\2\2!$$..<<]_}}\177\177\3\2\62;\3\2\63;\4\2GGgg\4\2"+
		"--//\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2!\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13"+
		"/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\218\3\2\2\2\23>\3\2\2\2\25D\3\2\2"+
		"\2\27L\3\2\2\2\31P\3\2\2\2\33U\3\2\2\2\35[\3\2\2\2\37]\3\2\2\2!`\3\2\2"+
		"\2#v\3\2\2\2%x\3\2\2\2\'(\7}\2\2(\4\3\2\2\2)*\7.\2\2*\6\3\2\2\2+,\7\177"+
		"\2\2,\b\3\2\2\2-.\7<\2\2.\n\3\2\2\2/\60\7]\2\2\60\f\3\2\2\2\61\62\7_\2"+
		"\2\62\16\3\2\2\2\63\64\7v\2\2\64\65\7t\2\2\65\66\7w\2\2\66\67\7g\2\2\67"+
		"\20\3\2\2\289\7h\2\29:\7c\2\2:;\7n\2\2;<\7u\2\2<=\7g\2\2=\22\3\2\2\2>"+
		"?\7p\2\2?@\7w\2\2@A\7n\2\2AB\7n\2\2B\24\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF"+
		"\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\13\2\2I\26\3\2\2\2JM\5\31\r"+
		"\2KM\5\37\20\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\30\3"+
		"\2\2\2PS\7^\2\2QT\t\3\2\2RT\5\33\16\2SQ\3\2\2\2SR\3\2\2\2T\32\3\2\2\2"+
		"UV\7w\2\2VW\5\35\17\2WX\5\35\17\2XY\5\35\17\2YZ\5\35\17\2Z\34\3\2\2\2"+
		"[\\\t\4\2\2\\\36\3\2\2\2]^\n\5\2\2^ \3\2\2\2_a\7/\2\2`_\3\2\2\2`a\3\2"+
		"\2\2ab\3\2\2\2bi\5#\22\2ce\7\60\2\2df\t\6\2\2ed\3\2\2\2fg\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2hj\3\2\2\2ic\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\5%\23\2lk\3"+
		"\2\2\2lm\3\2\2\2m\"\3\2\2\2nw\7\62\2\2os\t\7\2\2pr\t\6\2\2qp\3\2\2\2r"+
		"u\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vo\3\2\2\2"+
		"w$\3\2\2\2xz\t\b\2\2y{\t\t\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\5#\22\2"+
		"}&\3\2\2\2\16\2FLNS`gilsvz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Sync.g4 by ANTLR 4.8

package com.kambr.parser.onex.sync.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyncLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WORD=6, INTEGER=7, NEW_LINE=8, 
		WHITE_SPACE_SKIP=9, SEPARATOR_SKIP=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WORD", "INTEGER", "NEW_LINE", 
			"WHITE_SPACE_SKIP", "SEPARATOR_SKIP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'F;'", "'S;'", "'.'", "'-'", "':'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WORD", "INTEGER", "NEW_LINE", "WHITE_SPACE_SKIP", 
			"SEPARATOR_SKIP"
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


	public SyncLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sync.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7%\n\7\r\7\16"+
		"\7&\3\b\6\b*\n\b\r\b\16\b+\3\t\6\t/\n\t\r\t\16\t\60\3\n\6\n\64\n\n\r\n"+
		"\16\n\65\3\n\3\n\3\13\3\13\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\3\2\6\4\2C\\c|\3\2\62;\4\2\f\f\17\17\3\2\13\13\2@\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5"+
		"\32\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r$\3\2\2\2\17)\3\2\2"+
		"\2\21.\3\2\2\2\23\63\3\2\2\2\259\3\2\2\2\27\30\7H\2\2\30\31\7=\2\2\31"+
		"\4\3\2\2\2\32\33\7U\2\2\33\34\7=\2\2\34\6\3\2\2\2\35\36\7\60\2\2\36\b"+
		"\3\2\2\2\37 \7/\2\2 \n\3\2\2\2!\"\7<\2\2\"\f\3\2\2\2#%\t\2\2\2$#\3\2\2"+
		"\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\16\3\2\2\2(*\t\3\2\2)(\3\2\2\2*+\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\20\3\2\2\2-/\t\4\2\2.-\3\2\2\2/\60\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\22\3\2\2\2\62\64\t\5\2\2\63\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\b\n\2\28\24"+
		"\3\2\2\29:\7=\2\2:;\3\2\2\2;<\b\13\2\2<\26\3\2\2\2\7\2&+\60\65\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
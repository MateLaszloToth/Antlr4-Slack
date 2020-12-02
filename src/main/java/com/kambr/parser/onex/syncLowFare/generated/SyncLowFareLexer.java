// Generated from SyncLowFare.g4 by ANTLR 4.8

package com.kambr.parser.onex.syncLowFare.generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyncLowFareLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DATE=2, NUMBER=3, WORD=4, NEW_LINE=5, SEPARATOR=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DATE", "NUMBER", "WORD", "NEW_LINE", "SEPARATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DATE", "NUMBER", "WORD", "NEW_LINE", "SEPARATOR"
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


	public SyncLowFareLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SyncLowFare.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bN\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\6\3\23\n\3\r\3\16\3"+
		"\24\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\5"+
		"\4$\n\4\3\4\6\4\'\n\4\r\4\16\4(\3\4\3\4\6\4-\n\4\r\4\16\4.\5\4\61\n\4"+
		"\3\5\7\5\64\n\5\f\5\16\5\67\13\5\3\5\6\5:\n\5\r\5\16\5;\3\5\7\5?\n\5\f"+
		"\5\16\5B\13\5\6\5D\n\5\r\5\16\5E\3\6\5\6I\n\6\3\6\3\6\3\7\3\7\2\2\b\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\3\2\5\3\2\62;\b\2\"\"((*+/\60\62;aa\4\2C\\c|\2"+
		"Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\3\17\3\2\2\2\5\22\3\2\2\2\7#\3\2\2\2\tC\3\2\2\2\13H\3\2\2\2\rL\3"+
		"\2\2\2\17\20\7<\2\2\20\4\3\2\2\2\21\23\t\2\2\2\22\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\30\7\60\2\2\27\31\t"+
		"\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3"+
		"\2\2\2\34\36\7\60\2\2\35\37\t\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!\6\3\2\2\2\"$\7/\2\2#\"\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'"+
		"\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\60\3\2\2\2*,\7\60\2"+
		"\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60*\3"+
		"\2\2\2\60\61\3\2\2\2\61\b\3\2\2\2\62\64\t\3\2\2\63\62\3\2\2\2\64\67\3"+
		"\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28:\t\4\2\2"+
		"98\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<@\3\2\2\2=?\t\3\2\2>=\3\2\2\2"+
		"?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C\65\3\2\2\2DE\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2F\n\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2"+
		"\2\2JK\7\f\2\2K\f\3\2\2\2LM\7=\2\2M\16\3\2\2\2\21\2\24\32 #(.\60\63\65"+
		";>@EH\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
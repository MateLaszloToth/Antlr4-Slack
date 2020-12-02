// Generated from SyncLowFare.g4 by ANTLR 4.8

package com.kambr.parser.onex.syncLowFare.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyncLowFareParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DATE=2, NUMBER=3, WORD=4, NEW_LINE=5, SEPARATOR=6;
	public static final int
		RULE_file = 0, RULE_header = 1, RULE_row = 2, RULE_departureDate = 3, 
		RULE_origin = 4, RULE_destination = 5, RULE_viaStation = 6, RULE_carrierCode = 7, 
		RULE_flightNumber = 8, RULE_departureTime = 9, RULE_arrivalTime = 10, 
		RULE_time = 11, RULE_flightID = 12, RULE_pnrIdentifier = 13, RULE_agencyCode = 14, 
		RULE_agencyName = 15, RULE_seatsSold = 16, RULE_flightPrice = 17, RULE_tax = 18, 
		RULE_additionalAmount = 19, RULE_sum = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "header", "row", "departureDate", "origin", "destination", "viaStation", 
			"carrierCode", "flightNumber", "departureTime", "arrivalTime", "time", 
			"flightID", "pnrIdentifier", "agencyCode", "agencyName", "seatsSold", 
			"flightPrice", "tax", "additionalAmount", "sum"
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

	@Override
	public String getGrammarFileName() { return "SyncLowFare.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyncLowFareParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SyncLowFareParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			header();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				row();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DATE );
			setState(48);
			match(EOF);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(SyncLowFareParser.NEW_LINE, 0); }
		public List<TerminalNode> WORD() { return getTokens(SyncLowFareParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(SyncLowFareParser.WORD, i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(SyncLowFareParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(SyncLowFareParser.SEPARATOR, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(WORD);
				setState(51);
				match(SEPARATOR);
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(56);
			match(NEW_LINE);
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

	public static class RowContext extends ParserRuleContext {
		public DepartureDateContext departureDate() {
			return getRuleContext(DepartureDateContext.class,0);
		}
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public ViaStationContext viaStation() {
			return getRuleContext(ViaStationContext.class,0);
		}
		public CarrierCodeContext carrierCode() {
			return getRuleContext(CarrierCodeContext.class,0);
		}
		public FlightNumberContext flightNumber() {
			return getRuleContext(FlightNumberContext.class,0);
		}
		public DepartureTimeContext departureTime() {
			return getRuleContext(DepartureTimeContext.class,0);
		}
		public ArrivalTimeContext arrivalTime() {
			return getRuleContext(ArrivalTimeContext.class,0);
		}
		public FlightIDContext flightID() {
			return getRuleContext(FlightIDContext.class,0);
		}
		public PnrIdentifierContext pnrIdentifier() {
			return getRuleContext(PnrIdentifierContext.class,0);
		}
		public AgencyCodeContext agencyCode() {
			return getRuleContext(AgencyCodeContext.class,0);
		}
		public AgencyNameContext agencyName() {
			return getRuleContext(AgencyNameContext.class,0);
		}
		public SeatsSoldContext seatsSold() {
			return getRuleContext(SeatsSoldContext.class,0);
		}
		public FlightPriceContext flightPrice() {
			return getRuleContext(FlightPriceContext.class,0);
		}
		public TaxContext tax() {
			return getRuleContext(TaxContext.class,0);
		}
		public AdditionalAmountContext additionalAmount() {
			return getRuleContext(AdditionalAmountContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SyncLowFareParser.NEW_LINE, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			departureDate();
			setState(59);
			origin();
			setState(60);
			destination();
			setState(61);
			viaStation();
			setState(62);
			carrierCode();
			setState(63);
			flightNumber();
			setState(64);
			departureTime();
			setState(65);
			arrivalTime();
			setState(66);
			flightID();
			setState(67);
			pnrIdentifier();
			setState(68);
			agencyCode();
			setState(69);
			agencyName();
			setState(70);
			seatsSold();
			setState(71);
			flightPrice();
			setState(72);
			tax();
			setState(73);
			additionalAmount();
			setState(74);
			sum();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE) {
				{
				setState(75);
				match(NEW_LINE);
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

	public static class DepartureDateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(SyncLowFareParser.DATE, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public DepartureDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departureDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitDepartureDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureDateContext departureDate() throws RecognitionException {
		DepartureDateContext _localctx = new DepartureDateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_departureDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(DATE);
			setState(79);
			match(SEPARATOR);
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

	public static class OriginContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncLowFareParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_origin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(WORD);
			setState(82);
			match(SEPARATOR);
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

	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncLowFareParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitDestination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_destination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(WORD);
			setState(85);
			match(SEPARATOR);
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

	public static class ViaStationContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public TerminalNode WORD() { return getToken(SyncLowFareParser.WORD, 0); }
		public ViaStationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viaStation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitViaStation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViaStationContext viaStation() throws RecognitionException {
		ViaStationContext _localctx = new ViaStationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_viaStation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(87);
				match(WORD);
				}
			}

			setState(90);
			match(SEPARATOR);
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

	public static class CarrierCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncLowFareParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public CarrierCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carrierCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitCarrierCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CarrierCodeContext carrierCode() throws RecognitionException {
		CarrierCodeContext _localctx = new CarrierCodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_carrierCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(WORD);
			setState(93);
			match(SEPARATOR);
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

	public static class FlightNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public FlightNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitFlightNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightNumberContext flightNumber() throws RecognitionException {
		FlightNumberContext _localctx = new FlightNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flightNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(NUMBER);
			setState(96);
			match(SEPARATOR);
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

	public static class DepartureTimeContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public DepartureTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departureTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitDepartureTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureTimeContext departureTime() throws RecognitionException {
		DepartureTimeContext _localctx = new DepartureTimeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_departureTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			time();
			setState(99);
			match(SEPARATOR);
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

	public static class ArrivalTimeContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public ArrivalTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrivalTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitArrivalTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrivalTimeContext arrivalTime() throws RecognitionException {
		ArrivalTimeContext _localctx = new ArrivalTimeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrivalTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			time();
			setState(102);
			match(SEPARATOR);
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
		public List<TerminalNode> NUMBER() { return getTokens(SyncLowFareParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SyncLowFareParser.NUMBER, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NUMBER);
			setState(105);
			match(T__0);
			setState(106);
			match(NUMBER);
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

	public static class FlightIDContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public FlightIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitFlightID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightIDContext flightID() throws RecognitionException {
		FlightIDContext _localctx = new FlightIDContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_flightID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(NUMBER);
			setState(109);
			match(SEPARATOR);
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

	public static class PnrIdentifierContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public PnrIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pnrIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitPnrIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PnrIdentifierContext pnrIdentifier() throws RecognitionException {
		PnrIdentifierContext _localctx = new PnrIdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pnrIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(NUMBER);
			setState(112);
			match(SEPARATOR);
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

	public static class AgencyCodeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public AgencyCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agencyCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitAgencyCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgencyCodeContext agencyCode() throws RecognitionException {
		AgencyCodeContext _localctx = new AgencyCodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_agencyCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(NUMBER);
			setState(115);
			match(SEPARATOR);
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

	public static class AgencyNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncLowFareParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public AgencyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agencyName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitAgencyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgencyNameContext agencyName() throws RecognitionException {
		AgencyNameContext _localctx = new AgencyNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_agencyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WORD);
			setState(118);
			match(SEPARATOR);
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

	public static class SeatsSoldContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public SeatsSoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seatsSold; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitSeatsSold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeatsSoldContext seatsSold() throws RecognitionException {
		SeatsSoldContext _localctx = new SeatsSoldContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_seatsSold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(NUMBER);
			setState(121);
			match(SEPARATOR);
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

	public static class FlightPriceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public FlightPriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightPrice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitFlightPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightPriceContext flightPrice() throws RecognitionException {
		FlightPriceContext _localctx = new FlightPriceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_flightPrice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(NUMBER);
			setState(124);
			match(SEPARATOR);
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

	public static class TaxContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public TaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitTax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaxContext tax() throws RecognitionException {
		TaxContext _localctx = new TaxContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(NUMBER);
			setState(127);
			match(SEPARATOR);
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

	public static class AdditionalAmountContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public TerminalNode SEPARATOR() { return getToken(SyncLowFareParser.SEPARATOR, 0); }
		public AdditionalAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalAmount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitAdditionalAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionalAmountContext additionalAmount() throws RecognitionException {
		AdditionalAmountContext _localctx = new AdditionalAmountContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additionalAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(NUMBER);
			setState(130);
			match(SEPARATOR);
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

	public static class SumContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SyncLowFareParser.NUMBER, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncLowFareVisitor ) return ((SyncLowFareVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\3\3\3\3\6\3\67\n\3\r\3\16\38\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\5\b[\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\2\2w\2,\3\2\2\2\4\66\3\2\2\2\6<\3\2\2\2\bP\3"+
		"\2\2\2\nS\3\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20^\3\2\2\2\22a\3\2\2\2\24d\3"+
		"\2\2\2\26g\3\2\2\2\30j\3\2\2\2\32n\3\2\2\2\34q\3\2\2\2\36t\3\2\2\2 w\3"+
		"\2\2\2\"z\3\2\2\2$}\3\2\2\2&\u0080\3\2\2\2(\u0083\3\2\2\2*\u0086\3\2\2"+
		"\2,.\5\4\3\2-/\5\6\4\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\62\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\7\6\2\2\65\67\7\b\2\2"+
		"\66\64\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\7\2\2;"+
		"\5\3\2\2\2<=\5\b\5\2=>\5\n\6\2>?\5\f\7\2?@\5\16\b\2@A\5\20\t\2AB\5\22"+
		"\n\2BC\5\24\13\2CD\5\26\f\2DE\5\32\16\2EF\5\34\17\2FG\5\36\20\2GH\5 \21"+
		"\2HI\5\"\22\2IJ\5$\23\2JK\5&\24\2KL\5(\25\2LN\5*\26\2MO\7\7\2\2NM\3\2"+
		"\2\2NO\3\2\2\2O\7\3\2\2\2PQ\7\4\2\2QR\7\b\2\2R\t\3\2\2\2ST\7\6\2\2TU\7"+
		"\b\2\2U\13\3\2\2\2VW\7\6\2\2WX\7\b\2\2X\r\3\2\2\2Y[\7\6\2\2ZY\3\2\2\2"+
		"Z[\3\2\2\2[\\\3\2\2\2\\]\7\b\2\2]\17\3\2\2\2^_\7\6\2\2_`\7\b\2\2`\21\3"+
		"\2\2\2ab\7\5\2\2bc\7\b\2\2c\23\3\2\2\2de\5\30\r\2ef\7\b\2\2f\25\3\2\2"+
		"\2gh\5\30\r\2hi\7\b\2\2i\27\3\2\2\2jk\7\5\2\2kl\7\3\2\2lm\7\5\2\2m\31"+
		"\3\2\2\2no\7\5\2\2op\7\b\2\2p\33\3\2\2\2qr\7\5\2\2rs\7\b\2\2s\35\3\2\2"+
		"\2tu\7\5\2\2uv\7\b\2\2v\37\3\2\2\2wx\7\6\2\2xy\7\b\2\2y!\3\2\2\2z{\7\5"+
		"\2\2{|\7\b\2\2|#\3\2\2\2}~\7\5\2\2~\177\7\b\2\2\177%\3\2\2\2\u0080\u0081"+
		"\7\5\2\2\u0081\u0082\7\b\2\2\u0082\'\3\2\2\2\u0083\u0084\7\5\2\2\u0084"+
		"\u0085\7\b\2\2\u0085)\3\2\2\2\u0086\u0087\7\5\2\2\u0087+\3\2\2\2\6\60"+
		"8NZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
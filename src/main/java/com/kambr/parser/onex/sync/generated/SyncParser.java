// Generated from Sync.g4 by ANTLR 4.8

package com.kambr.parser.onex.sync.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyncParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WORD=6, INTEGER=7, NEW_LINE=8, 
		WHITE_SPACE_SKIP=9, SEPARATOR_SKIP=10;
	public static final int
		RULE_flightRecords = 0, RULE_geniusFlight = 1, RULE_airlineCode = 2, RULE_flightNumber = 3, 
		RULE_origin = 4, RULE_destination = 5, RULE_departureDate = 6, RULE_cabin = 7, 
		RULE_viaStation = 8, RULE_chainID = 9, RULE_flightID = 10, RULE_cabinCapacity = 11, 
		RULE_cabinBooking = 12, RULE_websiteAllocated = 13, RULE_websiteBookings = 14, 
		RULE_poolCapacity = 15, RULE_poolBooked = 16, RULE_restCapacity = 17, 
		RULE_restBooked = 18, RULE_departureTime = 19, RULE_arrivalTime = 20, 
		RULE_updateIndentifier = 21, RULE_specialPriceOffers = 22, RULE_fromSeat = 23, 
		RULE_price = 24, RULE_date = 25, RULE_time = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"flightRecords", "geniusFlight", "airlineCode", "flightNumber", "origin", 
			"destination", "departureDate", "cabin", "viaStation", "chainID", "flightID", 
			"cabinCapacity", "cabinBooking", "websiteAllocated", "websiteBookings", 
			"poolCapacity", "poolBooked", "restCapacity", "restBooked", "departureTime", 
			"arrivalTime", "updateIndentifier", "specialPriceOffers", "fromSeat", 
			"price", "date", "time"
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

	@Override
	public String getGrammarFileName() { return "Sync.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyncParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FlightRecordsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SyncParser.EOF, 0); }
		public List<GeniusFlightContext> geniusFlight() {
			return getRuleContexts(GeniusFlightContext.class);
		}
		public GeniusFlightContext geniusFlight(int i) {
			return getRuleContext(GeniusFlightContext.class,i);
		}
		public FlightRecordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightRecords; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitFlightRecords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightRecordsContext flightRecords() throws RecognitionException {
		FlightRecordsContext _localctx = new FlightRecordsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_flightRecords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				geniusFlight();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(59);
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

	public static class GeniusFlightContext extends ParserRuleContext {
		public AirlineCodeContext airlineCode() {
			return getRuleContext(AirlineCodeContext.class,0);
		}
		public FlightNumberContext flightNumber() {
			return getRuleContext(FlightNumberContext.class,0);
		}
		public OriginContext origin() {
			return getRuleContext(OriginContext.class,0);
		}
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public DepartureDateContext departureDate() {
			return getRuleContext(DepartureDateContext.class,0);
		}
		public CabinContext cabin() {
			return getRuleContext(CabinContext.class,0);
		}
		public ChainIDContext chainID() {
			return getRuleContext(ChainIDContext.class,0);
		}
		public FlightIDContext flightID() {
			return getRuleContext(FlightIDContext.class,0);
		}
		public CabinCapacityContext cabinCapacity() {
			return getRuleContext(CabinCapacityContext.class,0);
		}
		public CabinBookingContext cabinBooking() {
			return getRuleContext(CabinBookingContext.class,0);
		}
		public WebsiteAllocatedContext websiteAllocated() {
			return getRuleContext(WebsiteAllocatedContext.class,0);
		}
		public WebsiteBookingsContext websiteBookings() {
			return getRuleContext(WebsiteBookingsContext.class,0);
		}
		public PoolCapacityContext poolCapacity() {
			return getRuleContext(PoolCapacityContext.class,0);
		}
		public PoolBookedContext poolBooked() {
			return getRuleContext(PoolBookedContext.class,0);
		}
		public RestCapacityContext restCapacity() {
			return getRuleContext(RestCapacityContext.class,0);
		}
		public RestBookedContext restBooked() {
			return getRuleContext(RestBookedContext.class,0);
		}
		public DepartureTimeContext departureTime() {
			return getRuleContext(DepartureTimeContext.class,0);
		}
		public ArrivalTimeContext arrivalTime() {
			return getRuleContext(ArrivalTimeContext.class,0);
		}
		public UpdateIndentifierContext updateIndentifier() {
			return getRuleContext(UpdateIndentifierContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SyncParser.NEW_LINE, 0); }
		public ViaStationContext viaStation() {
			return getRuleContext(ViaStationContext.class,0);
		}
		public List<SpecialPriceOffersContext> specialPriceOffers() {
			return getRuleContexts(SpecialPriceOffersContext.class);
		}
		public SpecialPriceOffersContext specialPriceOffers(int i) {
			return getRuleContext(SpecialPriceOffersContext.class,i);
		}
		public GeniusFlightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geniusFlight; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitGeniusFlight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeniusFlightContext geniusFlight() throws RecognitionException {
		GeniusFlightContext _localctx = new GeniusFlightContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_geniusFlight);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			airlineCode();
			setState(63);
			flightNumber();
			setState(64);
			origin();
			setState(65);
			destination();
			setState(66);
			departureDate();
			setState(67);
			cabin();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(68);
				viaStation();
				}
			}

			setState(71);
			chainID();
			setState(72);
			flightID();
			setState(73);
			cabinCapacity();
			setState(74);
			cabinBooking();
			setState(75);
			websiteAllocated();
			setState(76);
			websiteBookings();
			setState(77);
			poolCapacity();
			setState(78);
			poolBooked();
			setState(79);
			restCapacity();
			setState(80);
			restBooked();
			setState(81);
			departureTime();
			setState(82);
			arrivalTime();
			setState(83);
			updateIndentifier();
			setState(84);
			match(NEW_LINE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(85);
				specialPriceOffers();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AirlineCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncParser.WORD, 0); }
		public AirlineCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_airlineCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitAirlineCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AirlineCodeContext airlineCode() throws RecognitionException {
		AirlineCodeContext _localctx = new AirlineCodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_airlineCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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

	public static class FlightNumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public FlightNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitFlightNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightNumberContext flightNumber() throws RecognitionException {
		FlightNumberContext _localctx = new FlightNumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_flightNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(INTEGER);
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
		public TerminalNode WORD() { return getToken(SyncParser.WORD, 0); }
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_origin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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

	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncParser.WORD, 0); }
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitDestination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_destination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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

	public static class DepartureDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public DepartureDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departureDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitDepartureDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureDateContext departureDate() throws RecognitionException {
		DepartureDateContext _localctx = new DepartureDateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_departureDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			date();
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

	public static class CabinContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncParser.WORD, 0); }
		public CabinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitCabin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabinContext cabin() throws RecognitionException {
		CabinContext _localctx = new CabinContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cabin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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

	public static class ViaStationContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncParser.WORD, 0); }
		public ViaStationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viaStation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitViaStation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViaStationContext viaStation() throws RecognitionException {
		ViaStationContext _localctx = new ViaStationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_viaStation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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

	public static class ChainIDContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public ChainIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitChainID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainIDContext chainID() throws RecognitionException {
		ChainIDContext _localctx = new ChainIDContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_chainID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(INTEGER);
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
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public FlightIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitFlightID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightIDContext flightID() throws RecognitionException {
		FlightIDContext _localctx = new FlightIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_flightID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(INTEGER);
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

	public static class CabinCapacityContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public CabinCapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabinCapacity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitCabinCapacity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabinCapacityContext cabinCapacity() throws RecognitionException {
		CabinCapacityContext _localctx = new CabinCapacityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cabinCapacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(INTEGER);
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

	public static class CabinBookingContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public CabinBookingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabinBooking; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitCabinBooking(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabinBookingContext cabinBooking() throws RecognitionException {
		CabinBookingContext _localctx = new CabinBookingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cabinBooking);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(INTEGER);
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

	public static class WebsiteAllocatedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public WebsiteAllocatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_websiteAllocated; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitWebsiteAllocated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebsiteAllocatedContext websiteAllocated() throws RecognitionException {
		WebsiteAllocatedContext _localctx = new WebsiteAllocatedContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_websiteAllocated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(INTEGER);
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

	public static class WebsiteBookingsContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public WebsiteBookingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_websiteBookings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitWebsiteBookings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebsiteBookingsContext websiteBookings() throws RecognitionException {
		WebsiteBookingsContext _localctx = new WebsiteBookingsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_websiteBookings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(INTEGER);
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

	public static class PoolCapacityContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public PoolCapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolCapacity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitPoolCapacity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoolCapacityContext poolCapacity() throws RecognitionException {
		PoolCapacityContext _localctx = new PoolCapacityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_poolCapacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(INTEGER);
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

	public static class PoolBookedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public PoolBookedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolBooked; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitPoolBooked(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoolBookedContext poolBooked() throws RecognitionException {
		PoolBookedContext _localctx = new PoolBookedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_poolBooked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(INTEGER);
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

	public static class RestCapacityContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public RestCapacityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restCapacity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitRestCapacity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestCapacityContext restCapacity() throws RecognitionException {
		RestCapacityContext _localctx = new RestCapacityContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_restCapacity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(INTEGER);
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

	public static class RestBookedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public RestBookedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restBooked; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitRestBooked(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestBookedContext restBooked() throws RecognitionException {
		RestBookedContext _localctx = new RestBookedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_restBooked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(INTEGER);
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
		public DepartureTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departureTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitDepartureTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureTimeContext departureTime() throws RecognitionException {
		DepartureTimeContext _localctx = new DepartureTimeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_departureTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			time();
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
		public ArrivalTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrivalTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitArrivalTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrivalTimeContext arrivalTime() throws RecognitionException {
		ArrivalTimeContext _localctx = new ArrivalTimeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrivalTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			time();
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

	public static class UpdateIndentifierContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SyncParser.WORD, 0); }
		public UpdateIndentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateIndentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitUpdateIndentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateIndentifierContext updateIndentifier() throws RecognitionException {
		UpdateIndentifierContext _localctx = new UpdateIndentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_updateIndentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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

	public static class SpecialPriceOffersContext extends ParserRuleContext {
		public FromSeatContext fromSeat() {
			return getRuleContext(FromSeatContext.class,0);
		}
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SyncParser.NEW_LINE, 0); }
		public SpecialPriceOffersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialPriceOffers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitSpecialPriceOffers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialPriceOffersContext specialPriceOffers() throws RecognitionException {
		SpecialPriceOffersContext _localctx = new SpecialPriceOffersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_specialPriceOffers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__1);
			setState(132);
			fromSeat();
			setState(133);
			price();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE) {
				{
				setState(134);
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

	public static class FromSeatContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SyncParser.INTEGER, 0); }
		public FromSeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSeat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitFromSeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromSeatContext fromSeat() throws RecognitionException {
		FromSeatContext _localctx = new FromSeatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fromSeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(INTEGER);
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

	public static class PriceContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(SyncParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SyncParser.INTEGER, i);
		}
		public PriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_price; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriceContext price() throws RecognitionException {
		PriceContext _localctx = new PriceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_price);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(INTEGER);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==INTEGER) {
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(140);
					match(T__2);
					}
				}

				setState(143);
				match(INTEGER);
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

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(SyncParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SyncParser.INTEGER, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(INTEGER);
			setState(147);
			match(T__3);
			setState(148);
			match(INTEGER);
			setState(149);
			match(T__3);
			setState(150);
			match(INTEGER);
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
		public List<TerminalNode> INTEGER() { return getTokens(SyncParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SyncParser.INTEGER, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyncVisitor ) return ((SyncVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(INTEGER);
			setState(153);
			match(T__4);
			setState(154);
			match(INTEGER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\u009f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u008a\n\30\3\31\3\31"+
		"\3\32\3\32\5\32\u0090\n\32\3\32\5\32\u0093\n\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\2\2\u0089\29\3\2\2\2\4?\3\2\2\2\6]\3"+
		"\2\2\2\b_\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22i\3"+
		"\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32q\3\2\2\2\34s\3\2\2\2\36"+
		"u\3\2\2\2 w\3\2\2\2\"y\3\2\2\2${\3\2\2\2&}\3\2\2\2(\177\3\2\2\2*\u0081"+
		"\3\2\2\2,\u0083\3\2\2\2.\u0085\3\2\2\2\60\u008b\3\2\2\2\62\u008d\3\2\2"+
		"\2\64\u0094\3\2\2\2\66\u009a\3\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;9\3"+
		"\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\2\2\3>\3\3\2\2\2?@\7\3\2\2@A\5\6\4\2AB"+
		"\5\b\5\2BC\5\n\6\2CD\5\f\7\2DE\5\16\b\2EG\5\20\t\2FH\5\22\n\2GF\3\2\2"+
		"\2GH\3\2\2\2HI\3\2\2\2IJ\5\24\13\2JK\5\26\f\2KL\5\30\r\2LM\5\32\16\2M"+
		"N\5\34\17\2NO\5\36\20\2OP\5 \21\2PQ\5\"\22\2QR\5$\23\2RS\5&\24\2ST\5("+
		"\25\2TU\5*\26\2UV\5,\27\2VZ\7\n\2\2WY\5.\30\2XW\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[\5\3\2\2\2\\Z\3\2\2\2]^\7\b\2\2^\7\3\2\2\2_`\7\t\2\2"+
		"`\t\3\2\2\2ab\7\b\2\2b\13\3\2\2\2cd\7\b\2\2d\r\3\2\2\2ef\5\64\33\2f\17"+
		"\3\2\2\2gh\7\b\2\2h\21\3\2\2\2ij\7\b\2\2j\23\3\2\2\2kl\7\t\2\2l\25\3\2"+
		"\2\2mn\7\t\2\2n\27\3\2\2\2op\7\t\2\2p\31\3\2\2\2qr\7\t\2\2r\33\3\2\2\2"+
		"st\7\t\2\2t\35\3\2\2\2uv\7\t\2\2v\37\3\2\2\2wx\7\t\2\2x!\3\2\2\2yz\7\t"+
		"\2\2z#\3\2\2\2{|\7\t\2\2|%\3\2\2\2}~\7\t\2\2~\'\3\2\2\2\177\u0080\5\66"+
		"\34\2\u0080)\3\2\2\2\u0081\u0082\5\66\34\2\u0082+\3\2\2\2\u0083\u0084"+
		"\7\b\2\2\u0084-\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5\60\31\2\u0087"+
		"\u0089\5\62\32\2\u0088\u008a\7\n\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a/\3\2\2\2\u008b\u008c\7\t\2\2\u008c\61\3\2\2\2\u008d\u0092"+
		"\7\t\2\2\u008e\u0090\7\5\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0093\7\t\2\2\u0092\u008f\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\63\3\2\2\2\u0094\u0095\7\t\2\2\u0095\u0096\7\6\2\2\u0096\u0097"+
		"\7\t\2\2\u0097\u0098\7\6\2\2\u0098\u0099\7\t\2\2\u0099\65\3\2\2\2\u009a"+
		"\u009b\7\t\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7\t\2\2\u009d\67\3\2\2"+
		"\2\b;GZ\u0089\u008f\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
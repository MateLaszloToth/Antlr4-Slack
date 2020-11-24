// Generated from Spo.g4 by ANTLR 4.8

package com.kambr.parser.onex.spo.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FIELD=3, NEW_LINE=4, SEPARATOR_SKIP=5;
	public static final int
		RULE_spo = 0, RULE_header = 1, RULE_row = 2, RULE_departureDate = 3, RULE_origin = 4, 
		RULE_destination = 5, RULE_viaStation = 6, RULE_carrierCode = 7, RULE_flightNumber = 8, 
		RULE_departureTime = 9, RULE_arrivalTime = 10, RULE_taxAmount = 11, RULE_surcharge = 12, 
		RULE_fixAllocation = 13, RULE_proRataAmount = 14, RULE_totalNumberOfAllocations = 15, 
		RULE_bookings = 16, RULE_available = 17, RULE_contractPrice = 18, RULE_from = 19, 
		RULE_price = 20, RULE_flightID = 21, RULE_poolingEnabled = 22, RULE_agencyCode = 23, 
		RULE_agencyName = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"spo", "header", "row", "departureDate", "origin", "destination", "viaStation", 
			"carrierCode", "flightNumber", "departureTime", "arrivalTime", "taxAmount", 
			"surcharge", "fixAllocation", "proRataAmount", "totalNumberOfAllocations", 
			"bookings", "available", "contractPrice", "from", "price", "flightID", 
			"poolingEnabled", "agencyCode", "agencyName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\r'", "'\n'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FIELD", "NEW_LINE", "SEPARATOR_SKIP"
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
	public String getGrammarFileName() { return "Spo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpoContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public SpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitSpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpoContext spo() throws RecognitionException {
		SpoContext _localctx = new SpoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			header();
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				row();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FIELD );
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
		public List<TerminalNode> FIELD() { return getTokens(SpoParser.FIELD); }
		public TerminalNode FIELD(int i) {
			return getToken(SpoParser.FIELD, i);
		}
		public List<TerminalNode> SEPARATOR_SKIP() { return getTokens(SpoParser.SEPARATOR_SKIP); }
		public TerminalNode SEPARATOR_SKIP(int i) {
			return getToken(SpoParser.SEPARATOR_SKIP, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitHeader(this);
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
			setState(56);
			match(FIELD);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR_SKIP) {
				{
				{
				setState(57);
				match(SEPARATOR_SKIP);
				setState(58);
				match(FIELD);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(64);
				match(T__0);
				}
			}

			setState(67);
			match(T__1);
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
		public TaxAmountContext taxAmount() {
			return getRuleContext(TaxAmountContext.class,0);
		}
		public SurchargeContext surcharge() {
			return getRuleContext(SurchargeContext.class,0);
		}
		public FixAllocationContext fixAllocation() {
			return getRuleContext(FixAllocationContext.class,0);
		}
		public ProRataAmountContext proRataAmount() {
			return getRuleContext(ProRataAmountContext.class,0);
		}
		public TotalNumberOfAllocationsContext totalNumberOfAllocations() {
			return getRuleContext(TotalNumberOfAllocationsContext.class,0);
		}
		public BookingsContext bookings() {
			return getRuleContext(BookingsContext.class,0);
		}
		public AvailableContext available() {
			return getRuleContext(AvailableContext.class,0);
		}
		public ContractPriceContext contractPrice() {
			return getRuleContext(ContractPriceContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public FlightIDContext flightID() {
			return getRuleContext(FlightIDContext.class,0);
		}
		public PoolingEnabledContext poolingEnabled() {
			return getRuleContext(PoolingEnabledContext.class,0);
		}
		public AgencyCodeContext agencyCode() {
			return getRuleContext(AgencyCodeContext.class,0);
		}
		public AgencyNameContext agencyName() {
			return getRuleContext(AgencyNameContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(SpoParser.NEW_LINE, 0); }
		public ViaStationContext viaStation() {
			return getRuleContext(ViaStationContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			departureDate();
			setState(70);
			origin();
			setState(71);
			destination();
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(72);
				viaStation();
				}
				break;
			}
			setState(75);
			carrierCode();
			setState(76);
			flightNumber();
			setState(77);
			departureTime();
			setState(78);
			arrivalTime();
			setState(79);
			taxAmount();
			setState(80);
			surcharge();
			setState(81);
			fixAllocation();
			setState(82);
			proRataAmount();
			setState(83);
			totalNumberOfAllocations();
			setState(84);
			bookings();
			setState(85);
			available();
			setState(86);
			contractPrice();
			setState(87);
			from();
			setState(88);
			price();
			setState(89);
			flightID();
			setState(90);
			poolingEnabled();
			setState(91);
			agencyCode();
			setState(92);
			agencyName();
			setState(93);
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

	public static class DepartureDateContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public DepartureDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departureDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitDepartureDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureDateContext departureDate() throws RecognitionException {
		DepartureDateContext _localctx = new DepartureDateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_departureDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_origin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitDestination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_destination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public ViaStationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viaStation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitViaStation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViaStationContext viaStation() throws RecognitionException {
		ViaStationContext _localctx = new ViaStationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_viaStation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public CarrierCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carrierCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitCarrierCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CarrierCodeContext carrierCode() throws RecognitionException {
		CarrierCodeContext _localctx = new CarrierCodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_carrierCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public FlightNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitFlightNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightNumberContext flightNumber() throws RecognitionException {
		FlightNumberContext _localctx = new FlightNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flightNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public DepartureTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departureTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitDepartureTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureTimeContext departureTime() throws RecognitionException {
		DepartureTimeContext _localctx = new DepartureTimeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_departureTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public ArrivalTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrivalTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitArrivalTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrivalTimeContext arrivalTime() throws RecognitionException {
		ArrivalTimeContext _localctx = new ArrivalTimeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrivalTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FIELD);
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

	public static class TaxAmountContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public TaxAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taxAmount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitTaxAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaxAmountContext taxAmount() throws RecognitionException {
		TaxAmountContext _localctx = new TaxAmountContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_taxAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FIELD);
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

	public static class SurchargeContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public SurchargeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surcharge; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitSurcharge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurchargeContext surcharge() throws RecognitionException {
		SurchargeContext _localctx = new SurchargeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_surcharge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(FIELD);
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

	public static class FixAllocationContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public FixAllocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixAllocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitFixAllocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixAllocationContext fixAllocation() throws RecognitionException {
		FixAllocationContext _localctx = new FixAllocationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fixAllocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(FIELD);
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

	public static class ProRataAmountContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public ProRataAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proRataAmount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitProRataAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProRataAmountContext proRataAmount() throws RecognitionException {
		ProRataAmountContext _localctx = new ProRataAmountContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_proRataAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(FIELD);
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

	public static class TotalNumberOfAllocationsContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public TotalNumberOfAllocationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalNumberOfAllocations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitTotalNumberOfAllocations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalNumberOfAllocationsContext totalNumberOfAllocations() throws RecognitionException {
		TotalNumberOfAllocationsContext _localctx = new TotalNumberOfAllocationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_totalNumberOfAllocations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FIELD);
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

	public static class BookingsContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public BookingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitBookings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookingsContext bookings() throws RecognitionException {
		BookingsContext _localctx = new BookingsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bookings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FIELD);
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

	public static class AvailableContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public AvailableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_available; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitAvailable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvailableContext available() throws RecognitionException {
		AvailableContext _localctx = new AvailableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_available);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(FIELD);
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

	public static class ContractPriceContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public ContractPriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPrice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitContractPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractPriceContext contractPrice() throws RecognitionException {
		ContractPriceContext _localctx = new ContractPriceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_contractPrice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FIELD);
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

	public static class FromContext extends ParserRuleContext {
		public List<TerminalNode> FIELD() { return getTokens(SpoParser.FIELD); }
		public TerminalNode FIELD(int i) {
			return getToken(SpoParser.FIELD, i);
		}
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_from);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(FIELD);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class PriceContext extends ParserRuleContext {
		public List<TerminalNode> FIELD() { return getTokens(SpoParser.FIELD); }
		public TerminalNode FIELD(int i) {
			return getToken(SpoParser.FIELD, i);
		}
		public PriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_price; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriceContext price() throws RecognitionException {
		PriceContext _localctx = new PriceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_price);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(FIELD);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class FlightIDContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public FlightIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitFlightID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightIDContext flightID() throws RecognitionException {
		FlightIDContext _localctx = new FlightIDContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_flightID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FIELD);
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

	public static class PoolingEnabledContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public PoolingEnabledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poolingEnabled; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitPoolingEnabled(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoolingEnabledContext poolingEnabled() throws RecognitionException {
		PoolingEnabledContext _localctx = new PoolingEnabledContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_poolingEnabled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public AgencyCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agencyCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitAgencyCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgencyCodeContext agencyCode() throws RecognitionException {
		AgencyCodeContext _localctx = new AgencyCodeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_agencyCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FIELD);
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
		public TerminalNode FIELD() { return getToken(SpoParser.FIELD, 0); }
		public AgencyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agencyName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpoVisitor ) return ((SpoVisitor<? extends T>)visitor).visitAgencyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgencyNameContext agencyName() throws RecognitionException {
		AgencyNameContext _localctx = new AgencyNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_agencyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(FIELD);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\u0096\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\6\2\67\n\2\r\2\16\28\3\3\3\3\3\3\7\3>\n\3\f\3\16\3"+
		"A\13\3\3\3\5\3D\n\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\7\25\u0083\n\25\f\25\16\25\u0086\13\25\3\26\7\26\u0089\n\26\f\26\16\26"+
		"\u008c\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\2\u0082\2\64\3\2"+
		"\2\2\4:\3\2\2\2\6G\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fe\3\2\2\2\16g\3\2\2"+
		"\2\20i\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32s\3\2"+
		"\2\2\34u\3\2\2\2\36w\3\2\2\2 y\3\2\2\2\"{\3\2\2\2$}\3\2\2\2&\177\3\2\2"+
		"\2(\u0084\3\2\2\2*\u008a\3\2\2\2,\u008d\3\2\2\2.\u008f\3\2\2\2\60\u0091"+
		"\3\2\2\2\62\u0093\3\2\2\2\64\66\5\4\3\2\65\67\5\6\4\2\66\65\3\2\2\2\67"+
		"8\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:?\7\5\2\2;<\7\7\2\2<>\7\5\2"+
		"\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2\2\2BD\7\3\2"+
		"\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\4\2\2F\5\3\2\2\2GH\5\b\5\2HI\5\n"+
		"\6\2IK\5\f\7\2JL\5\16\b\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\20\t\2NO\5"+
		"\22\n\2OP\5\24\13\2PQ\5\26\f\2QR\5\30\r\2RS\5\32\16\2ST\5\34\17\2TU\5"+
		"\36\20\2UV\5 \21\2VW\5\"\22\2WX\5$\23\2XY\5&\24\2YZ\5(\25\2Z[\5*\26\2"+
		"[\\\5,\27\2\\]\5.\30\2]^\5\60\31\2^_\5\62\32\2_`\7\6\2\2`\7\3\2\2\2ab"+
		"\7\5\2\2b\t\3\2\2\2cd\7\5\2\2d\13\3\2\2\2ef\7\5\2\2f\r\3\2\2\2gh\7\5\2"+
		"\2h\17\3\2\2\2ij\7\5\2\2j\21\3\2\2\2kl\7\5\2\2l\23\3\2\2\2mn\7\5\2\2n"+
		"\25\3\2\2\2op\7\5\2\2p\27\3\2\2\2qr\7\5\2\2r\31\3\2\2\2st\7\5\2\2t\33"+
		"\3\2\2\2uv\7\5\2\2v\35\3\2\2\2wx\7\5\2\2x\37\3\2\2\2yz\7\5\2\2z!\3\2\2"+
		"\2{|\7\5\2\2|#\3\2\2\2}~\7\5\2\2~%\3\2\2\2\177\u0080\7\5\2\2\u0080\'\3"+
		"\2\2\2\u0081\u0083\7\5\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085)\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0087\u0089\7\5\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b+\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\7\5\2\2\u008e-\3\2\2\2\u008f\u0090\7\5\2\2\u0090/\3\2\2\2\u0091"+
		"\u0092\7\5\2\2\u0092\61\3\2\2\2\u0093\u0094\7\5\2\2\u0094\63\3\2\2\2\b"+
		"8?CK\u0084\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
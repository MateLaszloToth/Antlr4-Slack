// Generated from TurSys.g4 by ANTLR 4.8

package com.kambr.parser.onex.tursys.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurSysParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, NUMBER=2, WORD=3, NEW_LINE=4, SEPARATOR=5;
	public static final int
		RULE_file = 0, RULE_header = 1, RULE_row = 2, RULE_segment = 3, RULE_departureDate = 4, 
		RULE_carrierCode = 5, RULE_flightNumber = 6, RULE_origin = 7, RULE_destination = 8, 
		RULE_flightPath = 9, RULE_cabinCode = 10, RULE_seatAssignment = 11, RULE_liftStatus = 12, 
		RULE_boardingSequence = 13, RULE_pnr = 14, RULE_couponIdentificationCode = 15, 
		RULE_fareBasisCode = 16, RULE_bookingTypeCode = 17, RULE_bookingStatusCode = 18, 
		RULE_bookingDate = 19, RULE_bookingTime = 20, RULE_ticketingDate = 21, 
		RULE_ticketingTime = 22, RULE_cancellationDate = 23, RULE_agentCode = 24, 
		RULE_salesSource = 25, RULE_passengerType = 26, RULE_currency = 27, RULE_rateOfExchange = 28, 
		RULE_spoBasePrice = 29, RULE_discount = 30, RULE_dynamicPriceAdjustment = 31, 
		RULE_priceAdjustmentApplied = 32, RULE_salesPrice = 33, RULE_tax = 34, 
		RULE_totalAmount = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "header", "row", "segment", "departureDate", "carrierCode", "flightNumber", 
			"origin", "destination", "flightPath", "cabinCode", "seatAssignment", 
			"liftStatus", "boardingSequence", "pnr", "couponIdentificationCode", 
			"fareBasisCode", "bookingTypeCode", "bookingStatusCode", "bookingDate", 
			"bookingTime", "ticketingDate", "ticketingTime", "cancellationDate", 
			"agentCode", "salesSource", "passengerType", "currency", "rateOfExchange", 
			"spoBasePrice", "discount", "dynamicPriceAdjustment", "priceAdjustmentApplied", 
			"salesPrice", "tax", "totalAmount"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "NUMBER", "WORD", "NEW_LINE", "SEPARATOR"
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
	public String getGrammarFileName() { return "TurSys.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TurSysParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TurSysParser.EOF, 0); }
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
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitFile(this);
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
			setState(72);
			header();
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				row();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER || _la==SEPARATOR );
			setState(78);
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
		public List<TerminalNode> WORD() { return getTokens(TurSysParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TurSysParser.WORD, i);
		}
		public TerminalNode NEW_LINE() { return getToken(TurSysParser.NEW_LINE, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(TurSysParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(TurSysParser.SEPARATOR, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(WORD);
					setState(81);
					match(SEPARATOR);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(87);
			match(WORD);
			setState(88);
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
		public PnrContext pnr() {
			return getRuleContext(PnrContext.class,0);
		}
		public CouponIdentificationCodeContext couponIdentificationCode() {
			return getRuleContext(CouponIdentificationCodeContext.class,0);
		}
		public FareBasisCodeContext fareBasisCode() {
			return getRuleContext(FareBasisCodeContext.class,0);
		}
		public BookingTypeCodeContext bookingTypeCode() {
			return getRuleContext(BookingTypeCodeContext.class,0);
		}
		public BookingStatusCodeContext bookingStatusCode() {
			return getRuleContext(BookingStatusCodeContext.class,0);
		}
		public BookingDateContext bookingDate() {
			return getRuleContext(BookingDateContext.class,0);
		}
		public BookingTimeContext bookingTime() {
			return getRuleContext(BookingTimeContext.class,0);
		}
		public TicketingDateContext ticketingDate() {
			return getRuleContext(TicketingDateContext.class,0);
		}
		public TicketingTimeContext ticketingTime() {
			return getRuleContext(TicketingTimeContext.class,0);
		}
		public CancellationDateContext cancellationDate() {
			return getRuleContext(CancellationDateContext.class,0);
		}
		public AgentCodeContext agentCode() {
			return getRuleContext(AgentCodeContext.class,0);
		}
		public SalesSourceContext salesSource() {
			return getRuleContext(SalesSourceContext.class,0);
		}
		public PassengerTypeContext passengerType() {
			return getRuleContext(PassengerTypeContext.class,0);
		}
		public CurrencyContext currency() {
			return getRuleContext(CurrencyContext.class,0);
		}
		public RateOfExchangeContext rateOfExchange() {
			return getRuleContext(RateOfExchangeContext.class,0);
		}
		public SpoBasePriceContext spoBasePrice() {
			return getRuleContext(SpoBasePriceContext.class,0);
		}
		public DiscountContext discount() {
			return getRuleContext(DiscountContext.class,0);
		}
		public DynamicPriceAdjustmentContext dynamicPriceAdjustment() {
			return getRuleContext(DynamicPriceAdjustmentContext.class,0);
		}
		public PriceAdjustmentAppliedContext priceAdjustmentApplied() {
			return getRuleContext(PriceAdjustmentAppliedContext.class,0);
		}
		public SalesPriceContext salesPrice() {
			return getRuleContext(SalesPriceContext.class,0);
		}
		public TaxContext tax() {
			return getRuleContext(TaxContext.class,0);
		}
		public TotalAmountContext totalAmount() {
			return getRuleContext(TotalAmountContext.class,0);
		}
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public TerminalNode NEW_LINE() { return getToken(TurSysParser.NEW_LINE, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitRow(this);
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
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				segment();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER || _la==SEPARATOR );
			setState(95);
			pnr();
			setState(96);
			couponIdentificationCode();
			setState(97);
			fareBasisCode();
			setState(98);
			bookingTypeCode();
			setState(99);
			bookingStatusCode();
			setState(100);
			bookingDate();
			setState(101);
			bookingTime();
			setState(102);
			ticketingDate();
			setState(103);
			ticketingTime();
			setState(104);
			cancellationDate();
			setState(105);
			agentCode();
			setState(106);
			salesSource();
			setState(107);
			passengerType();
			setState(108);
			currency();
			setState(109);
			rateOfExchange();
			setState(110);
			spoBasePrice();
			setState(111);
			discount();
			setState(112);
			dynamicPriceAdjustment();
			setState(113);
			priceAdjustmentApplied();
			setState(114);
			salesPrice();
			setState(115);
			tax();
			setState(116);
			totalAmount();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW_LINE) {
				{
				setState(117);
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

	public static class SegmentContext extends ParserRuleContext {
		public DepartureDateContext departureDate() {
			return getRuleContext(DepartureDateContext.class,0);
		}
		public CarrierCodeContext carrierCode() {
			return getRuleContext(CarrierCodeContext.class,0);
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
		public FlightPathContext flightPath() {
			return getRuleContext(FlightPathContext.class,0);
		}
		public CabinCodeContext cabinCode() {
			return getRuleContext(CabinCodeContext.class,0);
		}
		public SeatAssignmentContext seatAssignment() {
			return getRuleContext(SeatAssignmentContext.class,0);
		}
		public LiftStatusContext liftStatus() {
			return getRuleContext(LiftStatusContext.class,0);
		}
		public BoardingSequenceContext boardingSequence() {
			return getRuleContext(BoardingSequenceContext.class,0);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			departureDate();
			setState(121);
			carrierCode();
			setState(122);
			flightNumber();
			setState(123);
			origin();
			setState(124);
			destination();
			setState(125);
			flightPath();
			setState(126);
			cabinCode();
			setState(127);
			seatAssignment();
			setState(128);
			liftStatus();
			setState(129);
			boardingSequence();
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
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public DepartureDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departureDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitDepartureDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureDateContext departureDate() throws RecognitionException {
		DepartureDateContext _localctx = new DepartureDateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_departureDate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(131);
				match(INTEGER);
				}
			}

			setState(134);
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
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public CarrierCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carrierCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitCarrierCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CarrierCodeContext carrierCode() throws RecognitionException {
		CarrierCodeContext _localctx = new CarrierCodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_carrierCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(136);
				match(WORD);
				}
			}

			setState(139);
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
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public FlightNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitFlightNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightNumberContext flightNumber() throws RecognitionException {
		FlightNumberContext _localctx = new FlightNumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flightNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(INTEGER);
			setState(142);
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
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public OriginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_origin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginContext origin() throws RecognitionException {
		OriginContext _localctx = new OriginContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_origin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(144);
				match(WORD);
				}
			}

			setState(147);
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
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitDestination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_destination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(149);
				match(WORD);
				}
			}

			setState(152);
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

	public static class FlightPathContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public FlightPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightPath; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitFlightPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightPathContext flightPath() throws RecognitionException {
		FlightPathContext _localctx = new FlightPathContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flightPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(154);
				match(WORD);
				}
			}

			setState(157);
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

	public static class CabinCodeContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public CabinCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabinCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitCabinCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabinCodeContext cabinCode() throws RecognitionException {
		CabinCodeContext _localctx = new CabinCodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cabinCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(159);
				match(WORD);
				}
			}

			setState(162);
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

	public static class SeatAssignmentContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public SeatAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seatAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitSeatAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeatAssignmentContext seatAssignment() throws RecognitionException {
		SeatAssignmentContext _localctx = new SeatAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_seatAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(164);
				match(WORD);
				}
			}

			setState(167);
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

	public static class LiftStatusContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public LiftStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liftStatus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitLiftStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiftStatusContext liftStatus() throws RecognitionException {
		LiftStatusContext _localctx = new LiftStatusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_liftStatus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(169);
				match(INTEGER);
				}
			}

			setState(172);
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

	public static class BoardingSequenceContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public BoardingSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boardingSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitBoardingSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardingSequenceContext boardingSequence() throws RecognitionException {
		BoardingSequenceContext _localctx = new BoardingSequenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boardingSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(174);
				match(INTEGER);
				}
			}

			setState(177);
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

	public static class PnrContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public PnrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pnr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitPnr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PnrContext pnr() throws RecognitionException {
		PnrContext _localctx = new PnrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pnr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WORD);
			setState(180);
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

	public static class CouponIdentificationCodeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public CouponIdentificationCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_couponIdentificationCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitCouponIdentificationCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CouponIdentificationCodeContext couponIdentificationCode() throws RecognitionException {
		CouponIdentificationCodeContext _localctx = new CouponIdentificationCodeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_couponIdentificationCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(INTEGER);
			setState(183);
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

	public static class FareBasisCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public FareBasisCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fareBasisCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitFareBasisCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FareBasisCodeContext fareBasisCode() throws RecognitionException {
		FareBasisCodeContext _localctx = new FareBasisCodeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fareBasisCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(WORD);
			setState(186);
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

	public static class BookingTypeCodeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public BookingTypeCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookingTypeCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitBookingTypeCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookingTypeCodeContext bookingTypeCode() throws RecognitionException {
		BookingTypeCodeContext _localctx = new BookingTypeCodeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bookingTypeCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(INTEGER);
			setState(189);
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

	public static class BookingStatusCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public BookingStatusCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookingStatusCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitBookingStatusCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookingStatusCodeContext bookingStatusCode() throws RecognitionException {
		BookingStatusCodeContext _localctx = new BookingStatusCodeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bookingStatusCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(WORD);
			setState(192);
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

	public static class BookingDateContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public BookingDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookingDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitBookingDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookingDateContext bookingDate() throws RecognitionException {
		BookingDateContext _localctx = new BookingDateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bookingDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(INTEGER);
			setState(195);
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

	public static class BookingTimeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public BookingTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookingTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitBookingTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookingTimeContext bookingTime() throws RecognitionException {
		BookingTimeContext _localctx = new BookingTimeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bookingTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(INTEGER);
			setState(198);
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

	public static class TicketingDateContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TicketingDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ticketingDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitTicketingDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TicketingDateContext ticketingDate() throws RecognitionException {
		TicketingDateContext _localctx = new TicketingDateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ticketingDate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(200);
				match(INTEGER);
				}
			}

			setState(203);
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

	public static class TicketingTimeContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TicketingTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ticketingTime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitTicketingTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TicketingTimeContext ticketingTime() throws RecognitionException {
		TicketingTimeContext _localctx = new TicketingTimeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ticketingTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(205);
				match(INTEGER);
				}
			}

			setState(208);
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

	public static class CancellationDateContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public CancellationDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cancellationDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitCancellationDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CancellationDateContext cancellationDate() throws RecognitionException {
		CancellationDateContext _localctx = new CancellationDateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cancellationDate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(210);
				match(INTEGER);
				}
			}

			setState(213);
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

	public static class AgentCodeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public AgentCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitAgentCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgentCodeContext agentCode() throws RecognitionException {
		AgentCodeContext _localctx = new AgentCodeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_agentCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(INTEGER);
			setState(216);
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

	public static class SalesSourceContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public SalesSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salesSource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitSalesSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SalesSourceContext salesSource() throws RecognitionException {
		SalesSourceContext _localctx = new SalesSourceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_salesSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(WORD);
			setState(219);
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

	public static class PassengerTypeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public PassengerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passengerType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitPassengerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassengerTypeContext passengerType() throws RecognitionException {
		PassengerTypeContext _localctx = new PassengerTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_passengerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(WORD);
			setState(222);
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

	public static class CurrencyContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public CurrencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currency; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitCurrency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurrencyContext currency() throws RecognitionException {
		CurrencyContext _localctx = new CurrencyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_currency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(WORD);
			setState(225);
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

	public static class RateOfExchangeContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public RateOfExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rateOfExchange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitRateOfExchange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RateOfExchangeContext rateOfExchange() throws RecognitionException {
		RateOfExchangeContext _localctx = new RateOfExchangeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rateOfExchange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
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

	public static class SpoBasePriceContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public SpoBasePriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spoBasePrice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitSpoBasePrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpoBasePriceContext spoBasePrice() throws RecognitionException {
		SpoBasePriceContext _localctx = new SpoBasePriceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_spoBasePrice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
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

	public static class DiscountContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public DiscountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitDiscount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscountContext discount() throws RecognitionException {
		DiscountContext _localctx = new DiscountContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_discount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
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

	public static class DynamicPriceAdjustmentContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public DynamicPriceAdjustmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicPriceAdjustment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitDynamicPriceAdjustment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicPriceAdjustmentContext dynamicPriceAdjustment() throws RecognitionException {
		DynamicPriceAdjustmentContext _localctx = new DynamicPriceAdjustmentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dynamicPriceAdjustment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
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

	public static class PriceAdjustmentAppliedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public PriceAdjustmentAppliedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priceAdjustmentApplied; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitPriceAdjustmentApplied(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriceAdjustmentAppliedContext priceAdjustmentApplied() throws RecognitionException {
		PriceAdjustmentAppliedContext _localctx = new PriceAdjustmentAppliedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_priceAdjustmentApplied);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(INTEGER);
			setState(240);
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

	public static class SalesPriceContext extends ParserRuleContext {
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public SalesPriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salesPrice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitSalesPrice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SalesPriceContext salesPrice() throws RecognitionException {
		SalesPriceContext _localctx = new SalesPriceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_salesPrice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
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
		public TerminalNode SEPARATOR() { return getToken(TurSysParser.SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitTax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaxContext tax() throws RecognitionException {
		TaxContext _localctx = new TaxContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
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

	public static class TotalAmountContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public TotalAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_totalAmount; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitTotalAmount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TotalAmountContext totalAmount() throws RecognitionException {
		TotalAmountContext _localctx = new TotalAmountContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_totalAmount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==NUMBER) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\6\2M\n\2\r\2\16\2N\3\2\3\2\3\3\3"+
		"\3\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\3\3\4\6\4^\n\4\r\4\16\4_\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\5\6\u0087\n\6\3\6\3\6\3\7\5\7\u008c\n\7\3\7\3\7\3\b\3\b\3\b\3\t\5\t"+
		"\u0094\n\t\3\t\3\t\3\n\5\n\u0099\n\n\3\n\3\n\3\13\5\13\u009e\n\13\3\13"+
		"\3\13\3\f\5\f\u00a3\n\f\3\f\3\f\3\r\5\r\u00a8\n\r\3\r\3\r\3\16\5\16\u00ad"+
		"\n\16\3\16\3\16\3\17\5\17\u00b2\n\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\5\27\u00cc\n\27\3\27\3\27\3\30\5\30\u00d1\n\30\3\30\3"+
		"\30\3\31\5\31\u00d6\n\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\2\2&\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\3\3\2\3\4\2\u00e8\2"+
		"J\3\2\2\2\4V\3\2\2\2\6]\3\2\2\2\bz\3\2\2\2\n\u0086\3\2\2\2\f\u008b\3\2"+
		"\2\2\16\u008f\3\2\2\2\20\u0093\3\2\2\2\22\u0098\3\2\2\2\24\u009d\3\2\2"+
		"\2\26\u00a2\3\2\2\2\30\u00a7\3\2\2\2\32\u00ac\3\2\2\2\34\u00b1\3\2\2\2"+
		"\36\u00b5\3\2\2\2 \u00b8\3\2\2\2\"\u00bb\3\2\2\2$\u00be\3\2\2\2&\u00c1"+
		"\3\2\2\2(\u00c4\3\2\2\2*\u00c7\3\2\2\2,\u00cb\3\2\2\2.\u00d0\3\2\2\2\60"+
		"\u00d5\3\2\2\2\62\u00d9\3\2\2\2\64\u00dc\3\2\2\2\66\u00df\3\2\2\28\u00e2"+
		"\3\2\2\2:\u00e5\3\2\2\2<\u00e8\3\2\2\2>\u00eb\3\2\2\2@\u00ee\3\2\2\2B"+
		"\u00f1\3\2\2\2D\u00f4\3\2\2\2F\u00f7\3\2\2\2H\u00fa\3\2\2\2JL\5\4\3\2"+
		"KM\5\6\4\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\2\2\3"+
		"Q\3\3\2\2\2RS\7\5\2\2SU\7\7\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2"+
		"\2WY\3\2\2\2XV\3\2\2\2YZ\7\5\2\2Z[\7\6\2\2[\5\3\2\2\2\\^\5\b\5\2]\\\3"+
		"\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\5\36\20\2bc\5 \21\2c"+
		"d\5\"\22\2de\5$\23\2ef\5&\24\2fg\5(\25\2gh\5*\26\2hi\5,\27\2ij\5.\30\2"+
		"jk\5\60\31\2kl\5\62\32\2lm\5\64\33\2mn\5\66\34\2no\58\35\2op\5:\36\2p"+
		"q\5<\37\2qr\5> \2rs\5@!\2st\5B\"\2tu\5D#\2uv\5F$\2vx\5H%\2wy\7\6\2\2x"+
		"w\3\2\2\2xy\3\2\2\2y\7\3\2\2\2z{\5\n\6\2{|\5\f\7\2|}\5\16\b\2}~\5\20\t"+
		"\2~\177\5\22\n\2\177\u0080\5\24\13\2\u0080\u0081\5\26\f\2\u0081\u0082"+
		"\5\30\r\2\u0082\u0083\5\32\16\2\u0083\u0084\5\34\17\2\u0084\t\3\2\2\2"+
		"\u0085\u0087\7\3\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\7\7\2\2\u0089\13\3\2\2\2\u008a\u008c\7\5\2\2\u008b"+
		"\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\7"+
		"\2\2\u008e\r\3\2\2\2\u008f\u0090\7\3\2\2\u0090\u0091\7\7\2\2\u0091\17"+
		"\3\2\2\2\u0092\u0094\7\5\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7\7\2\2\u0096\21\3\2\2\2\u0097\u0099\7\5\2"+
		"\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\7\7\2\2\u009b\23\3\2\2\2\u009c\u009e\7\5\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0\25\3\2\2"+
		"\2\u00a1\u00a3\7\5\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\27\3\2\2\2\u00a6\u00a8\7\5\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\7"+
		"\2\2\u00aa\31\3\2\2\2\u00ab\u00ad\7\3\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\7\2\2\u00af\33\3\2\2\2\u00b0"+
		"\u00b2\7\3\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\7\7\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7"+
		"\7\7\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba\7\7\2\2\u00ba"+
		"!\3\2\2\2\u00bb\u00bc\7\5\2\2\u00bc\u00bd\7\7\2\2\u00bd#\3\2\2\2\u00be"+
		"\u00bf\7\3\2\2\u00bf\u00c0\7\7\2\2\u00c0%\3\2\2\2\u00c1\u00c2\7\5\2\2"+
		"\u00c2\u00c3\7\7\2\2\u00c3\'\3\2\2\2\u00c4\u00c5\7\3\2\2\u00c5\u00c6\7"+
		"\7\2\2\u00c6)\3\2\2\2\u00c7\u00c8\7\3\2\2\u00c8\u00c9\7\7\2\2\u00c9+\3"+
		"\2\2\2\u00ca\u00cc\7\3\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\7\7\2\2\u00ce-\3\2\2\2\u00cf\u00d1\7\3\2\2"+
		"\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3"+
		"\7\7\2\2\u00d3/\3\2\2\2\u00d4\u00d6\7\3\2\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\61\3\2\2"+
		"\2\u00d9\u00da\7\3\2\2\u00da\u00db\7\7\2\2\u00db\63\3\2\2\2\u00dc\u00dd"+
		"\7\5\2\2\u00dd\u00de\7\7\2\2\u00de\65\3\2\2\2\u00df\u00e0\7\5\2\2\u00e0"+
		"\u00e1\7\7\2\2\u00e1\67\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\7\7\2"+
		"\2\u00e49\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6\u00e7\7\7\2\2\u00e7;\3\2\2"+
		"\2\u00e8\u00e9\t\2\2\2\u00e9\u00ea\7\7\2\2\u00ea=\3\2\2\2\u00eb\u00ec"+
		"\t\2\2\2\u00ec\u00ed\7\7\2\2\u00ed?\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef"+
		"\u00f0\7\7\2\2\u00f0A\3\2\2\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3\7\7\2\2"+
		"\u00f3C\3\2\2\2\u00f4\u00f5\t\2\2\2\u00f5\u00f6\7\7\2\2\u00f6E\3\2\2\2"+
		"\u00f7\u00f8\t\2\2\2\u00f8\u00f9\7\7\2\2\u00f9G\3\2\2\2\u00fa\u00fb\t"+
		"\2\2\2\u00fbI\3\2\2\2\22NV_x\u0086\u008b\u0093\u0098\u009d\u00a2\u00a7"+
		"\u00ac\u00b1\u00cb\u00d0\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
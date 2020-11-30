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
		INTEGER=1, NUMBER=2, WORD=3, ID=4, NEW_LINE=5, SEPARATOR_SKIP=6;
	public static final int
		RULE_file = 0, RULE_header = 1, RULE_row = 2, RULE_segment = 3, RULE_departureDate = 4, 
		RULE_carrierCode = 5, RULE_flightNumber = 6, RULE_origin = 7, RULE_destination = 8, 
		RULE_flightPath = 9, RULE_cabinCode = 10, RULE_seatAssignment = 11, RULE_liftStatus = 12, 
		RULE_boardingSequence = 13, RULE_pnr = 14, RULE_couponIdentificationCode = 15, 
		RULE_fareBasisCode = 16, RULE_bookingTypeCode = 17, RULE_bookingStatusCode = 18, 
		RULE_bookingDate = 19, RULE_bookingTime = 20, RULE_ticketingDate = 21, 
		RULE_ticketingTime = 22, RULE_cancellationDate = 23, RULE_agentCode = 24, 
		RULE_salesSource = 25, RULE_passengerType = 26, RULE_currency = 27, RULE_rateOfExchange = 28, 
		RULE_spoBasePrice = 29, RULE_promoIdentifier = 30, RULE_discount = 31, 
		RULE_dynamicPriceAdjustment = 32, RULE_priceAdjustmentApplied = 33, RULE_salesPrice = 34, 
		RULE_tax = 35, RULE_totalAmount = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "header", "row", "segment", "departureDate", "carrierCode", "flightNumber", 
			"origin", "destination", "flightPath", "cabinCode", "seatAssignment", 
			"liftStatus", "boardingSequence", "pnr", "couponIdentificationCode", 
			"fareBasisCode", "bookingTypeCode", "bookingStatusCode", "bookingDate", 
			"bookingTime", "ticketingDate", "ticketingTime", "cancellationDate", 
			"agentCode", "salesSource", "passengerType", "currency", "rateOfExchange", 
			"spoBasePrice", "promoIdentifier", "discount", "dynamicPriceAdjustment", 
			"priceAdjustmentApplied", "salesPrice", "tax", "totalAmount"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "NUMBER", "WORD", "ID", "NEW_LINE", "SEPARATOR_SKIP"
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
			setState(74);
			header();
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				row();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER || _la==WORD );
			setState(80);
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
		public TerminalNode NEW_LINE() { return getToken(TurSysParser.NEW_LINE, 0); }
		public List<TerminalNode> ID() { return getTokens(TurSysParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TurSysParser.ID, i);
		}
		public List<TerminalNode> WORD() { return getTokens(TurSysParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TurSysParser.WORD, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD || _la==ID );
			setState(87);
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
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
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
		public PromoIdentifierContext promoIdentifier() {
			return getRuleContext(PromoIdentifierContext.class,0);
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
		public TerminalNode NEW_LINE() { return getToken(TurSysParser.NEW_LINE, 0); }
		public CancellationDateContext cancellationDate() {
			return getRuleContext(CancellationDateContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			segment();
			setState(90);
			segment();
			setState(91);
			segment();
			setState(92);
			pnr();
			setState(93);
			couponIdentificationCode();
			setState(94);
			fareBasisCode();
			setState(95);
			bookingTypeCode();
			setState(96);
			bookingStatusCode();
			setState(97);
			bookingDate();
			setState(98);
			bookingTime();
			setState(99);
			ticketingDate();
			setState(100);
			ticketingTime();
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(101);
				cancellationDate();
				}
				break;
			}
			setState(104);
			agentCode();
			setState(105);
			salesSource();
			setState(106);
			passengerType();
			setState(107);
			currency();
			setState(108);
			rateOfExchange();
			setState(109);
			spoBasePrice();
			setState(110);
			promoIdentifier();
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
			setState(117);
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

	public static class SegmentContext extends ParserRuleContext {
		public FlightNumberContext flightNumber() {
			return getRuleContext(FlightNumberContext.class,0);
		}
		public BoardingSequenceContext boardingSequence() {
			return getRuleContext(BoardingSequenceContext.class,0);
		}
		public DepartureDateContext departureDate() {
			return getRuleContext(DepartureDateContext.class,0);
		}
		public CarrierCodeContext carrierCode() {
			return getRuleContext(CarrierCodeContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(119);
				departureDate();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(122);
				carrierCode();
				}
			}

			setState(125);
			flightNumber();
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(126);
				origin();
				}
				break;
			}
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(129);
				destination();
				}
				break;
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(132);
				flightPath();
				}
				break;
			}
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(135);
				cabinCode();
				}
				break;
			}
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(138);
				seatAssignment();
				}
				break;
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD) {
				{
				setState(141);
				liftStatus();
				}
			}

			setState(144);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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

	public static class CarrierCodeContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
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

	public static class OriginContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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

	public static class FlightPathContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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

	public static class CabinCodeContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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

	public static class SeatAssignmentContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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

	public static class LiftStatusContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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

	public static class BoardingSequenceContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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

	public static class PnrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TurSysParser.ID, 0); }
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
			setState(166);
			match(ID);
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
			setState(168);
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

	public static class FareBasisCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
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
			setState(170);
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

	public static class BookingTypeCodeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
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
			setState(172);
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

	public static class BookingStatusCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
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
			setState(174);
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

	public static class BookingDateContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
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
			setState(176);
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

	public static class BookingTimeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
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
			setState(178);
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

	public static class TicketingDateContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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

	public static class TicketingTimeContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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

	public static class CancellationDateContext extends ParserRuleContext {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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

	public static class AgentCodeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
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
			setState(186);
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

	public static class SalesSourceContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
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
			setState(188);
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

	public static class PassengerTypeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
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
			setState(190);
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

	public static class CurrencyContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(TurSysParser.WORD, 0); }
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
			setState(192);
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

	public static class RateOfExchangeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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

	public static class SpoBasePriceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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

	public static class PromoIdentifierContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
		public PromoIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promoIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TurSysVisitor ) return ((TurSysVisitor<? extends T>)visitor).visitPromoIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PromoIdentifierContext promoIdentifier() throws RecognitionException {
		PromoIdentifierContext _localctx = new PromoIdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_promoIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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

	public static class DiscountContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
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
		enterRule(_localctx, 62, RULE_discount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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

	public static class DynamicPriceAdjustmentContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
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
		enterRule(_localctx, 64, RULE_dynamicPriceAdjustment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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

	public static class PriceAdjustmentAppliedContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TurSysParser.INTEGER, 0); }
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
		enterRule(_localctx, 66, RULE_priceAdjustmentApplied);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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

	public static class SalesPriceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
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
		enterRule(_localctx, 68, RULE_salesPrice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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

	public static class TaxContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
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
		enterRule(_localctx, 70, RULE_tax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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

	public static class TotalAmountContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TurSysParser.NUMBER, 0); }
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
		enterRule(_localctx, 72, RULE_totalAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\6\2O\n\2\r\2\16\2P\3\2\3\2"+
		"\3\3\6\3V\n\3\r\3\16\3W\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4i\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\5\5{\n\5\3\5\5\5~\n\5\3\5\3\5\5\5\u0082\n\5\3\5\5\5"+
		"\u0085\n\5\3\5\5\5\u0088\n\5\3\5\5\5\u008b\n\5\3\5\5\5\u008e\n\5\3\5\5"+
		"\5\u0091\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\3\3\2\5\6\2\u00bc\2L\3\2\2"+
		"\2\4U\3\2\2\2\6[\3\2\2\2\bz\3\2\2\2\n\u0094\3\2\2\2\f\u0096\3\2\2\2\16"+
		"\u0098\3\2\2\2\20\u009a\3\2\2\2\22\u009c\3\2\2\2\24\u009e\3\2\2\2\26\u00a0"+
		"\3\2\2\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34\u00a6\3\2\2\2\36\u00a8\3"+
		"\2\2\2 \u00aa\3\2\2\2\"\u00ac\3\2\2\2$\u00ae\3\2\2\2&\u00b0\3\2\2\2(\u00b2"+
		"\3\2\2\2*\u00b4\3\2\2\2,\u00b6\3\2\2\2.\u00b8\3\2\2\2\60\u00ba\3\2\2\2"+
		"\62\u00bc\3\2\2\2\64\u00be\3\2\2\2\66\u00c0\3\2\2\28\u00c2\3\2\2\2:\u00c4"+
		"\3\2\2\2<\u00c6\3\2\2\2>\u00c8\3\2\2\2@\u00ca\3\2\2\2B\u00cc\3\2\2\2D"+
		"\u00ce\3\2\2\2F\u00d0\3\2\2\2H\u00d2\3\2\2\2J\u00d4\3\2\2\2LN\5\4\3\2"+
		"MO\5\6\4\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\2\2\3"+
		"S\3\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2"+
		"\2YZ\7\7\2\2Z\5\3\2\2\2[\\\5\b\5\2\\]\5\b\5\2]^\5\b\5\2^_\5\36\20\2_`"+
		"\5 \21\2`a\5\"\22\2ab\5$\23\2bc\5&\24\2cd\5(\25\2de\5*\26\2ef\5,\27\2"+
		"fh\5.\30\2gi\5\60\31\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\5\62\32\2kl\5\64"+
		"\33\2lm\5\66\34\2mn\58\35\2no\5:\36\2op\5<\37\2pq\5> \2qr\5@!\2rs\5B\""+
		"\2st\5D#\2tu\5F$\2uv\5H%\2vw\5J&\2wx\7\7\2\2x\7\3\2\2\2y{\5\n\6\2zy\3"+
		"\2\2\2z{\3\2\2\2{}\3\2\2\2|~\5\f\7\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2"+
		"\177\u0081\5\16\b\2\u0080\u0082\5\20\t\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\5\22\n\2\u0084\u0083\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0088\5\24\13\2\u0087\u0086"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5\26\f\2"+
		"\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e"+
		"\5\30\r\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u0091\5\32\16\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\5\34\17\2\u0093\t\3\2\2\2\u0094\u0095\7\3\2\2\u0095"+
		"\13\3\2\2\2\u0096\u0097\7\5\2\2\u0097\r\3\2\2\2\u0098\u0099\7\3\2\2\u0099"+
		"\17\3\2\2\2\u009a\u009b\7\5\2\2\u009b\21\3\2\2\2\u009c\u009d\7\5\2\2\u009d"+
		"\23\3\2\2\2\u009e\u009f\7\5\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a3\7\3\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5"+
		"\33\3\2\2\2\u00a6\u00a7\7\3\2\2\u00a7\35\3\2\2\2\u00a8\u00a9\7\6\2\2\u00a9"+
		"\37\3\2\2\2\u00aa\u00ab\7\3\2\2\u00ab!\3\2\2\2\u00ac\u00ad\7\5\2\2\u00ad"+
		"#\3\2\2\2\u00ae\u00af\7\3\2\2\u00af%\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1"+
		"\'\3\2\2\2\u00b2\u00b3\7\3\2\2\u00b3)\3\2\2\2\u00b4\u00b5\7\3\2\2\u00b5"+
		"+\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7-\3\2\2\2\u00b8\u00b9\7\3\2\2\u00b9"+
		"/\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\61\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd"+
		"\63\3\2\2\2\u00be\u00bf\7\5\2\2\u00bf\65\3\2\2\2\u00c0\u00c1\7\5\2\2\u00c1"+
		"\67\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c39\3\2\2\2\u00c4\u00c5\7\4\2\2\u00c5"+
		";\3\2\2\2\u00c6\u00c7\7\4\2\2\u00c7=\3\2\2\2\u00c8\u00c9\7\3\2\2\u00c9"+
		"?\3\2\2\2\u00ca\u00cb\7\4\2\2\u00cbA\3\2\2\2\u00cc\u00cd\7\4\2\2\u00cd"+
		"C\3\2\2\2\u00ce\u00cf\7\3\2\2\u00cfE\3\2\2\2\u00d0\u00d1\7\4\2\2\u00d1"+
		"G\3\2\2\2\u00d2\u00d3\7\4\2\2\u00d3I\3\2\2\2\u00d4\u00d5\7\4\2\2\u00d5"+
		"K\3\2\2\2\rPWhz}\u0081\u0084\u0087\u008a\u008d\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
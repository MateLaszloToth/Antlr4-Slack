// Generated from TurSys.g4 by ANTLR 4.9.1

package com.kambr.parser.onex.tursys.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TurSysParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TurSysVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TurSysParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(TurSysParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(TurSysParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(TurSysParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment(TurSysParser.SegmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#departureDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartureDate(TurSysParser.DepartureDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#carrierCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarrierCode(TurSysParser.CarrierCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#flightNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightNumber(TurSysParser.FlightNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#origin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin(TurSysParser.OriginContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination(TurSysParser.DestinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#flightPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightPath(TurSysParser.FlightPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#cabinCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabinCode(TurSysParser.CabinCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#seatAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeatAssignment(TurSysParser.SeatAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#liftStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiftStatus(TurSysParser.LiftStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#boardingSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoardingSequence(TurSysParser.BoardingSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#pnr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPnr(TurSysParser.PnrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#couponIdentificationCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCouponIdentificationCode(TurSysParser.CouponIdentificationCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#fareBasisCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFareBasisCode(TurSysParser.FareBasisCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#bookingTypeCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBookingTypeCode(TurSysParser.BookingTypeCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#bookingStatusCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBookingStatusCode(TurSysParser.BookingStatusCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#bookingDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBookingDate(TurSysParser.BookingDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#bookingTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBookingTime(TurSysParser.BookingTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#ticketingDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTicketingDate(TurSysParser.TicketingDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#ticketingTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTicketingTime(TurSysParser.TicketingTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#cancellationDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCancellationDate(TurSysParser.CancellationDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#agentCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgentCode(TurSysParser.AgentCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#salesSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalesSource(TurSysParser.SalesSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#passengerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassengerType(TurSysParser.PassengerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#currency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrency(TurSysParser.CurrencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#rateOfExchange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRateOfExchange(TurSysParser.RateOfExchangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#spoBasePrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpoBasePrice(TurSysParser.SpoBasePriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#discount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscount(TurSysParser.DiscountContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#dynamicPriceAdjustment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicPriceAdjustment(TurSysParser.DynamicPriceAdjustmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#priceAdjustmentApplied}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriceAdjustmentApplied(TurSysParser.PriceAdjustmentAppliedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#salesPrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalesPrice(TurSysParser.SalesPriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#tax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTax(TurSysParser.TaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link TurSysParser#totalAmount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalAmount(TurSysParser.TotalAmountContext ctx);
}
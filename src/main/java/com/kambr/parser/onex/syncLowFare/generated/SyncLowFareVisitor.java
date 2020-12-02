// Generated from SyncLowFare.g4 by ANTLR 4.8

package com.kambr.parser.onex.syncLowFare.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SyncLowFareParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SyncLowFareVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(SyncLowFareParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SyncLowFareParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(SyncLowFareParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#departureDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartureDate(SyncLowFareParser.DepartureDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#origin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin(SyncLowFareParser.OriginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination(SyncLowFareParser.DestinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#viaStation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViaStation(SyncLowFareParser.ViaStationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#carrierCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarrierCode(SyncLowFareParser.CarrierCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#flightNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightNumber(SyncLowFareParser.FlightNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#departureTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartureTime(SyncLowFareParser.DepartureTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#arrivalTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrivalTime(SyncLowFareParser.ArrivalTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(SyncLowFareParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#flightID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightID(SyncLowFareParser.FlightIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#pnrIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPnrIdentifier(SyncLowFareParser.PnrIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#agencyCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgencyCode(SyncLowFareParser.AgencyCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#agencyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgencyName(SyncLowFareParser.AgencyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#seatsSold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeatsSold(SyncLowFareParser.SeatsSoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#flightPrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightPrice(SyncLowFareParser.FlightPriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#tax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTax(SyncLowFareParser.TaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#additionalAmount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalAmount(SyncLowFareParser.AdditionalAmountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncLowFareParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(SyncLowFareParser.SumContext ctx);
}
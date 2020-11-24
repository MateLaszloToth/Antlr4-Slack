// Generated from Spo.g4 by ANTLR 4.8

package com.kambr.parser.onex.spo.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpoParser#spo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpo(SpoParser.SpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SpoParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(SpoParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#departureDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartureDate(SpoParser.DepartureDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#origin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin(SpoParser.OriginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination(SpoParser.DestinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#viaStation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViaStation(SpoParser.ViaStationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#carrierCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarrierCode(SpoParser.CarrierCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#flightNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightNumber(SpoParser.FlightNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#departureTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartureTime(SpoParser.DepartureTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#arrivalTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrivalTime(SpoParser.ArrivalTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#taxAmount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxAmount(SpoParser.TaxAmountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#surcharge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurcharge(SpoParser.SurchargeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#fixAllocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixAllocation(SpoParser.FixAllocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#proRataAmount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProRataAmount(SpoParser.ProRataAmountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#totalNumberOfAllocations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotalNumberOfAllocations(SpoParser.TotalNumberOfAllocationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#bookings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBookings(SpoParser.BookingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#available}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailable(SpoParser.AvailableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#contractPrice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractPrice(SpoParser.ContractPriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(SpoParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#price}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrice(SpoParser.PriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#flightID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightID(SpoParser.FlightIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#poolingEnabled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoolingEnabled(SpoParser.PoolingEnabledContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#agencyCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgencyCode(SpoParser.AgencyCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpoParser#agencyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgencyName(SpoParser.AgencyNameContext ctx);
}
// Generated from /Users/matetoth/Documents/Kambr/Antlr-corendon/grammar/Sync.g4 by ANTLR 4.8

package com.kambr.sync.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SyncParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SyncVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SyncParser#flightRecords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightRecords(SyncParser.FlightRecordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#geniusFlight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeniusFlight(SyncParser.GeniusFlightContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#airlineCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAirlineCode(SyncParser.AirlineCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#flightNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightNumber(SyncParser.FlightNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#origin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrigin(SyncParser.OriginContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#destination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination(SyncParser.DestinationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#departureDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartureDate(SyncParser.DepartureDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#cabin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabin(SyncParser.CabinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#viaStation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViaStation(SyncParser.ViaStationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#chainID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainID(SyncParser.ChainIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#flightID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightID(SyncParser.FlightIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#cabinCapacity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabinCapacity(SyncParser.CabinCapacityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#cabinBooking}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabinBooking(SyncParser.CabinBookingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#websiteAllocated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebsiteAllocated(SyncParser.WebsiteAllocatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#websiteBookings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWebsiteBookings(SyncParser.WebsiteBookingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#poolCapacity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoolCapacity(SyncParser.PoolCapacityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#poolBooked}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoolBooked(SyncParser.PoolBookedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#restCapacity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestCapacity(SyncParser.RestCapacityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#restBooked}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestBooked(SyncParser.RestBookedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#departureTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepartureTime(SyncParser.DepartureTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#arrivalTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrivalTime(SyncParser.ArrivalTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#updateIndentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateIndentifier(SyncParser.UpdateIndentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#specialPriceOffers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialPriceOffers(SyncParser.SpecialPriceOffersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#fromSeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSeat(SyncParser.FromSeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#price}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrice(SyncParser.PriceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(SyncParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyncParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(SyncParser.TimeContext ctx);
}
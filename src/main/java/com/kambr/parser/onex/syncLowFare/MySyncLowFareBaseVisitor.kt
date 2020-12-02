package com.kambr.parser.onex.syncLowFare

import com.kambr.parser.onex.syncLowFare.dataClasses.LowFareSales
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareBaseVisitor
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser.AdditionalAmountContext
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser.AgencyCodeContext
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser.FlightPriceContext
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser.PnrIdentifierContext
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser.SeatsSoldContext
import com.kambr.parser.onex.syncLowFare.generated.SyncLowFareParser.SumContext
import org.antlr.v4.runtime.tree.TerminalNode
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MySyncLowFareBaseVisitor : SyncLowFareBaseVisitor<Any>() {

    companion object {
        val datePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        val timePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")
    }

    override fun visitFile(ctx: SyncLowFareParser.FileContext): List<LowFareSales> {
        val lowFareSalesList: MutableList<LowFareSales> = mutableListOf()
        for (child in ctx.children) {
            when (child) {
                is SyncLowFareParser.HeaderContext -> {
                }
                is SyncLowFareParser.RowContext -> lowFareSalesList.add(visitRow(child))
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of FileContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }

        return lowFareSalesList
    }

    override fun visitRow(ctx: SyncLowFareParser.RowContext): LowFareSales {
        var departureDate: LocalDate? = null
        var origin: String? = null
        var destination: String? = null
        var viaStation: String? = null
        var carrierCode: String? = null
        var flightNumber: String? = null
        var departureTime: LocalTime? = null
        var arrivalTime: LocalTime? = null
        var flightID: Long? = null
        var pnrIdentifier: String? = null
        var agencyID: Long? = null
        var agencyName: String? = null
        var seatsSold: Int? = null
        var flightPrice: BigDecimal? = null
        var tax: BigDecimal? = null
        var additionalAmount: BigDecimal? = null
        var sum: BigDecimal? = null

        for (child in ctx.children) {
            when (child) {
                is SyncLowFareParser.DepartureDateContext -> departureDate = visitDepartureDate(child)
                is SyncLowFareParser.OriginContext -> origin = visitOrigin(child)
                is SyncLowFareParser.DestinationContext -> destination = visitDestination(child)
                is SyncLowFareParser.ViaStationContext -> viaStation = visitViaStation(child)
                is SyncLowFareParser.CarrierCodeContext -> carrierCode = visitCarrierCode(child)
                is SyncLowFareParser.FlightNumberContext -> flightNumber = visitFlightNumber(child)
                is SyncLowFareParser.DepartureTimeContext -> departureTime = visitDepartureTime(child)
                is SyncLowFareParser.ArrivalTimeContext -> arrivalTime = visitArrivalTime(child)
                is SyncLowFareParser.FlightIDContext -> flightID = visitFlightID(child)
                is PnrIdentifierContext -> pnrIdentifier = visitPnrIdentifier(child)
                is AgencyCodeContext -> agencyID = visitAgencyCode(child)
                is SyncLowFareParser.AgencyNameContext -> agencyName = visitAgencyName(child)
                is SeatsSoldContext -> seatsSold = visitSeatsSold(child)
                is FlightPriceContext -> flightPrice = visitFlightPrice(child)
                is SyncLowFareParser.TaxContext -> tax = visitTax(child)
                is AdditionalAmountContext -> additionalAmount = visitAdditionalAmount(child)
                is SumContext -> sum = visitSum(child)
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of RowContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }
        return LowFareSales(
            departureDate = departureDate!!,
            origin = origin!!,
            destination = destination!!,
            viaStation = viaStation,
            carrierCode = carrierCode!!,
            flightNumber = flightNumber!!,
            departureTime = departureTime!!,
            arrivalTime = arrivalTime!!,
            flightID = flightID!!,
            pnrIdentifier = pnrIdentifier!!,
            agencyID = agencyID!!,
            agencyName = agencyName!!,
            seatsSold = seatsSold!!,
            flightPrice = flightPrice!!,
            tax = tax!!,
            additionalAmount = additionalAmount!!,
            sum = sum!!
        )
    }

    override fun visitDepartureDate(ctx: SyncLowFareParser.DepartureDateContext): LocalDate {
        return LocalDate.parse(ctx.DATE().text, datePattern)
    }

    override fun visitOrigin(ctx: SyncLowFareParser.OriginContext): String {
        return ctx.WORD().text
    }

    override fun visitDestination(ctx: SyncLowFareParser.DestinationContext): String {
        return ctx.WORD().text
    }

    override fun visitViaStation(ctx: SyncLowFareParser.ViaStationContext): String? {
        return ctx.WORD()?.text
    }

    override fun visitCarrierCode(ctx: SyncLowFareParser.CarrierCodeContext): String {
        return ctx.WORD().text
    }

    override fun visitFlightNumber(ctx: SyncLowFareParser.FlightNumberContext): String {
        return ctx.NUMBER().text
    }

    override fun visitDepartureTime(ctx: SyncLowFareParser.DepartureTimeContext): LocalTime {
        return visitTime(ctx.time())
    }

    override fun visitArrivalTime(ctx: SyncLowFareParser.ArrivalTimeContext): LocalTime {
        return visitTime(ctx.time())
    }

    override fun visitTime(ctx: SyncLowFareParser.TimeContext): LocalTime {
        return LocalTime.parse(ctx.text, timePattern)
    }

    override fun visitFlightID(ctx: SyncLowFareParser.FlightIDContext): Long {
        return ctx.NUMBER().text.toLong()
    }

    override fun visitPnrIdentifier(ctx: PnrIdentifierContext): String {
        return ctx.NUMBER().text
    }

    override fun visitAgencyCode(ctx: AgencyCodeContext): Long {
        return ctx.NUMBER().text.toLong()
    }

    override fun visitAgencyName(ctx: SyncLowFareParser.AgencyNameContext): String {
        return ctx.WORD().text
    }

    override fun visitSeatsSold(ctx: SeatsSoldContext): Int {
        return ctx.NUMBER().text.toInt()
    }

    override fun visitFlightPrice(ctx: FlightPriceContext): BigDecimal {
        return ctx.NUMBER().text.toBigDecimal()
    }

    override fun visitTax(ctx: SyncLowFareParser.TaxContext): BigDecimal {
        return ctx.NUMBER().text.toBigDecimal()
    }

    override fun visitAdditionalAmount(ctx: AdditionalAmountContext): BigDecimal {
        return ctx.NUMBER().text.toBigDecimal()
    }

    override fun visitSum(ctx: SumContext): BigDecimal {
        return ctx.NUMBER().text.toBigDecimal()
    }
}
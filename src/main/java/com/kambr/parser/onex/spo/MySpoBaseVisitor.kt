package com.kambr.parser.onex.spo

import com.kambr.parser.onex.spo.dataClasses.FromAndPrice
import com.kambr.parser.onex.spo.dataClasses.SpoGlobal
import com.kambr.parser.onex.spo.generated.SpoBaseVisitor
import com.kambr.parser.onex.spo.generated.SpoParser
import com.kambr.parser.onex.spo.generated.SpoParser.AgencyIDContext
import com.kambr.parser.onex.spo.generated.SpoParser.AgencyNameContext
import com.kambr.parser.onex.spo.generated.SpoParser.AvailableContext
import com.kambr.parser.onex.spo.generated.SpoParser.BookingsContext
import com.kambr.parser.onex.spo.generated.SpoParser.CarrierCodeContext
import com.kambr.parser.onex.spo.generated.SpoParser.ContractPriceContext
import com.kambr.parser.onex.spo.generated.SpoParser.FixAllocationContext
import com.kambr.parser.onex.spo.generated.SpoParser.FromContext
import com.kambr.parser.onex.spo.generated.SpoParser.HeaderContext
import com.kambr.parser.onex.spo.generated.SpoParser.PoolingEnabledContext
import com.kambr.parser.onex.spo.generated.SpoParser.ProRataAmountContext
import com.kambr.parser.onex.spo.generated.SpoParser.RowContext
import com.kambr.parser.onex.spo.generated.SpoParser.SpoContext
import com.kambr.parser.onex.spo.generated.SpoParser.SurchargeContext
import com.kambr.parser.onex.spo.generated.SpoParser.TaxAmountContext
import com.kambr.parser.onex.spo.generated.SpoParser.TotalNumberOfAllocationsContext
import org.antlr.v4.runtime.tree.TerminalNode
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MySpoBaseVisitor : SpoBaseVisitor<Any>() {

    companion object{
        val datePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        val timePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm")
    }

    override fun visitSpo(ctx: SpoContext): List<SpoGlobal> {
        val spoList = mutableListOf<SpoGlobal>()
        for (child in ctx.children) {
            when (child) {
                is HeaderContext -> {
                }
                is RowContext -> spoList.add(visitRow(child))
            }
        }
        return spoList
    }

    override fun visitRow(ctx: RowContext): SpoGlobal {
        var departureDate: LocalDate? = null
        var origin: String? = null
        var destination: String? = null
        var viaStation: String? = null
        var carrierCode: String? = null
        var flightNumber: String? = null
        var departureTime: LocalTime? = null
        var arrivalTime: LocalTime? = null
        var taxAmount: Double? = null
        var surcharge: Double? = null
        var fixAllocation: Int? = null
        var proRataAmount: Int? = null
        var totalNumberOfAllocations: Int? = null
        var bookings: Int? = null
        var available: Int? = null
        var contractPrice: Double? = null
        val fromAndPrice: MutableList<FromAndPrice> = mutableListOf()
        var flightID: Long? = null
        var poolingEnabled: Boolean? = null
        var agencyID: Long? = null
        var agencyName: String? = null

        for (child in ctx.children) {
            when (child) {
                is SpoParser.DepartureDateContext -> departureDate = visitDepartureDate(child)
                is SpoParser.OriginContext -> origin = visitOrigin(child)
                is SpoParser.DestinationContext -> destination = visitDestination(child)
                is SpoParser.ViaStationContext -> {
                    if (ctx.viaStation() != null) {
                        viaStation = visitViaStation(ctx.viaStation())
                    }
                }
                is CarrierCodeContext -> carrierCode = visitCarrierCode(child)
                is SpoParser.FlightNumberContext -> flightNumber = visitFlightNumber(child)
                is SpoParser.DepartureTimeContext -> departureTime = visitDepartureTime(child)
                is SpoParser.ArrivalTimeContext -> arrivalTime = visitArrivalTime(child)
                is TaxAmountContext -> taxAmount = visitTaxAmount(child)
                is SurchargeContext -> surcharge = visitSurcharge(child)
                is FixAllocationContext -> fixAllocation = visitFixAllocation(child)
                is ProRataAmountContext -> proRataAmount = visitProRataAmount(child)
                is TotalNumberOfAllocationsContext -> totalNumberOfAllocations = visitTotalNumberOfAllocations(child)
                is BookingsContext -> bookings = visitBookings(child)
                is AvailableContext -> available = visitAvailable(child)
                is ContractPriceContext -> contractPrice = visitContractPrice(child)
                is SpoParser.FromAndPriceContext -> fromAndPrice.add(visitFromAndPrice(child))
                is SpoParser.FlightIDContext -> flightID = visitFlightID(child)
                is PoolingEnabledContext -> poolingEnabled = visitPoolingEnabled(child)
                is AgencyIDContext -> agencyID = visitAgencyID(child)
                is AgencyNameContext -> agencyName = visitAgencyName(child)
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of row. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }

        return SpoGlobal(
            departureDate = departureDate!!,
            origin = origin!!,
            destination = destination!!,
            viaStation = viaStation,
            carrierCode = carrierCode!!,
            flightNumber = flightNumber!!,
            departureTime = departureTime!!,
            arrivalTime = arrivalTime!!,
            taxAmount = taxAmount!!,
            surcharge = surcharge!!,
            fixAllocation = fixAllocation!!,
            proRataAmount = proRataAmount!!,
            totalNumberOfAllocations = totalNumberOfAllocations!!,
            bookings = bookings!!,
            available = available!!,
            contractPrice = contractPrice!!,
            fromAndPrice = fromAndPrice,
            flightID = flightID!!,
            poolingEnabled = poolingEnabled!!,
            agencyID = agencyID!!,
            agencyName = agencyName!!,
        )
    }

    override fun visitDepartureDate(ctx: SpoParser.DepartureDateContext): LocalDate {
        return LocalDate.parse(ctx.text, datePattern)
    }

    override fun visitOrigin(ctx: SpoParser.OriginContext): String {
        return ctx.text
    }

    override fun visitDestination(ctx: SpoParser.DestinationContext): String {
        return ctx.text
    }

    override fun visitViaStation(ctx: SpoParser.ViaStationContext): String {
        return ctx.text
    }

    override fun visitCarrierCode(ctx: CarrierCodeContext): String {
        return ctx.text
    }

    override fun visitFlightNumber(ctx: SpoParser.FlightNumberContext): String {
        return ctx.text
    }

    override fun visitDepartureTime(ctx: SpoParser.DepartureTimeContext): LocalTime {
        return LocalTime.parse(ctx.text, timePattern)
    }

    override fun visitArrivalTime(ctx: SpoParser.ArrivalTimeContext): LocalTime {
        return LocalTime.parse(ctx.text, timePattern)
    }

    override fun visitTaxAmount(ctx: TaxAmountContext): Double {
        return ctx.text.replace(',','.').toDouble()
    }

    override fun visitSurcharge(ctx: SurchargeContext): Double {
        return ctx.text.replace(',','.').toDouble()
    }

    override fun visitFixAllocation(ctx: FixAllocationContext): Int {
        return ctx.text.toInt()
    }

    override fun visitProRataAmount(ctx: ProRataAmountContext): Int {
        return ctx.text.toInt()
    }

    override fun visitTotalNumberOfAllocations(ctx: TotalNumberOfAllocationsContext): Int {
        return ctx.text.toInt()
    }

    override fun visitBookings(ctx: BookingsContext): Int {
        return ctx.text.toInt()
    }

    override fun visitAvailable(ctx: AvailableContext): Int {
        return ctx.text.toInt()
    }

    override fun visitContractPrice(ctx: ContractPriceContext): Double {
        return ctx.text.replace(',','.').toDouble()
    }

    override fun visitFromAndPrice(ctx: SpoParser.FromAndPriceContext): FromAndPrice {
        var from: Int? = null
        var price: Double? = null

        for (child in ctx.children) {
            when(child) {
                is FromContext -> from = visitFrom(child)
                is SpoParser.PriceContext -> price = visitPrice(child)
                else -> {
                    throw RuntimeException(
                        "Unexpected children of fromAndPrice. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }
        return FromAndPrice(from!!, price!!)
    }

    override fun visitFrom(ctx: FromContext): Int {
        return ctx.text.toInt()
    }

    override fun visitPrice(ctx: SpoParser.PriceContext): Double {
        return ctx.text.replace(',','.').toDouble()
    }

    override fun visitFlightID(ctx: SpoParser.FlightIDContext): Long {
        return ctx.text.toLong()
    }

    override fun visitPoolingEnabled(ctx: PoolingEnabledContext): Boolean {
        return ctx.text == "1"
    }

    override fun visitAgencyID(ctx: AgencyIDContext): Long {
        return ctx.text.toLong()
    }

    override fun visitAgencyName(ctx: AgencyNameContext): String {
        return ctx.text
    }
}
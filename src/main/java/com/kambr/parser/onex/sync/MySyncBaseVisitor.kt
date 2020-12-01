package com.kambr.parser.onex.sync

import com.kambr.parser.onex.sync.dataClasses.GeniusFlight
import com.kambr.parser.onex.sync.dataClasses.SpecialPriceOffer
import com.kambr.parser.onex.sync.dataClasses.UpdateIdentifierEnum
import com.kambr.parser.onex.sync.generated.SyncBaseVisitor
import com.kambr.parser.onex.sync.generated.SyncParser.AirlineCodeContext
import com.kambr.parser.onex.sync.generated.SyncParser.ArrivalTimeContext
import com.kambr.parser.onex.sync.generated.SyncParser.CabinBookingContext
import com.kambr.parser.onex.sync.generated.SyncParser.CabinCapacityContext
import com.kambr.parser.onex.sync.generated.SyncParser.CabinContext
import com.kambr.parser.onex.sync.generated.SyncParser.ChainIDContext
import com.kambr.parser.onex.sync.generated.SyncParser.DateContext
import com.kambr.parser.onex.sync.generated.SyncParser.DepartureDateContext
import com.kambr.parser.onex.sync.generated.SyncParser.DepartureTimeContext
import com.kambr.parser.onex.sync.generated.SyncParser.DestinationContext
import com.kambr.parser.onex.sync.generated.SyncParser.FlightIDContext
import com.kambr.parser.onex.sync.generated.SyncParser.FlightNumberContext
import com.kambr.parser.onex.sync.generated.SyncParser.FlightRecordsContext
import com.kambr.parser.onex.sync.generated.SyncParser.FromSeatContext
import com.kambr.parser.onex.sync.generated.SyncParser.GeniusFlightContext
import com.kambr.parser.onex.sync.generated.SyncParser.OriginContext
import com.kambr.parser.onex.sync.generated.SyncParser.PoolBookedContext
import com.kambr.parser.onex.sync.generated.SyncParser.PoolCapacityContext
import com.kambr.parser.onex.sync.generated.SyncParser.PriceContext
import com.kambr.parser.onex.sync.generated.SyncParser.RestBookedContext
import com.kambr.parser.onex.sync.generated.SyncParser.RestCapacityContext
import com.kambr.parser.onex.sync.generated.SyncParser.SpecialPriceOffersContext
import com.kambr.parser.onex.sync.generated.SyncParser.TimeContext
import com.kambr.parser.onex.sync.generated.SyncParser.UpdateIndentifierContext
import com.kambr.parser.onex.sync.generated.SyncParser.ViaStationContext
import com.kambr.parser.onex.sync.generated.SyncParser.WebsiteAllocatedContext
import com.kambr.parser.onex.sync.generated.SyncParser.WebsiteBookingsContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.ArrayList

class MySyncBaseVisitor : SyncBaseVisitor<Any>() {

    private val timePattern = DateTimeFormatter.ofPattern("HH:mm")

    override fun visitFlightRecords(ctx: FlightRecordsContext): List<GeniusFlight> {
        val geniusFlightList: MutableList<GeniusFlight> = ArrayList()
        for (flight in ctx.geniusFlight()) {
            geniusFlightList.add(visitGeniusFlight(flight))
        }
        return geniusFlightList
    }

    override fun visitGeniusFlight(ctx: GeniusFlightContext): GeniusFlight {
        var carrierCode: String? = null
        var flightNumber: String? = null
        var origin: String? = null
        var destination: String? = null
        var departureDate: LocalDate? = null
        var cabin: String? = null
        var viaStation: String? = null
        var chainID: Long? = null
        var flightID: Long? = null
        var cabinCapacity: Int? = null
        var cabinBookings: Int? = null
        var websiteAllocated: Int? = null
        var websiteBookings: Int? = null
        var poolCapacity: Int? = null
        var poolBooked: Int? = null
        var restCapacity: Int? = null
        var restBooked: Int? = null
        var departureTime: LocalTime? = null
        var arrivalTime: LocalTime? = null
        var updateIdentifier: UpdateIdentifierEnum? = null
        val specialPriceOffers: MutableList<SpecialPriceOffer> = ArrayList()

        for (i in 0 until ctx.childCount) {
            when (val child = ctx.getChild(i) as ParseTree) {
                is AirlineCodeContext -> carrierCode = visitAirlineCode(ctx.airlineCode())
                is FlightNumberContext -> flightNumber = visitFlightNumber(ctx.flightNumber())
                is OriginContext -> origin = visitOrigin(ctx.origin())
                is DestinationContext -> destination = visitDestination(ctx.destination())
                is DepartureDateContext -> departureDate = visitDepartureDate(ctx.departureDate())
                is CabinContext -> cabin = visitCabin(ctx.cabin())
                is ViaStationContext -> {
                    if (ctx.viaStation() != null) {
                        viaStation = visitViaStation(ctx.viaStation())
                    }
                }
                is ChainIDContext -> chainID = visitChainID(ctx.chainID())
                is FlightIDContext -> flightID = visitFlightID(ctx.flightID())
                is CabinCapacityContext -> cabinCapacity = visitCabinCapacity(ctx.cabinCapacity())
                is CabinBookingContext -> cabinBookings = visitCabinBooking(ctx.cabinBooking())
                is WebsiteAllocatedContext -> websiteAllocated = visitWebsiteAllocated(ctx.websiteAllocated())
                is WebsiteBookingsContext -> websiteBookings = visitWebsiteBookings(ctx.websiteBookings())
                is PoolCapacityContext -> poolCapacity = visitPoolCapacity(ctx.poolCapacity())
                is PoolBookedContext -> poolBooked = visitPoolBooked(ctx.poolBooked())
                is RestCapacityContext -> restCapacity = visitRestCapacity(ctx.restCapacity())
                is RestBookedContext -> restBooked = visitRestBooked(ctx.restBooked())
                is DepartureTimeContext -> departureTime = visitDepartureTime(ctx.departureTime())
                is ArrivalTimeContext -> arrivalTime = visitArrivalTime(ctx.arrivalTime())
                is UpdateIndentifierContext -> updateIdentifier = visitUpdateIndentifier(ctx.updateIndentifier())
                is SpecialPriceOffersContext -> specialPriceOffers.add(visitSpecialPriceOffers(child))
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of GeniusFlightContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }
        return GeniusFlight(
            carrierCode!!,
            flightNumber!!,
            origin!!,
            destination!!,
            departureDate!!,
            cabin!!,
            viaStation,
            chainID!!,
            flightID!!,
            cabinCapacity!!,
            cabinBookings!!,
            websiteAllocated!!,
            websiteBookings!!,
            poolCapacity!!,
            poolBooked!!,
            restCapacity!!,
            restBooked!!,
            departureTime!!,
            arrivalTime!!,
            updateIdentifier!!,
            specialPriceOffers
        )
    }

    override fun visitAirlineCode(ctx: AirlineCodeContext): String {
        return ctx.text
    }

    override fun visitFlightNumber(ctx: FlightNumberContext): String {
        return ctx.text
    }

    override fun visitOrigin(ctx: OriginContext): String {
        return ctx.text
    }

    override fun visitDestination(ctx: DestinationContext): String {
        return ctx.text
    }

    override fun visitDepartureDate(ctx: DepartureDateContext): LocalDate {
        return LocalDate.parse(ctx.text, DateTimeFormatter.ISO_LOCAL_DATE)
    }

    override fun visitCabin(ctx: CabinContext): String {
        return ctx.text
    }

    override fun visitViaStation(ctx: ViaStationContext): String {
        return ctx.text
    }

    override fun visitChainID(ctx: ChainIDContext): Long {
        return ctx.text.toLong()
    }

    override fun visitFlightID(ctx: FlightIDContext): Long {
        return ctx.text.toLong()
    }

    override fun visitCabinCapacity(ctx: CabinCapacityContext): Int {
        return ctx.text.toInt()
    }

    override fun visitCabinBooking(ctx: CabinBookingContext): Int {
        return ctx.text.toInt()
    }

    override fun visitWebsiteAllocated(ctx: WebsiteAllocatedContext): Int {
        return ctx.text.toInt()
    }

    override fun visitWebsiteBookings(ctx: WebsiteBookingsContext): Int {
        return ctx.text.toInt()
    }

    override fun visitPoolCapacity(ctx: PoolCapacityContext): Int {
        return ctx.text.toInt()
    }

    override fun visitPoolBooked(ctx: PoolBookedContext): Int {
        return ctx.text.toInt()
    }

    override fun visitRestCapacity(ctx: RestCapacityContext): Int {
        return ctx.text.toInt()
    }

    override fun visitRestBooked(ctx: RestBookedContext): Int {
        return ctx.text.toInt()
    }

    override fun visitDepartureTime(ctx: DepartureTimeContext): LocalTime {
        return LocalTime.parse(ctx.text, timePattern)
    }

    override fun visitArrivalTime(ctx: ArrivalTimeContext): LocalTime {
        return LocalTime.parse(ctx.text, timePattern)
    }

    @Throws(RuntimeException::class)
    override fun visitUpdateIndentifier(ctx: UpdateIndentifierContext): UpdateIdentifierEnum {
        val character: Char
        if (ctx.text.isNotEmpty()) {
            character = ctx.text[0]
            return when (character) {
                'N' -> UpdateIdentifierEnum.NEW_FLIGHT
                'S' -> UpdateIdentifierEnum.SPO_FIX
                'U' -> UpdateIdentifierEnum.NIGHTLY_CAPTURE
                'X' -> UpdateIdentifierEnum.OTHER
                else -> throw RuntimeException(
                    "Update identifier is supposed to be " +
                        "'N' or 'S' or 'U' or 'X', but it was " + character
                )
            }
        }
        throw RuntimeException("Update identifier is supposed to be 'N' or 'S' or 'U' or 'X', but it is missing.")
    }

    override fun visitSpecialPriceOffers(ctx: SpecialPriceOffersContext): SpecialPriceOffer {
        var fromSeat: Int? = null
        var price: BigDecimal? = null
        for (child in ctx.children) {
            when (child) {
                is FromSeatContext -> fromSeat = visitFromSeat(ctx.fromSeat())
                is PriceContext -> price = visitPrice(ctx.price())
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of SpecialPriceOffers. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }
        return SpecialPriceOffer(fromSeat!!, price!!)
    }

    override fun visitFromSeat(ctx: FromSeatContext): Int {
        return ctx.text.toInt()
    }

    override fun visitPrice(ctx: PriceContext): BigDecimal {
        return ctx.text.toBigDecimal()
    }

    override fun visitDate(ctx: DateContext): String {
        return ctx.text
    }

    override fun visitTime(ctx: TimeContext): String {
        return ctx.text
    }
}
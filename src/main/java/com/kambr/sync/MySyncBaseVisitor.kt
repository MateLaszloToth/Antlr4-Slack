package com.kambr.sync

import com.kambr.sync.dataClasses.GeniusFlight
import com.kambr.sync.dataClasses.SpecialPriceOffer
import com.kambr.sync.dataClasses.UpdateIdentifierEnum
import com.kambr.sync.generated.SyncBaseVisitor
import com.kambr.sync.generated.SyncParser.AirlineCodeContext
import com.kambr.sync.generated.SyncParser.ArrivalTimeContext
import com.kambr.sync.generated.SyncParser.CabinBookingContext
import com.kambr.sync.generated.SyncParser.CabinCapacityContext
import com.kambr.sync.generated.SyncParser.CabinContext
import com.kambr.sync.generated.SyncParser.ChainIDContext
import com.kambr.sync.generated.SyncParser.DateContext
import com.kambr.sync.generated.SyncParser.DepartureDateContext
import com.kambr.sync.generated.SyncParser.DepartureTimeContext
import com.kambr.sync.generated.SyncParser.DestinationContext
import com.kambr.sync.generated.SyncParser.FlightIDContext
import com.kambr.sync.generated.SyncParser.FlightNumberContext
import com.kambr.sync.generated.SyncParser.FlightRecordsContext
import com.kambr.sync.generated.SyncParser.FromSeatContext
import com.kambr.sync.generated.SyncParser.GeniusFlightContext
import com.kambr.sync.generated.SyncParser.OriginContext
import com.kambr.sync.generated.SyncParser.PoolBookedContext
import com.kambr.sync.generated.SyncParser.PoolCapacityContext
import com.kambr.sync.generated.SyncParser.PriceContext
import com.kambr.sync.generated.SyncParser.RestBookedContext
import com.kambr.sync.generated.SyncParser.RestCapacityContext
import com.kambr.sync.generated.SyncParser.SpecialPriceOffersContext
import com.kambr.sync.generated.SyncParser.TimeContext
import com.kambr.sync.generated.SyncParser.UpdateIndentifierContext
import com.kambr.sync.generated.SyncParser.ViaStationContext
import com.kambr.sync.generated.SyncParser.WebsiteAllocatedContext
import com.kambr.sync.generated.SyncParser.WebsiteBookingsContext
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
        var airlineCode: String? = null
        var flightNumber: String? = null
        var origin: String? = null
        var destination: String? = null
        var departureDate: LocalDate? = null
        var cabin: String? = null
        var viaStation: String? = null
        var chainID: Long? = null
        var flightID: Long? = null
        var cabinCapacity: Short? = null
        var cabinBookings: Short? = null
        var websiteAllocated: Short? = null
        var websiteBookings: Short? = null
        var poolCapacity: Short? = null
        var poolBooked: Short? = null
        var restCapacity: Short? = null
        var restBooked: Short? = null
        var departureTime: LocalTime? = null
        var arrivalTime: LocalTime? = null
        var updateIndentifier: UpdateIdentifierEnum? = null
        val specialPriceOffers: MutableList<SpecialPriceOffer> = ArrayList()

        for (i in 0 until ctx.childCount) {
            when (val child = ctx.getChild(i) as ParseTree) {
                is AirlineCodeContext -> airlineCode = visitAirlineCode(ctx.airlineCode())
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
                is UpdateIndentifierContext -> updateIndentifier = visitUpdateIndentifier(ctx.updateIndentifier())
                is SpecialPriceOffersContext -> specialPriceOffers.add(visitSpecialPriceOffers(child))
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of GeniusFlight. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }
        return GeniusFlight(
            airlineCode!!,
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
            updateIndentifier!!,
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

    override fun visitCabinCapacity(ctx: CabinCapacityContext): Short {
        return ctx.text.toShort()
    }

    override fun visitCabinBooking(ctx: CabinBookingContext): Short {
        return ctx.text.toShort()
    }

    override fun visitWebsiteAllocated(ctx: WebsiteAllocatedContext): Short {
        return ctx.text.toShort()
    }

    override fun visitWebsiteBookings(ctx: WebsiteBookingsContext): Short {
        return ctx.text.toShort()
    }

    override fun visitPoolCapacity(ctx: PoolCapacityContext): Short {
        return ctx.text.toShort()
    }

    override fun visitPoolBooked(ctx: PoolBookedContext): Short {
        return ctx.text.toShort()
    }

    override fun visitRestCapacity(ctx: RestCapacityContext): Short {
        return ctx.text.toShort()
    }

    override fun visitRestBooked(ctx: RestBookedContext): Short {
        return ctx.text.toShort()
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
            return if (character == 'N') UpdateIdentifierEnum.NEW_FLIGHT else if (character == 'S') UpdateIdentifierEnum.SPO_FIX else if (character == 'U') UpdateIdentifierEnum.NIGHTLY_CAPTURE else if (character == 'X') UpdateIdentifierEnum.OTHER else throw RuntimeException(
                "Update identifier is supposed to be " +
                    "'N' or 'S' or 'U' or 'X', but it was " + character
            )
        }
        throw RuntimeException("Update identifier is supposed to be 'N' or 'S' or 'U' or 'X', but it is missing.")
    }

    override fun visitSpecialPriceOffers(ctx: SpecialPriceOffersContext): SpecialPriceOffer {
        var fromSeat: Short? = null
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

    override fun visitFromSeat(ctx: FromSeatContext): Short {
        return ctx.text.toShort()
    }

    override fun visitPrice(ctx: PriceContext): BigDecimal {
        return BigDecimal(ctx.text)
    }

    override fun visitDate(ctx: DateContext): String {
        return ctx.text
    }

    override fun visitTime(ctx: TimeContext): String {
        return ctx.text
    }
}
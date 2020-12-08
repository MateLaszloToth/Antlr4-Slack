package com.kambr.parser.onex.tursys

import com.kambr.parser.onex.tursys.dataClasses.BookingStatusCode
import com.kambr.parser.onex.tursys.dataClasses.BookingTypeCode
import com.kambr.parser.onex.tursys.dataClasses.LiftStatus
import com.kambr.parser.onex.tursys.dataClasses.PassengerType
import com.kambr.parser.onex.tursys.dataClasses.Segment
import com.kambr.parser.onex.tursys.dataClasses.Tursys
import com.kambr.parser.onex.tursys.generated.TurSysBaseVisitor
import com.kambr.parser.onex.tursys.generated.TurSysParser
import com.kambr.parser.onex.tursys.generated.TurSysParser.AgentCodeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.BoardingSequenceContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.BookingDateContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.BookingStatusCodeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.BookingTimeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.BookingTypeCodeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.CabinCodeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.CancellationDateContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.CouponIdentificationCodeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.CurrencyContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.DiscountContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.DynamicPriceAdjustmentContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.FareBasisCodeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.FileContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.FlightPathContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.LiftStatusContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.PassengerTypeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.PnrContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.PriceAdjustmentAppliedContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.PromoIdentifierContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.RateOfExchangeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.SalesPriceContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.SalesSourceContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.SeatAssignmentContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.SegmentContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.SpoBasePriceContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.TaxContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.TicketingDateContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.TicketingTimeContext
import com.kambr.parser.onex.tursys.generated.TurSysParser.TotalAmountContext
import org.antlr.v4.runtime.tree.TerminalNode
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Objects.nonNull

class MyTurSysBaseVisitor : TurSysBaseVisitor<Any>() {

    companion object {
        val datePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")
        val timePatternHHmmss: DateTimeFormatter = DateTimeFormatter.ofPattern("HHmmss")
        val timePatternHmmss: DateTimeFormatter = DateTimeFormatter.ofPattern("Hmmss")
        const val COMMA = ','
        const val PERIOD = '.'
    }

    override fun visitFile(ctx: FileContext): List<Tursys> {
        val tursysList: MutableList<Tursys> = mutableListOf()
        for (child in ctx.children) {
            when (child) {
                is TurSysParser.HeaderContext -> {
                }
                is TurSysParser.RowContext -> tursysList.add(visitRow(child))
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of FileContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }

        return tursysList
    }

    override fun visitRow(ctx: TurSysParser.RowContext): Tursys {
        val segments: MutableList<Segment> = mutableListOf()
        var pnr: String? = null
        var couponIdentificationCode: String? = null
        var fareBasisCode: String? = null
        var bookingTypeCode: BookingTypeCode? = null
        var bookingStatusCode: BookingStatusCode? = null
        var bookingDate: LocalDate? = null
        var bookingTime: LocalTime? = null
        var ticketingDate: LocalDate? = null
        var ticketingTime: LocalTime? = null
        var cancellationDate: LocalDate? = null
        var agentCode: String? = null
        var salesSource: String? = null
        var passengerType: PassengerType? = null
        var currency: String? = null
        var rateOfExchange: BigDecimal? = null
        var spoBasePrice: BigDecimal? = null
        var promoIdentifier: Boolean? = null
        var discount: BigDecimal? = null
        var dynamicPriceAdjustment: BigDecimal? = null
        var priceAdjustmentApplied: Boolean? = null
        var salesPrice: BigDecimal? = null
        var tax: BigDecimal? = null
        var totalAmount: BigDecimal? = null

        for (child in ctx.children) {
            when (child) {
                is SegmentContext -> if (nonNull(child.departureDate().INTEGER())) segments.add(visitSegment(child))
                is PnrContext -> pnr = visitPnr(child)
                is CouponIdentificationCodeContext -> couponIdentificationCode = visitCouponIdentificationCode(child)
                is FareBasisCodeContext -> fareBasisCode = visitFareBasisCode(child)
                is BookingTypeCodeContext -> bookingTypeCode = visitBookingTypeCode(child)
                is BookingStatusCodeContext -> bookingStatusCode = visitBookingStatusCode(child)
                is BookingDateContext -> bookingDate = visitBookingDate(child)
                is BookingTimeContext -> bookingTime = visitBookingTime(child)
                is TicketingDateContext -> ticketingDate = visitTicketingDate(child)
                is TicketingTimeContext -> ticketingTime = visitTicketingTime(child)
                is CancellationDateContext -> cancellationDate = visitCancellationDate(child)
                is AgentCodeContext -> agentCode = visitAgentCode(child)
                is SalesSourceContext -> salesSource = visitSalesSource(child)
                is PassengerTypeContext -> passengerType = visitPassengerType(child)
                is CurrencyContext -> currency = visitCurrency(child)
                is RateOfExchangeContext -> rateOfExchange = visitRateOfExchange(child)
                is SpoBasePriceContext -> spoBasePrice = visitSpoBasePrice(child)
                is PromoIdentifierContext -> promoIdentifier = visitPromoIdentifier(child)
                is DiscountContext -> discount = visitDiscount(child)
                is DynamicPriceAdjustmentContext -> dynamicPriceAdjustment = visitDynamicPriceAdjustment(child)
                is PriceAdjustmentAppliedContext -> priceAdjustmentApplied = visitPriceAdjustmentApplied(child)
                is SalesPriceContext -> salesPrice = visitSalesPrice(child)
                is TaxContext -> tax = visitTax(child)
                is TotalAmountContext -> totalAmount = visitTotalAmount(child)
                !is TerminalNode -> throw RuntimeException(
                    "Unexpected children of RowContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                )
            }
        }

        return Tursys(
            segments = segments,
            pnr = pnr!!,
            couponIdentificationCode = couponIdentificationCode!!,
            fareBasisCode = fareBasisCode!!,
            bookingTypeCode = bookingTypeCode!!,
            bookingStatusCode = bookingStatusCode!!,
            bookingDate = bookingDate!!,
            bookingTime = bookingTime!!,
            ticketingDate = ticketingDate!!,
            ticketingTime = ticketingTime!!,
            cancellationDate = cancellationDate,
            agentCode = agentCode!!,
            salesSource = salesSource!!,
            passengerType = passengerType!!,
            currency = currency!!,
            rateOfExchange = rateOfExchange!!,
            spoBasePrice = spoBasePrice!!,
            promoIdentifier = promoIdentifier!!,
            discount = discount!!,
            dynamicPriceAdjustment = dynamicPriceAdjustment!!,
            priceAdjustmentApplied = priceAdjustmentApplied!!,
            salesPrice = salesPrice!!,
            tax = tax!!,
            totalAmount = totalAmount!!
        )
    }

    override fun visitSegment(ctx: SegmentContext): Segment {
        var departureDate: LocalDate? = null
        var carrierCode: String? = null
        var flightNumber: String? = null
        var origin: String? = null
        var destination: String? = null
        var flightPath: String? = null
        var cabinCode: String? = null
        var seatAssignment: String? = null
        var liftStatus: LiftStatus? = null
        var boardingSequence: Int? = null

        for (child in ctx.children) {
            when (child) {
                is TurSysParser.DepartureDateContext -> departureDate = visitDepartureDate(child)
                is TurSysParser.CarrierCodeContext -> carrierCode = visitCarrierCode(child)
                is TurSysParser.FlightNumberContext -> flightNumber = visitFlightNumber(child)
                is TurSysParser.OriginContext -> origin = visitOrigin(child)
                is TurSysParser.DestinationContext -> destination = visitDestination(child)
                is FlightPathContext -> flightPath = visitFlightPath(child)
                is CabinCodeContext -> cabinCode = visitCabinCode(child)
                is SeatAssignmentContext -> seatAssignment = visitSeatAssignment(child)
                is LiftStatusContext -> liftStatus = visitLiftStatus(child)
                is BoardingSequenceContext -> boardingSequence = visitBoardingSequence(child)
                !is TerminalNode -> throw RuntimeException(
                    "Unexpected children of SegmentContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                )
            }
        }

        return Segment(
            departureDate = departureDate!!,
            carrierCode = carrierCode!!,
            flightNumber = flightNumber!!,
            origin = origin!!,
            destination = destination!!,
            flightPath = flightPath!!,
            cabinCode = cabinCode!!,
            seatAssignment = seatAssignment,
            liftStatus = liftStatus,
            boardingSequence = boardingSequence
        )
    }

    override fun visitDepartureDate(ctx: TurSysParser.DepartureDateContext): LocalDate {
        return LocalDate.parse(ctx.INTEGER().text, datePattern)
    }

    override fun visitCarrierCode(ctx: TurSysParser.CarrierCodeContext): String {
        return ctx.WORD().text
    }

    override fun visitFlightNumber(ctx: TurSysParser.FlightNumberContext): String {
        return ctx.INTEGER().text
    }

    override fun visitOrigin(ctx: TurSysParser.OriginContext): String {
        return ctx.WORD().text
    }

    override fun visitDestination(ctx: TurSysParser.DestinationContext): String {
        return ctx.WORD().text
    }

    override fun visitFlightPath(ctx: FlightPathContext): String {
        return ctx.WORD().text
    }

    override fun visitCabinCode(ctx: CabinCodeContext): String {
        return ctx.WORD().text
    }

    override fun visitSeatAssignment(ctx: SeatAssignmentContext): String? {
        return ctx.WORD()?.text
    }

    override fun visitLiftStatus(ctx: LiftStatusContext): LiftStatus? {
        return when (ctx.WORD()?.text) {
            "CheckedIn" -> LiftStatus.CHECKED_IN
            "Boarded" -> LiftStatus.BOARDED
            "NoShow" -> LiftStatus.NO_SHOW
            "GoShow" -> LiftStatus.GO_SHOW
            "Offloaded" -> LiftStatus.OFFLOADED
            "VoluntaryDeniedBoarded" -> LiftStatus.VOLUNTARY_DENIED_BOARDED
            "DeniedBoarded" -> LiftStatus.DENIED_BOARDED
            null -> null
            else -> throw RuntimeException(
                "LiftStatus should be CheckedIn, Boarded, NoShow, GoShow, Offloaded, " +
                    "VoluntaryDeniedBoarded, or DeniedBoarded, but it is: ${ctx.WORD().text}"
            )
        }
    }

    override fun visitBoardingSequence(ctx: BoardingSequenceContext): Int? {
        return ctx.INTEGER()?.text?.toInt()
    }

    override fun visitPnr(ctx: PnrContext): String {
        return ctx.WORD().text
    }

    override fun visitCouponIdentificationCode(ctx: CouponIdentificationCodeContext): String {
        return ctx.INTEGER().text
    }

    override fun visitFareBasisCode(ctx: FareBasisCodeContext): String {
        return ctx.WORD().text
    }

    override fun visitBookingTypeCode(ctx: BookingTypeCodeContext): BookingTypeCode {
        return when (ctx.INTEGER().text.toInt()) {
            1 -> BookingTypeCode.ONE_WAY
            2 -> BookingTypeCode.ROUND_TRIP
            3 -> BookingTypeCode.MULTI_CITY
            4 -> BookingTypeCode.OPEN_JAW
            else -> throw RuntimeException(
                "BookingTypeCode should be 1, 2, 3, or 4, but it is: ${ctx.INTEGER().text}"
            )
        }
    }

    override fun visitBookingStatusCode(ctx: BookingStatusCodeContext): BookingStatusCode {
        return when (ctx.WORD().text) {
            "HK" -> BookingStatusCode.CONFIRMED
            "WL" -> BookingStatusCode.WAITLIST
            "HL" -> BookingStatusCode.OPTION
            "GN" -> BookingStatusCode.GROUP_BOOKING
            "GL" -> BookingStatusCode.GROUP_WAITLIST_OPTION
            "XX" -> BookingStatusCode.CANCELLED
            else -> throw RuntimeException(
                "BookingStatusCode should be HK, WL, HL, GN, GL, or XX, but it is: ${ctx.WORD().text}"
            )
        }
    }

    override fun visitBookingDate(ctx: BookingDateContext): LocalDate {
        return LocalDate.parse(ctx.INTEGER().text, datePattern)
    }

    override fun visitBookingTime(ctx: BookingTimeContext): LocalTime {
        return if (ctx.INTEGER().text.length == 5) { // 9:35:10 AM -> 93510  10:35:10 AM -> 103510
            LocalTime.parse(ctx.INTEGER().text, timePatternHmmss)
        } else {
            LocalTime.parse(ctx.INTEGER().text, timePatternHHmmss)
        }
    }

    override fun visitTicketingDate(ctx: TicketingDateContext): LocalDate {
        return LocalDate.parse(ctx.INTEGER().text, datePattern)
    }

    override fun visitTicketingTime(ctx: TicketingTimeContext): LocalTime {
        return if (ctx.INTEGER().text.length == 5) { // 9:35:10 AM -> 93510  10:35:10 AM -> 103510
            LocalTime.parse(ctx.INTEGER().text, timePatternHmmss)
        } else {
            LocalTime.parse(ctx.INTEGER().text, timePatternHHmmss)
        }
    }

    override fun visitCancellationDate(ctx: CancellationDateContext): LocalDate? {
        return if (nonNull(ctx.INTEGER())) LocalDate.parse(ctx.INTEGER().text, datePattern) else null
    }

    override fun visitAgentCode(ctx: AgentCodeContext): String {
        return ctx.INTEGER().text
    }

    override fun visitSalesSource(ctx: SalesSourceContext): String {
        return ctx.WORD().text
    }

    override fun visitPassengerType(ctx: PassengerTypeContext): PassengerType {
        return when (ctx.WORD().text) {
            "ADT" -> PassengerType.ADULT
            "CHD" -> PassengerType.CHILD
            "INF" -> PassengerType.INFANT
            else -> throw RuntimeException(
                "PassengerType should be ADT, CHD, or INF, but it is: ${ctx.WORD().text}"
            )
        }
    }

    override fun visitCurrency(ctx: CurrencyContext): String {
        return ctx.WORD().text
    }

    override fun visitRateOfExchange(ctx: RateOfExchangeContext): BigDecimal {
        val result = ctx.NUMBER()?.text ?: ctx.INTEGER().text
        return result.replace(COMMA, PERIOD).toBigDecimal()
    }

    override fun visitSpoBasePrice(ctx: SpoBasePriceContext): BigDecimal {
        val result = ctx.NUMBER()?.text ?: ctx.INTEGER().text
        return result.replace(COMMA, PERIOD).toBigDecimal()
    }

    override fun visitPromoIdentifier(ctx: PromoIdentifierContext): Boolean {
        return ctx.INTEGER().text == "1"
    }

    override fun visitDiscount(ctx: DiscountContext): BigDecimal {
        val result = ctx.NUMBER()?.text ?: ctx.INTEGER().text
        return result.replace(COMMA, PERIOD).toBigDecimal()
    }

    override fun visitDynamicPriceAdjustment(ctx: DynamicPriceAdjustmentContext): BigDecimal {
        val result = ctx.NUMBER()?.text ?: ctx.INTEGER().text
        return result.replace(COMMA, PERIOD).toBigDecimal()
    }

    override fun visitPriceAdjustmentApplied(ctx: PriceAdjustmentAppliedContext): Boolean {
        return ctx.INTEGER().text == "1"
    }

    override fun visitSalesPrice(ctx: SalesPriceContext): BigDecimal {
        val result = ctx.NUMBER()?.text ?: ctx.INTEGER().text
        return result.replace(COMMA, PERIOD).toBigDecimal()
    }

    override fun visitTax(ctx: TaxContext): BigDecimal {
        val result = ctx.NUMBER()?.text ?: ctx.INTEGER().text
        return result.replace(COMMA, PERIOD).toBigDecimal()
    }

    override fun visitTotalAmount(ctx: TotalAmountContext): BigDecimal {
        val result = ctx.NUMBER()?.text ?: ctx.INTEGER().text
        return result.replace(COMMA, PERIOD).toBigDecimal()
    }
}
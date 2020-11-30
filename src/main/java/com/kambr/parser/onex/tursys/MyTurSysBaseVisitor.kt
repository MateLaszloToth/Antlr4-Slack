package com.kambr.parser.onex.tursys

import com.kambr.parser.onex.tursys.dataClasses.BookingStatusCodeEnum
import com.kambr.parser.onex.tursys.dataClasses.BookingTypeCodeEnum
import com.kambr.parser.onex.tursys.dataClasses.PassengerTypeEnum
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
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Objects.nonNull

class MyTurSysBaseVisitor : TurSysBaseVisitor<Any>() {

    companion object {
        val datePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")
        val timePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("HHmmss")
    }

    override fun visitRow(ctx: TurSysParser.RowContext): Tursys {
        val segments: MutableList<Segment> = mutableListOf()
        var pnr: String? = null
        var couponIdentificationCode: String? = null
        var fareBasisCode: String? = null
        var bookingTypeCode: BookingTypeCodeEnum? = null
        var bookingStatusCode: BookingStatusCodeEnum? = null
        var bookingDate: LocalDate? = null
        var bookingTime: LocalTime? = null
        var ticketingDate: LocalDate? = null
        var ticketingTime: LocalTime? = null
        var cancellationDate: LocalDate? = null,
        var agentCode: String? = null
        var salesSource: String? = null
        var passengerType: PassengerTypeEnum? = null
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
                is SegmentContext -> segments.add(visitSegment(child))
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
            cancellationDate = cancellationDate!!,
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

    override fun visitSegment(ctx: SegmentContext) {
        return visitChildren(ctx)
    }

    override fun visitDepartureDate(ctx: TurSysParser.DepartureDateContext): LocalDate {
        return LocalDate.parse(ctx.text, datePattern)
    }

    override fun visitCarrierCode(ctx: TurSysParser.CarrierCodeContext): String {
        return ctx.text
    }

    override fun visitFlightNumber(ctx: TurSysParser.FlightNumberContext): String {
        return ctx.text
    }

    override fun visitOrigin(ctx: TurSysParser.OriginContext): String {
        return ctx.text
    }

    override fun visitDestination(ctx: TurSysParser.DestinationContext): String {
        return ctx.text
    }

    override fun visitFlightPath(ctx: FlightPathContext): String {
        return ctx.text
    }

    override fun visitCabinCode(ctx: CabinCodeContext): String {
        return ctx.text
    }

    override fun visitSeatAssignment(ctx: SeatAssignmentContext): String {
        return ctx.text
    }

    override fun visitLiftStatus(ctx: LiftStatusContext): {
        return visitChildren(ctx)
    }

    override fun visitBoardingSequence(ctx: BoardingSequenceContext): Int {
        return ctx.text.toInt()
    }

    override fun visitPnr(ctx: PnrContext): String {
        return ctx.text
    }

    override fun visitCouponIdentificationCode(ctx: CouponIdentificationCodeContext): String {
        return ctx.text
    }

    override fun visitFareBasisCode(ctx: FareBasisCodeContext): String {
        return ctx.text
    }

    override fun visitBookingTypeCode(ctx: BookingTypeCodeContext): BookingTypeCodeEnum {
        return when (ctx.INTEGER().text.toInt()) {
            1 -> BookingTypeCodeEnum.ONE_WAY
            2 -> BookingTypeCodeEnum.ROUND_TRIP
            3 -> BookingTypeCodeEnum.MULTI_CITY
            4 -> BookingTypeCodeEnum.OPEN_JAW
            else -> throw RuntimeException(
                "BookingTypeCode should be 1, 2, 3, or 4, but was: ${
                    ctx.INTEGER().text
                }"
            )
        }
    }

    override fun visitBookingStatusCode(ctx: BookingStatusCodeContext): BookingStatusCodeEnum {
        return when (ctx.WORD().text) {
            "HK" -> BookingStatusCodeEnum.CONFIRMED
            "WL" -> BookingStatusCodeEnum.WAITLIST
            "HL" -> BookingStatusCodeEnum.OPTION
            "GN" -> BookingStatusCodeEnum.GROUP_BOOKING
            "GL" -> BookingStatusCodeEnum.GROUP_WAITLIST_OPTION
            "XX" -> BookingStatusCodeEnum.CANCELLED
            else -> throw RuntimeException(
                "BookingStatusCode should be HK, WL, HL, GN, GL, or XX, but was: ${
                    ctx.WORD().text
                }"
            )
        }
    }

    override fun visitBookingDate(ctx: BookingDateContext): LocalDate {
        return LocalDate.parse(ctx.INTEGER().text , datePattern)
    }

    override fun visitBookingTime(ctx: BookingTimeContext): LocalTime {
        return LocalTime.parse(ctx.text, timePattern)
    }

    override fun visitTicketingDate(ctx: TicketingDateContext): LocalDate {
        return LocalDate.parse(ctx.text, datePattern)
    }

    override fun visitTicketingTime(ctx: TicketingTimeContext): LocalTime {
        return LocalTime.parse(ctx.text, timePattern)
    }

    override fun visitCancellationDate(ctx: CancellationDateContext): LocalDate? {
        return if (nonNull(ctx.text)) LocalDate.parse(ctx.text, datePattern) else null
    }

    override fun visitAgentCode(ctx: AgentCodeContext): String {
        return ctx.INTEGER().text
    }

    override fun visitSalesSource(ctx: SalesSourceContext): String {
        return ctx.WORD().text
    }

    override fun visitPassengerType(ctx: PassengerTypeContext): {
        return ctx.WORD().text
    }

    override fun visitCurrency(ctx: CurrencyContext): String {
        return ctx.WORD().text
    }

    override fun visitRateOfExchange(ctx: RateOfExchangeContext): BigDecimal {
        return ctx.NUMBER() .text.replace(',', ',').toBigDecimal() // TODO figure out what to do when it Integer
    }

    override fun visitSpoBasePrice(ctx: SpoBasePriceContext): BigDecimal {
        return ctx.text.replace(',', ',').toBigDecimal()
    }

    override fun visitPromoIdentifier(ctx: PromoIdentifierContext): Boolean {
        return ctx.text == "1"
    }

    override fun visitDiscount(ctx: DiscountContext): BigDecimal {
        return ctx.text.replace(',', ',').toBigDecimal()
    }

    override fun visitDynamicPriceAdjustment(ctx: DynamicPriceAdjustmentContext): BigDecimal {
        return ctx.text.replace(',', ',').toBigDecimal()
    }

    override fun visitPriceAdjustmentApplied(ctx: PriceAdjustmentAppliedContext): Boolean {
        return ctx.text == "1"
    }

    override fun visitSalesPrice(ctx: SalesPriceContext): Boolean {
        return ctx.text == "1"
    }

    override fun visitTax(ctx: TaxContext): BigDecimal {
        return ctx.text.replace(',', ',').toBigDecimal()
    }

    override fun visitTotalAmount(ctx: TotalAmountContext): BigDecimal {
        return ctx.text.replace(',', ',').toBigDecimal()
    }
}
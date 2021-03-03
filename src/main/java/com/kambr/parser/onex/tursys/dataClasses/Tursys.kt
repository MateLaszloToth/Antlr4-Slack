package com.kambr.parser.onex.tursys.dataClasses

import com.kambr.parser.onex.common.DateTimePatterns.Companion.datePattern
import com.kambr.parser.onex.common.DateTimePatterns.Companion.timePatternHHmm
import com.kambr.parser.onex.common.DateTimePatterns.Companion.timePatternHHmmss
import com.kambr.parser.onex.common.DateTimePatterns.Companion.timePatternHmmss
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime

class Tursys(row: List<String?>) {

    var segments: List<Segment>

    val pnr: String = row[30] ?: throw IllegalArgumentException("PNR column is mandatory, but it was null in row: $row (Tursys file)")

    val couponIdentificationCode: String =
        row[31] ?: throw IllegalArgumentException("CouponIdentificationCode column is mandatory, but it was null in row: $row (Tursys file)")

    val fareBasisCode: String = row[32] ?: throw IllegalArgumentException("FareBasisCode column is mandatory, but it was null in row: $row (Tursys file)")

    val bookingTypeCode: BookingTypeCode = when (row[33]?.toInt()) {
        0, 1 -> BookingTypeCode.ONE_WAY
        2 -> BookingTypeCode.ROUND_TRIP
        3 -> BookingTypeCode.MULTI_CITY
        4 -> BookingTypeCode.OPEN_JAW
        else -> throw IllegalArgumentException("BookingTypeCode must be 1, 2, 3, or 4, but it is: ${row[33]} in row: $row (Tursys file)")
    }

    val bookingStatusCode: BookingStatusCode = when (row[34]) {
        "HK" -> BookingStatusCode.CONFIRMED
        "WL" -> BookingStatusCode.WAITLIST
        "HL" -> BookingStatusCode.OPTION
        "GN" -> BookingStatusCode.GROUP_BOOKING
        "GL" -> BookingStatusCode.GROUP_WAITLIST_OPTION
        "XX" -> BookingStatusCode.CANCELLED
        else -> throw IllegalArgumentException(
            "BookingStatusCode should be HK, WL, HL, GN, GL, or XX, but it is: ${row[34]} in row: $row (Tursys file)"
        )
    }

    val bookingDate: LocalDate = if (row[35] != null) LocalDate.parse(row[35], datePattern) else
        throw IllegalArgumentException("BookingDate column is mandatory, but it was null in row: $row (Tursys file)")

    val bookingTime: LocalTime = when (row[36]?.length) {
        5 -> LocalTime.parse(row[36], timePatternHmmss)
        6 -> LocalTime.parse(row[36], timePatternHHmmss)
        null -> throw IllegalArgumentException("BookingTime column is mandatory, but it was null")
        else -> LocalTime.parse(row[36], timePatternHHmm)
    }

    val ticketingDate: LocalDate? = if (row[37] != null) LocalDate.parse(row[37], datePattern) else null

    val ticketingTime: LocalTime? = when (row[38]?.length) {
        5 -> LocalTime.parse(row[38], timePatternHmmss)
        6 -> LocalTime.parse(row[38], timePatternHHmmss)
        null -> null
        else -> throw IllegalArgumentException("TicketingTime format is ambiguous, can't be parsed until file is fixed.")
    }
    val cancellationDate: LocalDate? = if (row[39] != null) LocalDate.parse(row[39], datePattern) else null

    val agentCode: String = row[40] ?: throw IllegalArgumentException("AgentCode column is mandatory, but it was null in row: $row (Tursys file)")

    val salesSource: String = row[41] ?: throw IllegalArgumentException("SalesSource column is mandatory, but it was null in row: $row (Tursys file)")

    val passengerType: PassengerType = when (row[42]) {
        "ADT" -> PassengerType.ADULT
        "CHD" -> PassengerType.CHILD
        "INF" -> PassengerType.INFANT
        else -> throw IllegalArgumentException("PassengerType should be ADT, CHD, or INF, but it is: ${row[42]} in row: $row (Tursys file)")
    }

    val currency: String = row[43] ?: throw IllegalArgumentException("Currency column is mandatory, but it was null in row: $row (Tursys file)")

    val rateOfExchange: BigDecimal =
        row[44]?.toBigDecimal() ?: throw IllegalArgumentException("RateOfExchange column is mandatory, but it was null in row: $row (Tursys file)")

    val spoBasePrice: BigDecimal =
        row[45]?.toBigDecimal() ?: throw IllegalArgumentException("SpoBasePrice column is mandatory, but it was null in row: $row (Tursys file)")

    val discount: BigDecimal =
        row[46]?.toBigDecimal() ?: throw IllegalArgumentException("Discount column is mandatory, but it was null in row: $row (Tursys file)")

    val dynamicPriceAdjustment: BigDecimal =
        row[47]?.toBigDecimal() ?: throw IllegalArgumentException("DynamicPriceAdjustment column is mandatory, but it was null in row: $row (Tursys file)")

    val priceAdjustmentApplied: Boolean =
        if (row[48] != null) row[48]!!.toDouble() == 1.0 else throw IllegalArgumentException("PriceAdjustmentApplied column is mandatory, but it was null in row: $row (Tursys file)")

    val salesPrice: BigDecimal =
        row[49]?.toBigDecimal() ?: throw IllegalArgumentException("SalesPrice column is mandatory, but it was null in row: $row (Tursys file)")

    val tax: BigDecimal = row[50]?.toBigDecimal() ?: throw IllegalArgumentException("Tax column is mandatory, but it was null in row: $row (Tursys file)")

    val totalAmount: BigDecimal =
        row[51]?.toBigDecimal() ?: throw IllegalArgumentException("TotalAmount column is mandatory, but it was null in row: $row (Tursys file)")

    init {
        val listOfSegments = mutableListOf<Segment>()
        for (i in 0..20 step 10) {
            if (row[i] != null) {
                listOfSegments.add(Segment(row.subList(i, i + 10), pnr))
            }
        }
        segments = listOfSegments.toList()
    }
}

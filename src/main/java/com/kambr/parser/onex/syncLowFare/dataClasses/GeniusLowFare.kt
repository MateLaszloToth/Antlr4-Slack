package com.kambr.parser.onex.syncLowFare.dataClasses

import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime

data class GeniusLowFare(
    val departureDate: LocalDate,
    val origin: String,
    val destination: String,
    val viaStation: String?,
    val carrierCode: String,
    val flightNumber: String,
    val departureTime: LocalTime,
    val arrivalTime: LocalTime,
    val flightID: Long,
    val pnrIdentifier: String,
    val agencyID: Long,
    val agencyName: String,
    val seatsSold: Int,
    val flightPrice: BigDecimal,
    val tax: BigDecimal,
    val additionalAmount: BigDecimal,
    val sum: BigDecimal
)
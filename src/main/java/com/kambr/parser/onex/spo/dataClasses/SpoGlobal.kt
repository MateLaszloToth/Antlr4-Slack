package com.kambr.parser.onex.spo.dataClasses

import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime

data class SpoGlobal(
    val departureDate: LocalDate,
    val origin: String,
    val destination: String,
    val viaStation: String?,
    val carrierCode: String,
    val flightNumber: String,
    val departureTime: LocalTime,
    val arrivalTime: LocalTime,
    val taxAmount: Double,
    val surcharge: Double,
    val fixAllocation: Int,
    val proRataAmount: Int,
    val totalNumberOfAllocations: Int,
    val bookings: Int,
    val available: Int,
    val contractPrice: BigDecimal,
    val fromAndPrice: List<FromAndPrice>,
    val flightID: Long,
    val poolingEnabled: Boolean,
    val agencyID: Long,
    val agencyName: String,
)
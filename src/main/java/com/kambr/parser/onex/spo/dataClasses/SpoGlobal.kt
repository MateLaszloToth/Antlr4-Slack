package com.kambr.parser.onex.spo.dataClasses

import java.math.BigInteger
import java.time.LocalDate
import java.time.LocalTime

data class SpoGlobal(
    val departureDate: LocalDate,
    val origin: String,
    val destination: String,
    val viaStation: String,
    val carrierCode: String,
    val flightNumber: Short,
    val departureTime: LocalTime,
    val arrivalTime: LocalTime,
    val taxAmount: Double,
    val surcharge: Double,
    val fixAllocation: Short,
    val proRataAmount: Short,
    val totalNumberOfAllocations: Short,
    val bookings: Short,
    val available: Short,
    val contractPrice: Double,
    val from: List<Short>,
    val price: List<Double>,
    val flightID: BigInteger,
    val poolingEnabled: Boolean,
    val agencyCode: BigInteger,
    val agencyName: String,
)
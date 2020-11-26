package com.kambr.parser.onex.sync.dataClasses

import java.time.LocalDate
import java.time.LocalTime

data class GeniusFlight(
    val carrierCode: String,
    val flightNumber: String,
    val origin: String,
    val destination: String,
    val departureDate: LocalDate,
    val cabin: String,
    val viaStation: String?,
    val chainID: Long,
    val flightID: Long?,
    val cabinCapacity: Int,
    val cabinBookings: Int,
    val websiteAllocated: Int,
    val websiteBookings: Int,
    val poolCapacity: Int,
    val poolBooked: Int,
    val restCapacity: Int,
    val restBooked: Int,
    val departureTime: LocalTime,
    val arrivalTime: LocalTime,
    val updateIdentifier: UpdateIdentifierEnum,
    val specialPriceOffers: List<SpecialPriceOffer>,
    val isHiddenFlight: Boolean = false
)
package com.kambr.parser.onex.sync.dataClasses

import java.time.LocalDate
import java.time.LocalTime

data class GeniusFlight (
    val airlineCode: String ,
    val flightNumber: String,
    val origin: String,
    val destination: String,
    val departureDate: LocalDate,
    val cabin: String,
    val viaStation: String?,
    val chainID: Long,
    val flightID: Long?,
    val cabinCapacity: Short,
    val cabinBookings: Short,
    val websiteAllocated: Short,
    val websiteBookings: Short,
    val poolCapacity: Short,
    val poolBooked: Short,
    val restCapacity: Short,
    val restBooked: Short,
    val departureTime: LocalTime,
    val arrivalTime: LocalTime,
    val updateIdentifier: UpdateIdentifierEnum,
    val specialPriceOffers: List<SpecialPriceOffer>,
    val isHiddenFlight: Boolean = false
)
package com.kambr.sync.dataClasses

import java.math.BigInteger
import java.time.LocalDate

data class GeniusFlight (
    val airlineCode: String ,
    val flightNumber: String,
    val origin: String,
    val destination: String,
    val departureDate: LocalDate,
    val cabin: String,
    val viaStation: String?,
    val chainID: BigInteger,
    val flightID: BigInteger,
    val cabinCapacity: Short,
    val cabinBookings: Short,
    val websiteAllocated: Short,
    val websiteBookings: Short,
    val poolCapacity: Short,
    val poolBooked: Short,
    val restCapacity: Short,
    val restBooked: Short,
    val departureTime: String,
    val arrivalTime: String,
    val updateIndentifier: UpdateIdentifierEnum,
    val specialPriceOffers: List<SpecialPriceOffer>
)
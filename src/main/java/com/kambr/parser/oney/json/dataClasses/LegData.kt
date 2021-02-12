package com.kambr.parser.oney.json.dataClasses

import java.time.LocalDate
import java.time.LocalDateTime

data class LegData(
    val legDepartureDate: LocalDate,
    val carrierCode: String,
    val operatingSuffix: String,
    val flightNumber: Int,
    val departureStation: String,
    val arrivalStation: String,
    val departureTime: LocalDateTime,
    val arrivalTime: LocalDateTime,
    val overNights: Int,
    val serviceType: String,
    val equipmentVersion: String,
    val baseCurrencyCode: String,
    val aircraftSaleableCapacity: Int,
    val aircraftAuthorizedCapacity: Int,
    val cabins: CabinDetails,
    val blockSpaces: BlockSpaceDetails
    )
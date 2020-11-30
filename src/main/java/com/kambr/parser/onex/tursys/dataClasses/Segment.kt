package com.kambr.parser.onex.tursys.dataClasses

import java.time.LocalDate

data class Segment(
    val departureDate: LocalDate,
    val carrierCode: String,
    val flightNumber: String,
    val origin: String,
    val destination: String,
    val flightPath: String,
    val cabinCode: String,
    val seatAssignment: String?,
    val liftStatus: LiftStatusEnum?,
    val boardingSequence: Int?
)
package com.kambr.parser.onex.tursys.dataClasses

import com.kambr.parser.onex.common.DateTimePatterns
import com.kambr.parser.onex.common.DateTimePatterns.Companion.datePattern
import java.time.LocalDate

class Segment(segment: List<String?>, pnr: String) {
    val departureDate: LocalDate = LocalDate.parse(segment[0], datePattern)
    val carrierCode: String = segment[1] ?: throw IllegalArgumentException("CarrierCode column is mandatory, but it was null in Tursys file with PNR: $pnr")
    val flightNumber: String = segment[2] ?: throw IllegalArgumentException("FlightNumber column is mandatory, but it was null in Tursys file with PNR: $pnr")
    val origin: String = segment[3] ?: throw IllegalArgumentException("Origin column is mandatory, but it was null in Tursys file with PNR: $pnr")
    val destination: String = segment[4] ?: throw IllegalArgumentException("Destination column is mandatory, but it was null in Tursys file with PNR: $pnr")
    val flightPath: String = segment[5] ?: throw IllegalArgumentException("FlightPath column is mandatory, but it was null in Tursys file with PNR: $pnr")
    val cabinCode: String = segment[6] ?: throw IllegalArgumentException("CabinCode column is mandatory, but it was null in Tursys file with PNR: $pnr")
    val seatAssignment: String? = segment[7]
    val liftStatus: LiftStatus? = when (segment[8]?.toInt()) {
        0 -> LiftStatus.DEFAULT
        1 -> LiftStatus.CHECKED_IN
        2 -> LiftStatus.BOARDED
        3 -> LiftStatus.NO_SHOW
        4 -> LiftStatus.GO_SHOW
        5 -> LiftStatus.OFFLOADED
        6 -> LiftStatus.VOLUNTARY_DENIED_BOARDED
        7 -> LiftStatus.DENIED_BOARDED
        null -> null
        else -> throw IllegalArgumentException(
            "LiftStatus should be 0 -> Default, 1 -> CheckedIn, 2 -> Boarded, 3 -> NoShow, 4 -> GoShow, 5 -> Offloaded, " +
                "6 -> VoluntaryDeniedBoarded, or 7 -> DeniedBoarded, but it is: ${segment[8]}"
        )
    }
    val boardingSequence: Int? = segment[9]?.toInt()
}
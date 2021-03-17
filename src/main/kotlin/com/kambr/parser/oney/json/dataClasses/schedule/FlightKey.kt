package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.AIRLINE_CODE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_LINE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_PATH
import java.time.LocalDate

class FlightKey {
    val departureDate: LocalDate
    val airlineCode: String
    val flightLine: String
    val flightPath: String

    constructor(flightKey: HashMap<String, Any>) {
        departureDate = flightKey[DEPARTURE_DATE.value]!!.toLocalDate()
        airlineCode = flightKey[AIRLINE_CODE.value]!! as String
        flightLine = flightKey[FLIGHT_LINE.value]!! as String
        flightPath = flightKey[FLIGHT_PATH.value]!! as String
    }

    constructor(
        departureDate: LocalDate,
        airlineCode: String,
        flightLine: String,
        flightPath: String
    ) {
        this.departureDate = departureDate
        this.airlineCode = airlineCode
        this.flightLine = flightLine
        this.flightPath = flightPath
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FlightKey

        if (departureDate != other.departureDate) return false
        if (airlineCode != other.airlineCode) return false
        if (flightLine != other.flightLine) return false
        if (flightPath != other.flightPath) return false

        return true
    }

    override fun hashCode(): Int {
        var result = departureDate.hashCode()
        result = 31 * result + airlineCode.hashCode()
        result = 31 * result + flightLine.hashCode()
        result = 31 * result + flightPath.hashCode()
        return result
    }

    override fun toString(): String {
        return "FlightKey(departureDate=$departureDate, airlineCode='$airlineCode', flightLine='$flightLine', flightPath='$flightPath')"
    }
}
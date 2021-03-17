package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.AIRLINE_CODE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.ARRIVAL_AIRPORT
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_AIRPORT
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_NUMBER
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.OPERATIONAL_SUFFIX
import java.time.LocalDate

class FlightLeg {
    val departureDate: LocalDate
    val airlineCode: String
    val operationalSuffix: String?
    val flightNumber: String
    val departureAirport: String
    val arrivalAirport: String

    constructor(leg: HashMap<String, Any>) {
        departureDate = leg[DEPARTURE_DATE.value]!!.toLocalDate()
        airlineCode = leg[AIRLINE_CODE.value]!! as String
        operationalSuffix =
            if (leg[OPERATIONAL_SUFFIX.value] as String == "null")
                null
            else
                leg[OPERATIONAL_SUFFIX.value] as String
        flightNumber = leg[FLIGHT_NUMBER.value]!! as String
        departureAirport = leg[DEPARTURE_AIRPORT.value]!! as String
        arrivalAirport = leg[ARRIVAL_AIRPORT.value]!! as String
    }

    constructor(
        departureDate: LocalDate,
        airlineCode: String,
        operationalSuffix: String,
        flightNumber: String,
        departureAirport: String,
        arrivalAirport: String
    ) {
        this.departureDate = departureDate
        this.airlineCode = airlineCode
        this.operationalSuffix = operationalSuffix
        this.flightNumber = flightNumber
        this.departureAirport = departureAirport
        this.arrivalAirport = arrivalAirport
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FlightLeg

        if (departureDate != other.departureDate) return false
        if (airlineCode != other.airlineCode) return false
        if (operationalSuffix != other.operationalSuffix) return false
        if (flightNumber != other.flightNumber) return false
        if (departureAirport != other.departureAirport) return false
        if (arrivalAirport != other.arrivalAirport) return false

        return true
    }

    override fun hashCode(): Int {
        var result = departureDate.hashCode()
        result = 31 * result + airlineCode.hashCode()
        result = 31 * result + (operationalSuffix?.hashCode() ?: 0)
        result = 31 * result + flightNumber.hashCode()
        result = 31 * result + departureAirport.hashCode()
        result = 31 * result + arrivalAirport.hashCode()
        return result
    }

    override fun toString(): String {
        return "FlightLeg(departureDate=$departureDate, airlineCode='$airlineCode', operationalSuffix=$operationalSuffix, flightNumber='$flightNumber', departureAirport='$departureAirport', arrivalAirport='$arrivalAirport')"
    }
}
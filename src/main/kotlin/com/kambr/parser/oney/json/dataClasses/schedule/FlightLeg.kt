package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.AIRLINE_CODE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.ARRIVAL_AIRPORT
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_AIRPORT
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_NUMBER
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.OPERATIONAL_SUFFIX
import java.time.LocalDate

class FlightLeg(leg: HashMap<String, Any>) {
    val departureDate: LocalDate = leg[DEPARTURE_DATE.value]!!.toLocalDate()
    val airlineCode: String = leg[AIRLINE_CODE.value]!! as String
    val operationalSuffix: String? =
        if (leg[OPERATIONAL_SUFFIX.value] as String == "null") null else leg[OPERATIONAL_SUFFIX.value] as String
    val flightNumber: String = leg[FLIGHT_NUMBER.value]!! as String
    val departureAirport: String = leg[DEPARTURE_AIRPORT.value]!! as String
    val arrivalAirport: String = leg[ARRIVAL_AIRPORT.value]!! as String
}
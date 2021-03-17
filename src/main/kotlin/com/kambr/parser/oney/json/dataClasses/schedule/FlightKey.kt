package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.AIRLINE_CODE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_LINE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_PATH
import java.time.LocalDate

class FlightKey(flightKey: HashMap<String, Any>) {
    val departureDate: LocalDate = flightKey[DEPARTURE_DATE.value]!!.toLocalDate()
    val airlineCode: String = flightKey[AIRLINE_CODE.value]!! as String
    val flightLine: String = flightKey[FLIGHT_LINE.value]!! as String
    val flightPath: String = flightKey[FLIGHT_PATH.value]!! as String
}
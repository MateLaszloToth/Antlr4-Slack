package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.CITY_PAIR
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_NUMBER
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.OPERATIONAL_SUFFIX
import java.time.LocalDate

class FlightKey(flightKey: HashMap<String, Any>) {
    val departureDate: LocalDate = flightKey[DEPARTURE_DATE.value]!!.toLocalDate()
    val airlineCode: String = flightKey[FiledNames.AIRLINE_CODE.value]!! as String
    val operationalSuffix: String? =
        if (flightKey[OPERATIONAL_SUFFIX.value] as String == "null") null else flightKey[OPERATIONAL_SUFFIX.value] as String
    val flightNumber: String = flightKey[FLIGHT_NUMBER.value]!! as String
    val cityPair: String = flightKey[CITY_PAIR.value]!! as String
}
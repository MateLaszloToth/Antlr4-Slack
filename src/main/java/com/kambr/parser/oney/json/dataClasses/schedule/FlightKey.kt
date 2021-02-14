package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.AIRLINE_CODE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.CITY_PAIR
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_NUMBER
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.OPERATIONAL_SUFFIX

class FlightKey(flightKey: HashMap<String, Any>) {
    val departureDate: String = flightKey[DEPARTURE_DATE.value]!! as String
    val airlineCode: String = flightKey[AIRLINE_CODE.value]!! as String
    val operationalSuffix: String? = flightKey[OPERATIONAL_SUFFIX.value] as? String
    val flightNumber: String = flightKey[FLIGHT_NUMBER.value]!! as String
    val cityPair: String = flightKey[CITY_PAIR.value]!! as String
}
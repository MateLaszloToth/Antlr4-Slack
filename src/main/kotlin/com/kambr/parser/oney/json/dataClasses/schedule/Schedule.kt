package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_KEY
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_LEGS

@Suppress("UNCHECKED_CAST")
class Schedule(row: HashMap<String, Any>) {
    val flightKey: FlightKey = FlightKey(row[FLIGHT_KEY.value]!! as HashMap<String, Any>)
    val flightLegs: MutableList<FlightLeg> = mutableListOf()

    init {
        (row[FLIGHT_LEGS.value] as List<*>).forEach { flightLeg ->
            if(flightLeg != null) {
                flightLegs.add(FlightLeg(flightLeg as HashMap<String, Any>))
            }
        }
    }
}
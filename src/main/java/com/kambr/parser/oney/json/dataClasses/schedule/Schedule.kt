package com.kambr.parser.oney.json.dataClasses.schedule

import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_KEY
import com.kambr.parser.oney.json.dataClasses.schedule.FiledNames.FLIGHT_LEGS

@Suppress("UNCHECKED_CAST")
class Schedule {
    val flightKey: FlightKey
    val flightLegs: List<FlightLeg>


    constructor(row: HashMap<String, Any>) {
        flightKey = FlightKey(row[FLIGHT_KEY.value]!! as HashMap<String, Any>)

        val tempFlightLegs = mutableListOf<FlightLeg>()
        (row[FLIGHT_LEGS.value] as List<*>).forEach { flightLeg ->
            if (flightLeg != null) {
                tempFlightLegs.add(FlightLeg(flightLeg as HashMap<String, Any>))
            }
        }

        flightLegs = tempFlightLegs
    }

    constructor(flightKey: FlightKey, flightLegs: List<FlightLeg>) {
        this.flightKey = flightKey
        this.flightLegs = flightLegs
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Schedule

        if (flightKey != other.flightKey) return false
        if (flightLegs != other.flightLegs) return false

        return true
    }

    override fun hashCode(): Int {
        var result = flightKey.hashCode()
        result = 31 * result + flightLegs.hashCode()
        return result
    }

    override fun toString(): String {
        return "Schedule(flightKey=$flightKey, flightLegs=$flightLegs)"
    }
}
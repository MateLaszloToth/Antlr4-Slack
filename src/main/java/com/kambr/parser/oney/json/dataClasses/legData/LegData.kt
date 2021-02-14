package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalTime
import java.time.LocalDate
import java.time.LocalTime

class LegData(row: HashMap<String, Any>) {
    var legDepartureDate: LocalDate = row["legDepartureDate"]!!.toLocalDate()
    var carrierCode: String = row["carrierCode"] as String
    var operatingSuffix: String? = row["operatingSuffix"] as String?
    var flightNumber: Int = row["flightNumber"]!!.toInteger()
    var departureStation: String = row["departureStation"] as String
    var arrivalStation: String = row["arrivalStation"] as String
    var departureTime: LocalTime = row["departureTime"]!!.toLocalTime()
    var arrivalTime: LocalTime = row["arrivalTime"]!!.toLocalTime()
    var overNights: Int = row["overNights"]!!.toInteger()
    var serviceType: String = row["serviceType"] as String
    var equipmentVersion: String? = row["equipmentVersion"] as String?
    var baseCurrencyCode: String = row["baseCurrencyCode"] as String
    var aircraftSaleableCapacity: Int = row["aircraftSaleableCapacity"]!!.toInteger()
    var aircraftAuthorizedCapacity: Int = row["aircraftAuthorizedCapacity"]!!.toInteger()
    var cabins: MutableList<CabinDetails> = mutableListOf()

    init {
        (row["cabinDetails"] as List<*>).forEach { cabin ->
            if (cabin != null) {
                cabins.add(CabinDetails(cabin as HashMap<String, Any>))
            }
        }
    }
}
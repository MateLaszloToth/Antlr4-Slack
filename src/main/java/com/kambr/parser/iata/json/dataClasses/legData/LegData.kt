package com.kambr.parser.iata.json.dataClasses.legData

import com.kambr.parser.iata.json.ExtensionFunctions.toInteger
import com.kambr.parser.iata.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.iata.json.ExtensionFunctions.toLocalTime
import com.kambr.parser.iata.json.dataClasses.legData.FieldNames.*
import java.time.LocalDate
import java.time.LocalTime

class LegData(row: HashMap<String, Any>) {
    var legDepartureDate: LocalDate = row[LEG_DEPARTURE_DATE.value]!!.toLocalDate()
    var carrierCode: String = row[CARRIER_CODE.value] as String
    var operationalSuffix: String? =
        if (row[OPERATIONAL_SUFFIX.value] as String == "null") null else row[OPERATIONAL_SUFFIX.value] as String
    var flightNumber: String = row[FLIGHT_NUMBER.value]!! as String
    var departureStation: String = row[DEPARTURE_STATION.value] as String
    var arrivalStation: String = row[ARRIVAL_STATION.value] as String
    var departureTime: LocalTime = row[DEPARTURE_TIME.value]!!.toLocalTime()
    var arrivalTime: LocalTime = row[ARRIVAL_TIME.value]!!.toLocalTime()
    var overNights: Int = row[OVER_NIGHTS.value]!!.toInteger()
    var serviceType: String = row[SERVICE_TYPE.value] as String
    var equipmentType: String? = row[EQUIPMENT_TYPE.value] as String?
    var equipmentVersion: String? =
        if (row[EQUIPMENT_VERSION.value] as String == "null") null else row[EQUIPMENT_VERSION.value] as String
    var baseCurrencyCode: String = row[BASE_CURRENCY_CODE.value] as String
    var aircraftSaleableCapacity: Int = row[AIRCRAFT_SALEABLE_CAPACITY.value]!!.toInteger()
    var aircraftAuthorizedCapacity: Int = row[AIRCRAFT_AUTHORIZED_CAPACITY.value]!!.toInteger()
    var cabins: MutableList<CabinDetails> = mutableListOf()

    init {
        (row[CABIN_DETAILS.value] as List<*>).forEach { cabin ->
            if (cabin != null) {
                cabins.add(CabinDetails(cabin as HashMap<String, Any>))
            }
        }
    }
}
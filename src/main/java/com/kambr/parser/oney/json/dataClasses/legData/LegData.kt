package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalTime
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.AIRCRAFT_AUTHORIZED_CAPACITY
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.AIRCRAFT_SALEABLE_CAPACITY
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.ARRIVAL_STATION
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.ARRIVAL_TIME
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.BASE_CURRENCY_CODE
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CABIN_DETAILS
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.CARRIER_CODE
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.DEPARTURE_STATION
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.DEPARTURE_TIME
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.EQUIPMENT_VERSION
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.FLIGHT_NUMBER
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.LEG_DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.OPERATING_SUFFIX
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.OVER_NIGHTS
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.SERVICE_TYPE
import java.time.LocalDate
import java.time.LocalTime

class LegData(row: HashMap<String, Any>) {
    var legDepartureDate: LocalDate = row[LEG_DEPARTURE_DATE.value]!!.toLocalDate()
    var carrierCode: String = row[CARRIER_CODE.value] as String
    var operatingSuffix: String? = row[OPERATING_SUFFIX.value] as String?
    var flightNumber: String = row[FLIGHT_NUMBER.value]!! as String
    var departureStation: String = row[DEPARTURE_STATION.value] as String
    var arrivalStation: String = row[ARRIVAL_STATION.value] as String
    var departureTime: LocalTime = row[DEPARTURE_TIME.value]!!.toLocalTime()
    var arrivalTime: LocalTime = row[ARRIVAL_TIME.value]!!.toLocalTime()
    var overNights: Int = row[OVER_NIGHTS.value]!!.toInteger()
    var serviceType: String = row[SERVICE_TYPE.value] as String
    var equipmentVersion: String? = row[EQUIPMENT_VERSION.value] as String?
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
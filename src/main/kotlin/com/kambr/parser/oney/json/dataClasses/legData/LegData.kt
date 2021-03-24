package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalTime
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.*
import java.time.LocalDate
import java.time.LocalTime

@Suppress("UNCHECKED_CAST")
class LegData(row: HashMap<String, Any>) {
    val legDepartureDate: LocalDate = row[LEG_DEPARTURE_DATE.value]!!.toLocalDate()
    val carrierCode: String = row[CARRIER_CODE.value] as String
    val operationalSuffix: String? = if (row[OPERATIONAL_SUFFIX.value] as String == "null")
        null
    else
        row[OPERATIONAL_SUFFIX.value] as String
    val flightNumber: String = row[FLIGHT_NUMBER.value]!! as String
    val departureStation: String = row[DEPARTURE_STATION.value] as String
    val arrivalStation: String = row[ARRIVAL_STATION.value] as String
    val departureTime: LocalTime = row[DEPARTURE_TIME.value]!!.toLocalTime()
    val arrivalTime: LocalTime = row[ARRIVAL_TIME.value]!!.toLocalTime()
    val overNights: Int = row[OVER_NIGHTS.value]!!.toInteger()
    val serviceType: String = row[SERVICE_TYPE.value] as String
    val equipmentType: String? = row[EQUIPMENT_TYPE.value] as String?
    val equipmentVersion: String? = if (row[EQUIPMENT_VERSION.value] as String == "null")
        null
    else
        row[EQUIPMENT_VERSION.value] as String
    val baseCurrencyCode: String = row[BASE_CURRENCY_CODE.value] as String
    val aircraftAuthorizedCapacity: Int = row[AIRCRAFT_AUTHORIZED_CAPACITY.value]!!.toInteger()
    val aircraftCapacity: Int = row[AIRCRAFT_CAPACITY.value]!!.toInteger()
    val cabins: List<CabinDetails>

    init {
        val tempCabins = mutableListOf<CabinDetails>()
        (row[CABIN_DETAILS.value] as List<*>).forEach { cabin ->
            if (cabin != null) {
                tempCabins.add(CabinDetails(cabin as HashMap<String, Any>))
            }
        }
        cabins = tempCabins
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LegData

        if (legDepartureDate != other.legDepartureDate) return false
        if (carrierCode != other.carrierCode) return false
        if (operationalSuffix != other.operationalSuffix) return false
        if (flightNumber != other.flightNumber) return false
        if (departureStation != other.departureStation) return false
        if (arrivalStation != other.arrivalStation) return false
        if (departureTime != other.departureTime) return false
        if (arrivalTime != other.arrivalTime) return false
        if (overNights != other.overNights) return false
        if (serviceType != other.serviceType) return false
        if (equipmentType != other.equipmentType) return false
        if (equipmentVersion != other.equipmentVersion) return false
        if (baseCurrencyCode != other.baseCurrencyCode) return false
        if (aircraftAuthorizedCapacity != other.aircraftAuthorizedCapacity) return false
        if (aircraftCapacity != other.aircraftCapacity) return false
        if (cabins != other.cabins) return false

        return true
    }

    override fun hashCode(): Int {
        var result = legDepartureDate.hashCode()
        result = 31 * result + carrierCode.hashCode()
        result = 31 * result + (operationalSuffix?.hashCode() ?: 0)
        result = 31 * result + flightNumber.hashCode()
        result = 31 * result + departureStation.hashCode()
        result = 31 * result + arrivalStation.hashCode()
        result = 31 * result + departureTime.hashCode()
        result = 31 * result + arrivalTime.hashCode()
        result = 31 * result + overNights
        result = 31 * result + serviceType.hashCode()
        result = 31 * result + (equipmentType?.hashCode() ?: 0)
        result = 31 * result + (equipmentVersion?.hashCode() ?: 0)
        result = 31 * result + baseCurrencyCode.hashCode()
        result = 31 * result + aircraftAuthorizedCapacity
        result = 31 * result + aircraftCapacity
        result = 31 * result + cabins.hashCode()
        return result
    }

    override fun toString(): String {
        return "LegData(legDepartureDate=$legDepartureDate, carrierCode='$carrierCode', operationalSuffix=$operationalSuffix, " +
            "flightNumber='$flightNumber', departureStation='$departureStation', arrivalStation='$arrivalStation', " +
            "departureTime=$departureTime, arrivalTime=$arrivalTime, overNights=$overNights, serviceType='$serviceType', " +
            "equipmentType=$equipmentType, equipmentVersion=$equipmentVersion, baseCurrencyCode='$baseCurrencyCode', " +
            "aircraftAuthorizedCapacity=$aircraftAuthorizedCapacity, aircraftCapacity=$aircraftCapacity, cabins=$cabins)"
    }
}
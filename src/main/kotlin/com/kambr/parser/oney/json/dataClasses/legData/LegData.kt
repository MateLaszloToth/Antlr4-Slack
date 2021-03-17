package com.kambr.parser.oney.json.dataClasses.legData

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalTime
import com.kambr.parser.oney.json.dataClasses.legData.FieldNames.*
import java.time.LocalDate
import java.time.LocalTime

@Suppress("UNCHECKED_CAST")
class LegData {
    val legDepartureDate: LocalDate
    val carrierCode: String
    val operationalSuffix: String?
    val flightNumber: String
    val departureStation: String
    val arrivalStation: String
    val departureTime: LocalTime
    val arrivalTime: LocalTime
    val overNights: Int
    val serviceType: String
    val equipmentType: String?
    val equipmentVersion: String?
    val baseCurrencyCode: String
    val aircraftSaleableCapacity: Int
    val aircraftAuthorizedCapacity: Int
    val cabins: List<CabinDetails>

    constructor(row: HashMap<String, Any>) {
        legDepartureDate = row[LEG_DEPARTURE_DATE.value]!!.toLocalDate()
        carrierCode = row[CARRIER_CODE.value] as String
        operationalSuffix =
            if (row[OPERATIONAL_SUFFIX.value] as String == "null")
                null
            else
                row[OPERATIONAL_SUFFIX.value] as String
        flightNumber = row[FLIGHT_NUMBER.value]!! as String
        departureStation = row[DEPARTURE_STATION.value] as String
        arrivalStation = row[ARRIVAL_STATION.value] as String
        departureTime = row[DEPARTURE_TIME.value]!!.toLocalTime()
        arrivalTime = row[ARRIVAL_TIME.value]!!.toLocalTime()
        overNights = row[OVER_NIGHTS.value]!!.toInteger()
        serviceType = row[SERVICE_TYPE.value] as String
        equipmentType = row[EQUIPMENT_TYPE.value] as String?
        equipmentVersion =
            if (row[EQUIPMENT_VERSION.value] as String == "null")
                null
            else
                row[EQUIPMENT_VERSION.value] as String
        baseCurrencyCode = row[BASE_CURRENCY_CODE.value] as String
        aircraftSaleableCapacity = row[AIRCRAFT_SALEABLE_CAPACITY.value]!!.toInteger()
        aircraftAuthorizedCapacity = row[AIRCRAFT_AUTHORIZED_CAPACITY.value]!!.toInteger()

        val tempCabins = mutableListOf<CabinDetails>()
        (row[CABIN_DETAILS.value] as List<*>).forEach { cabin ->
            if (cabin != null) {
                tempCabins.add(CabinDetails(cabin as HashMap<String, Any>))
            }
        }
        cabins = tempCabins
    }

    constructor(
        legDepartureDate: LocalDate,
        carrierCode: String,
        operationalSuffix: String,
        flightNumber: String,
        departureStation: String,
        arrivalStation: String,
        departureTime: LocalTime,
        arrivalTime: LocalTime,
        overNights: Int,
        serviceType: String,
        equipmentType: String,
        equipmentVersion: String,
        baseCurrencyCode: String,
        aircraftSaleableCapacity: Int,
        aircraftAuthorizedCapacity: Int,
        cabins: List<CabinDetails>
    ) {
        this.legDepartureDate = legDepartureDate
        this.carrierCode = carrierCode
        this.operationalSuffix = operationalSuffix
        this.flightNumber = flightNumber
        this.departureStation = departureStation
        this.arrivalStation = arrivalStation
        this.departureTime = departureTime
        this.arrivalTime = arrivalTime
        this.overNights = overNights
        this.serviceType = serviceType
        this.equipmentType = equipmentType
        this.equipmentVersion = equipmentVersion
        this.baseCurrencyCode = baseCurrencyCode
        this.aircraftSaleableCapacity = aircraftSaleableCapacity
        this.aircraftAuthorizedCapacity = aircraftAuthorizedCapacity
        this.cabins = cabins
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
        if (aircraftSaleableCapacity != other.aircraftSaleableCapacity) return false
        if (aircraftAuthorizedCapacity != other.aircraftAuthorizedCapacity) return false
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
        result = 31 * result + aircraftSaleableCapacity
        result = 31 * result + aircraftAuthorizedCapacity
        result = 31 * result + cabins.hashCode()
        return result
    }

    override fun toString(): String {
        return "LegData(legDepartureDate=$legDepartureDate, carrierCode='$carrierCode', operationalSuffix=$operationalSuffix, flightNumber='$flightNumber', departureStation='$departureStation', arrivalStation='$arrivalStation', departureTime=$departureTime, arrivalTime=$arrivalTime, overNights=$overNights, serviceType='$serviceType', equipmentType=$equipmentType, equipmentVersion=$equipmentVersion, baseCurrencyCode='$baseCurrencyCode', aircraftSaleableCapacity=$aircraftSaleableCapacity, aircraftAuthorizedCapacity=$aircraftAuthorizedCapacity, cabins=$cabins)"
    }
}
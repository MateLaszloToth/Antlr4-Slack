package com.kambr.parser.oney.json.dataClasses.flightSeatPrice

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalTime
import com.kambr.parser.oney.json.dataClasses.flightSeatPrice.FieldNames.DEPARTURE_DATE
import java.text.DecimalFormat
import java.time.LocalDate

class FlightSeatPrice {
    val departureDate: LocalDate
    val carrierCode: String
    val flightLine: String
    val flightPath: String
    val baseCurrencyCode: String
    val changedByUserID: String
    val cabinDetails: List<CabinDetails>



    constructor(row: HashMap<String, Any>) {
        departureDate = row[DEPARTURE_DATE.value]!!.toLocalDate()
        carrierCode = row[FieldNames.CARRIER_CODE.value] as String
        flightLine = row[FieldNames.FLIGHT_LINE.value]!! as String
        flightPath = row[FieldNames.FLIGHT_PATH.value] as String
        baseCurrencyCode = row[FieldNames.BASE_CURRENCY_CODE.value] as String
        changedByUserID = row[FieldNames.CHANGED_BY_USER.value] as String
        cabinDetails = row[FieldNames.CABIN_DETAILS.value] as List<CabinDetails>
    }

    constructor(
            departureDate: LocalDate,
            carrierCode: String,
            flightLine: String,
            flightPath: String,
            baseCurrencyCode: String,
            changedByUserID: String,
            cabinDetails: List<CabinDetails>,
    ) {
        this.departureDate = departureDate
        this.carrierCode = carrierCode
        this.flightLine = flightLine
        this.flightPath = flightPath
        this.baseCurrencyCode = baseCurrencyCode
        this.changedByUserID = changedByUserID
        this.cabinDetails = cabinDetails
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FlightSeatPrice

        if (departureDate != other.departureDate) return false
        if (carrierCode != other.carrierCode) return false
        if (flightLine != other.flightLine) return false
        if (flightPath != other.flightPath) return false
        if (baseCurrencyCode != other.baseCurrencyCode) return false
        if (changedByUserID != other.changedByUserID) return false
        if (cabinDetails != other.cabinDetails) return false

        return true
    }

    override fun hashCode(): Int {
        var result = departureDate.hashCode()
        result = 31 * result + carrierCode.hashCode()
        result = 31 * result + flightLine.hashCode()
        result = 31 * result + flightPath.hashCode()
        result = 31 * result + baseCurrencyCode.hashCode()
        result = 31 * result + changedByUserID.hashCode()
        result = 31 * result + cabinDetails.hashCode()
        return result
    }

    override fun toString(): String {
        return "FlightSeatPrice(departureDate=$departureDate, carrierCode='$carrierCode', flightLine='$flightLine', flightPath='$flightPath', baseCurrencyCode='$baseCurrencyCode', changedByUserID='$changedByUserID', cabinDetails=$cabinDetails)"
    }


}
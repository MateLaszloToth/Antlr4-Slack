package com.kambr.parser.oney.json.dataClasses.flightSeatPrice

import com.kambr.parser.oney.json.dataClasses.flightSeatPrice.FieldNames.*
import com.kambr.parser.oney.json.dataClasses.flightSeatPrice.SeatDetails

class CabinDetails {
    val cabinCode: String
    val seatDetails: List<SeatDetails>

    constructor(row: HashMap<String, Any>) {
        cabinCode = row[CABIN_CODE.value] as String
        seatDetails = row[FieldNames.SEAT_DETAILS.value] as List<SeatDetails>
    }

    constructor(
            cabinCode: String,
            seatDetails: List<SeatDetails>,
    ) {
        this.cabinCode = cabinCode
        this.seatDetails = seatDetails
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CabinDetails

        if (cabinCode != other.cabinCode) return false
        if (seatDetails != other.seatDetails) return false

        return true
    }

    override fun hashCode(): Int {
        var result = cabinCode.hashCode()
        result = 31 * result + seatDetails.hashCode()
        return result
    }

    override fun toString(): String {
        return "CabinDetails(cabinCode='$cabinCode', seatDetails=$seatDetails)"
    }

}
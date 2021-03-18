package com.kambr.parser.oney.json.dataClasses.flightSeatPrice

import com.kambr.parser.oney.json.dataClasses.flightSeatPrice.FieldNames.*

class CabinDetails {
    val cabinCode: String

    constructor(
            cabinObject: HashMap<String, Any>
    ) {
        cabinCode = cabinObject[CABIN_CODE.value] as String
    }

    constructor(
            cabinCode: String,
    ) {
        this.cabinCode = cabinCode

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as com.kambr.parser.oney.json.dataClasses.flightSeatPrice.CabinDetails

        if (cabinCode != other.cabinCode) return false

        return true
    }

    override fun hashCode(): Int {
        return cabinCode.hashCode()
    }

    override fun toString(): String {
        return "CabinDetails(cabinCode='$cabinCode')"
    }


}
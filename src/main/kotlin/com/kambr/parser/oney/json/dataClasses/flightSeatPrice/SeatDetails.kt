package com.kambr.parser.oney.json.dataClasses.flightSeatPrice

import java.text.DecimalFormat

class SeatDetails {
    val seatNumberFrom : Int
    val seatBasePrice : DecimalFormat
    val isPromoIdentifier : Boolean

    constructor(
            cabinObject: HashMap<String, Any>
    ) {
        seatNumberFrom = cabinObject[FieldNames.SEAT_NUMBER_FROM.value] as Int
        seatBasePrice = cabinObject[FieldNames.SEAT_BASE_PRICE.value] as DecimalFormat
        isPromoIdentifier = cabinObject[FieldNames.IS_PROMO_IDENTIFIER.value] as Boolean
    }

    constructor(
            seatNumberFrom: Int,
            seatBasePrice: DecimalFormat,
            isPromoIdentifier: Boolean
    ) {
        this.seatNumberFrom = seatNumberFrom
        this.seatBasePrice = seatBasePrice
        this.isPromoIdentifier = isPromoIdentifier
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SeatDetails

        if (seatNumberFrom != other.seatNumberFrom) return false
        if (seatBasePrice != other.seatBasePrice) return false
        if (isPromoIdentifier != other.isPromoIdentifier) return false

        return true
    }

    override fun hashCode(): Int {
        var result = seatNumberFrom
        result = 31 * result + seatBasePrice.hashCode()
        result = 31 * result + isPromoIdentifier.hashCode()
        return result
    }

    override fun toString(): String {
        return "SeatDetails(seatNumberFrom=$seatNumberFrom, seatBasePrice=$seatBasePrice, isPromoIdentifier=$isPromoIdentifier)"
    }


}
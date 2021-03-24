package com.kambr.parser.oney.json.dataClasses.flightSeatPrice

enum class FieldNames(val value: String) {

        DEPARTURE_DATE("departureDate"),
        CARRIER_CODE("carrierCode"),
        FLIGHT_LINE("flightLine"),
        FLIGHT_PATH("flightPath"),
        BASE_CURRENCY_CODE("baseCurrencyCode"),
        CHANGED_BY_USER("changedByUser"),
        CABIN_DETAILS("cabinDetails"),
        CABIN_CODE("cabinCode"),
        SEAT_DETAILS("seatDetails"),
        SEAT_NUMBER_FROM("seatNumberFrom"),
        SEAT_BASE_PRICE("seatBasePrice"),
        IS_PROMO_IDENTIFIER("isPromoIdentifier"),
}
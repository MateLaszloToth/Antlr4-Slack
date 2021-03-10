package com.kambr.parser.oney.json.dataClasses.schedule

enum class FiledNames(val value: String) {
    FLIGHT_KEY("flightKey"),
    DEPARTURE_DATE("departureDate"),
    AIRLINE_CODE("airlineCode"),
    OPERATIONAL_SUFFIX("operationalSuffix"),
    FLIGHT_NUMBER("flightNumber"),
    CITY_PAIR("cityPair"),

    FLIGHT_LEGS("flightLegs"),
    DEPARTURE_AIRPORT("departureAirport"),
    ARRIVAL_AIRPORT("arrivalAirport"),
}
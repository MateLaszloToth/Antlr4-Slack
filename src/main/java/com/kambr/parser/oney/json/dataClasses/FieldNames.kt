package com.kambr.parser.oney.json.dataClasses

enum class FieldNames(val value: String) {

     LEG_DEPARTURE_DATE("legDepartureDate"),
     CARRIER_CODE("carrierCode"),
     OPERATING_SUFFIX("operatingSuffix"),
     FLIGHT_NUMBER("flightNumber"),
     DEPARTURE_STATION("departureStation"),
     ARRIVAL_STATION("arrivalStation"),
     DEPARTURE_TIME("departureTime"),
     ARRIVAL_TIME("arrivalTime"),
     OVER_NIGHTS("overNights"),
     SERVICE_TYPE("serviceType"),
     EQUIPMENT_VERSION("equipmentVersion"),
     BASE_CURRENCY_CODE("baseCurrencyCode"),
     AIRCRAFT_SALEABLE_CAPACITY("aircraftSaleableCapacity"),
     AIRCRAFT_AUTHORIZED_CAPACITY("aircraftAuthorizedCapacity"),
     CABIN_DETAILS("cabinDetails"),
     BLOCK_SPACE_DETAILS("blockSpaceDetails"),
     CODE_SHARE_BLOCK("codeShareBlock"),
     PROTECTED_SEATS("protectedSeats"),
     CABIN_CODE("cabinCode"),
     CABIN_SALEABLE_CAPACITY("cabinSaleableCapacity"),
     CABIN_AUTHORIZED_CAPACITY("cabinAuthorizedCapacity"),
     CABIN_BLOCK("cabinBlock")

}
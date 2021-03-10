package com.kambr.parser.onex.tursys.dataClasses

enum class BookingTypeCode(val value: Int) {
    ONE_WAY(1),
    ROUND_TRIP(2),
    MULTI_CITY(3),
    OPEN_JAW(4)
}
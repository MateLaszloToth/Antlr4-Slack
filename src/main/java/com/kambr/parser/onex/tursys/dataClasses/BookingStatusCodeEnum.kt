package com.kambr.parser.onex.tursys.dataClasses

enum class BookingStatusCodeEnum(val value: String) {
    CONFIRMED("HK"),
    WAITLIST("WL"),
    OPTION("HL"),
    GROUP_BOOKING("GN"),
    GROUP_WAITLIST_OPTION("GL"),
    CANCELLED("XX")
}
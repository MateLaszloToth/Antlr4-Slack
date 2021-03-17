package com.kambr.parser.oney.json

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter.BASIC_ISO_DATE
import java.time.format.DateTimeFormatter.ofPattern

internal object ExtensionFunctions {

    /**
     * Converts an Any object to LocalDate, when the string representation of the ANy object has the format: yyyyMMdd
     */
    fun Any.toLocalDate(): LocalDate {
        return LocalDate.parse(this.toString(), BASIC_ISO_DATE)
    }

    /**
     * Converts an Any object to LocalTime, when the string representation of the Any object has the format: HHmm (hour 0-24)
     */
    fun Any.toLocalTime(): LocalTime {
        val formatter = ofPattern("HHmm")
        return LocalTime.parse(this.toString(), formatter)
    }

    /**
     * Converts an Any object to String and then Int
     */
    fun Any.toInteger(): Int {
        return this.toString().toInt()
    }
}
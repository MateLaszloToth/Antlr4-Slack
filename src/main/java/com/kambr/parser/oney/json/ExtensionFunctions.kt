package com.kambr.parser.oney.json

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeFormatter.BASIC_ISO_DATE

object ExtensionFunctions {

    /**
     * Converts an Any object to LocalDate, when the string representation of the ANy object has the format: yyyyMMdd
     */
    fun Any.toLocalDate() : LocalDate {
        return LocalDate.parse(this.toString(), BASIC_ISO_DATE )
    }

    /**
     * Converts an Any object to LocalDateTime, when the string representation of the ANy object has the format: yyyyMMdd
     */
    fun Any.toLocalDateTime() : LocalDateTime {
        val formatter = DateTimeFormatter.ofPattern("HHmm")
        return LocalDateTime.parse(this.toString(), formatter)
    }

    /**
     *
     */
    fun Any.toInteger() : Int {
        return this.toString().toInt()
    }
}
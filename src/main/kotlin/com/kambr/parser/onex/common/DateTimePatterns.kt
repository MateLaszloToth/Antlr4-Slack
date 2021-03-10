package com.kambr.parser.onex.common

import java.time.format.DateTimeFormatter

class DateTimePatterns {
    companion object {
        val datePattern: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd")
        val timePatternHHmmss: DateTimeFormatter = DateTimeFormatter.ofPattern("HHmmss")
        val timePatternHmmss: DateTimeFormatter = DateTimeFormatter.ofPattern("Hmmss")
        val timePatternHHmm: DateTimeFormatter = DateTimeFormatter.ofPattern("HHmm")
    }
}
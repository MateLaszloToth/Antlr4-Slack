package com.kambr.parser.iata.xml

import java.time.LocalDateTime
import javax.xml.datatype.XMLGregorianCalendar


/**
 * Convert object to LocalDateTime without adjusting to time zone
 * (the value from the file will be used and it will not be adjusted for time zone)
 */
fun XMLGregorianCalendar.toLocalDateTime(): LocalDateTime {
    val utcZoned = this.toGregorianCalendar().toZonedDateTime()
    return utcZoned.toLocalDateTime()
}
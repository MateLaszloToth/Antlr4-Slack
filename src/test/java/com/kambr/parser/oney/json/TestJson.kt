package com.kambr.parser.oney.json

import com.kambr.kambrlogger.Logger
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams.fromFileName
import org.junit.jupiter.api.Test
import java.io.IOException
import org.junit.jupiter.api.Assertions.assertEquals


class TestJson {
    companion object {
        const val LEG_DATA_FILE_PATH = "src/test/resources/oney/json/LegData.json"
        const val SCHEDULE_FILE_PATH = "src/test/resources/oney/json/Schedule.json"
        val logger = Logger(this::class.java)
    }


    /**
     * Test cases:
     *      All possible properties have values
     *      operationalSuffix and equipmentVersion tested for null as well
     */
    @Test
    fun test_legData_parser() {
        var charStream: CharStream? = null
        try {
            charStream = fromFileName(LEG_DATA_FILE_PATH)
        } catch (e: IOException) {
            logger.error(e.localizedMessage)
        }
        val jsonObject = parseIATALegData(charStream!!)

        val record1 = jsonObject[0]

        assertEquals("2021-01-11", record1.legDepartureDate.toString())
        assertEquals("PDM", record1.carrierCode)
        assertEquals(null, record1.operationalSuffix)
        assertEquals("1113", record1.flightNumber)
        assertEquals("BGO", record1.departureStation)
        assertEquals("OSL", record1.arrivalStation)
        assertEquals("12:00", record1.departureTime.toString())
        assertEquals("12:55", record1.arrivalTime.toString())
        assertEquals(0, record1.overNights)
        assertEquals("J", record1.serviceType)
        assertEquals("320", record1.equipmentType)
        assertEquals(null, record1.equipmentVersion)
        assertEquals("NOK", record1.baseCurrencyCode)
        assertEquals(186, record1.aircraftSaleableCapacity)
        assertEquals(186, record1.aircraftAuthorizedCapacity)
        assertEquals(1, record1.cabins.size)
        assertEquals("ECONOMY", record1.cabins[0].cabinCode)
        assertEquals(186, record1.cabins[0].cabinSaleableCapacity)
        assertEquals(186, record1.cabins[0].cabinAuthorizedCapacity)
        assertEquals(0, record1.cabins[0].cabinBlock)
        assertEquals(0, record1.cabins[0].blockSpaceDetails.size)

        val record2 = jsonObject[1]
        assertEquals("1y", record2.operationalSuffix)
        assertEquals("AVE", record2.equipmentVersion)
        assertEquals(2, record2.cabins[0].blockSpaceDetails.size)
        assertEquals(1, record2.cabins[0].blockSpaceDetails[0].codeShareBlock)
        assertEquals(3, record2.cabins[0].blockSpaceDetails[0].protectedSeats)
        assertEquals(2, record2.cabins[0].blockSpaceDetails[1].codeShareBlock)
        assertEquals(4, record2.cabins[0].blockSpaceDetails[1].protectedSeats)

    }

    /**
     * Test cases:
     *      All possible properties have values
     *      operationalSuffix and equipmentVersion tested for null as well
     */

    @Test
    fun test_schedule_parser() {
        var charStream: CharStream? = null
        try {
            charStream = fromFileName(SCHEDULE_FILE_PATH)
        } catch (e: IOException) {
            logger.error(e.localizedMessage)
        }
        val jsonObject = parseIATASchedule(charStream!!)

        val record1 = jsonObject[0]
        assertEquals("2021-01-01", record1.flightKey.departureDate.toString())
        assertEquals("PDM", record1.flightKey.airlineCode)
        assertEquals(null, record1.flightKey.operationalSuffix)
        assertEquals("1111", record1.flightKey.flightNumber)
        assertEquals("MUCOSL", record1.flightKey.cityPair)

        assertEquals("2021-01-01", record1.flightLegs[0].departureDate.toString())
        assertEquals("PDM", record1.flightLegs[0].airlineCode)
        assertEquals("1y", record1.flightLegs[0].operationalSuffix)
        assertEquals("1111", record1.flightLegs[0].flightNumber)
        assertEquals("MUC", record1.flightLegs[0].departureAirport)
        assertEquals("OSL", record1.flightLegs[0].arrivalAirport)
    }
}
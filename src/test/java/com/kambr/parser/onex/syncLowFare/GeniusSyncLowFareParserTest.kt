package com.kambr.parser.onex.syncLowFare

import com.ibm.icu.impl.Assert
import com.kambr.kambrlogger.Logger
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.junit.jupiter.api.Test
import java.io.IOException

class GeniusSyncLowFareParserTest {
    companion object {
        const val FILE_PATH = "src/test/resources/onex/syncLowFare/test-file.txt"
        val logger = Logger(this::class.java)
    }

    @Test
    fun test_genius_sync_low_fare_parser() {
        var charStream: CharStream? = null
        try {
            charStream = CharStreams.fromFileName(FILE_PATH)
        } catch (e: IOException) {
            logger.error(e.localizedMessage)
        }
        val geniusLowFares = GeniusSyncLowFareParser.parse(charStream!!)

        // Record 1
        Assert.assrt("2020-10-20" == geniusLowFares[0].departureDate.toString())
        Assert.assrt("NUE" == geniusLowFares[0].origin)
        Assert.assrt("TLV" == geniusLowFares[0].destination)
        Assert.assrt(null == geniusLowFares[0].viaStation)
        Assert.assrt("CXI" == geniusLowFares[0].carrierCode)
        Assert.assrt("2124" == geniusLowFares[0].flightNumber)
        Assert.assrt("04:00" == geniusLowFares[0].departureTime.toString())
        Assert.assrt("09:10" == geniusLowFares[0].arrivalTime.toString())
        Assert.assrt(74435995.toLong() == geniusLowFares[0].flightID)
        Assert.assrt("B220138D636A" == geniusLowFares[0].passengerNameRecordID)
        Assert.assrt(1000203.toLong() == geniusLowFares[0].agencyID)
        Assert.assrt("AIRTUERK (WEB)" == geniusLowFares[0].agencyName)
        Assert.assrt(2 == geniusLowFares[0].seatsSold)
        Assert.assrt(360.01.toBigDecimal() == geniusLowFares[0].flightPrice)
        Assert.assrt(0.10.toBigDecimal().setScale(2) == geniusLowFares[0].tax)
        Assert.assrt(3.00.toBigDecimal().setScale(2) == geniusLowFares[0].additionalAmount)
        Assert.assrt(363.00.toBigDecimal().setScale(2) == geniusLowFares[0].totalAmount)

        // Record 2
        Assert.assrt("2020-10-20" == geniusLowFares[1].departureDate.toString())
        Assert.assrt("NUE" == geniusLowFares[1].origin)
        Assert.assrt("TLV" == geniusLowFares[1].destination)
        Assert.assrt("AMS" == geniusLowFares[1].viaStation)
        Assert.assrt("CXI" == geniusLowFares[1].carrierCode)
        Assert.assrt("2124" == geniusLowFares[1].flightNumber)
        Assert.assrt("04:00" == geniusLowFares[1].departureTime.toString())
        Assert.assrt("09:10" == geniusLowFares[1].arrivalTime.toString())
        Assert.assrt(74435995.toLong() == geniusLowFares[1].flightID)
        Assert.assrt(220134172.toString() == geniusLowFares[1].passengerNameRecordID)
        Assert.assrt(1000203.toLong() == geniusLowFares[1].agencyID)
        Assert.assrt("6SPOT6 REISEN GMBH (SPLITCHARTER) & Co. Co  (WEB)" == geniusLowFares[1].agencyName)
        Assert.assrt(4 == geniusLowFares[1].seatsSold)
        Assert.assrt(760.00.toBigDecimal().setScale(2) == geniusLowFares[1].flightPrice)
        Assert.assrt(0.toBigDecimal() == geniusLowFares[1].tax)
        Assert.assrt(7.00.toBigDecimal().setScale(2) == geniusLowFares[1].additionalAmount)
        Assert.assrt(767.00.toBigDecimal().setScale(2) == geniusLowFares[1].totalAmount)
    }
}
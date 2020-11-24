package com.kambr.parser.onex.spo

import com.ibm.icu.impl.Assert
import com.kambr.kambrlogger.Logger
import com.kambr.parser.onex.spo.dataClasses.SpoGlobal
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.junit.jupiter.api.Test
import java.io.IOException

class TestGeniusSpoGlobalParser {

    companion object {
        var FILE_PATH = "src/test/resources/spo/test-file.csv"
        var logger = Logger(this::class.java)
    }

    @Test
    fun test_genius_spo_global_parser() {
        var charStream: CharStream? = null
        try {
            charStream = CharStreams.fromFileName(FILE_PATH)
        } catch (e: IOException) {
            logger.error(e.localizedMessage)
        }
        val spoGlobalRecords: List<SpoGlobal> = GeniusSpoGlobalParser.parse(charStream!!)

        Assert.assrt(spoGlobalRecords[0].departureDate.toString() == "")
        // Assert.assrt(spoGlobalRecords[0].origin == )
        // Assert.assrt(spoGlobalRecords[0].destination == )
        // Assert.assrt(spoGlobalRecords[0].viaStation.toString() == )
        // Assert.assrt(spoGlobalRecords[0].carrierCode == )
        // Assert.assrt(spoGlobalRecords[0].flightNumber.toString() == )
        // Assert.assrt(spoGlobalRecords[0].departureTime.toString() == )
        // Assert.assrt(spoGlobalRecords[0].arrivalTime.toString() == )
        // Assert.assrt(spoGlobalRecords[0].taxAmount.toString() == )
        // Assert.assrt(spoGlobalRecords[0].surcharge.toString() == )
        // Assert.assrt(spoGlobalRecords[0].fixAllocation.toString() == )
        // Assert.assrt(spoGlobalRecords[0].proRataAmount.toString() == )
        // Assert.assrt(spoGlobalRecords[0].totalNumberOfAllocations.toString() == )
        // Assert.assrt(spoGlobalRecords[0].bookings.toString() == )
        // Assert.assrt(spoGlobalRecords[0].available.toString() == )
        // Assert.assrt(spoGlobalRecords[0].contractPrice.toString() == )
        // Assert.assrt(spoGlobalRecords[0].fromAndPrice.toString() == )
        // Assert.assrt(spoGlobalRecords[0].flightID.toString() == )
        // Assert.assrt(spoGlobalRecords[0].poolingEnabled.toString() == )
        // Assert.assrt(spoGlobalRecords[0].agencyCode.toString() == )
        // Assert.assrt(spoGlobalRecords[0].agencyName == )
    }


}
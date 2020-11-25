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
        const val FILE_PATH = "src/test/resources/spo/test-file.csv"
        val logger = Logger(this::class.java)
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

        Assert.assrt(spoGlobalRecords[0].departureDate.toString() == "2020-12-07")
        Assert.assrt(spoGlobalRecords[0].origin == "AYT")
        Assert.assrt(spoGlobalRecords[0].destination == "DUS")
        Assert.assrt(spoGlobalRecords[0].viaStation!! == "AMS")
        Assert.assrt(spoGlobalRecords[0].carrierCode == "CAI")
        Assert.assrt(spoGlobalRecords[0].flightNumber == "1407")
        Assert.assrt(spoGlobalRecords[0].departureTime.toString() == "07:00")
        Assert.assrt(spoGlobalRecords[0].arrivalTime.toString() == "08:50")
        Assert.assrt(spoGlobalRecords[0].taxAmount == 0.0)
        Assert.assrt(spoGlobalRecords[0].surcharge == 1.5)
        Assert.assrt(spoGlobalRecords[0].fixAllocation == 0)
        Assert.assrt(spoGlobalRecords[0].proRataAmount == 0)
        Assert.assrt(spoGlobalRecords[0].totalNumberOfAllocations == 0)
        Assert.assrt(spoGlobalRecords[0].bookings == 0)
        Assert.assrt(spoGlobalRecords[0].available == 0)
        Assert.assrt(spoGlobalRecords[0].contractPrice == 50.toBigDecimal())
        Assert.assrt(spoGlobalRecords[0].fromAndPrice.size == 15)
        Assert.assrt(spoGlobalRecords[0].flightID == 74513199.toLong())
        Assert.assrt(!spoGlobalRecords[0].poolingEnabled)
        Assert.assrt(spoGlobalRecords[0].agencyID == 1000118.toLong())
        Assert.assrt(spoGlobalRecords[0].agencyName == "WEBSITE")

        var correction = 1
        spoGlobalRecords[0].fromAndPrice.forEachIndexed { index, fromAndPrice ->
            Assert.assrt(fromAndPrice.from == (index+correction))
            Assert.assrt(fromAndPrice.price == (index+correction+1).toDouble())
            correction++
        }

        Assert.assrt(spoGlobalRecords[1].departureDate.toString() == "2020-12-07")
        Assert.assrt(spoGlobalRecords[1].origin == "AYT")
        Assert.assrt(spoGlobalRecords[1].destination == "DUS")
        Assert.assrt(spoGlobalRecords[1].viaStation == null)
        Assert.assrt(spoGlobalRecords[1].carrierCode == "CAI")
        Assert.assrt(spoGlobalRecords[1].flightNumber == "1407")
        Assert.assrt(spoGlobalRecords[1].departureTime.toString() == "07:00")
        Assert.assrt(spoGlobalRecords[1].arrivalTime.toString() == "08:50")
        Assert.assrt(spoGlobalRecords[1].taxAmount == 0.0)
        Assert.assrt(spoGlobalRecords[1].surcharge == 1.5)
        Assert.assrt(spoGlobalRecords[1].fixAllocation == 0)
        Assert.assrt(spoGlobalRecords[1].proRataAmount == 0)
        Assert.assrt(spoGlobalRecords[1].totalNumberOfAllocations == 0)
        Assert.assrt(spoGlobalRecords[1].bookings == 0)
        Assert.assrt(spoGlobalRecords[1].available == (-3))
        Assert.assrt(spoGlobalRecords[1].contractPrice == 50.8.toBigDecimal())
        Assert.assrt(spoGlobalRecords[1].fromAndPrice.isEmpty())
        Assert.assrt(spoGlobalRecords[1].flightID == 74513199.toLong())
        Assert.assrt(!spoGlobalRecords[1].poolingEnabled)
        Assert.assrt(spoGlobalRecords[1].agencyID == 1000069.toLong())
        Assert.assrt(spoGlobalRecords[1].agencyName == "6SPOT6 REISEN GMBH (SPLITCHARTER) & Co. Co ")
    }
}
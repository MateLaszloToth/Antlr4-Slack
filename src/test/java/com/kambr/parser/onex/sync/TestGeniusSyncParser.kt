package com.kambr.parser.onex.sync

import com.ibm.icu.impl.Assert
import com.kambr.kambrlogger.Logger
import com.kambr.parser.onex.sync.GeniusSyncParser.parse
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.junit.jupiter.api.Test
import java.io.IOException

class TestGeniusSyncParser {

    companion object {
        const val FILE_PATH = "src/test/resources/sync/test-file.txt"
        val logger = Logger(this::class.java)
    }

    @Test
    fun test_main() {
        var charStream: CharStream? = null
        try {
            charStream = CharStreams.fromFileName(FILE_PATH)
        } catch (e: IOException) {
            logger.error(e.localizedMessage)
        }
        val geniusFlights = parse(charStream!!)

        // Flight 1 (Line in file: 1)
        val flight1 = geniusFlights[0]
        Assert.assrt(flight1.carrierCode == "CXI")
        Assert.assrt(flight1.flightNumber == "2238")
        Assert.assrt(flight1.origin == "HAJ")
        Assert.assrt(flight1.destination == "SSH")
        Assert.assrt(flight1.departureDate.toString() == "2021-03-27")
        Assert.assrt(flight1.cabin == "Y")
        Assert.assrt(flight1.viaStation == null)
        Assert.assrt(flight1.chainID.toString() == "74490395")
        Assert.assrt(flight1.flightID!!.toString() == "74490396")
        Assert.assrt(flight1.cabinCapacity == 189)
        Assert.assrt(flight1.cabinBookings == 10)
        Assert.assrt(flight1.websiteAllocated == 0)
        Assert.assrt(flight1.websiteBookings == 0)
        Assert.assrt(flight1.poolCapacity == 179)
        Assert.assrt(flight1.poolBooked == 10)
        Assert.assrt(flight1.restCapacity == 0)
        Assert.assrt(flight1.restBooked == 0)
        Assert.assrt(flight1.departureTime.toString() == "06:30")
        Assert.assrt(flight1.arrivalTime.toString() == "12:20")
        Assert.assrt(flight1.updateIdentifier.name == "NEW_FLIGHT")
        Assert.assrt(flight1.specialPriceOffers.isEmpty())
        Assert.assrt(!flight1.isHiddenFlight)

        // Flight 2 (Line in file: 2-4)
        val flight2 = geniusFlights[1]
        Assert.assrt(flight2.carrierCode == "CXI")
        Assert.assrt(flight2.flightNumber == "2239")
        Assert.assrt(flight2.origin == "SSH")
        Assert.assrt(flight2.destination == "HAJ")
        Assert.assrt(flight2.departureDate.toString() == "2021-03-27")
        Assert.assrt(flight2.cabin == "Y")
        Assert.assrt(flight2.viaStation == "AMS")
        Assert.assrt(flight2.chainID.toString() == "74490495")
        Assert.assrt(flight2.flightID!!.toString() == "74490496")
        Assert.assrt(flight2.cabinCapacity == 189)
        Assert.assrt(flight2.cabinBookings == 2)
        Assert.assrt(flight2.websiteAllocated == 0)
        Assert.assrt(flight2.websiteBookings == 0)
        Assert.assrt(flight2.poolCapacity == 187)
        Assert.assrt(flight2.poolBooked == 2)
        Assert.assrt(flight2.restCapacity == 0)
        Assert.assrt(flight2.restBooked == 0)
        Assert.assrt(flight2.departureTime.toString() == "13:20")
        Assert.assrt(flight2.arrivalTime.toString() == "17:50")
        Assert.assrt(flight2.updateIdentifier.name == "OTHER")
        Assert.assrt(flight2.specialPriceOffers.size == 2)
        Assert.assrt(flight2.specialPriceOffers[0].fromSeats == 2)
        Assert.assrt(flight2.specialPriceOffers[0].price == 120.00)
        Assert.assrt(flight2.specialPriceOffers[1].fromSeats == 3)
        Assert.assrt(flight2.specialPriceOffers[1].price == 145.00)
        Assert.assrt(!flight2.isHiddenFlight)

        // Flight 3 (Line in file: 5-9)
        val flight3 = geniusFlights[2]
        Assert.assrt(flight3.carrierCode == "CAI")
        Assert.assrt(flight3.flightNumber == "3556")
        Assert.assrt(flight3.origin == "CGN")
        Assert.assrt(flight3.destination == "ADB")
        Assert.assrt(flight3.departureDate.toString() == "2021-03-27")
        Assert.assrt(flight3.cabin == "Y")
        Assert.assrt(flight3.viaStation == null)
        Assert.assrt(flight3.chainID.toString() == "74552422")
        Assert.assrt(flight3.flightID.toString() == "74552423")
        Assert.assrt(flight3.cabinCapacity == 189)
        Assert.assrt(flight3.cabinBookings == 6)
        Assert.assrt(flight3.websiteAllocated == 0)
        Assert.assrt(flight3.websiteBookings == 6)
        Assert.assrt(flight3.poolCapacity == 183)
        Assert.assrt(flight3.poolBooked == 0)
        Assert.assrt(flight3.restCapacity == 0)
        Assert.assrt(flight3.restBooked == 0)
        Assert.assrt(flight3.departureTime.toString() == "03:05")
        Assert.assrt(flight3.arrivalTime.toString() == "07:15")
        Assert.assrt(flight3.updateIdentifier.name == "NIGHTLY_CAPTURE")
        Assert.assrt(flight3.specialPriceOffers.size == 4)
        Assert.assrt(flight3.specialPriceOffers[0].fromSeats == 1)
        Assert.assrt(flight3.specialPriceOffers[0].price == 105.90)
        Assert.assrt(flight3.specialPriceOffers[1].fromSeats == 2)
        Assert.assrt(flight3.specialPriceOffers[1].price == 120.00)
        Assert.assrt(flight3.specialPriceOffers[2].fromSeats == 2)
        Assert.assrt(flight3.specialPriceOffers[2].price == 120.00)
        Assert.assrt(flight3.specialPriceOffers[3].fromSeats == 17)
        Assert.assrt(flight3.specialPriceOffers[3].price == 220.09)
        Assert.assrt(!flight3.isHiddenFlight)

        // Flight 4 (Line in file: 10)
        val flight4 = geniusFlights[3]
        Assert.assrt(flight4.carrierCode == "CAI")
        Assert.assrt(flight4.flightNumber == "2268")
        Assert.assrt(flight4.origin == "HAJ")
        Assert.assrt(flight4.destination == "ESB")
        Assert.assrt(flight4.departureDate.toString() == "2021-03-27")
        Assert.assrt(flight4.cabin == "Y")
        Assert.assrt(flight4.viaStation == null)
        Assert.assrt(flight4.chainID.toString() == "74490767")
        Assert.assrt(flight4.flightID.toString() == "74490768")
        Assert.assrt(flight4.cabinCapacity == 189)
        Assert.assrt(flight4.cabinBookings == 0)
        Assert.assrt(flight4.websiteAllocated == 0)
        Assert.assrt(flight4.websiteBookings == 0)
        Assert.assrt(flight4.poolCapacity == 189)
        Assert.assrt(flight4.poolBooked == 0)
        Assert.assrt(flight4.restCapacity == 0)
        Assert.assrt(flight4.restBooked == 0)
        Assert.assrt(flight4.departureTime.toString() == "18:50")
        Assert.assrt(flight4.arrivalTime.toString() == "23:55")
        Assert.assrt(flight4.updateIdentifier.name == "SPO_FIX")
        Assert.assrt(flight4.specialPriceOffers.isEmpty())
        Assert.assrt(!flight4.isHiddenFlight)

        // Flight 5 (Line in file: 11-13)
        val flight5 = geniusFlights[4]
        Assert.assrt(flight5.carrierCode == "CAI")
        Assert.assrt(flight5.flightNumber == "2260")
        Assert.assrt(flight5.origin == "HAJ")
        Assert.assrt(flight5.destination == "GZT")
        Assert.assrt(flight5.departureDate.toString() == "2021-03-27")
        Assert.assrt(flight5.cabin == "Y")
        Assert.assrt(flight5.viaStation == null)
        Assert.assrt(flight5.chainID.toString() == "74490911")
        Assert.assrt(flight5.flightID.toString() == "74490912")
        Assert.assrt(flight5.cabinCapacity == 189)
        Assert.assrt(flight5.cabinBookings == 0)
        Assert.assrt(flight5.websiteAllocated == 0)
        Assert.assrt(flight5.websiteBookings == 0)
        Assert.assrt(flight5.poolCapacity == 189)
        Assert.assrt(flight5.poolBooked == 0)
        Assert.assrt(flight5.restCapacity == 0)
        Assert.assrt(flight5.restBooked == 0)
        Assert.assrt(flight5.departureTime.toString() == "18:30")
        Assert.assrt(flight5.arrivalTime.toString() == "00:40")
        Assert.assrt(flight5.updateIdentifier.name == "NEW_FLIGHT")
        Assert.assrt(flight5.specialPriceOffers.size == 2)
        Assert.assrt(flight5.specialPriceOffers[0].fromSeats == 2)
        Assert.assrt(flight5.specialPriceOffers[0].price == 125.00)
        Assert.assrt(flight5.specialPriceOffers[1].fromSeats == 3)
        Assert.assrt(flight5.specialPriceOffers[1].price == 146.00)
        Assert.assrt(!flight5.isHiddenFlight)
    }
}
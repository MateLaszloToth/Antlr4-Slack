package com.kambr.sync;

import com.kambr.kambrlogger.Logger;
import com.kambr.sync.dataClasses.GeniusFlight;
import com.ibm.icu.impl.Assert;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class TestMain {

    static String FILE_PATH = "src/test/resources/test-file.txt";
    static public Logger logger = new Logger(Main.class);

    @Test
    public void test_main() {

        CharStream charStream = null;

        try {
            charStream = CharStreams.fromFileName(FILE_PATH);
        } catch (IOException e) {
            logger.error(e.getLocalizedMessage());
        }

        List<GeniusFlight> geniusFlights = Main.parse(charStream);

        // Flight 1 (Line in file: 1)
        GeniusFlight flight1 = geniusFlights.get(0);
        Assert.assrt(flight1.airlineCode.equals("CXI"));
        Assert.assrt(flight1.flightNumber.equals("2238"));
        Assert.assrt(flight1.origin.equals("HAJ"));
        Assert.assrt(flight1.destination.equals("SSH"));
        Assert.assrt(flight1.departureDate.toString().equals("2021-03-27"));
        Assert.assrt(flight1.cabin.equals("Y"));
        Assert.assrt(flight1.viaStation == null);
        Assert.assrt(flight1.chainID.toString().equals("74490395"));
        Assert.assrt(flight1.flightID.toString().equals("74490396"));
        Assert.assrt(flight1.cabinCapacity.toString().equals("189"));
        Assert.assrt(flight1.cabinBooking.toString().equals("10"));
        Assert.assrt(flight1.websiteAllocated.toString().equals("0"));
        Assert.assrt(flight1.websiteBookings.toString().equals("0"));
        Assert.assrt(flight1.poolCapacity.toString().equals("179"));
        Assert.assrt(flight1.poolBooked.toString().equals("10"));
        Assert.assrt(flight1.restCapacity.toString().equals("0"));
        Assert.assrt(flight1.restBooked.toString().equals("0"));
        Assert.assrt(flight1.departureTime.equals("06:30"));
        Assert.assrt(flight1.arrivalTime.equals("12:20"));
        Assert.assrt(flight1.updateIndentifier.name().equals("NEW_FLIGHT"));
        Assert.assrt(flight1.specialPriceOffers.size() == 0);

        // Flight 2 (Line in file: 2-4)
        GeniusFlight flight2 = geniusFlights.get(1);
        Assert.assrt(flight2.airlineCode.equals("CXI"));
        Assert.assrt(flight2.flightNumber.equals("2239"));
        Assert.assrt(flight2.origin.equals("SSH"));
        Assert.assrt(flight2.destination.equals("HAJ"));
        Assert.assrt(flight2.departureDate.toString().equals("2021-03-27"));
        Assert.assrt(flight2.cabin.equals("Y"));
        Assert.assrt(flight2.viaStation.equals("AMS"));
        Assert.assrt(flight2.chainID.toString().equals("74490495"));
        Assert.assrt(flight2.flightID.toString().equals("74490496"));
        Assert.assrt(flight2.cabinCapacity.toString().equals("189"));
        Assert.assrt(flight2.cabinBooking.toString().equals("2"));
        Assert.assrt(flight2.websiteAllocated.toString().equals("0"));
        Assert.assrt(flight2.websiteBookings.toString().equals("0"));
        Assert.assrt(flight2.poolCapacity.toString().equals("187"));
        Assert.assrt(flight2.poolBooked.toString().equals("2"));
        Assert.assrt(flight2.restCapacity.toString().equals("0"));
        Assert.assrt(flight2.restBooked.toString().equals("0"));
        Assert.assrt(flight2.departureTime.equals("13:20"));
        Assert.assrt(flight2.arrivalTime.equals("17:50"));
        Assert.assrt(flight2.updateIndentifier.name().equals("OTHER"));
        Assert.assrt(flight2.specialPriceOffers.size() == 2);
        Assert.assrt(flight2.specialPriceOffers.get(0).fromSeats.toString().equals("2"));
        Assert.assrt(flight2.specialPriceOffers.get(0).price.toString().equals("120.00"));
        Assert.assrt(flight2.specialPriceOffers.get(1).fromSeats.toString().equals("3"));
        Assert.assrt(flight2.specialPriceOffers.get(1).price.toString().equals("145.00"));

        // Flight 3 (Line in file: 5-9)
        GeniusFlight flight3 = geniusFlights.get(2);
        Assert.assrt(flight3.airlineCode.equals("CAI"));
        Assert.assrt(flight3.flightNumber.equals("3556"));
        Assert.assrt(flight3.origin.equals("CGN"));
        Assert.assrt(flight3.destination.equals("ADB"));
        Assert.assrt(flight3.departureDate.toString().equals("2021-03-27"));
        Assert.assrt(flight3.cabin.equals("Y"));
        Assert.assrt(flight3.viaStation == null);
        Assert.assrt(flight3.chainID.toString().equals("74552422"));
        Assert.assrt(flight3.flightID.toString().equals("74552423"));
        Assert.assrt(flight3.cabinCapacity.toString().equals("189"));
        Assert.assrt(flight3.cabinBooking.toString().equals("6"));
        Assert.assrt(flight3.websiteAllocated.toString().equals("0"));
        Assert.assrt(flight3.websiteBookings.toString().equals("6"));
        Assert.assrt(flight3.poolCapacity.toString().equals("183"));
        Assert.assrt(flight3.poolBooked.toString().equals("0"));
        Assert.assrt(flight3.restCapacity.toString().equals("0"));
        Assert.assrt(flight3.restBooked.toString().equals("0"));
        Assert.assrt(flight3.departureTime.equals("03:05"));
        Assert.assrt(flight3.arrivalTime.equals("07:15"));
        Assert.assrt(flight3.updateIndentifier.name().equals("NIGHTLY_CAPTURE"));
        Assert.assrt(flight3.specialPriceOffers.size() == 4);
        Assert.assrt(flight3.specialPriceOffers.get(0).fromSeats.toString().equals("1"));
        Assert.assrt(flight3.specialPriceOffers.get(0).price.toString().equals("105.00"));
        Assert.assrt(flight3.specialPriceOffers.get(1).fromSeats.toString().equals("2"));
        Assert.assrt(flight3.specialPriceOffers.get(1).price.toString().equals("120.00"));
        Assert.assrt(flight3.specialPriceOffers.get(2).fromSeats.toString().equals("2"));
        Assert.assrt(flight3.specialPriceOffers.get(2).price.toString().equals("120.00"));
        Assert.assrt(flight3.specialPriceOffers.get(3).fromSeats.toString().equals("17"));
        Assert.assrt(flight3.specialPriceOffers.get(3).price.toString().equals("220.00"));

        // Flight 4 (Line in file: 10)
        GeniusFlight flight4 = geniusFlights.get(3);
        Assert.assrt(flight4.airlineCode.equals("CAI"));
        Assert.assrt(flight4.flightNumber.equals("2268"));
        Assert.assrt(flight4.origin.equals("HAJ"));
        Assert.assrt(flight4.destination.equals("ESB"));
        Assert.assrt(flight4.departureDate.toString().equals("2021-03-27"));
        Assert.assrt(flight4.cabin.equals("Y"));
        Assert.assrt(flight4.viaStation == null);
        Assert.assrt(flight4.chainID.toString().equals("74490767"));
        Assert.assrt(flight4.flightID.toString().equals("74490768"));
        Assert.assrt(flight4.cabinCapacity.toString().equals("189"));
        Assert.assrt(flight4.cabinBooking.toString().equals("0"));
        Assert.assrt(flight4.websiteAllocated.toString().equals("0"));
        Assert.assrt(flight4.websiteBookings.toString().equals("0"));
        Assert.assrt(flight4.poolCapacity.toString().equals("189"));
        Assert.assrt(flight4.poolBooked.toString().equals("0"));
        Assert.assrt(flight4.restCapacity.toString().equals("0"));
        Assert.assrt(flight4.restBooked.toString().equals("0"));
        Assert.assrt(flight4.departureTime.equals("18:50"));
        Assert.assrt(flight4.arrivalTime.equals("23:55"));
        Assert.assrt(flight4.updateIndentifier.name().equals("SPO_FIX"));
        Assert.assrt(flight4.specialPriceOffers.size() == 0);

        // Flight 5 (Line in file: 11-13)
        GeniusFlight flight5 = geniusFlights.get(4);
        Assert.assrt(flight5.airlineCode.equals("CAI"));
        Assert.assrt(flight5.flightNumber.equals("2260"));
        Assert.assrt(flight5.origin.equals("HAJ"));
        Assert.assrt(flight5.destination.equals("GZT"));
        Assert.assrt(flight5.departureDate.toString().equals("2021-03-27"));
        Assert.assrt(flight5.cabin.equals("Y"));
        Assert.assrt(flight5.viaStation == null);
        Assert.assrt(flight5.chainID.toString().equals("74490911"));
        Assert.assrt(flight5.flightID.toString().equals("74490912"));
        Assert.assrt(flight5.cabinCapacity.toString().equals("189"));
        Assert.assrt(flight5.cabinBooking.toString().equals("0"));
        Assert.assrt(flight5.websiteAllocated.toString().equals("0"));
        Assert.assrt(flight5.websiteBookings.toString().equals("0"));
        Assert.assrt(flight5.poolCapacity.toString().equals("189"));
        Assert.assrt(flight5.poolBooked.toString().equals("0"));
        Assert.assrt(flight5.restCapacity.toString().equals("0"));
        Assert.assrt(flight5.restBooked.toString().equals("0"));
        Assert.assrt(flight5.departureTime.equals("18:30"));
        Assert.assrt(flight5.arrivalTime.equals("00:40"));
        Assert.assrt(flight5.updateIndentifier.name().equals("NEW_FLIGHT"));
        Assert.assrt(flight5.specialPriceOffers.size() == 2);
        Assert.assrt(flight5.specialPriceOffers.get(0).fromSeats.toString().equals("2"));
        Assert.assrt(flight5.specialPriceOffers.get(0).price.toString().equals("125.00"));
        Assert.assrt(flight5.specialPriceOffers.get(1).fromSeats.toString().equals("3"));
        Assert.assrt(flight5.specialPriceOffers.get(1).price.toString().equals("146.00"));
    }
}

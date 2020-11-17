package com.kambr.sync.dataClasses;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class GeniusFlight {
    public String airlineCode;
    public String flightNumber;
    public String origin;
    public String destination;
    public LocalDate departureDate;
    public String cabin;
    public String viaStation;
    public BigInteger chainID;
    public BigInteger flightID;
    public Short cabinCapacity;
    public Short cabinBooking;
    public Short websiteAllocated;
    public Short websiteBookings;
    public Short poolCapacity;
    public Short poolBooked;
    public Short restCapacity;
    public Short restBooked;
    public String departureTime;
    public String arrivalTime;
    public UpdateIdentifierEnum updateIndentifier;
    public List<SpecialPriceOffer> specialPriceOffers;

    public GeniusFlight(
            String airlineCode,
            String flightNumber,
            String origin,
            String destination,
            LocalDate departureDate,
            String cabin,
            String viaStation,
            BigInteger chainID,
            BigInteger flightID,
            Short cabinCapacity,
            Short cabinBooking,
            Short websiteAllocated,
            Short websiteBookings,
            Short poolCapacity,
            Short poolBooked,
            Short restCapacity,
            Short restBooked,
            String departureTime,
            String arrivalTime,
            UpdateIdentifierEnum updateIndentifier,
            List<SpecialPriceOffer> specialPriceOffers
    ) {
        this.airlineCode = airlineCode;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.cabin = cabin;
        this.viaStation = viaStation;
        this.chainID = chainID;
        this.flightID = flightID;
        this.cabinCapacity = cabinCapacity;
        this.cabinBooking = cabinBooking;
        this.websiteAllocated = websiteAllocated;
        this.websiteBookings = websiteBookings;
        this.poolCapacity = poolCapacity;
        this.poolBooked = poolBooked;
        this.restCapacity = restCapacity;
        this.restBooked = restBooked;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.updateIndentifier = updateIndentifier;
        this.specialPriceOffers = specialPriceOffers;
    }

}

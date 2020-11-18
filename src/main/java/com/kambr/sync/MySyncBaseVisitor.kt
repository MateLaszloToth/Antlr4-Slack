package com.kambr.sync;

import com.kambr.sync.dataClasses.GeniusFlight;
import com.kambr.sync.dataClasses.SpecialPriceOffer;
import com.kambr.sync.dataClasses.UpdateIdentifierEnum;
import com.kambr.sync.generated.SyncBaseVisitor;
import com.kambr.sync.generated.SyncParser;
import com.kambr.sync.generated.SyncParser.GeniusFlightContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MySyncBaseVisitor extends SyncBaseVisitor {

    @Override
    public List<GeniusFlight> visitFlightRecords(SyncParser.FlightRecordsContext ctx) {
        List<GeniusFlight> geniusFlightList = new ArrayList<>();
        for (GeniusFlightContext flight : ctx.geniusFlight()) {
            geniusFlightList.add(visitGeniusFlight(flight));
        }
        return geniusFlightList;
    }

    @Override
    public GeniusFlight visitGeniusFlight(GeniusFlightContext ctx) {
        String airlineCode = null;
        String flightNumber = null;
        String origin = null;
        String destination = null;
        LocalDate departureDate = null;
        String cabin = null;
        String viaStation = null;
        BigInteger chainID = null;
        BigInteger flightID = null;
        Short cabinCapacity = null;
        Short cabinBooking = null;
        Short websiteAllocated = null;
        Short websiteBookings = null;
        Short poolCapacity = null;
        Short poolBooked = null;
        Short restCapacity = null;
        Short restBooked = null;
        String departureTime = null;
        String arrivalTime = null;
        UpdateIdentifierEnum updateIndentifier = null;
        List<SpecialPriceOffer> specialPriceOffers = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof SyncParser.AirlineCodeContext) {
                airlineCode = visitAirlineCode(ctx.airlineCode());
            } else if (child instanceof SyncParser.FlightNumberContext) {
                flightNumber = visitFlightNumber(ctx.flightNumber());
            } else if (child instanceof SyncParser.OriginContext) {
                origin = visitOrigin(ctx.origin());
            } else if (child instanceof SyncParser.DestinationContext) {
                destination = visitDestination(ctx.destination());
            } else if (child instanceof SyncParser.DepartureDateContext) {
                departureDate = visitDepartureDate(ctx.departureDate());
            } else if (child instanceof SyncParser.CabinContext) {
                cabin = visitCabin(ctx.cabin());
            } else if (child instanceof SyncParser.ViaStationContext) {
                if (ctx.viaStation() != null) {
                    viaStation = visitViaStation(ctx.viaStation());
                }
            } else if (child instanceof SyncParser.ChainIDContext) {
                chainID = visitChainID(ctx.chainID());
            } else if (child instanceof SyncParser.FlightIDContext) {
                flightID = visitFlightID(ctx.flightID());
            } else if (child instanceof SyncParser.CabinCapacityContext) {
                cabinCapacity = visitCabinCapacity(ctx.cabinCapacity());
            } else if (child instanceof SyncParser.CabinBookingContext) {
                cabinBooking = visitCabinBooking(ctx.cabinBooking());
            } else if (child instanceof SyncParser.WebsiteAllocatedContext) {
                websiteAllocated = visitWebsiteAllocated(ctx.websiteAllocated());
            } else if (child instanceof SyncParser.WebsiteBookingsContext) {
                websiteBookings = visitWebsiteBookings(ctx.websiteBookings());
            } else if (child instanceof SyncParser.PoolCapacityContext) {
                poolCapacity = visitPoolCapacity(ctx.poolCapacity());
            } else if (child instanceof SyncParser.PoolBookedContext) {
                poolBooked = visitPoolBooked(ctx.poolBooked());
            } else if (child instanceof SyncParser.RestCapacityContext) {
                restCapacity = visitRestCapacity(ctx.restCapacity());
            } else if (child instanceof SyncParser.RestBookedContext) {
                restBooked = visitRestBooked(ctx.restBooked());
            } else if (child instanceof SyncParser.DepartureTimeContext) {
                departureTime = visitDepartureTime(ctx.departureTime());
            } else if (child instanceof SyncParser.ArrivalTimeContext) {
                arrivalTime = visitArrivalTime(ctx.arrivalTime());
            } else if (child instanceof SyncParser.UpdateIndentifierContext) {
                updateIndentifier = visitUpdateIndentifier(ctx.updateIndentifier());
            } else if (child instanceof SyncParser.SpecialPriceOffersContext) {
                specialPriceOffers.add(visitSpecialPriceOffers((SyncParser.SpecialPriceOffersContext) child));
            } else if (!(child instanceof TerminalNode)) {
                throw new RuntimeException("Unexpected children of EdiObject. Content is: " + child.getText() +
                        " Parse tree: " + child.toStringTree());
            }

        }

        return new GeniusFlight(
                airlineCode,
                flightNumber,
                origin,
                destination,
                departureDate,
                cabin,
                viaStation,
                chainID,
                flightID,
                cabinCapacity,
                cabinBooking,
                websiteAllocated,
                websiteBookings,
                poolCapacity,
                poolBooked,
                restCapacity,
                restBooked,
                departureTime,
                arrivalTime,
                updateIndentifier,
                specialPriceOffers
        );
    }

    @Override
    public String visitAirlineCode(SyncParser.AirlineCodeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFlightNumber(SyncParser.FlightNumberContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOrigin(SyncParser.OriginContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitDestination(SyncParser.DestinationContext ctx) {
        return ctx.getText();
    }

    @Override
    public LocalDate visitDepartureDate(SyncParser.DepartureDateContext ctx) {
        return LocalDate.parse(ctx.getText(), DateTimeFormatter.ISO_LOCAL_DATE);
    }

    @Override
    public String visitCabin(SyncParser.CabinContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitViaStation(SyncParser.ViaStationContext ctx) {
        return ctx.getText();
    }

    @Override
    public BigInteger visitChainID(SyncParser.ChainIDContext ctx) {
        return new BigInteger(ctx.getText());
    }

    @Override
    public BigInteger visitFlightID(SyncParser.FlightIDContext ctx) {
        return new BigInteger(ctx.getText());
    }

    @Override
    public Short visitCabinCapacity(SyncParser.CabinCapacityContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public Short visitCabinBooking(SyncParser.CabinBookingContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public Short visitWebsiteAllocated(SyncParser.WebsiteAllocatedContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public Short visitWebsiteBookings(SyncParser.WebsiteBookingsContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public Short visitPoolCapacity(SyncParser.PoolCapacityContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public Short visitPoolBooked(SyncParser.PoolBookedContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public Short visitRestCapacity(SyncParser.RestCapacityContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public Short visitRestBooked(SyncParser.RestBookedContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public String visitDepartureTime(SyncParser.DepartureTimeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitArrivalTime(SyncParser.ArrivalTimeContext ctx) {
        return ctx.getText();
    }

    @Override
    public UpdateIdentifierEnum visitUpdateIndentifier(SyncParser.UpdateIndentifierContext ctx) throws RuntimeException {
        char character;
        if (ctx.getText().length() >= 1) {
            character = ctx.getText().charAt(0);
            if (character == 'N')
                return UpdateIdentifierEnum.NEW_FLIGHT;
            else if (character == 'S')
                return UpdateIdentifierEnum.SPO_FIX;
            else if (character == 'U')
                return UpdateIdentifierEnum.NIGHTLY_CAPTURE;
            else if (character == 'X')
                return UpdateIdentifierEnum.OTHER;
            else
                throw new RuntimeException("Update identifier is supposed to be " +
                        "'N' or 'S' or 'U' or 'X', but it was " + character);
        }
        throw new RuntimeException("Update identifier is supposed to be 'N' or 'S' or 'U' or 'X', but it is missing.");
    }

    @Override
    public SpecialPriceOffer visitSpecialPriceOffers(SyncParser.SpecialPriceOffersContext ctx) {
        Short fromSeat = null;
        BigDecimal price = null;
        for (ParseTree child : ctx.children) {
            if (child instanceof SyncParser.FromSeatContext) {
                fromSeat = visitFromSeat(ctx.fromSeat());
            } else if (child instanceof SyncParser.PriceContext) {
                price = visitPrice(ctx.price());
            } else if (!(child instanceof TerminalNode)) {
                throw new RuntimeException("Unexpected children of SpecialPriceOffers. Content is: " + child.getText() +
                        " Parse tree: " + child.toStringTree());
            }
        }
        return new SpecialPriceOffer(fromSeat, price);
    }

    @Override
    public Short visitFromSeat(SyncParser.FromSeatContext ctx) {
        return new Short(ctx.getText());
    }

    @Override
    public BigDecimal visitPrice(SyncParser.PriceContext ctx) {
        return new BigDecimal(ctx.getText());
    }

    @Override
    public String visitDate(SyncParser.DateContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTime(SyncParser.TimeContext ctx) {
        return ctx.getText();
    }
}

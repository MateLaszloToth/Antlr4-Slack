grammar Sync;

// $ antlr4 /Users/matetoth/Documents/Kambr/Antlr-corendon/grammar/Sync.g4 -o /Users/matetoth/Documents/Kambr/Antlr-corendon/src/main/java/antlr/generated -no-listener -visitor

@header {
package antlr.generated;
}

flightRecords
: geniusFlight+ EOF
;

geniusFlight
: 'F;' airlineCode flightNumber origin destination
 departureDate cabin viaStation? chainID flightID
 cabinCapacity cabinBooking websiteAllocated websiteBookings
 poolCapacity poolBooked restCapacity restBooked departureTime
 arrivalTime updateIndentifier NEW_LINE specialPriceOffers*
;

airlineCode
: WORD
;

flightNumber
: INTEGER
;

origin
: WORD
;

destination
: WORD
;

departureDate
: date
;

cabin
: WORD
;

viaStation
: WORD
;

chainID
: INTEGER
;

flightID
: INTEGER
;

cabinCapacity
: INTEGER
;

cabinBooking
: INTEGER
;

websiteAllocated
: INTEGER
;

websiteBookings
: INTEGER
;

poolCapacity
: INTEGER
;

poolBooked
: INTEGER
;

restCapacity
: INTEGER
;

restBooked
: INTEGER
;

departureTime
: time
;

arrivalTime
: time
;

updateIndentifier
: WORD
;

specialPriceOffers
: 'S;' fromSeat price NEW_LINE?
;

fromSeat
: INTEGER
;

price
: INTEGER ('.'? INTEGER)?
;

date
: INTEGER '-' INTEGER '-' INTEGER
;

time
: INTEGER ':' INTEGER
;

WORD
: [a-zA-Z]+
;

INTEGER
: [0-9]+
;

NEW_LINE
: [\r\n]+
;

WHITE_SPACE_SKIP
: [\t]+ -> skip
;

SEPARATOR_SKIP
: ';' -> skip
;
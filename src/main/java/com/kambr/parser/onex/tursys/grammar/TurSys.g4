grammar TurSys;

@header{
package com.kambr.parser.onex.tursys.generated;
}

file
: header row+ EOF
;

header
:  (WORD SEPARATOR)*  WORD NEW_LINE
;

row
: segment+ pnr couponIdentificationCode fareBasisCode bookingTypeCode
bookingStatusCode bookingDate bookingTime ticketingDate ticketingTime
cancellationDate agentCode salesSource passengerType currency rateOfExchange
spoBasePrice promoIdentifier discount dynamicPriceAdjustment priceAdjustmentApplied
salesPrice tax totalAmount NEW_LINE?
;

segment
: departureDate carrierCode flightNumber origin destination flightPath
 cabinCode seatAssignment liftStatus boardingSequence
;

departureDate
: INTEGER? SEPARATOR
;

carrierCode
: WORD? SEPARATOR
;

flightNumber
: INTEGER SEPARATOR
;

origin
: WORD? SEPARATOR
;

destination
: WORD? SEPARATOR
;

flightPath
: WORD? SEPARATOR
;

cabinCode
:  WORD? SEPARATOR
;

seatAssignment
:  INTEGER? SEPARATOR
;

liftStatus
: WORD? SEPARATOR
;

boardingSequence
: INTEGER SEPARATOR
;

pnr
: WORD SEPARATOR
;

couponIdentificationCode
: INTEGER SEPARATOR
;

fareBasisCode
: WORD SEPARATOR
;

bookingTypeCode
: INTEGER SEPARATOR
;

bookingStatusCode
: WORD SEPARATOR
;

bookingDate
: INTEGER SEPARATOR
;

bookingTime
: INTEGER SEPARATOR
;

ticketingDate
: INTEGER SEPARATOR
;

ticketingTime
: INTEGER SEPARATOR
;

cancellationDate
: INTEGER? SEPARATOR
;

agentCode
: INTEGER SEPARATOR
;

salesSource
: WORD SEPARATOR
;

passengerType
: WORD SEPARATOR
;

currency
: WORD SEPARATOR
;

rateOfExchange
: (NUMBER | INTEGER) SEPARATOR
;

spoBasePrice
: (NUMBER | INTEGER) SEPARATOR
;

promoIdentifier
: INTEGER SEPARATOR
;

discount
: (NUMBER | INTEGER) SEPARATOR
;

dynamicPriceAdjustment
: (NUMBER | INTEGER) SEPARATOR
;

priceAdjustmentApplied
: INTEGER SEPARATOR
;

salesPrice
: (NUMBER | INTEGER) SEPARATOR
;

tax
: (NUMBER | INTEGER) SEPARATOR
;

totalAmount
: (NUMBER | INTEGER)
;

INTEGER
: [0-9]+
;

NUMBER
: '-'? [0-9]+ (',' [0-9]+)?
;

WORD
:  (([0-9] | '_' | '-')* [a-zA-Z]+ ([0-9] | '_' | '-')*)+
;

NEW_LINE
: '\r'? '\n'
;

SEPARATOR
: '|'
;

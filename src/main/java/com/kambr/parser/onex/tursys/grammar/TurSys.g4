grammar TurSys;

@header{
package com.kambr.parser.onex.tursys.generated;
}

file
: header row+ EOF
;

header
: (ID | WORD)+ NEW_LINE
;

row
: segment segment segment pnr couponIdentificationCode fareBasisCode bookingTypeCode
bookingStatusCode bookingDate bookingTime ticketingDate ticketingTime
cancellationDate? agentCode salesSource passengerType currency rateOfExchange
spoBasePrice promoIdentifier discount dynamicPriceAdjustment priceAdjustmentApplied
salesPrice tax totalAmount NEW_LINE
;

segment
: departureDate? carrierCode? flightNumber origin? destination? flightPath?
 cabinCode? seatAssignment? liftStatus? boardingSequence
;

departureDate
: INTEGER
;

carrierCode
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

flightPath
: WORD
;

cabinCode
:  WORD
;

seatAssignment
:  INTEGER
;

liftStatus
: WORD
;

boardingSequence
: INTEGER
;

pnr
: ID
;

couponIdentificationCode
: INTEGER
;

fareBasisCode
: WORD
;

bookingTypeCode
: INTEGER
;

bookingStatusCode
: WORD
;

bookingDate
: INTEGER
;

bookingTime
: INTEGER
;

ticketingDate
: INTEGER
;

ticketingTime
: INTEGER
;

cancellationDate
: INTEGER
;

agentCode
: INTEGER
;

salesSource
: WORD
;

passengerType
: WORD
;

currency
: WORD
;

rateOfExchange
: NUMBER
;

spoBasePrice
: NUMBER
;

promoIdentifier
: INTEGER
;

discount
: NUMBER
;

dynamicPriceAdjustment
: NUMBER
;

priceAdjustmentApplied
: INTEGER
;

salesPrice
: NUMBER
;

tax
: NUMBER
;

totalAmount
: NUMBER
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

ID
: ([a-zA-Z] | [0-9])+
;

NEW_LINE
: '\r'? '\n'
;

SEPARATOR_SKIP
: '|' -> skip
;

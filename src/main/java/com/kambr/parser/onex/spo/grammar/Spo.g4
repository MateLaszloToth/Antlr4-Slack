grammar Spo;

@header{
package com.kambr.parser.onex.spo.generated;
}

spo
: header row* EOF
;

header
: (ID | WORD)+ NEW_LINE
;

row
: departureDate origin destination viaStation? carrierCode flightNumber
  departureTime arrivalTime taxAmount surcharge fixAllocation proRataAmount
  totalNumberOfAllocations bookings available contractPrice fromAndPrice* flightID
  poolingEnabled agencyCode agencyName NEW_LINE?

;

departureDate
: NUMBER '.' NUMBER '.' NUMBER
;

origin
: WORD
;

destination
: WORD
;

viaStation
: WORD
;

carrierCode
: WORD
;

flightNumber
: NUMBER
;

departureTime
: NUMBER ':' NUMBER
;

arrivalTime
: NUMBER ':' NUMBER
;

taxAmount
: NUMBER
;

surcharge
: NUMBER
;

fixAllocation
: NUMBER
;

proRataAmount
: NUMBER
;

totalNumberOfAllocations
: NUMBER
;

bookings
: NUMBER
;

available
: NUMBER
;

contractPrice
: NUMBER
;

fromAndPrice
: from price
;

from
: NUMBER
;

price
: NUMBER
;

flightID
: NUMBER
;

poolingEnabled
: NUMBER
;

agencyCode
: NUMBER
;

agencyName
: WORD
;

NUMBER
: '-'? [0-9]+ (',' [0-9]+)?
;

WORD
: ([a-z] | [A-Z] | ' ' | '(' | ')' | '_')+
;

ID
: [a-zA-Z]+ [0-9]+
;

NEW_LINE
: '\r'? '\n'
;

SEPARATOR_SKIP
: ';' -> skip
;
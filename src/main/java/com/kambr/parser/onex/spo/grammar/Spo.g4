grammar Spo;

@header{
package com.kambr.parser.onex.spo.generated;
}

spo
: header row+
;

header
: FIELD (';' FIELD)* '\r'? '\n'
;

row
: departureDate origin destination viaStation? carrierCode flightNumber
  departureTime arrivalTime taxAmount surcharge fixAllocation proRataAmount
  totalNumberOfAllocations bookings available contractPrice fromAndPrice* flightID
  poolingEnabled agencyCode agencyName NEW_LINE

;

departureDate
: FIELD
;

origin
: FIELD
;

destination
: FIELD
;

viaStation
: FIELD
;

carrierCode
: FIELD
;

flightNumber
: FIELD
;

departureTime
: FIELD
;

arrivalTime
: FIELD
;

taxAmount
: FIELD
;

surcharge
: FIELD
;

fixAllocation
: FIELD
;

proRataAmount
: FIELD
;

totalNumberOfAllocations
: FIELD
;

bookings
: FIELD
;

available
: FIELD
;

contractPrice
: FIELD
;

fromAndPrice
: from price
;

from
: FIELD
;

price
: FIELD
;

flightID
: FIELD
;

poolingEnabled
: FIELD
;

agencyCode
: FIELD
;

agencyName
: FIELD
;


FIELD
: ~[;\n\r]+
;

NEW_LINE
: '\r'? '\n'
;

SEPARATOR_SKIP
: ';' -> skip
;
grammar Spo;

@header{
package com.kambr.parser.onex.spo.generated;
}

spo
: header row+
;

header
: row
;

row
: FIELD (';' FIELD)* '\r'? '\n'
;

origin
:
;

destination
:
;

viaStation
:
;

carrierCode
:
;

flightNumber
:
;

departureTime
:
;

arrivalTime
:
;

taxAmount
:
;

surcharge
:
;

fixAllocation
:
;

proRataAmount
:
;

totalNumberOfAllocations
:
;

booking
:
;

available
:
;

contractPrice
:
;

from
:
;

price
:
;

flightID
:
;

poolingEnabled
:
;

agencyCode
:
;

agencyName
:
;


FIELD
: ~[;\n\r]+
;

SEPARATOR_SKIP
: ';' -> skip
;
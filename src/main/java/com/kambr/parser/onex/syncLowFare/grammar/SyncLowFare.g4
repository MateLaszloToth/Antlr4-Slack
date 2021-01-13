grammar SyncLowFare;

@header{
package com.kambr.parser.onex.syncLowFare.generated;
}

file
: header row+ EOF
;

header
:  (WORD SEPARATOR)+ NEW_LINE
;

row
:   departureDate origin destination viaStation carrierCode flightNumber
    departureTime arrivalTime flightID pnrIdentifier agencyCode agencyName
    seatsSold flightPrice tax additionalAmount sum NEW_LINE?
;

departureDate
: DATE SEPARATOR
;

origin
: WORD SEPARATOR
;

destination
: WORD SEPARATOR
;

viaStation
: WORD? SEPARATOR
;

carrierCode
: WORD SEPARATOR
;

flightNumber
: NUMBER SEPARATOR
;

departureTime
: time SEPARATOR
;

arrivalTime
: time SEPARATOR
;

time
: NUMBER ':' NUMBER
;

flightID
: NUMBER SEPARATOR
;

pnrIdentifier
: (NUMBER | WORD) SEPARATOR
;

agencyCode
: NUMBER SEPARATOR
;

agencyName
: WORD SEPARATOR
;

seatsSold
: NUMBER SEPARATOR
;

flightPrice
: NUMBER SEPARATOR
;

tax
: NUMBER SEPARATOR
;

additionalAmount
: NUMBER SEPARATOR
;

sum
: NUMBER
;

DATE
: [0-9]+ '.' [0-9]+ '.' [0-9]+
;

NUMBER
: '-'? [0-9]+ ('.' [0-9]+)?
;

WORD
:  (([0-9] | ' ' | '(' | ')' | '_' | '&' | '-' | '.')* [a-zA-Z]+ ([0-9] | ' ' | '(' | ')' | '_' | '&' | '-' | '.')*)+
;

NEW_LINE
: '\r'? '\n'
;

SEPARATOR
: ';'
;
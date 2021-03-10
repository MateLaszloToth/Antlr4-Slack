package com.kambr.parser.onex.tursys.dataClasses

enum class LiftStatus(val value: Int) {
    DEFAULT(0),
    CHECKED_IN(1),
    BOARDED(2),
    NO_SHOW(3),
    GO_SHOW(4),
    OFFLOADED(5),
    VOLUNTARY_DENIED_BOARDED(6),
    DENIED_BOARDED(7)
}
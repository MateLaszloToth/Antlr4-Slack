package com.kambr.parser.onex.sync.dataClasses

enum class UpdateIdentifier(val value: String) {
    NEW_FLIGHT("N"),
    SPO_FIX("S"),
    NIGHTLY_CAPTURE("U"),
    OTHER("X")
}
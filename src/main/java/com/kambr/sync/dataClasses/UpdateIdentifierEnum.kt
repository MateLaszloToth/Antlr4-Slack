package com.kambr.sync.dataClasses

enum class UpdateIdentifierEnum(val value: String) {
    NEW_FLIGHT("N"),
    SPO_FIX("S"),
    NIGHTLY_CAPTURE("U"),
    OTHER("X")
}
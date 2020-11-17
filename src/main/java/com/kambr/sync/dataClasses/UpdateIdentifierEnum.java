package com.kambr.sync.dataClasses;

public enum UpdateIdentifierEnum {
    NEW_FLIGHT('N'),
    SPO_FIX('S'),
    NIGHTLY_CAPTURE('U'),
    OTHER('X');

    private Character value;

    UpdateIdentifierEnum(Character value) {
        this.value = value;
    }
}

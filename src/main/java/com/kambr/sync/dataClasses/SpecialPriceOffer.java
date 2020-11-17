package com.kambr.sync.dataClasses;

import java.math.BigDecimal;

public class SpecialPriceOffer {
    public Short fromSeats;
    public BigDecimal price;

    public SpecialPriceOffer(Short fromSeats, BigDecimal price) {
        this.fromSeats = fromSeats;
        this.price = price;
    }
}

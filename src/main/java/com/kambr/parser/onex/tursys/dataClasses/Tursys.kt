package com.kambr.parser.onex.tursys.dataClasses

import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalTime

data class Tursys (
    val segments: List<Segment>,
    val pnr: String,
    val couponIdentificationCode: String,
    val fareBasisCode: String,
    val bookingTypeCode: BookingTypeCodeEnum,
    val bookingStatusCode: BookingStatusCodeEnum,
    val bookingDate: LocalDate,
    val bookingTime: LocalTime,
    val ticketingDate: LocalDate,
    val ticketingTime: LocalTime,
    val cancellationDate: LocalDate,
    val agentCode: String,
    val salesSource: String,
    val passengerType: PassengerTypeEnum,
    val currency: String,
    val rateOfExchange: BigDecimal,
    val spoBasePrice: BigDecimal,
    val promoIdentifier: Boolean,
    val discount: BigDecimal,
    val dynamicPriceAdjustment: BigDecimal,
    val priceAdjustmentApplied: Boolean,
    val salesPrice: BigDecimal,
    val tax: BigDecimal,
    val totalAmount: BigDecimal
)
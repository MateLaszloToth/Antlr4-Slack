package com.kambr.parser.oney.json.dataClasses

data class CabinDetails(
    val cabinCode: String,
    val cabinSaleableCapacity: Int,
    val cabinAuthorizedCapacity: Int,
    val cabinBlock: Int
)
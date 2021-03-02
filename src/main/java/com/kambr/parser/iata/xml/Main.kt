package com.kambr.parser.iata.xml

import com.kambr.kambrlogger.Logger
import com.kambr.parser.iata.json.MyJsonVisitor

class Main

const val IATA_ORDER_SALES_INFORMATION_FILE = ""
const val IATA_SERVICE_STATUS_CHANGE_FILE = ""

fun main() {
    val logger = Logger(Main::class.java)
//    val serviceStatusChange = parseIATAServiceStatusChange(IATA_SERVICE_STATUS_CHANGE_FILE)
//    val orderSalesInfo = parseIATAOrderSalesInfo(IATA_ORDER_SALES_INFORMATION_FILE)

    logger.info("Done")
}
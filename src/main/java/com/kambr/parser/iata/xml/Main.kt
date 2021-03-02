package com.kambr.parser.iata.xml

import com.kambr.parser.iata.xml.IATAOrderSalesInformationNotifRQParser.parseIATAOrderSalesInfo
import com.kambr.parser.iata.xml.IATAServiceStatusChangeNotifRQParser.parseIATAServiceStatusChange

const val IATA_ORDER_SALES_INFORMATION_FILE = ""
const val IATA_SERVICE_STATUS_CHANGE_FILE = ""

fun main() {
    val serviceStatusChange = parseIATAServiceStatusChange(IATA_SERVICE_STATUS_CHANGE_FILE)
    val orderSalesInfo = parseIATAOrderSalesInfo(IATA_ORDER_SALES_INFORMATION_FILE)

    print("Done")
}
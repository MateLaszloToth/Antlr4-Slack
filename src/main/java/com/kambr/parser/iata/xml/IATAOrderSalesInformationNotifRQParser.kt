package com.kambr.parser.iata.xml

import com.kambr.parser.iata.xml.JAXBMiscellaneous.getObjectFromXML
import com.kambr.parser.iata.xml.orderSalesInformationNotifRQ.IATAOrderSalesInformationNotifRQ

fun parseIATAOrderSalesInfo(xmlAbsoluteFilePath: String): IATAOrderSalesInformationNotifRQ {
    return getObjectFromXML(
        xmlAbsoluteFilePath,
        IATAOrderSalesInformationNotifRQ::class.java
    ) as IATAOrderSalesInformationNotifRQ
}

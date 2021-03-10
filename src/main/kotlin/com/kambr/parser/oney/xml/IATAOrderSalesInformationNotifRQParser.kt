package com.kambr.parser.oney.xml

import com.kambr.parser.oney.xml.JAXBMiscellaneous.getObjectFromXML
import com.kambr.parser.oney.xml.orderSalesInformationNotifRQ.IATAOrderSalesInformationNotifRQ

fun parseIATAOrderSalesInfo(xmlAbsoluteFilePath: String): IATAOrderSalesInformationNotifRQ {
    return getObjectFromXML(
        xmlAbsoluteFilePath,
        IATAOrderSalesInformationNotifRQ::class.java
    ) as IATAOrderSalesInformationNotifRQ
}

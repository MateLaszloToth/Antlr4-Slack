package com.kambr.parser.oney.xml

import com.kambr.parser.oney.xml.JAXBMiscellaneous.getObjectFromFileWithXMLRootElementOnEachLine
import com.kambr.parser.oney.xml.orderSalesInformationNotifRQ.IATAOrderSalesInformationNotifRQ

@Suppress("UNCHECKED_CAST")
fun parseIATAOrderSalesInfo(xmlAbsoluteFilePath: String): List<IATAOrderSalesInformationNotifRQ> {
    return getObjectFromFileWithXMLRootElementOnEachLine(
        xmlAbsoluteFilePath,
        IATAOrderSalesInformationNotifRQ::class.java
    ) as List<IATAOrderSalesInformationNotifRQ>
}

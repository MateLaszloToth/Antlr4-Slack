package com.kambr.parser.oney.xml

import com.kambr.parser.oney.xml.serviceStatusChangeNotifRQ.IATAServiceStatusChangeNotifRQ


fun parseIATAServiceStatusChange(xmlAbsoluteFilePath: String): IATAServiceStatusChangeNotifRQ {
    return JAXBMiscellaneous.getObjectFromXML(
        xmlAbsoluteFilePath,
        IATAServiceStatusChangeNotifRQ::class.java
    ) as IATAServiceStatusChangeNotifRQ
}
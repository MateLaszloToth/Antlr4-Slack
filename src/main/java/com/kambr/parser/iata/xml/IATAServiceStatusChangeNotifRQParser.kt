package com.kambr.parser.iata.xml

import com.kambr.parser.iata.xml.serviceStatusChangeNotifRQ.IATAServiceStatusChangeNotifRQ


fun parseIATAServiceStatusChange(xmlAbsoluteFilePath: String): IATAServiceStatusChangeNotifRQ {
    return JAXBMiscellaneous.getObjectFromXML(
        xmlAbsoluteFilePath,
        IATAServiceStatusChangeNotifRQ::class.java
    ) as IATAServiceStatusChangeNotifRQ
}
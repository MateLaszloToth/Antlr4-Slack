package com.kambr.parser.oney.xml

import com.kambr.parser.oney.xml.iata.serviceStatusChangeNotifRQ.IATAServiceStatusChangeNotifRQ

object IATAServiceStatusChangeNotifRQParser {

    @JvmStatic
    fun parseIATAServiceStatusChange(xmlAbsoluteFilePath: String): IATAServiceStatusChangeNotifRQ {
        return JAXBMiscellaneous.getObjectFromXML(
            xmlAbsoluteFilePath,
            IATAServiceStatusChangeNotifRQ::class.java
        ) as IATAServiceStatusChangeNotifRQ
    }

}
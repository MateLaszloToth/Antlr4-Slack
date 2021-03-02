package com.kambr.parser.oney.xml

import org.junit.jupiter.api.Test
import com.kambr.parser.oney.xml.IATAOrderSalesInformationNotifRQParser.parseIATAOrderSalesInfo
import com.kambr.parser.oney.xml.IATAServiceStatusChangeNotifRQParser.parseIATAServiceStatusChange
import org.junit.jupiter.api.Assertions.assertEquals

class TestXML {

    companion object {
        const val IATA_ORDER_SALES_INFORMATION_FILE = "src/test/resources/oney/xml/L1WYFPB_OSIN.xml"
        const val IATA_SERVICE_STATUS_CHANGE_FILE = "src/test/resources/oney/xml/L1WYFPB_SSCN.xml"
    }

    @Test
    fun test_iata_order_sales_information() {
        val orderSalesInfo = parseIATAOrderSalesInfo(IATA_ORDER_SALES_INFORMATION_FILE)

        assertEquals("WEB", orderSalesInfo.party.sender.corporation.corporateCodeText)
        assertEquals("2021-01-08T10:09:40.615", orderSalesInfo.payloadAttributes.timestamp.toLocalDateTime().toString())

        val baggageAllowance = orderSalesInfo.request.dataLists.baggageAllowanceList.baggageAllowance

        assertEquals(1, baggageAllowance.size)
        assertEquals("BA1", baggageAllowance[0].baggageAllowanceID)
        assertEquals("Adult", baggageAllowance[0].pieceAllowance[0].applicablePartyText)
        assertEquals(4, baggageAllowance[0].pieceAllowance[0].pieceDimensionAllowance.size)
        assertEquals(
            "Linear",
            baggageAllowance[0].pieceAllowance[0].pieceDimensionAllowance[0].baggageDimensionCategory
        )
        assertEquals("Checked", baggageAllowance[0].typeCode.value())
        assertEquals(2, orderSalesInfo.request.dataLists.contactInfoList.contactInfo.size)
        assertEquals(
            "C215ea541-179e-47f6-ba59-0001351dffc2",
            orderSalesInfo.request.dataLists.contactInfoList.contactInfo[0].contactInfoID
        )
        assertEquals(1, orderSalesInfo.request.dataLists.originDestList.originDest.size)
        assertEquals("BGO", orderSalesInfo.request.dataLists.originDestList.originDest[0].destCode)
        assertEquals("LASTNAME", orderSalesInfo.request.dataLists.paxList.pax[0].individual.surname)
        assertEquals(1, orderSalesInfo.request.order.size)
        assertEquals("L1WYFPB", orderSalesInfo.request.order[0].orderID)
    }

    @Test
    fun test_iata_service_status_change() {
        val serviceStatusChange = parseIATAServiceStatusChange(IATA_SERVICE_STATUS_CHANGE_FILE)

        assertEquals("WEB", serviceStatusChange.party.sender.corporation.corporateCodeText)
        assertEquals(
            "2021-01-08T10:10:25.328",
            serviceStatusChange.payloadAttributes.timestamp.toLocalDateTime().toString()
        )
        assertEquals(1, serviceStatusChange.request.order.size)
        assertEquals("L1WYFPB", serviceStatusChange.request.order[0].orderID)
        assertEquals(3, serviceStatusChange.request.order[0].orderItem.size)
        assertEquals("OIL1WYFPB1", serviceStatusChange.request.order[0].orderItem[0].orderItemID)
        assertEquals(1, serviceStatusChange.request.order[0].orderItem[0].service.size)
        assertEquals("PDM", serviceStatusChange.request.order[0].orderItem[0].service[0].deliveryProvider.id)
    }
}

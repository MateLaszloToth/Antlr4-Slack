package com.kambr.parser.oney.xml

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class TestXML {

    companion object {
        const val IATA_ORDER_SALES_INFORMATION_FILE = "src/test/resources/oney/xml/L1WYFPB_OSIN.xml"
        const val IATA_SERVICE_STATUS_CHANGE_FILE = "src/test/resources/oney/xml/L1WYFPB_SSCN.xml"
    }

    @Test
    fun test_iata_order_sales_information() {
        val orderSalesInfoList = parseIATAOrderSalesInfo(IATA_ORDER_SALES_INFORMATION_FILE)

        assertEquals(2, orderSalesInfoList.size)

        val orderSalesInfo = orderSalesInfoList[0]

        assertEquals("WEB", orderSalesInfo.party.sender.corporation.corporateCodeText)
        assertEquals("2021-03-16T12:47:05.495", orderSalesInfo.payloadAttributes.timestamp.toLocalDateTime().toString())

        assertEquals(null, orderSalesInfo.request.dataLists.baggageAllowanceList)

        assertEquals(1, orderSalesInfo.request.dataLists.paxList.pax.size)
        assertEquals("ADT", orderSalesInfo.request.dataLists.paxList.pax[0].ptc)

        assertEquals(1, orderSalesInfo.request.order.size)
        assertEquals(5, orderSalesInfo.request.order[0].orderItem.size)
        assertEquals("OIL3TBULW1", orderSalesInfo.request.order[0].orderItem[0].orderItemID)
        assertEquals("L3TBULW", orderSalesInfo.request.order[0].orderID)
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

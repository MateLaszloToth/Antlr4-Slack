
package com.kambr.parser.oney.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatusCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="FROZEN"/>
 *     &lt;enumeration value="OPENED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatusCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum OrderStatusCodeContentType {


    /**
     * Once all Order Items are FULLY PAID and Services are either DELIVERED or REFUNDED or EXPIRED
     * 
     */
    CLOSED,

    /**
     * emergency lock
     * 
     */
    FROZEN,

    /**
     * Order was built based on offer information.
     * 
     */
    OPENED;

    public String value() {
        return name();
    }

    public static OrderStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}

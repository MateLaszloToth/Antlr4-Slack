
package com.kambr.parser.oney.xml.iata.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderItemStatusCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CANCELLED BY CUSTOMER"/>
 *     &lt;enumeration value="ENTITLED"/>
 *     &lt;enumeration value="NOT ENTITLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderItemStatusCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum OrderItemStatusCodeContentType {


    /**
     * The Order Item reservation is cancelled by the Customer.
     * 
     */
    @XmlEnumValue("CANCELLED BY CUSTOMER")
    CANCELLED_BY_CUSTOMER("CANCELLED BY CUSTOMER"),

    /**
     * Customer is entitled to receive the Order Item.
     * 
     */
    ENTITLED("ENTITLED"),

    /**
     * Customer is not entitled to receive the Order Item until certain conditions are met.
     * 
     */
    @XmlEnumValue("NOT ENTITLED")
    NOT_ENTITLED("NOT ENTITLED");
    private final String value;

    OrderItemStatusCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderItemStatusCodeContentType fromValue(String v) {
        for (OrderItemStatusCodeContentType c: OrderItemStatusCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

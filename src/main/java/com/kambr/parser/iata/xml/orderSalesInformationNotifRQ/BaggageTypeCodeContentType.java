
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BaggageTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CarryOn"/>
 *     &lt;enumeration value="Checked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BaggageTypeCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum BaggageTypeCodeContentType {

    @XmlEnumValue("CarryOn")
    CARRY_ON("CarryOn"),
    @XmlEnumValue("Checked")
    CHECKED("Checked");
    private final String value;

    BaggageTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageTypeCodeContentType fromValue(String v) {
        for (BaggageTypeCodeContentType c: BaggageTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

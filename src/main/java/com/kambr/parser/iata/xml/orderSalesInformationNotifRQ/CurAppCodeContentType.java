
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurAppCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurAppCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Actual"/>
 *     &lt;enumeration value="Conversion"/>
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Requested"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurAppCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum CurAppCodeContentType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested");
    private final String value;

    CurAppCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurAppCodeContentType fromValue(String v) {
        for (CurAppCodeContentType c: CurAppCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

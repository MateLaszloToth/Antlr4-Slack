
package com.kambr.parser.oney.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Applied"/>
 *     &lt;enumeration value="Exempt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum TaxTypeCodeContentType {

    @XmlEnumValue("Applied")
    APPLIED("Applied"),
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt");
    private final String value;

    TaxTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeCodeContentType fromValue(String v) {
        for (TaxTypeCodeContentType c: TaxTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

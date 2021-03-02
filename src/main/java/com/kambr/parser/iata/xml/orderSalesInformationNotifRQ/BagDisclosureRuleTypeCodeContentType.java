
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagDisclosureRuleTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagDisclosureRuleTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BagDisclosureRuleTypeCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum BagDisclosureRuleTypeCodeContentType {


    /**
     * Disclosure with no US DOT Reservation
     * 
     */
    D("D"),

    /**
     * No Disclosure or US DOT Reservation
     * 
     */
    N("N"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Disclosure and US DOT Reservation
     * 
     */
    Y("Y");
    private final String value;

    BagDisclosureRuleTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagDisclosureRuleTypeCodeContentType fromValue(String v) {
        for (BagDisclosureRuleTypeCodeContentType c: BagDisclosureRuleTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

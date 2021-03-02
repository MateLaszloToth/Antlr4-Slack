
package com.kambr.parser.oney.xml.iata.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="NoShow"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Upgrade"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PenaltyTypeCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PenaltyTypeCodeContentType {


    /**
     * Cancellation
     * 
     */
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),

    /**
     * Change
     * 
     */
    @XmlEnumValue("Change")
    CHANGE("Change"),

    /**
     * NoShow
     * 
     */
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Upgrade
     * 
     */
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade");
    private final String value;

    PenaltyTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyTypeCodeContentType fromValue(String v) {
        for (PenaltyTypeCodeContentType c: PenaltyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

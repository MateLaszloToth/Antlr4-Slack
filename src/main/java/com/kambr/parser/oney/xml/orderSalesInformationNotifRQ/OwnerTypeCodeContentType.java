
package com.kambr.parser.oney.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnerTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ORA"/>
 *     &lt;enumeration value="POA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnerTypeCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum OwnerTypeCodeContentType {


    /**
     * Offer Responsible Airline
     * 
     */
    ORA,

    /**
     * Participating Offer Airline
     * 
     */
    POA;

    public String value() {
        return name();
    }

    public static OwnerTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}


package com.kambr.parser.oney.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresenceTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PresenceTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="CPCN"/>
 *     &lt;enumeration value="CPCP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PresenceTypeCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PresenceTypeCodeContentType {


    /**
     * Customer not present
     * 
     */
    CN,

    /**
     * Customer present -> (e.g. for non-PaymentCard payment methods)
     * 
     */
    CP,

    /**
     * Customer present and card not present
     * 
     */
    CPCN,

    /**
     * Customer present and card present
     * 
     */
    CPCP;

    public String value() {
        return name();
    }

    public static PresenceTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}

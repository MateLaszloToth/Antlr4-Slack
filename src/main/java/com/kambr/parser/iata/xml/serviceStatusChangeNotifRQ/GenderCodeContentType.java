
package com.kambr.parser.iata.xml.serviceStatusChangeNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GenderCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum GenderCodeContentType {


    /**
     * Female
     * 
     */
    F,

    /**
     * Male
     * 
     */
    M,

    /**
     * Unknown
     * 
     */
    U,

    /**
     * Unspecified
     * 
     */
    X;

    public String value() {
        return name();
    }

    public static GenderCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}

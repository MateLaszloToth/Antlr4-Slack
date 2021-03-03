
package com.kambr.parser.oney.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelAgencyTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelAgencyTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OnlineTravelAgency"/>
 *     &lt;enumeration value="TravelAgency"/>
 *     &lt;enumeration value="TravelManagementCompany"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelAgencyTypeCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum TravelAgencyTypeCodeContentType {


    /**
     * A Travel Agency operating Online
     * 
     */
    @XmlEnumValue("OnlineTravelAgency")
    ONLINE_TRAVEL_AGENCY("OnlineTravelAgency"),

    /**
     * A Travel Agency
     * 
     */
    @XmlEnumValue("TravelAgency")
    TRAVEL_AGENCY("TravelAgency"),

    /**
     * A Travel Management Company
     * 
     */
    @XmlEnumValue("TravelManagementCompany")
    TRAVEL_MANAGEMENT_COMPANY("TravelManagementCompany");
    private final String value;

    TravelAgencyTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelAgencyTypeCodeContentType fromValue(String v) {
        for (TravelAgencyTypeCodeContentType c: TravelAgencyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

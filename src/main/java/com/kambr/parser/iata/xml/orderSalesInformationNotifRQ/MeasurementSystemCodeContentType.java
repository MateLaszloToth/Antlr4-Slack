
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementSystemCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementSystemCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Imperial"/>
 *     &lt;enumeration value="Metric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeasurementSystemCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum MeasurementSystemCodeContentType {

    @XmlEnumValue("Imperial")
    IMPERIAL("Imperial"),
    @XmlEnumValue("Metric")
    METRIC("Metric");
    private final String value;

    MeasurementSystemCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementSystemCodeContentType fromValue(String v) {
        for (MeasurementSystemCodeContentType c: MeasurementSystemCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDeliveryStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceDeliveryStatusCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CONFIRMED"/>
 *     &lt;enumeration value="DELIVERED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="FAILED TO DELIVER"/>
 *     &lt;enumeration value="IN PROGRESS"/>
 *     &lt;enumeration value="NOT CLAIMED"/>
 *     &lt;enumeration value="READY TO DELIVER"/>
 *     &lt;enumeration value="READY TO PROCEED"/>
 *     &lt;enumeration value="REMOVED"/>
 *     &lt;enumeration value="REQUESTED"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="UNABLE TO DELIVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceDeliveryStatusCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum ServiceDeliveryStatusCodeContentType {


    /**
     * Inventory owner confirms he is able to provide the Service.
     * 
     */
    CONFIRMED("CONFIRMED"),

    /**
     * Service has been successfully delivered.
     * 
     */
    DELIVERED("DELIVERED"),

    /**
     * Service is no longer available for delivery.
     *  Service purchased with an associated time limit for consumption and Service was never claimed.
     *  Service having been at least Confirmed is no longer available as the Customer did not claim the Service within a specific time period, as dictated by the Airline.
     * 
     */
    EXPIRED("EXPIRED"),

    /**
     * Service could not be delivered due to Airline's or provider limitations.
     * 
     */
    @XmlEnumValue("FAILED TO DELIVER")
    FAILED_TO_DELIVER("FAILED TO DELIVER"),

    /**
     * The Delivery Provider is in the process of delivering the Service.
     *  There is a universal concept that the 'In progress' status may block any further financial transactions; e.g. refund.
     * 
     */
    @XmlEnumValue("IN PROGRESS")
    IN_PROGRESS("IN PROGRESS"),

    /**
     * The Service has not been claimed by the Passenger for reasons as a result of Passenger action or inaction. e.g. Passenger no-show, etc.
     * 
     */
    @XmlEnumValue("NOT CLAIMED")
    NOT_CLAIMED("NOT CLAIMED"),

    /**
     * Provider is in a position to start delivery of the Service.
     * 
     */
    @XmlEnumValue("READY TO DELIVER")
    READY_TO_DELIVER("READY TO DELIVER"),

    /**
     * OM is in a position to allow a Delivery Provider to prepare the Service.
     *  Customer is entitled to receive the Service. This is typically a trigger for ORA to begin accounting process.
     * 
     */
    @XmlEnumValue("READY TO PROCEED")
    READY_TO_PROCEED("READY TO PROCEED"),

    /**
     * Service was deleted.
     * 
     */
    REMOVED("REMOVED"),

    /**
     * OM requests the Service from the Inventory owner.
     * 
     */
    REQUESTED("REQUESTED"),

    /**
     * Delivery of the Service is suspended as a result of an Airline decision. 
     *  Can only revert back to the previous status.
     *  Exception is that Suspended may go to Removed. 
     *  This status may be used in case of fraud detection.
     * 
     */
    SUSPENDED("SUSPENDED"),

    /**
     * It is not possible for the Delivery Provider to deliver a Service. This could be for reasons of availability, legal or regulatory constraint.
     * 
     */
    @XmlEnumValue("UNABLE TO DELIVER")
    UNABLE_TO_DELIVER("UNABLE TO DELIVER");
    private final String value;

    ServiceDeliveryStatusCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceDeliveryStatusCodeContentType fromValue(String v) {
        for (ServiceDeliveryStatusCodeContentType c: ServiceDeliveryStatusCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

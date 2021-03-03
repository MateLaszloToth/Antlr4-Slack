
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatusCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="ALLOCATED"/>
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="COMMITTED"/>
 *     &lt;enumeration value="RECEIVED"/>
 *     &lt;enumeration value="REFUNDED"/>
 *     &lt;enumeration value="SENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatusCodeContentType")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PaymentStatusCodeContentType {


    /**
     * The commitments to pay was accepted./At the Payment Level to indicate that a payment has been authorized, etc. or the status in not needed
     * 
     */
    ACCEPTED,

    /**
     * The value of compensation was allocated to the corresponding Order Item.
     * 
     */
    ALLOCATED,

    /**
     * The payment process was done.
     * 
     */
    CLOSED,

    /**
     * The payer has committed to pay the compensation./When NDC indicates that part of a payment is to be applied to an order item
     * 
     */
    COMMITTED,

    /**
     * The compensation was received./ The actual receipt of funds is a function of the accounting system, or it it expected that the revenue accounting system will update the order when the bank transmits funds to the airline? Don't think we need this.
     * 
     */
    RECEIVED,

    /**
     * The compensation was transfered back to the payer./When an order item is cancelled or changed, we expect that any payments applied to the item will be un-applied. this leaves a credit balance on the order that can be applied to a new item of refunded.
     * 
     */
    REFUNDED,

    /**
     * The compensation was transfered.
     * 
     */
    SENT;

    public String value() {
        return name();
    }

    public static PaymentStatusCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}

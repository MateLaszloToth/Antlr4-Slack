
package com.kambr.parser.oney.xml.serviceStatusChangeNotifRQ;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A uniquely identified record of the agreement of one party with another to receive products and services under specified terms and conditions. Order supports the sale of a flexible range of airline products and services that are not necessarily Journey based (e.g. subscription services). 
 *  Comment:
 *  A 'PNR', 'super PNR' and 'ticket' are all today's versions of airline implementations of aspects of an Order. 
 *  An Order may support non-homogeneity, i.e. each passenger in an Order may hold different sets of order items at different prices.
 * 
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type"/>
 *         &lt;element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}OrderItemType" maxOccurs="unbounded"/>
 *         &lt;element name="OrderVersionNumber" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}OrderVersionNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", propOrder = {
    "orderID",
    "orderItem",
    "orderVersionNumber"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class OrderType {

    @XmlElement(name = "OrderID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String orderID;
    @XmlElement(name = "OrderItem", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<OrderItemType> orderItem;
    @XmlElement(name = "OrderVersionNumber")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigInteger orderVersionNumber;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<OrderItemType> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItemType>();
        }
        return this.orderItem;
    }

    /**
     * Gets the value of the orderVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigInteger getOrderVersionNumber() {
        return orderVersionNumber;
    }

    /**
     * Sets the value of the orderVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrderVersionNumber(BigInteger value) {
        this.orderVersionNumber = value;
    }

}

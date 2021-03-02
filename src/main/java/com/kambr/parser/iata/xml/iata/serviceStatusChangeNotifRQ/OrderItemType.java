
package com.kambr.parser.oney.xml.iata.serviceStatusChangeNotifRQ;

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
 * An individually priced item within an Order, made up of one or more Services. May or may not be a selected Offer Item (e.g. non-chargeable Services available on request such as a wheelchair).
 * 
 * <p>Java class for OrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrandTotalAmount" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="OrderItemID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type"/>
 *         &lt;element name="OrderItemTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}CodeType" minOccurs="0"/>
 *         &lt;element name="ReusableInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ServiceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", propOrder = {
    "grandTotalAmount",
    "orderItemID",
    "orderItemTypeCode",
    "reusableInd",
    "service"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class OrderItemType {

    @XmlElement(name = "GrandTotalAmount")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AmountType grandTotalAmount;
    @XmlElement(name = "OrderItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String orderItemID;
    @XmlElement(name = "OrderItemTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String orderItemTypeCode;
    @XmlElement(name = "ReusableInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean reusableInd;
    @XmlElement(name = "Service", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<ServiceType> service;

    /**
     * Gets the value of the grandTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AmountType getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * Sets the value of the grandTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGrandTotalAmount(AmountType value) {
        this.grandTotalAmount = value;
    }

    /**
     * Gets the value of the orderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrderItemID(String value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the orderItemTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getOrderItemTypeCode() {
        return orderItemTypeCode;
    }

    /**
     * Sets the value of the orderItemTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrderItemTypeCode(String value) {
        this.orderItemTypeCode = value;
    }

    /**
     * Gets the value of the reusableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isReusableInd() {
        return reusableInd;
    }

    /**
     * Sets the value of the reusableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setReusableInd(Boolean value) {
        this.reusableInd = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

}

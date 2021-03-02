
package com.kambr.parser.oney.xml.iata.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Party committing to pay. In the case of a Credit or Debit Card this would be the Cardholder.
 * 
 * <p>Java class for PayerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayerBillingAddress" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PostalAddressType" minOccurs="0"/>
 *         &lt;element name="PayerEmailAddress" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}EmailAddressType" minOccurs="0"/>
 *         &lt;element name="PayerName" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PayerNameType" minOccurs="0"/>
 *         &lt;element name="PayerPhoneNumber" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PhoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayerType", propOrder = {
    "payerBillingAddress",
    "payerEmailAddress",
    "payerName",
    "payerPhoneNumber"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PayerType {

    @XmlElement(name = "PayerBillingAddress")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PostalAddressType payerBillingAddress;
    @XmlElement(name = "PayerEmailAddress")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected EmailAddressType payerEmailAddress;
    @XmlElement(name = "PayerName")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PayerNameType payerName;
    @XmlElement(name = "PayerPhoneNumber")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PhoneType payerPhoneNumber;

    /**
     * Gets the value of the payerBillingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PostalAddressType getPayerBillingAddress() {
        return payerBillingAddress;
    }

    /**
     * Sets the value of the payerBillingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPayerBillingAddress(PostalAddressType value) {
        this.payerBillingAddress = value;
    }

    /**
     * Gets the value of the payerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public EmailAddressType getPayerEmailAddress() {
        return payerEmailAddress;
    }

    /**
     * Sets the value of the payerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPayerEmailAddress(EmailAddressType value) {
        this.payerEmailAddress = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link PayerNameType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PayerNameType getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerNameType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPayerName(PayerNameType value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PhoneType getPayerPhoneNumber() {
        return payerPhoneNumber;
    }

    /**
     * Sets the value of the payerPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPayerPhoneNumber(PhoneType value) {
        this.payerPhoneNumber = value;
    }

}

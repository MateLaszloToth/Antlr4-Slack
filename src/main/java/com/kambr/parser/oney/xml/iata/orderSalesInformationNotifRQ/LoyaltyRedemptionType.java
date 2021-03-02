
package com.kambr.parser.oney.xml.iata.orderSalesInformationNotifRQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A form of payment by which the customer uses a virtual currency of a Loyalty Program Account (such as air miles) in exchange for goods or services.
 * 
 * <p>Java class for LoyaltyRedemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyRedemptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificateNumber" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}NumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoyaltyCurAmount" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}AmountType" minOccurs="0"/>
 *         &lt;element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}LoyaltyProgramAccountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRedemptionType", propOrder = {
    "certificateNumber",
    "loyaltyCurAmount",
    "loyaltyProgramAccount"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class LoyaltyRedemptionType {

    @XmlElement(name = "CertificateNumber")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<BigDecimal> certificateNumber;
    @XmlElement(name = "LoyaltyCurAmount")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AmountType loyaltyCurAmount;
    @XmlElement(name = "LoyaltyProgramAccount")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LoyaltyProgramAccountType loyaltyProgramAccount;

    /**
     * Gets the value of the certificateNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<BigDecimal> getCertificateNumber() {
        if (certificateNumber == null) {
            certificateNumber = new ArrayList<BigDecimal>();
        }
        return this.certificateNumber;
    }

    /**
     * Gets the value of the loyaltyCurAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AmountType getLoyaltyCurAmount() {
        return loyaltyCurAmount;
    }

    /**
     * Sets the value of the loyaltyCurAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLoyaltyCurAmount(AmountType value) {
        this.loyaltyCurAmount = value;
    }

    /**
     * Gets the value of the loyaltyProgramAccount property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramAccountType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LoyaltyProgramAccountType getLoyaltyProgramAccount() {
        return loyaltyProgramAccount;
    }

    /**
     * Sets the value of the loyaltyProgramAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramAccountType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLoyaltyProgramAccount(LoyaltyProgramAccountType value) {
        this.loyaltyProgramAccount = value;
    }

}

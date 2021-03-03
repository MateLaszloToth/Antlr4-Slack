
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

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
 * Disclosure information specifically related to baggage.
 * 
 * <p>Java class for BaggageDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDisclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageDisclosureID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="BDC" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}BDC_Type" minOccurs="0"/>
 *         &lt;element name="CheckInChargesInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="CommercialAgreementID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="DeferralInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DescType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FixedPrePaidInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="RuleTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}BagDisclosureRuleTypeCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDisclosureType", propOrder = {
    "baggageDisclosureID",
    "bdc",
    "checkInChargesInd",
    "commercialAgreementID",
    "deferralInd",
    "desc",
    "descText",
    "fixedPrePaidInd",
    "ruleTypeCode"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class BaggageDisclosureType {

    @XmlElement(name = "BaggageDisclosureID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String baggageDisclosureID;
    @XmlElement(name = "BDC")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BDCType bdc;
    @XmlElement(name = "CheckInChargesInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean checkInChargesInd;
    @XmlElement(name = "CommercialAgreementID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String commercialAgreementID;
    @XmlElement(name = "DeferralInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean deferralInd;
    @XmlElement(name = "Desc")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<DescType> desc;
    @XmlElement(name = "DescText")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> descText;
    @XmlElement(name = "FixedPrePaidInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean fixedPrePaidInd;
    @XmlElement(name = "RuleTypeCode", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BagDisclosureRuleTypeCodeContentType ruleTypeCode;

    /**
     * Gets the value of the baggageDisclosureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getBaggageDisclosureID() {
        return baggageDisclosureID;
    }

    /**
     * Sets the value of the baggageDisclosureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBaggageDisclosureID(String value) {
        this.baggageDisclosureID = value;
    }

    /**
     * Gets the value of the bdc property.
     * 
     * @return
     *     possible object is
     *     {@link BDCType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BDCType getBDC() {
        return bdc;
    }

    /**
     * Sets the value of the bdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDCType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBDC(BDCType value) {
        this.bdc = value;
    }

    /**
     * Gets the value of the checkInChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isCheckInChargesInd() {
        return checkInChargesInd;
    }

    /**
     * Sets the value of the checkInChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCheckInChargesInd(Boolean value) {
        this.checkInChargesInd = value;
    }

    /**
     * Gets the value of the commercialAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCommercialAgreementID() {
        return commercialAgreementID;
    }

    /**
     * Sets the value of the commercialAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCommercialAgreementID(String value) {
        this.commercialAgreementID = value;
    }

    /**
     * Gets the value of the deferralInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isDeferralInd() {
        return deferralInd;
    }

    /**
     * Sets the value of the deferralInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDeferralInd(Boolean value) {
        this.deferralInd = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the descText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<String>();
        }
        return this.descText;
    }

    /**
     * Gets the value of the fixedPrePaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isFixedPrePaidInd() {
        return fixedPrePaidInd;
    }

    /**
     * Sets the value of the fixedPrePaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFixedPrePaidInd(Boolean value) {
        this.fixedPrePaidInd = value;
    }

    /**
     * Gets the value of the ruleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BagDisclosureRuleTypeCodeContentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BagDisclosureRuleTypeCodeContentType getRuleTypeCode() {
        return ruleTypeCode;
    }

    /**
     * Sets the value of the ruleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDisclosureRuleTypeCodeContentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRuleTypeCode(BagDisclosureRuleTypeCodeContentType value) {
        this.ruleTypeCode = value;
    }

}

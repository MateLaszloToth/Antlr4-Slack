
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Additional identification and URLs used to further describe a secure payment transaction.
 * 
 * <p>Java class for PaymentTrxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTrxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TextType" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}OrderCreationDeviceType" minOccurs="0"/>
 *         &lt;element name="InputCurCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CurCodeType" minOccurs="0"/>
 *         &lt;element name="MaximumTryInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="NotProcessedInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="OriginalID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="RetryInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="SettlementCurCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CurCodeType" minOccurs="0"/>
 *         &lt;element name="TimestampDateTime" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DateTimeType" minOccurs="0"/>
 *         &lt;element name="TrxDataText" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TextType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="TrxID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="TrxTypeText" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTrxType", propOrder = {
    "descText",
    "device",
    "inputCurCode",
    "maximumTryInd",
    "notProcessedInd",
    "originalID",
    "retryInd",
    "settlementCurCode",
    "timestampDateTime",
    "trxDataText",
    "trxID",
    "trxTypeText"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PaymentTrxType {

    @XmlElement(name = "DescText")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String descText;
    @XmlElement(name = "Device")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected OrderCreationDeviceType device;
    @XmlElement(name = "InputCurCode")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String inputCurCode;
    @XmlElement(name = "MaximumTryInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean maximumTryInd;
    @XmlElement(name = "NotProcessedInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean notProcessedInd;
    @XmlElement(name = "OriginalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String originalID;
    @XmlElement(name = "RetryInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean retryInd;
    @XmlElement(name = "SettlementCurCode")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String settlementCurCode;
    @XmlElement(name = "TimestampDateTime")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar timestampDateTime;
    @XmlElement(name = "TrxDataText")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> trxDataText;
    @XmlElement(name = "TrxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String trxID;
    @XmlElement(name = "TrxTypeText")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String trxTypeText;

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCreationDeviceType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public OrderCreationDeviceType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCreationDeviceType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDevice(OrderCreationDeviceType value) {
        this.device = value;
    }

    /**
     * Gets the value of the inputCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getInputCurCode() {
        return inputCurCode;
    }

    /**
     * Sets the value of the inputCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInputCurCode(String value) {
        this.inputCurCode = value;
    }

    /**
     * Gets the value of the maximumTryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isMaximumTryInd() {
        return maximumTryInd;
    }

    /**
     * Sets the value of the maximumTryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMaximumTryInd(Boolean value) {
        this.maximumTryInd = value;
    }

    /**
     * Gets the value of the notProcessedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isNotProcessedInd() {
        return notProcessedInd;
    }

    /**
     * Sets the value of the notProcessedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNotProcessedInd(Boolean value) {
        this.notProcessedInd = value;
    }

    /**
     * Gets the value of the originalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getOriginalID() {
        return originalID;
    }

    /**
     * Sets the value of the originalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOriginalID(String value) {
        this.originalID = value;
    }

    /**
     * Gets the value of the retryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isRetryInd() {
        return retryInd;
    }

    /**
     * Sets the value of the retryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRetryInd(Boolean value) {
        this.retryInd = value;
    }

    /**
     * Gets the value of the settlementCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSettlementCurCode() {
        return settlementCurCode;
    }

    /**
     * Sets the value of the settlementCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSettlementCurCode(String value) {
        this.settlementCurCode = value;
    }

    /**
     * Gets the value of the timestampDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getTimestampDateTime() {
        return timestampDateTime;
    }

    /**
     * Sets the value of the timestampDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTimestampDateTime(XMLGregorianCalendar value) {
        this.timestampDateTime = value;
    }

    /**
     * Gets the value of the trxDataText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trxDataText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrxDataText().add(newItem);
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
    public List<String> getTrxDataText() {
        if (trxDataText == null) {
            trxDataText = new ArrayList<String>();
        }
        return this.trxDataText;
    }

    /**
     * Gets the value of the trxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTrxID() {
        return trxID;
    }

    /**
     * Sets the value of the trxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTrxID(String value) {
        this.trxID = value;
    }

    /**
     * Gets the value of the trxTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTrxTypeText() {
        return trxTypeText;
    }

    /**
     * Sets the value of the trxTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTrxTypeText(String value) {
        this.trxTypeText = value;
    }

}


package com.kambr.parser.oney.xml.acknowledgement;

import java.math.BigDecimal;
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
 * The IATA_PayloadStdAttributes defines the standard attributes that appear on the root element for all IATA payloads.
 * 
 * <p>Java class for IATA_PayloadStandardAttributesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_PayloadStandardAttributesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AltLangID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}ID_Type" minOccurs="0"/>
 *         &lt;element name="CorrelationID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}ID_Type" minOccurs="0"/>
 *         &lt;element name="PrimaryLangID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}ID_Type" minOccurs="0"/>
 *         &lt;element name="RetransmissionInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}IndType" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}DateTimeType" minOccurs="0"/>
 *         &lt;element name="TrxID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}ID_Type" minOccurs="0"/>
 *         &lt;element name="VersionNumber" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}NumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_PayloadStandardAttributesType", propOrder = {
    "altLangID",
    "correlationID",
    "primaryLangID",
    "retransmissionInd",
    "timestamp",
    "trxID",
    "versionNumber"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class IATAPayloadStandardAttributesType {

    @XmlElement(name = "AltLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String altLangID;
    @XmlElement(name = "CorrelationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String correlationID;
    @XmlElement(name = "PrimaryLangID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String primaryLangID;
    @XmlElement(name = "RetransmissionInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean retransmissionInd;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "TrxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String trxID;
    @XmlElement(name = "VersionNumber")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal versionNumber;

    /**
     * Gets the value of the altLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAltLangID() {
        return altLangID;
    }

    /**
     * Sets the value of the altLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAltLangID(String value) {
        this.altLangID = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the primaryLangID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPrimaryLangID() {
        return primaryLangID;
    }

    /**
     * Sets the value of the primaryLangID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPrimaryLangID(String value) {
        this.primaryLangID = value;
    }

    /**
     * Gets the value of the retransmissionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isRetransmissionInd() {
        return retransmissionInd;
    }

    /**
     * Sets the value of the retransmissionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRetransmissionInd(Boolean value) {
        this.retransmissionInd = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the trxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTrxID(String value) {
        this.trxID = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVersionNumber(BigDecimal value) {
        this.versionNumber = value;
    }

}

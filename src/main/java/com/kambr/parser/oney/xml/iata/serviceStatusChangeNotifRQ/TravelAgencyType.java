
package com.kambr.parser.oney.xml.iata.serviceStatusChangeNotifRQ;

import java.math.BigDecimal;
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
 * A private retailer or public service that provides travel and tourism related services to the public on behalf of suppliers such as activities, airlines, car rentals, cruise lines, hotels, railways, travel insurance, and package tours.
 * 
 * <p>Java class for TravelAgencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelAgencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type"/>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}NumberType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ProperNameType" minOccurs="0"/>
 *         &lt;element name="PseudoCityID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="TravelAgent" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}TravelAgentType" minOccurs="0"/>
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}TravelAgencyTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgencyType", propOrder = {
    "agencyID",
    "contactInfo",
    "iataNumber",
    "name",
    "pseudoCityID",
    "travelAgent",
    "typeCode"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class TravelAgencyType {

    @XmlElement(name = "AgencyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String agencyID;
    @XmlElement(name = "ContactInfo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<ContactInfoType> contactInfo;
    @XmlElement(name = "IATA_Number")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal iataNumber;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(name = "PseudoCityID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pseudoCityID;
    @XmlElement(name = "TravelAgent")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TravelAgentType travelAgent;
    @XmlElement(name = "TypeCode")
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TravelAgencyTypeCodeContentType typeCode;

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAgencyID(String value) {
        this.agencyID = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfoType>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIATANumber(BigDecimal value) {
        this.iataNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pseudoCityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPseudoCityID() {
        return pseudoCityID;
    }

    /**
     * Sets the value of the pseudoCityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPseudoCityID(String value) {
        this.pseudoCityID = value;
    }

    /**
     * Gets the value of the travelAgent property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TravelAgentType getTravelAgent() {
        return travelAgent;
    }

    /**
     * Sets the value of the travelAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTravelAgent(TravelAgentType value) {
        this.travelAgent = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TravelAgencyTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyTypeCodeContentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:26:21-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTypeCode(TravelAgencyTypeCodeContentType value) {
        this.typeCode = value;
    }

}

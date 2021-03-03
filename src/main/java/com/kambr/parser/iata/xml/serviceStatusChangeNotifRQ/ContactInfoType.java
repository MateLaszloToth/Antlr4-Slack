
package com.kambr.parser.iata.xml.serviceStatusChangeNotifRQ;

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
 * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
 * 
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfoID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="ContactPurposeText" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}TextType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="ContactRefusedInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}EmailAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Individual" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}IndividualType" minOccurs="0"/>
 *         &lt;element name="IndividualRefID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="OtherAddress" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}OtherAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}PhoneType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PostalAddress" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}PostalAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelationshipToPax" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "contactInfoID",
    "contactPurposeText",
    "contactRefusedInd",
    "emailAddress",
    "individual",
    "individualRefID",
    "otherAddress",
    "paxSegmentRefID",
    "phone",
    "postalAddress",
    "relationshipToPax"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ContactInfoType {

    @XmlElement(name = "ContactInfoID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String contactInfoID;
    @XmlElement(name = "ContactPurposeText")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> contactPurposeText;
    @XmlElement(name = "ContactRefusedInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean contactRefusedInd;
    @XmlElement(name = "EmailAddress")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<EmailAddressType> emailAddress;
    @XmlElement(name = "Individual")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IndividualType individual;
    @XmlElement(name = "IndividualRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String individualRefID;
    @XmlElement(name = "OtherAddress")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<OtherAddressType> otherAddress;
    @XmlElement(name = "PaxSegmentRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String paxSegmentRefID;
    @XmlElement(name = "Phone")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<PhoneType> phone;
    @XmlElement(name = "PostalAddress")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<PostalAddressType> postalAddress;
    @XmlElement(name = "RelationshipToPax")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String relationshipToPax;

    /**
     * Gets the value of the contactInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getContactInfoID() {
        return contactInfoID;
    }

    /**
     * Sets the value of the contactInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContactInfoID(String value) {
        this.contactInfoID = value;
    }

    /**
     * Gets the value of the contactPurposeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPurposeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPurposeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<String> getContactPurposeText() {
        if (contactPurposeText == null) {
            contactPurposeText = new ArrayList<String>();
        }
        return this.contactPurposeText;
    }

    /**
     * Gets the value of the contactRefusedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isContactRefusedInd() {
        return contactRefusedInd;
    }

    /**
     * Sets the value of the contactRefusedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContactRefusedInd(Boolean value) {
        this.contactRefusedInd = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddressType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<EmailAddressType> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<EmailAddressType>();
        }
        return this.emailAddress;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the individualRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIndividualRefID() {
        return individualRefID;
    }

    /**
     * Sets the value of the individualRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndividualRefID(String value) {
        this.individualRefID = value;
    }

    /**
     * Gets the value of the otherAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAddressType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<OtherAddressType> getOtherAddress() {
        if (otherAddress == null) {
            otherAddress = new ArrayList<OtherAddressType>();
        }
        return this.otherAddress;
    }

    /**
     * Gets the value of the paxSegmentRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPaxSegmentRefID() {
        return paxSegmentRefID;
    }

    /**
     * Sets the value of the paxSegmentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPaxSegmentRefID(String value) {
        this.paxSegmentRefID = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<PostalAddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<PostalAddressType>();
        }
        return this.postalAddress;
    }

    /**
     * Gets the value of the relationshipToPax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getRelationshipToPax() {
        return relationshipToPax;
    }

    /**
     * Sets the value of the relationshipToPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRelationshipToPax(String value) {
        this.relationshipToPax = value;
    }

}

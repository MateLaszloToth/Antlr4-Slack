
package com.kambr.parser.oney.xml.serviceStatusChangeNotifRQ;

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
 * A company that partners with a manufacturer or producer to market and sell the manufacturer's products, services, or technologies.
 * 
 * <p>Java class for RetailPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailPartnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}NameType" minOccurs="0"/>
 *         &lt;element name="RetailPartnerID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_ServiceStatusChangeNotifRQ}ID_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailPartnerType", propOrder = {
    "contactInfo",
    "name",
    "retailPartnerID"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class RetailPartnerType {

    @XmlElement(name = "ContactInfo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<ContactInfoType> contactInfo;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(name = "RetailPartnerID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String retailPartnerID;

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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfoType>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the retailPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getRetailPartnerID() {
        return retailPartnerID;
    }

    /**
     * Sets the value of the retailPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:19:44-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRetailPartnerID(String value) {
        this.retailPartnerID = value;
    }

}
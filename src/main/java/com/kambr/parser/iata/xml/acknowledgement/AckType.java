
package com.kambr.parser.iata.xml.acknowledgement;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Acknowledgement document is a simple notification from party to party acknowledging the receipt of another transaction such as an inventory release or an updated order
 *  
 *  It may also provide information indicating the status of the document.
 *  
 *  This document is used consistently as an optional response to a notification transaction.
 * 
 * <p>Java class for AckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}CodeType" minOccurs="0"/>
 *         &lt;element name="StatusMessageText" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AckType", propOrder = {
    "statusCode",
    "statusMessageText"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class AckType {

    @XmlElement(name = "StatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String statusCode;
    @XmlElement(name = "StatusMessageText")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String statusMessageText;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMessageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStatusMessageText() {
        return statusMessageText;
    }

    /**
     * Sets the value of the statusMessageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatusMessageText(String value) {
        this.statusMessageText = value;
    }

}

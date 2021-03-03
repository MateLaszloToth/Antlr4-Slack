
package com.kambr.parser.oney.xml.acknowledgement;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notification" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}AckType" minOccurs="0"/>
 *         &lt;element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_Acknowledgement}IATA_PayloadStandardAttributesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notification",
    "payloadAttributes"
})
@XmlRootElement(name = "IATA_Acknowledgement")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class IATAAcknowledgement {

    @XmlElement(name = "Notification")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AckType notification;
    @XmlElement(name = "PayloadAttributes")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IATAPayloadStandardAttributesType payloadAttributes;

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link AckType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AckType getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNotification(AckType value) {
        this.notification = value;
    }

    /**
     * Gets the value of the payloadAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IATAPayloadStandardAttributesType getPayloadAttributes() {
        return payloadAttributes;
    }

    /**
     * Sets the value of the payloadAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:17-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPayloadAttributes(IATAPayloadStandardAttributesType value) {
        this.payloadAttributes = value;
    }

}

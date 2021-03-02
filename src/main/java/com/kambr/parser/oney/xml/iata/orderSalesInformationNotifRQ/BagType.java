
package com.kambr.parser.oney.xml.iata.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A piece of luggage associated with a passenger, packed for traveling, and necessary or appropriate in connection with a journey.
 * 
 * <p>Java class for BagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BagDimension" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}BagDimensionType" minOccurs="0"/>
 *         &lt;element name="BagTag" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}BagTagType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagType", propOrder = {
    "bagDimension",
    "bagTag"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class BagType {

    @XmlElement(name = "BagDimension")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BagDimensionType bagDimension;
    @XmlElement(name = "BagTag")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BagTagType bagTag;

    /**
     * Gets the value of the bagDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BagDimensionType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BagDimensionType getBagDimension() {
        return bagDimension;
    }

    /**
     * Sets the value of the bagDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDimensionType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBagDimension(BagDimensionType value) {
        this.bagDimension = value;
    }

    /**
     * Gets the value of the bagTag property.
     * 
     * @return
     *     possible object is
     *     {@link BagTagType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BagTagType getBagTag() {
        return bagTag;
    }

    /**
     * Sets the value of the bagTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagTagType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBagTag(BagTagType value) {
        this.bagTag = value;
    }

}

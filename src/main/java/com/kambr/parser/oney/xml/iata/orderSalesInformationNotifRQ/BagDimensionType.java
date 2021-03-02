
package com.kambr.parser.oney.xml.iata.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A measurable extent of a particular bag, such as length, or height.
 * 
 * <p>Java class for BagDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagDimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeightMeasure" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}LengthMeasureType" minOccurs="0"/>
 *         &lt;element name="LengthMeasure" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}LengthMeasureType" minOccurs="0"/>
 *         &lt;element name="WidthMeasure" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}LengthMeasureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagDimensionType", propOrder = {
    "heightMeasure",
    "lengthMeasure",
    "widthMeasure"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class BagDimensionType {

    @XmlElement(name = "HeightMeasure")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LengthMeasureType heightMeasure;
    @XmlElement(name = "LengthMeasure")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LengthMeasureType lengthMeasure;
    @XmlElement(name = "WidthMeasure")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LengthMeasureType widthMeasure;

    /**
     * Gets the value of the heightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LengthMeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setHeightMeasure(LengthMeasureType value) {
        this.heightMeasure = value;
    }

    /**
     * Gets the value of the lengthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LengthMeasureType getLengthMeasure() {
        return lengthMeasure;
    }

    /**
     * Sets the value of the lengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLengthMeasure(LengthMeasureType value) {
        this.lengthMeasure = value;
    }

    /**
     * Gets the value of the widthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LengthMeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Sets the value of the widthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setWidthMeasure(LengthMeasureType value) {
        this.widthMeasure = value;
    }

}

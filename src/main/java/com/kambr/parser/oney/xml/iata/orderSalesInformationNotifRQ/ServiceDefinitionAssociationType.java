
package com.kambr.parser.oney.xml.iata.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Definition Association Choice to determine if the information of this ServiceDefinition needs to be extended with specific Bag or Seat characteristics or whether the ServiceDefinition is used as a bundle of further ServiceDefinitions.
 * 
 * <p>Java class for ServiceDefinitionAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BaggageAllowanceRef" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}BaggageAllowanceRefType"/>
 *         &lt;element name="SeatProfileRef" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}SeatProfileRefType"/>
 *         &lt;element name="ServiceBundle" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ServiceBundleType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionAssociationType", propOrder = {
    "baggageAllowanceRef",
    "seatProfileRef",
    "serviceBundle"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ServiceDefinitionAssociationType {

    @XmlElement(name = "BaggageAllowanceRef")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BaggageAllowanceRefType baggageAllowanceRef;
    @XmlElement(name = "SeatProfileRef")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected SeatProfileRefType seatProfileRef;
    @XmlElement(name = "ServiceBundle")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ServiceBundleType serviceBundle;

    /**
     * Gets the value of the baggageAllowanceRef property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceRefType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BaggageAllowanceRefType getBaggageAllowanceRef() {
        return baggageAllowanceRef;
    }

    /**
     * Sets the value of the baggageAllowanceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceRefType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBaggageAllowanceRef(BaggageAllowanceRefType value) {
        this.baggageAllowanceRef = value;
    }

    /**
     * Gets the value of the seatProfileRef property.
     * 
     * @return
     *     possible object is
     *     {@link SeatProfileRefType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public SeatProfileRefType getSeatProfileRef() {
        return seatProfileRef;
    }

    /**
     * Sets the value of the seatProfileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatProfileRefType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSeatProfileRef(SeatProfileRefType value) {
        this.seatProfileRef = value;
    }

    /**
     * Gets the value of the serviceBundle property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundleType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ServiceBundleType getServiceBundle() {
        return serviceBundle;
    }

    /**
     * Sets the value of the serviceBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundleType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-02-27T09:21:56-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setServiceBundle(ServiceBundleType value) {
        this.serviceBundle = value;
    }

}

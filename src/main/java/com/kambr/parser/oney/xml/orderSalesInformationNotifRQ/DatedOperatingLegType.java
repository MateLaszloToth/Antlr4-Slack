
package com.kambr.parser.oney.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc. 
 *  Business Identifier Fields:
 *  - (Operating) [Carrier] Airline Designator
 *  - Operating Carrier Flight Number
 *  - Operational Suffix
 *  - [Dated Operating Flight] Flight Identifier Date
 *  - Scheduled Departure Station
 *  - Repeat Number.
 * 
 * <p>Java class for DatedOperatingLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedOperatingLegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TransportArrivalType"/>
 *         &lt;element name="CarrierAircraftType" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CarrierAircraftTypeType" minOccurs="0"/>
 *         &lt;element name="ChangeofGaugeInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="DatedOperatingLegID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ID_Type" minOccurs="0"/>
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TransportDepType"/>
 *         &lt;element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}MeasureType" minOccurs="0"/>
 *         &lt;element name="IATA_AircraftType" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IATA_AircraftTypeType" minOccurs="0"/>
 *         &lt;element name="OnGroundDuration" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedOperatingLegType", propOrder = {
    "arrival",
    "carrierAircraftType",
    "changeofGaugeInd",
    "datedOperatingLegID",
    "dep",
    "distanceMeasure",
    "iataAircraftType",
    "onGroundDuration"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DatedOperatingLegType {

    @XmlElement(name = "Arrival", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TransportArrivalType arrival;
    @XmlElement(name = "CarrierAircraftType")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CarrierAircraftTypeType carrierAircraftType;
    @XmlElement(name = "ChangeofGaugeInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean changeofGaugeInd;
    @XmlElement(name = "DatedOperatingLegID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String datedOperatingLegID;
    @XmlElement(name = "Dep", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TransportDepType dep;
    @XmlElement(name = "DistanceMeasure")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected MeasureType distanceMeasure;
    @XmlElement(name = "IATA_AircraftType")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IATAAircraftTypeType iataAircraftType;
    @XmlElement(name = "OnGroundDuration")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Duration onGroundDuration;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link TransportArrivalType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TransportArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportArrivalType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setArrival(TransportArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the carrierAircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAircraftTypeType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CarrierAircraftTypeType getCarrierAircraftType() {
        return carrierAircraftType;
    }

    /**
     * Sets the value of the carrierAircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAircraftTypeType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCarrierAircraftType(CarrierAircraftTypeType value) {
        this.carrierAircraftType = value;
    }

    /**
     * Gets the value of the changeofGaugeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isChangeofGaugeInd() {
        return changeofGaugeInd;
    }

    /**
     * Sets the value of the changeofGaugeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setChangeofGaugeInd(Boolean value) {
        this.changeofGaugeInd = value;
    }

    /**
     * Gets the value of the datedOperatingLegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDatedOperatingLegID() {
        return datedOperatingLegID;
    }

    /**
     * Sets the value of the datedOperatingLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDatedOperatingLegID(String value) {
        this.datedOperatingLegID = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDepType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TransportDepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDepType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDep(TransportDepType value) {
        this.dep = value;
    }

    /**
     * Gets the value of the distanceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public MeasureType getDistanceMeasure() {
        return distanceMeasure;
    }

    /**
     * Sets the value of the distanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDistanceMeasure(MeasureType value) {
        this.distanceMeasure = value;
    }

    /**
     * Gets the value of the iataAircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link IATAAircraftTypeType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IATAAircraftTypeType getIATAAircraftType() {
        return iataAircraftType;
    }

    /**
     * Sets the value of the iataAircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAircraftTypeType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIATAAircraftType(IATAAircraftTypeType value) {
        this.iataAircraftType = value;
    }

    /**
     * Gets the value of the onGroundDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Duration getOnGroundDuration() {
        return onGroundDuration;
    }

    /**
     * Sets the value of the onGroundDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOnGroundDuration(Duration value) {
        this.onGroundDuration = value;
    }

}

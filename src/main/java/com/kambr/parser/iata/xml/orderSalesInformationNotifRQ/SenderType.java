
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information related to the party sending this message
 * 
 * <p>Java class for SenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Aggregator" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}AggregatorType"/>
 *         &lt;element name="Corporation" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CorporationType"/>
 *         &lt;element name="EnabledSystem" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}EnabledSystemType"/>
 *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CarrierType"/>
 *         &lt;element name="OperatingCarrier" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CarrierType"/>
 *         &lt;element name="ORA" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CarrierType"/>
 *         &lt;element name="POA" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CarrierType"/>
 *         &lt;element name="RetailPartner" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}RetailPartnerType"/>
 *         &lt;element name="TravelAgency" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TravelAgencyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenderType", propOrder = {
    "aggregator",
    "corporation",
    "enabledSystem",
    "marketingCarrier",
    "operatingCarrier",
    "ora",
    "poa",
    "retailPartner",
    "travelAgency"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SenderType {

    @XmlElement(name = "Aggregator")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected AggregatorType aggregator;
    @XmlElement(name = "Corporation")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CorporationType corporation;
    @XmlElement(name = "EnabledSystem")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected EnabledSystemType enabledSystem;
    @XmlElement(name = "MarketingCarrier")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CarrierType marketingCarrier;
    @XmlElement(name = "OperatingCarrier")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CarrierType operatingCarrier;
    @XmlElement(name = "ORA")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CarrierType ora;
    @XmlElement(name = "POA")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CarrierType poa;
    @XmlElement(name = "RetailPartner")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected RetailPartnerType retailPartner;
    @XmlElement(name = "TravelAgency")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TravelAgencyType travelAgency;

    /**
     * Gets the value of the aggregator property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public AggregatorType getAggregator() {
        return aggregator;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAggregator(AggregatorType value) {
        this.aggregator = value;
    }

    /**
     * Gets the value of the corporation property.
     * 
     * @return
     *     possible object is
     *     {@link CorporationType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CorporationType getCorporation() {
        return corporation;
    }

    /**
     * Sets the value of the corporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporationType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCorporation(CorporationType value) {
        this.corporation = value;
    }

    /**
     * Gets the value of the enabledSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledSystemType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public EnabledSystemType getEnabledSystem() {
        return enabledSystem;
    }

    /**
     * Sets the value of the enabledSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledSystemType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEnabledSystem(EnabledSystemType value) {
        this.enabledSystem = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CarrierType getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMarketingCarrier(CarrierType value) {
        this.marketingCarrier = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CarrierType getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOperatingCarrier(CarrierType value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the ora property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CarrierType getORA() {
        return ora;
    }

    /**
     * Sets the value of the ora property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setORA(CarrierType value) {
        this.ora = value;
    }

    /**
     * Gets the value of the poa property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CarrierType getPOA() {
        return poa;
    }

    /**
     * Sets the value of the poa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPOA(CarrierType value) {
        this.poa = value;
    }

    /**
     * Gets the value of the retailPartner property.
     * 
     * @return
     *     possible object is
     *     {@link RetailPartnerType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public RetailPartnerType getRetailPartner() {
        return retailPartner;
    }

    /**
     * Sets the value of the retailPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailPartnerType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRetailPartner(RetailPartnerType value) {
        this.retailPartner = value;
    }

    /**
     * Gets the value of the travelAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public TravelAgencyType getTravelAgency() {
        return travelAgency;
    }

    /**
     * Sets the value of the travelAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTravelAgency(TravelAgencyType value) {
        this.travelAgency = value;
    }

}

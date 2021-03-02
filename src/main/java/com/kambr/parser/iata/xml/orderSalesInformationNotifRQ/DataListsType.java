
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data List definition for this message.
 * 
 * <p>Java class for DataListsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataListsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaggageAllowanceList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}BaggageAllowanceListType" minOccurs="0"/>
 *         &lt;element name="BaggageDisclosureList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}BaggageDisclosureListType" minOccurs="0"/>
 *         &lt;element name="ContactInfoList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ContactInfoListType" minOccurs="0"/>
 *         &lt;element name="DisclosureList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DisclosureListType" minOccurs="0"/>
 *         &lt;element name="FareList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}FareListType" minOccurs="0"/>
 *         &lt;element name="MediaList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}MediaListType" minOccurs="0"/>
 *         &lt;element name="OriginDestList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}OriginDestListType" minOccurs="0"/>
 *         &lt;element name="PaxJourneyList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PaxJourneyListType" minOccurs="0"/>
 *         &lt;element name="PaxList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PaxListType" minOccurs="0"/>
 *         &lt;element name="PaxSegmentList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PaxSegmentListType" minOccurs="0"/>
 *         &lt;element name="PenaltyList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PenaltyListType" minOccurs="0"/>
 *         &lt;element name="PriceClassList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}PriceClassListType" minOccurs="0"/>
 *         &lt;element name="SeatProfileList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}SeatProfileListType" minOccurs="0"/>
 *         &lt;element name="ServiceDefinitionList" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ServiceDefinitionListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataListsType", propOrder = {
    "baggageAllowanceList",
    "baggageDisclosureList",
    "contactInfoList",
    "disclosureList",
    "fareList",
    "mediaList",
    "originDestList",
    "paxJourneyList",
    "paxList",
    "paxSegmentList",
    "penaltyList",
    "priceClassList",
    "seatProfileList",
    "serviceDefinitionList"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class DataListsType {

    @XmlElement(name = "BaggageAllowanceList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BaggageAllowanceListType baggageAllowanceList;
    @XmlElement(name = "BaggageDisclosureList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BaggageDisclosureListType baggageDisclosureList;
    @XmlElement(name = "ContactInfoList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ContactInfoListType contactInfoList;
    @XmlElement(name = "DisclosureList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DisclosureListType disclosureList;
    @XmlElement(name = "FareList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected FareListType fareList;
    @XmlElement(name = "MediaList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected MediaListType mediaList;
    @XmlElement(name = "OriginDestList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected OriginDestListType originDestList;
    @XmlElement(name = "PaxJourneyList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PaxJourneyListType paxJourneyList;
    @XmlElement(name = "PaxList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PaxListType paxList;
    @XmlElement(name = "PaxSegmentList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PaxSegmentListType paxSegmentList;
    @XmlElement(name = "PenaltyList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PenaltyListType penaltyList;
    @XmlElement(name = "PriceClassList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PriceClassListType priceClassList;
    @XmlElement(name = "SeatProfileList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected SeatProfileListType seatProfileList;
    @XmlElement(name = "ServiceDefinitionList")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ServiceDefinitionListType serviceDefinitionList;

    /**
     * Gets the value of the baggageAllowanceList property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BaggageAllowanceListType getBaggageAllowanceList() {
        return baggageAllowanceList;
    }

    /**
     * Sets the value of the baggageAllowanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBaggageAllowanceList(BaggageAllowanceListType value) {
        this.baggageAllowanceList = value;
    }

    /**
     * Gets the value of the baggageDisclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDisclosureListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BaggageDisclosureListType getBaggageDisclosureList() {
        return baggageDisclosureList;
    }

    /**
     * Sets the value of the baggageDisclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDisclosureListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBaggageDisclosureList(BaggageDisclosureListType value) {
        this.baggageDisclosureList = value;
    }

    /**
     * Gets the value of the contactInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ContactInfoListType getContactInfoList() {
        return contactInfoList;
    }

    /**
     * Sets the value of the contactInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContactInfoList(ContactInfoListType value) {
        this.contactInfoList = value;
    }

    /**
     * Gets the value of the disclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DisclosureListType getDisclosureList() {
        return disclosureList;
    }

    /**
     * Sets the value of the disclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDisclosureList(DisclosureListType value) {
        this.disclosureList = value;
    }

    /**
     * Gets the value of the fareList property.
     * 
     * @return
     *     possible object is
     *     {@link FareListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public FareListType getFareList() {
        return fareList;
    }

    /**
     * Sets the value of the fareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setFareList(FareListType value) {
        this.fareList = value;
    }

    /**
     * Gets the value of the mediaList property.
     * 
     * @return
     *     possible object is
     *     {@link MediaListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public MediaListType getMediaList() {
        return mediaList;
    }

    /**
     * Sets the value of the mediaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMediaList(MediaListType value) {
        this.mediaList = value;
    }

    /**
     * Gets the value of the originDestList property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public OriginDestListType getOriginDestList() {
        return originDestList;
    }

    /**
     * Sets the value of the originDestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOriginDestList(OriginDestListType value) {
        this.originDestList = value;
    }

    /**
     * Gets the value of the paxJourneyList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxJourneyListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PaxJourneyListType getPaxJourneyList() {
        return paxJourneyList;
    }

    /**
     * Sets the value of the paxJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxJourneyListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPaxJourneyList(PaxJourneyListType value) {
        this.paxJourneyList = value;
    }

    /**
     * Gets the value of the paxList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PaxListType getPaxList() {
        return paxList;
    }

    /**
     * Sets the value of the paxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPaxList(PaxListType value) {
        this.paxList = value;
    }

    /**
     * Gets the value of the paxSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxSegmentListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PaxSegmentListType getPaxSegmentList() {
        return paxSegmentList;
    }

    /**
     * Sets the value of the paxSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxSegmentListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPaxSegmentList(PaxSegmentListType value) {
        this.paxSegmentList = value;
    }

    /**
     * Gets the value of the penaltyList property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PenaltyListType getPenaltyList() {
        return penaltyList;
    }

    /**
     * Sets the value of the penaltyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPenaltyList(PenaltyListType value) {
        this.penaltyList = value;
    }

    /**
     * Gets the value of the priceClassList property.
     * 
     * @return
     *     possible object is
     *     {@link PriceClassListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PriceClassListType getPriceClassList() {
        return priceClassList;
    }

    /**
     * Sets the value of the priceClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceClassListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPriceClassList(PriceClassListType value) {
        this.priceClassList = value;
    }

    /**
     * Gets the value of the seatProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link SeatProfileListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public SeatProfileListType getSeatProfileList() {
        return seatProfileList;
    }

    /**
     * Sets the value of the seatProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatProfileListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSeatProfileList(SeatProfileListType value) {
        this.seatProfileList = value;
    }

    /**
     * Gets the value of the serviceDefinitionList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ServiceDefinitionListType getServiceDefinitionList() {
        return serviceDefinitionList;
    }

    /**
     * Sets the value of the serviceDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionListType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setServiceDefinitionList(ServiceDefinitionListType value) {
        this.serviceDefinitionList = value;
    }

}

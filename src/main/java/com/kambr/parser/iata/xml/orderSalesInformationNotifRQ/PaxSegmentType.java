
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

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
import javax.xml.datatype.Duration;


/**
 * Transportation of a passenger on a Dated Operating Segment.
 *  - [Dated Marketing Segment] (All identifying fields)
 *  - [Order] Order ID
 *  - [Individual] (no identifier available)
 * 
 * <p>Java class for PaxSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ARNK_Ind" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TransportArrivalType"/>
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}CabinTypeType" minOccurs="0"/>
 *         &lt;element name="DatedOperatingLeg" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DatedOperatingLegType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}TransportDepType"/>
 *         &lt;element name="Duration" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DurationType" minOccurs="0"/>
 *         &lt;element name="InterlineSettlementInfo" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}InterlineSettlementInfoType" minOccurs="0"/>
 *         &lt;element name="MarketingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DatedMarketingSegmentType"/>
 *         &lt;element name="OperatingCarrierInfo" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}DatedOperatingSegmentType" minOccurs="0"/>
 *         &lt;element name="PaxSegmentID" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}ID_Type"/>
 *         &lt;element name="SecureFlightInd" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}IndType" minOccurs="0"/>
 *         &lt;element name="SegmentTypeCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}SegmentTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentType", propOrder = {
    "arnkInd",
    "arrival",
    "cabinType",
    "datedOperatingLeg",
    "dep",
    "duration",
    "interlineSettlementInfo",
    "marketingCarrierInfo",
    "operatingCarrierInfo",
    "paxSegmentID",
    "secureFlightInd",
    "segmentTypeCode"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class PaxSegmentType {

    @XmlElement(name = "ARNK_Ind")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean arnkInd;
    @XmlElement(name = "Arrival", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TransportArrivalType arrival;
    @XmlElement(name = "CabinType")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CabinTypeType cabinType;
    @XmlElement(name = "DatedOperatingLeg")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<DatedOperatingLegType> datedOperatingLeg;
    @XmlElement(name = "Dep", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected TransportDepType dep;
    @XmlElement(name = "Duration")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Duration duration;
    @XmlElement(name = "InterlineSettlementInfo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected InterlineSettlementInfoType interlineSettlementInfo;
    @XmlElement(name = "MarketingCarrierInfo", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DatedMarketingSegmentType marketingCarrierInfo;
    @XmlElement(name = "OperatingCarrierInfo")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DatedOperatingSegmentType operatingCarrierInfo;
    @XmlElement(name = "PaxSegmentID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String paxSegmentID;
    @XmlElement(name = "SecureFlightInd")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Boolean secureFlightInd;
    @XmlElement(name = "SegmentTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String segmentTypeCode;

    /**
     * Gets the value of the arnkInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isARNKInd() {
        return arnkInd;
    }

    /**
     * Sets the value of the arnkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setARNKInd(Boolean value) {
        this.arnkInd = value;
    }

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
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CabinTypeType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCabinType(CabinTypeType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the datedOperatingLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedOperatingLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedOperatingLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedOperatingLegType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<DatedOperatingLegType> getDatedOperatingLeg() {
        if (datedOperatingLeg == null) {
            datedOperatingLeg = new ArrayList<DatedOperatingLegType>();
        }
        return this.datedOperatingLeg;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the interlineSettlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public InterlineSettlementInfoType getInterlineSettlementInfo() {
        return interlineSettlementInfo;
    }

    /**
     * Sets the value of the interlineSettlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineSettlementInfoType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInterlineSettlementInfo(InterlineSettlementInfoType value) {
        this.interlineSettlementInfo = value;
    }

    /**
     * Gets the value of the marketingCarrierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DatedMarketingSegmentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DatedMarketingSegmentType getMarketingCarrierInfo() {
        return marketingCarrierInfo;
    }

    /**
     * Sets the value of the marketingCarrierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedMarketingSegmentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMarketingCarrierInfo(DatedMarketingSegmentType value) {
        this.marketingCarrierInfo = value;
    }

    /**
     * Gets the value of the operatingCarrierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingSegmentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DatedOperatingSegmentType getOperatingCarrierInfo() {
        return operatingCarrierInfo;
    }

    /**
     * Sets the value of the operatingCarrierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingSegmentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOperatingCarrierInfo(DatedOperatingSegmentType value) {
        this.operatingCarrierInfo = value;
    }

    /**
     * Gets the value of the paxSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPaxSegmentID() {
        return paxSegmentID;
    }

    /**
     * Sets the value of the paxSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPaxSegmentID(String value) {
        this.paxSegmentID = value;
    }

    /**
     * Gets the value of the secureFlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Boolean isSecureFlightInd() {
        return secureFlightInd;
    }

    /**
     * Sets the value of the secureFlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSecureFlightInd(Boolean value) {
        this.secureFlightInd = value;
    }

    /**
     * Gets the value of the segmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getSegmentTypeCode() {
        return segmentTypeCode;
    }

    /**
     * Sets the value of the segmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSegmentTypeCode(String value) {
        this.segmentTypeCode = value;
    }

}

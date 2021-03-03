
package com.kambr.parser.iata.xml.orderSalesInformationNotifRQ;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A numeric value determining a length (linear dimension) along with the specified unit of measure.
 * 
 * <p>Java class for LengthMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LengthMeasureType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="UnitCode" type="{http://www.iata.org/IATA/2015/00/2020.2/IATA_OrderSalesInformationNotifRQ}LengthUnitCodeContentType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthMeasureType", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class LengthMeasureType {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal value;
    @XmlAttribute(name = "UnitCode")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected LengthUnitCodeContentType unitCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnitCodeContentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public LengthUnitCodeContentType getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnitCodeContentType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-03-02T11:18:58-08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUnitCode(LengthUnitCodeContentType value) {
        this.unitCode = value;
    }

}


package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubCategoryBytDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubCategoryBytDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Disposition11" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Disposition21" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Disposition31" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Disposition41" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Disposition51" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DispositionGarsoniera" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DispositionGreaterThan51" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCategoryBytDTO", propOrder = {
    "disposition11",
    "disposition21",
    "disposition31",
    "disposition41",
    "disposition51",
    "dispositionGarsoniera",
    "dispositionGreaterThan51"
})
public class SubCategoryBytDTO {

    @XmlElement(name = "Disposition11")
    protected Boolean disposition11;
    @XmlElement(name = "Disposition21")
    protected Boolean disposition21;
    @XmlElement(name = "Disposition31")
    protected Boolean disposition31;
    @XmlElement(name = "Disposition41")
    protected Boolean disposition41;
    @XmlElement(name = "Disposition51")
    protected Boolean disposition51;
    @XmlElement(name = "DispositionGarsoniera")
    protected Boolean dispositionGarsoniera;
    @XmlElement(name = "DispositionGreaterThan51")
    protected Boolean dispositionGreaterThan51;

    /**
     * Gets the value of the disposition11 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisposition11() {
        return disposition11;
    }

    /**
     * Sets the value of the disposition11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisposition11(Boolean value) {
        this.disposition11 = value;
    }

    /**
     * Gets the value of the disposition21 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisposition21() {
        return disposition21;
    }

    /**
     * Sets the value of the disposition21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisposition21(Boolean value) {
        this.disposition21 = value;
    }

    /**
     * Gets the value of the disposition31 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisposition31() {
        return disposition31;
    }

    /**
     * Sets the value of the disposition31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisposition31(Boolean value) {
        this.disposition31 = value;
    }

    /**
     * Gets the value of the disposition41 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisposition41() {
        return disposition41;
    }

    /**
     * Sets the value of the disposition41 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisposition41(Boolean value) {
        this.disposition41 = value;
    }

    /**
     * Gets the value of the disposition51 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisposition51() {
        return disposition51;
    }

    /**
     * Sets the value of the disposition51 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisposition51(Boolean value) {
        this.disposition51 = value;
    }

    /**
     * Gets the value of the dispositionGarsoniera property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispositionGarsoniera() {
        return dispositionGarsoniera;
    }

    /**
     * Sets the value of the dispositionGarsoniera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispositionGarsoniera(Boolean value) {
        this.dispositionGarsoniera = value;
    }

    /**
     * Gets the value of the dispositionGreaterThan51 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDispositionGreaterThan51() {
        return dispositionGreaterThan51;
    }

    /**
     * Sets the value of the dispositionGreaterThan51 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDispositionGreaterThan51(Boolean value) {
        this.dispositionGreaterThan51 = value;
    }

}

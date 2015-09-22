
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubCategoryKomercniProstorDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubCategoryKomercniProstorDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Obchodni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sklad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Vyroba" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCategoryKomercniProstorDTO", propOrder = {
    "obchodni",
    "sklad",
    "vyroba"
})
public class SubCategoryKomercniProstorDTO {

    @XmlElement(name = "Obchodni")
    protected Boolean obchodni;
    @XmlElement(name = "Sklad")
    protected Boolean sklad;
    @XmlElement(name = "Vyroba")
    protected Boolean vyroba;

    /**
     * Gets the value of the obchodni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObchodni() {
        return obchodni;
    }

    /**
     * Sets the value of the obchodni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObchodni(Boolean value) {
        this.obchodni = value;
    }

    /**
     * Gets the value of the sklad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSklad() {
        return sklad;
    }

    /**
     * Sets the value of the sklad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSklad(Boolean value) {
        this.sklad = value;
    }

    /**
     * Gets the value of the vyroba property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVyroba() {
        return vyroba;
    }

    /**
     * Sets the value of the vyroba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVyroba(Boolean value) {
        this.vyroba = value;
    }

}

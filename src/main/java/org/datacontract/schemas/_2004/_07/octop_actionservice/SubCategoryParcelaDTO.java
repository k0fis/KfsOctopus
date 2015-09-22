
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubCategoryParcelaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubCategoryParcelaDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ostatni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Stavebni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCategoryParcelaDTO", propOrder = {
    "ostatni",
    "stavebni"
})
public class SubCategoryParcelaDTO {

    @XmlElement(name = "Ostatni")
    protected Boolean ostatni;
    @XmlElement(name = "Stavebni")
    protected Boolean stavebni;

    /**
     * Gets the value of the ostatni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOstatni() {
        return ostatni;
    }

    /**
     * Sets the value of the ostatni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOstatni(Boolean value) {
        this.ostatni = value;
    }

    /**
     * Gets the value of the stavebni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStavebni() {
        return stavebni;
    }

    /**
     * Sets the value of the stavebni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStavebni(Boolean value) {
        this.stavebni = value;
    }

}

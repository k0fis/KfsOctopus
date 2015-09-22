
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tSearchProfileRegionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSearchProfileRegionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSearchProfile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSearchProfileRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSubRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSearchProfileRegionDTO", propOrder = {
    "idRegion",
    "idSearchProfile",
    "idSearchProfileRegion",
    "idSubRegion"
})
public class TSearchProfileRegionDTO {

    @XmlElement(name = "IdRegion")
    protected Integer idRegion;
    @XmlElement(name = "IdSearchProfile")
    protected Integer idSearchProfile;
    @XmlElement(name = "IdSearchProfileRegion")
    protected Integer idSearchProfileRegion;
    @XmlElementRef(name = "IdSubRegion", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idSubRegion;

    /**
     * Gets the value of the idRegion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRegion() {
        return idRegion;
    }

    /**
     * Sets the value of the idRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRegion(Integer value) {
        this.idRegion = value;
    }

    /**
     * Gets the value of the idSearchProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSearchProfile() {
        return idSearchProfile;
    }

    /**
     * Sets the value of the idSearchProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSearchProfile(Integer value) {
        this.idSearchProfile = value;
    }

    /**
     * Gets the value of the idSearchProfileRegion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSearchProfileRegion() {
        return idSearchProfileRegion;
    }

    /**
     * Sets the value of the idSearchProfileRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSearchProfileRegion(Integer value) {
        this.idSearchProfileRegion = value;
    }

    /**
     * Gets the value of the idSubRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdSubRegion() {
        return idSubRegion;
    }

    /**
     * Sets the value of the idSubRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdSubRegion(JAXBElement<Integer> value) {
        this.idSubRegion = value;
    }

}

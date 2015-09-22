
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tSearchProfileCategoryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSearchProfileCategoryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommercialMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSearchProfile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSearchProfileCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSearchProfileCategoryDTO", propOrder = {
    "commercialMode",
    "idCategory",
    "idSearchProfile",
    "idSearchProfileCategory",
    "subCategory"
})
public class TSearchProfileCategoryDTO {

    @XmlElement(name = "CommercialMode")
    protected Integer commercialMode;
    @XmlElement(name = "IdCategory")
    protected Integer idCategory;
    @XmlElement(name = "IdSearchProfile")
    protected Integer idSearchProfile;
    @XmlElement(name = "IdSearchProfileCategory")
    protected Integer idSearchProfileCategory;
    @XmlElementRef(name = "SubCategory", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subCategory;

    /**
     * Gets the value of the commercialMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommercialMode() {
        return commercialMode;
    }

    /**
     * Sets the value of the commercialMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommercialMode(Integer value) {
        this.commercialMode = value;
    }

    /**
     * Gets the value of the idCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCategory() {
        return idCategory;
    }

    /**
     * Sets the value of the idCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCategory(Integer value) {
        this.idCategory = value;
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
     * Gets the value of the idSearchProfileCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSearchProfileCategory() {
        return idSearchProfileCategory;
    }

    /**
     * Sets the value of the idSearchProfileCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSearchProfileCategory(Integer value) {
        this.idSearchProfileCategory = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubCategory(JAXBElement<Integer> value) {
        this.subCategory = value;
    }

}

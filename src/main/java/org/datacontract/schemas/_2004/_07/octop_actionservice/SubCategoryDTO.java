
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubCategoryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubCategoryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSubCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubCategoryAbbrev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubCategoryDTO", propOrder = {
    "idCategory",
    "idSubCategory",
    "subCategory",
    "subCategoryAbbrev",
    "subCategoryName"
})
public class SubCategoryDTO {

    @XmlElement(name = "IdCategory")
    protected Integer idCategory;
    @XmlElement(name = "IdSubCategory")
    protected Integer idSubCategory;
    @XmlElement(name = "SubCategory")
    protected Integer subCategory;
    @XmlElementRef(name = "SubCategoryAbbrev", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subCategoryAbbrev;
    @XmlElementRef(name = "SubCategoryName", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subCategoryName;

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
     * Gets the value of the idSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSubCategory() {
        return idSubCategory;
    }

    /**
     * Sets the value of the idSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSubCategory(Integer value) {
        this.idSubCategory = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubCategory(Integer value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the subCategoryAbbrev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubCategoryAbbrev() {
        return subCategoryAbbrev;
    }

    /**
     * Sets the value of the subCategoryAbbrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubCategoryAbbrev(JAXBElement<String> value) {
        this.subCategoryAbbrev = value;
    }

    /**
     * Gets the value of the subCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubCategoryName() {
        return subCategoryName;
    }

    /**
     * Sets the value of the subCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubCategoryName(JAXBElement<String> value) {
        this.subCategoryName = value;
    }

}


package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributeCategoryIdDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributeCategoryIdDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}CategoryDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributeCategoryIdDTO", propOrder = {
    "category"
})
public class PairingAttributeCategoryIdDTO
    extends PairingAttributeDTO
{

    @XmlElementRef(name = "Category", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<CategoryDTO> category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CategoryDTO }{@code >}
     *     
     */
    public JAXBElement<CategoryDTO> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CategoryDTO }{@code >}
     *     
     */
    public void setCategory(JAXBElement<CategoryDTO> value) {
        this.category = value;
    }

}

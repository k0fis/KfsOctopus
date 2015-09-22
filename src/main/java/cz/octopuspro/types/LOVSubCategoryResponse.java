
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfSubCategoryDTO;


/**
 * <p>Java class for LOV_SubCategoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_SubCategoryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubCategories" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOfSubCategoryDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_SubCategoryResponse", propOrder = {
    "subCategories"
})
public class LOVSubCategoryResponse
    extends ResponseBase
{

    @XmlElementRef(name = "SubCategories", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubCategoryDTO> subCategories;

    /**
     * Gets the value of the subCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubCategoryDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSubCategoryDTO> getSubCategories() {
        return subCategories;
    }

    /**
     * Sets the value of the subCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubCategoryDTO }{@code >}
     *     
     */
    public void setSubCategories(JAXBElement<ArrayOfSubCategoryDTO> value) {
        this.subCategories = value;
    }

}

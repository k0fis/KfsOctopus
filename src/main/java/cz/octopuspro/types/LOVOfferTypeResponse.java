
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfOfferTypeDTO;


/**
 * <p>Java class for LOV_OfferTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_OfferTypeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferTypes" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOfOfferTypeDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_OfferTypeResponse", propOrder = {
    "offerTypes"
})
public class LOVOfferTypeResponse
    extends ResponseBase
{

    @XmlElementRef(name = "OfferTypes", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOfferTypeDTO> offerTypes;

    /**
     * Gets the value of the offerTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOfferTypeDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOfferTypeDTO> getOfferTypes() {
        return offerTypes;
    }

    /**
     * Sets the value of the offerTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOfferTypeDTO }{@code >}
     *     
     */
    public void setOfferTypes(JAXBElement<ArrayOfOfferTypeDTO> value) {
        this.offerTypes = value;
    }

}

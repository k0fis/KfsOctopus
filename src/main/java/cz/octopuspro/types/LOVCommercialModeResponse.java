
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfCommercialModeDTO;


/**
 * <p>Java class for LOV_CommercialModeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_CommercialModeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommercialModes" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOfCommercialModeDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_CommercialModeResponse", propOrder = {
    "commercialModes"
})
public class LOVCommercialModeResponse
    extends ResponseBase
{

    @XmlElementRef(name = "CommercialModes", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommercialModeDTO> commercialModes;

    /**
     * Gets the value of the commercialModes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommercialModeDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCommercialModeDTO> getCommercialModes() {
        return commercialModes;
    }

    /**
     * Sets the value of the commercialModes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCommercialModeDTO }{@code >}
     *     
     */
    public void setCommercialModes(JAXBElement<ArrayOfCommercialModeDTO> value) {
        this.commercialModes = value;
    }

}

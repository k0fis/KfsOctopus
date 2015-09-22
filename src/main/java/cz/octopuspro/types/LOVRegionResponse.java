
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfRegionDTO;


/**
 * <p>Java class for LOV_RegionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_RegionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Regions" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOfRegionDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_RegionResponse", propOrder = {
    "regions"
})
public class LOVRegionResponse
    extends ResponseBase
{

    @XmlElementRef(name = "Regions", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRegionDTO> regions;

    /**
     * Gets the value of the regions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegionDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRegionDTO> getRegions() {
        return regions;
    }

    /**
     * Sets the value of the regions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRegionDTO }{@code >}
     *     
     */
    public void setRegions(JAXBElement<ArrayOfRegionDTO> value) {
        this.regions = value;
    }

}

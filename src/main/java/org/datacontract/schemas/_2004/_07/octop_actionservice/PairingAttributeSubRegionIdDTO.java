
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributeSubRegionIdDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributeSubRegionIdDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubRegions" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOfSubRegionDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributeSubRegionIdDTO", propOrder = {
    "subRegions"
})
public class PairingAttributeSubRegionIdDTO
    extends PairingAttributeDTO
{

    @XmlElementRef(name = "SubRegions", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSubRegionDTO> subRegions;

    /**
     * Gets the value of the subRegions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubRegionDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSubRegionDTO> getSubRegions() {
        return subRegions;
    }

    /**
     * Sets the value of the subRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSubRegionDTO }{@code >}
     *     
     */
    public void setSubRegions(JAXBElement<ArrayOfSubRegionDTO> value) {
        this.subRegions = value;
    }

}

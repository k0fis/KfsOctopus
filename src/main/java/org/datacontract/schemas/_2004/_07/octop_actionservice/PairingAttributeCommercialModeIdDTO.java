
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributeCommercialModeIdDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributeCommercialModeIdDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommercialMode" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}CommercialModeDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributeCommercialModeIdDTO", propOrder = {
    "commercialMode"
})
public class PairingAttributeCommercialModeIdDTO
    extends PairingAttributeDTO
{

    @XmlElementRef(name = "CommercialMode", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<CommercialModeDTO> commercialMode;

    /**
     * Gets the value of the commercialMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommercialModeDTO }{@code >}
     *     
     */
    public JAXBElement<CommercialModeDTO> getCommercialMode() {
        return commercialMode;
    }

    /**
     * Sets the value of the commercialMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommercialModeDTO }{@code >}
     *     
     */
    public void setCommercialMode(JAXBElement<CommercialModeDTO> value) {
        this.commercialMode = value;
    }

}

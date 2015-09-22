
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributeOwnershipIdDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributeOwnershipIdDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ownership" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}OwnershipDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributeOwnershipIdDTO", propOrder = {
    "ownership"
})
public class PairingAttributeOwnershipIdDTO
    extends PairingAttributeDTO
{

    @XmlElementRef(name = "Ownership", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<OwnershipDTO> ownership;

    /**
     * Gets the value of the ownership property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OwnershipDTO }{@code >}
     *     
     */
    public JAXBElement<OwnershipDTO> getOwnership() {
        return ownership;
    }

    /**
     * Sets the value of the ownership property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OwnershipDTO }{@code >}
     *     
     */
    public void setOwnership(JAXBElement<OwnershipDTO> value) {
        this.ownership = value;
    }

}

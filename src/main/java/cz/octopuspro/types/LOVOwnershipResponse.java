
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfOwnershipDTO;


/**
 * <p>Java class for LOV_OwnershipResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_OwnershipResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ownerships" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOfOwnershipDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_OwnershipResponse", propOrder = {
    "ownerships"
})
public class LOVOwnershipResponse
    extends ResponseBase
{

    @XmlElementRef(name = "Ownerships", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOwnershipDTO> ownerships;

    /**
     * Gets the value of the ownerships property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOwnershipDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOwnershipDTO> getOwnerships() {
        return ownerships;
    }

    /**
     * Sets the value of the ownerships property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOwnershipDTO }{@code >}
     *     
     */
    public void setOwnerships(JAXBElement<ArrayOfOwnershipDTO> value) {
        this.ownerships = value;
    }

}

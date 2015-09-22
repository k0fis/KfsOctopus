
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOftSearchProfileDTO;


/**
 * <p>Java class for tSearchProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSearchProfileResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tSearchProfiles" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOftSearchProfileDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSearchProfileResponse", propOrder = {
    "tSearchProfiles"
})
public class TSearchProfileResponse
    extends ResponseBase
{

    @XmlElementRef(name = "tSearchProfiles", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOftSearchProfileDTO> tSearchProfiles;

    /**
     * Gets the value of the tSearchProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftSearchProfileDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOftSearchProfileDTO> getTSearchProfiles() {
        return tSearchProfiles;
    }

    /**
     * Sets the value of the tSearchProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftSearchProfileDTO }{@code >}
     *     
     */
    public void setTSearchProfiles(JAXBElement<ArrayOftSearchProfileDTO> value) {
        this.tSearchProfiles = value;
    }

}

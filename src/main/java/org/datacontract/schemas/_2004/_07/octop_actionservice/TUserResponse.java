
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.ResponseBase;


/**
 * <p>Java class for tUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tUserResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tUsers" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOftUserDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUserResponse", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.Message", propOrder = {
    "tUsers"
})
public class TUserResponse
    extends ResponseBase
{

    @XmlElementRef(name = "tUsers", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.Message", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOftUserDTO> tUsers;

    /**
     * Gets the value of the tUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftUserDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOftUserDTO> getTUsers() {
        return tUsers;
    }

    /**
     * Sets the value of the tUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftUserDTO }{@code >}
     *     
     */
    public void setTUsers(JAXBElement<ArrayOftUserDTO> value) {
        this.tUsers = value;
    }

}

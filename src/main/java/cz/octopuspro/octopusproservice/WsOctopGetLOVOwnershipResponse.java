
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVOwnershipResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ws_octop_get_LOV_OwnershipResult" type="{http://www.octopuspro.cz/types/}LOV_OwnershipResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wsOctopGetLOVOwnershipResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_OwnershipResponse")
public class WsOctopGetLOVOwnershipResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_OwnershipResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVOwnershipResponse> wsOctopGetLOVOwnershipResult;

    /**
     * Gets the value of the wsOctopGetLOVOwnershipResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVOwnershipResponse }{@code >}
     *     
     */
    public JAXBElement<LOVOwnershipResponse> getWsOctopGetLOVOwnershipResult() {
        return wsOctopGetLOVOwnershipResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVOwnershipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVOwnershipResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVOwnershipResult(JAXBElement<LOVOwnershipResponse> value) {
        this.wsOctopGetLOVOwnershipResult = value;
    }

}

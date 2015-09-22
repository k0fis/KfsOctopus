
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVRoleResponse;


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
 *         &lt;element name="ws_octop_get_LOV_RoleResult" type="{http://www.octopuspro.cz/types/}LOV_RoleResponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVRoleResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_RoleResponse")
public class WsOctopGetLOVRoleResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_RoleResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVRoleResponse> wsOctopGetLOVRoleResult;

    /**
     * Gets the value of the wsOctopGetLOVRoleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVRoleResponse }{@code >}
     *     
     */
    public JAXBElement<LOVRoleResponse> getWsOctopGetLOVRoleResult() {
        return wsOctopGetLOVRoleResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVRoleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVRoleResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVRoleResult(JAXBElement<LOVRoleResponse> value) {
        this.wsOctopGetLOVRoleResult = value;
    }

}


package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ws_remove_KN_property_from_lvkeeperResult" type="{http://www.octopuspro.cz/types/}ws_remove_KN_property_from_lvkeeper_Response" minOccurs="0"/&gt;
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
    "wsRemoveKNPropertyFromLvkeeperResult"
})
@XmlRootElement(name = "ws_remove_KN_property_from_lvkeeperResponse")
public class WsRemoveKNPropertyFromLvkeeperResponse {

    @XmlElementRef(name = "ws_remove_KN_property_from_lvkeeperResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse> wsRemoveKNPropertyFromLvkeeperResult;

    /**
     * Gets the value of the wsRemoveKNPropertyFromLvkeeperResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse }{@code >}
     *     
     */
    public JAXBElement<cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse> getWsRemoveKNPropertyFromLvkeeperResult() {
        return wsRemoveKNPropertyFromLvkeeperResult;
    }

    /**
     * Sets the value of the wsRemoveKNPropertyFromLvkeeperResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse }{@code >}
     *     
     */
    public void setWsRemoveKNPropertyFromLvkeeperResult(JAXBElement<cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse> value) {
        this.wsRemoveKNPropertyFromLvkeeperResult = value;
    }

}

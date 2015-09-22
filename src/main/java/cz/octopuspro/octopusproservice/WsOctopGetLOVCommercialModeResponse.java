
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVCommercialModeResponse;


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
 *         &lt;element name="ws_octop_get_LOV_CommercialModeResult" type="{http://www.octopuspro.cz/types/}LOV_CommercialModeResponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVCommercialModeResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_CommercialModeResponse")
public class WsOctopGetLOVCommercialModeResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_CommercialModeResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVCommercialModeResponse> wsOctopGetLOVCommercialModeResult;

    /**
     * Gets the value of the wsOctopGetLOVCommercialModeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVCommercialModeResponse }{@code >}
     *     
     */
    public JAXBElement<LOVCommercialModeResponse> getWsOctopGetLOVCommercialModeResult() {
        return wsOctopGetLOVCommercialModeResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVCommercialModeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVCommercialModeResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVCommercialModeResult(JAXBElement<LOVCommercialModeResponse> value) {
        this.wsOctopGetLOVCommercialModeResult = value;
    }

}

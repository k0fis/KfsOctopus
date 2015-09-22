
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVRegionResponse;


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
 *         &lt;element name="ws_octop_get_LOV_RegionResult" type="{http://www.octopuspro.cz/types/}LOV_RegionResponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVRegionResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_RegionResponse")
public class WsOctopGetLOVRegionResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_RegionResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVRegionResponse> wsOctopGetLOVRegionResult;

    /**
     * Gets the value of the wsOctopGetLOVRegionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVRegionResponse }{@code >}
     *     
     */
    public JAXBElement<LOVRegionResponse> getWsOctopGetLOVRegionResult() {
        return wsOctopGetLOVRegionResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVRegionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVRegionResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVRegionResult(JAXBElement<LOVRegionResponse> value) {
        this.wsOctopGetLOVRegionResult = value;
    }

}

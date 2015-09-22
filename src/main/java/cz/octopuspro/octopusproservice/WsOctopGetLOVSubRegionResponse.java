
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVSubRegionReponse;


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
 *         &lt;element name="ws_octop_get_LOV_SubRegionResult" type="{http://www.octopuspro.cz/types/}LOV_SubRegionReponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVSubRegionResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_SubRegionResponse")
public class WsOctopGetLOVSubRegionResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_SubRegionResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVSubRegionReponse> wsOctopGetLOVSubRegionResult;

    /**
     * Gets the value of the wsOctopGetLOVSubRegionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVSubRegionReponse }{@code >}
     *     
     */
    public JAXBElement<LOVSubRegionReponse> getWsOctopGetLOVSubRegionResult() {
        return wsOctopGetLOVSubRegionResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVSubRegionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVSubRegionReponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVSubRegionResult(JAXBElement<LOVSubRegionReponse> value) {
        this.wsOctopGetLOVSubRegionResult = value;
    }

}

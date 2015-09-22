
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVOfferTypeResponse;


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
 *         &lt;element name="ws_octop_get_LOV_OfferTypeResult" type="{http://www.octopuspro.cz/types/}LOV_OfferTypeResponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVOfferTypeResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_OfferTypeResponse")
public class WsOctopGetLOVOfferTypeResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_OfferTypeResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVOfferTypeResponse> wsOctopGetLOVOfferTypeResult;

    /**
     * Gets the value of the wsOctopGetLOVOfferTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVOfferTypeResponse }{@code >}
     *     
     */
    public JAXBElement<LOVOfferTypeResponse> getWsOctopGetLOVOfferTypeResult() {
        return wsOctopGetLOVOfferTypeResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVOfferTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVOfferTypeResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVOfferTypeResult(JAXBElement<LOVOfferTypeResponse> value) {
        this.wsOctopGetLOVOfferTypeResult = value;
    }

}

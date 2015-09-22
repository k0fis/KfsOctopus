
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVCountryResponse;


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
 *         &lt;element name="ws_octop_get_LOV_CountryResult" type="{http://www.octopuspro.cz/types/}LOV_CountryResponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVCountryResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_CountryResponse")
public class WsOctopGetLOVCountryResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_CountryResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVCountryResponse> wsOctopGetLOVCountryResult;

    /**
     * Gets the value of the wsOctopGetLOVCountryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVCountryResponse }{@code >}
     *     
     */
    public JAXBElement<LOVCountryResponse> getWsOctopGetLOVCountryResult() {
        return wsOctopGetLOVCountryResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVCountryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVCountryResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVCountryResult(JAXBElement<LOVCountryResponse> value) {
        this.wsOctopGetLOVCountryResult = value;
    }

}

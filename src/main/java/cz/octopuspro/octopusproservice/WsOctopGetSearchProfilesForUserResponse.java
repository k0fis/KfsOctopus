
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.TSearchProfileResponse;


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
 *         &lt;element name="ws_octop_get_SearchProfiles_For_UserResult" type="{http://www.octopuspro.cz/types/}tSearchProfileResponse" minOccurs="0"/&gt;
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
    "wsOctopGetSearchProfilesForUserResult"
})
@XmlRootElement(name = "ws_octop_get_SearchProfiles_For_UserResponse")
public class WsOctopGetSearchProfilesForUserResponse {

    @XmlElementRef(name = "ws_octop_get_SearchProfiles_For_UserResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<TSearchProfileResponse> wsOctopGetSearchProfilesForUserResult;

    /**
     * Gets the value of the wsOctopGetSearchProfilesForUserResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TSearchProfileResponse }{@code >}
     *     
     */
    public JAXBElement<TSearchProfileResponse> getWsOctopGetSearchProfilesForUserResult() {
        return wsOctopGetSearchProfilesForUserResult;
    }

    /**
     * Sets the value of the wsOctopGetSearchProfilesForUserResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TSearchProfileResponse }{@code >}
     *     
     */
    public void setWsOctopGetSearchProfilesForUserResult(JAXBElement<TSearchProfileResponse> value) {
        this.wsOctopGetSearchProfilesForUserResult = value;
    }

}

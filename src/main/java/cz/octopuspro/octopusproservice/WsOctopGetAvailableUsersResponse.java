
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.TUserResponse;


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
 *         &lt;element name="ws_octop_get_AvailableUsersResult" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.Message}tUserResponse" minOccurs="0"/&gt;
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
    "wsOctopGetAvailableUsersResult"
})
@XmlRootElement(name = "ws_octop_get_AvailableUsersResponse")
public class WsOctopGetAvailableUsersResponse {

    @XmlElementRef(name = "ws_octop_get_AvailableUsersResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<TUserResponse> wsOctopGetAvailableUsersResult;

    /**
     * Gets the value of the wsOctopGetAvailableUsersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TUserResponse }{@code >}
     *     
     */
    public JAXBElement<TUserResponse> getWsOctopGetAvailableUsersResult() {
        return wsOctopGetAvailableUsersResult;
    }

    /**
     * Sets the value of the wsOctopGetAvailableUsersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TUserResponse }{@code >}
     *     
     */
    public void setWsOctopGetAvailableUsersResult(JAXBElement<TUserResponse> value) {
        this.wsOctopGetAvailableUsersResult = value;
    }

}

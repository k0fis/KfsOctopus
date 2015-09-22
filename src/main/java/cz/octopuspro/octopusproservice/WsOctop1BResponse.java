
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.THitResponse;


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
 *         &lt;element name="ws_octop_1bResult" type="{http://www.octopuspro.cz/types/}tHitResponse" minOccurs="0"/&gt;
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
    "wsOctop1BResult"
})
@XmlRootElement(name = "ws_octop_1bResponse")
public class WsOctop1BResponse {

    @XmlElementRef(name = "ws_octop_1bResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<THitResponse> wsOctop1BResult;

    /**
     * Gets the value of the wsOctop1BResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link THitResponse }{@code >}
     *     
     */
    public JAXBElement<THitResponse> getWsOctop1BResult() {
        return wsOctop1BResult;
    }

    /**
     * Sets the value of the wsOctop1BResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link THitResponse }{@code >}
     *     
     */
    public void setWsOctop1BResult(JAXBElement<THitResponse> value) {
        this.wsOctop1BResult = value;
    }

}

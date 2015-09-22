
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.ResponseBase;


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
 *         &lt;element name="ws_tryLoginResult" type="{http://www.octopuspro.cz/types/}ResponseBase" minOccurs="0"/&gt;
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
    "wsTryLoginResult"
})
@XmlRootElement(name = "ws_tryLoginResponse")
public class WsTryLoginResponse {

    @XmlElementRef(name = "ws_tryLoginResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseBase> wsTryLoginResult;

    /**
     * Gets the value of the wsTryLoginResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}
     *     
     */
    public JAXBElement<ResponseBase> getWsTryLoginResult() {
        return wsTryLoginResult;
    }

    /**
     * Sets the value of the wsTryLoginResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}
     *     
     */
    public void setWsTryLoginResult(JAXBElement<ResponseBase> value) {
        this.wsTryLoginResult = value;
    }

}

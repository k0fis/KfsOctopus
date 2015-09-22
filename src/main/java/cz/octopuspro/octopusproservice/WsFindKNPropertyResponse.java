
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
 *         &lt;element name="ws_find_KN_propertyResult" type="{http://www.octopuspro.cz/types/}ws_find_KN_property_Response" minOccurs="0"/&gt;
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
    "wsFindKNPropertyResult"
})
@XmlRootElement(name = "ws_find_KN_propertyResponse")
public class WsFindKNPropertyResponse {

    @XmlElementRef(name = "ws_find_KN_propertyResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<cz.octopuspro.types.WsFindKNPropertyResponse> wsFindKNPropertyResult;

    /**
     * Gets the value of the wsFindKNPropertyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsFindKNPropertyResponse }{@code >}
     *     
     */
    public JAXBElement<cz.octopuspro.types.WsFindKNPropertyResponse> getWsFindKNPropertyResult() {
        return wsFindKNPropertyResult;
    }

    /**
     * Sets the value of the wsFindKNPropertyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsFindKNPropertyResponse }{@code >}
     *     
     */
    public void setWsFindKNPropertyResult(JAXBElement<cz.octopuspro.types.WsFindKNPropertyResponse> value) {
        this.wsFindKNPropertyResult = value;
    }

}

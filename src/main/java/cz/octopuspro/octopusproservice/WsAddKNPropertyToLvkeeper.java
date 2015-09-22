
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.WsAddKNPropertyToLvkeeperRequest;


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
 *         &lt;element name="request" type="{http://www.octopuspro.cz/types/}ws_add_KN_property_to_lvkeeper_Request" minOccurs="0"/&gt;
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
    "request"
})
@XmlRootElement(name = "ws_add_KN_property_to_lvkeeper")
public class WsAddKNPropertyToLvkeeper {

    @XmlElementRef(name = "request", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsAddKNPropertyToLvkeeperRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsAddKNPropertyToLvkeeperRequest }{@code >}
     *     
     */
    public JAXBElement<WsAddKNPropertyToLvkeeperRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsAddKNPropertyToLvkeeperRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<WsAddKNPropertyToLvkeeperRequest> value) {
        this.request = value;
    }

}

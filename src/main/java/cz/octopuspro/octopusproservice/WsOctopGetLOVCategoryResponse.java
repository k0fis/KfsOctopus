
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVCategoryResponse;


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
 *         &lt;element name="ws_octop_get_LOV_CategoryResult" type="{http://www.octopuspro.cz/types/}LOV_CategoryResponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVCategoryResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_CategoryResponse")
public class WsOctopGetLOVCategoryResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_CategoryResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVCategoryResponse> wsOctopGetLOVCategoryResult;

    /**
     * Gets the value of the wsOctopGetLOVCategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVCategoryResponse }{@code >}
     *     
     */
    public JAXBElement<LOVCategoryResponse> getWsOctopGetLOVCategoryResult() {
        return wsOctopGetLOVCategoryResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVCategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVCategoryResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVCategoryResult(JAXBElement<LOVCategoryResponse> value) {
        this.wsOctopGetLOVCategoryResult = value;
    }

}

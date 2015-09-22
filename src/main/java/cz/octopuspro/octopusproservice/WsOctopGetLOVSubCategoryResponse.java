
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.LOVSubCategoryResponse;


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
 *         &lt;element name="ws_octop_get_LOV_SubCategoryResult" type="{http://www.octopuspro.cz/types/}LOV_SubCategoryResponse" minOccurs="0"/&gt;
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
    "wsOctopGetLOVSubCategoryResult"
})
@XmlRootElement(name = "ws_octop_get_LOV_SubCategoryResponse")
public class WsOctopGetLOVSubCategoryResponse {

    @XmlElementRef(name = "ws_octop_get_LOV_SubCategoryResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<LOVSubCategoryResponse> wsOctopGetLOVSubCategoryResult;

    /**
     * Gets the value of the wsOctopGetLOVSubCategoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOVSubCategoryResponse }{@code >}
     *     
     */
    public JAXBElement<LOVSubCategoryResponse> getWsOctopGetLOVSubCategoryResult() {
        return wsOctopGetLOVSubCategoryResult;
    }

    /**
     * Sets the value of the wsOctopGetLOVSubCategoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOVSubCategoryResponse }{@code >}
     *     
     */
    public void setWsOctopGetLOVSubCategoryResult(JAXBElement<LOVSubCategoryResponse> value) {
        this.wsOctopGetLOVSubCategoryResult = value;
    }

}

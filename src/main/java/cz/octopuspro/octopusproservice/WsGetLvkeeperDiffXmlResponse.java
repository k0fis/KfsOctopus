
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
 *         &lt;element name="ws_get_lvkeeper_diff_xmlResult" type="{http://www.octopuspro.cz/types/}ws_get_lvkeeper_diff_xml_Response" minOccurs="0"/&gt;
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
    "wsGetLvkeeperDiffXmlResult"
})
@XmlRootElement(name = "ws_get_lvkeeper_diff_xmlResponse")
public class WsGetLvkeeperDiffXmlResponse {

    @XmlElementRef(name = "ws_get_lvkeeper_diff_xmlResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse> wsGetLvkeeperDiffXmlResult;

    /**
     * Gets the value of the wsGetLvkeeperDiffXmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse }{@code >}
     *     
     */
    public JAXBElement<cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse> getWsGetLvkeeperDiffXmlResult() {
        return wsGetLvkeeperDiffXmlResult;
    }

    /**
     * Sets the value of the wsGetLvkeeperDiffXmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse }{@code >}
     *     
     */
    public void setWsGetLvkeeperDiffXmlResult(JAXBElement<cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse> value) {
        this.wsGetLvkeeperDiffXmlResult = value;
    }

}

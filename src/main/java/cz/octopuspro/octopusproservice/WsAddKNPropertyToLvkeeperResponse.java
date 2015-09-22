
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
 *         &lt;element name="ws_add_KN_property_to_lvkeeperResult" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.Message.Exekuce}ws_add_KN_property_to_lvkeeper_Response" minOccurs="0"/&gt;
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
    "wsAddKNPropertyToLvkeeperResult"
})
@XmlRootElement(name = "ws_add_KN_property_to_lvkeeperResponse")
public class WsAddKNPropertyToLvkeeperResponse {

    @XmlElementRef(name = "ws_add_KN_property_to_lvkeeperResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse> wsAddKNPropertyToLvkeeperResult;

    /**
     * Gets the value of the wsAddKNPropertyToLvkeeperResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse> getWsAddKNPropertyToLvkeeperResult() {
        return wsAddKNPropertyToLvkeeperResult;
    }

    /**
     * Sets the value of the wsAddKNPropertyToLvkeeperResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse }{@code >}
     *     
     */
    public void setWsAddKNPropertyToLvkeeperResult(JAXBElement<org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse> value) {
        this.wsAddKNPropertyToLvkeeperResult = value;
    }

}

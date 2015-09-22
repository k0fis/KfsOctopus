
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
 *         &lt;element name="ws_change_lvkeeper_noteResult" type="{http://www.octopuspro.cz/types/}ws_change_lvkeeper_note_Response" minOccurs="0"/&gt;
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
    "wsChangeLvkeeperNoteResult"
})
@XmlRootElement(name = "ws_change_lvkeeper_noteResponse")
public class WsChangeLvkeeperNoteResponse {

    @XmlElementRef(name = "ws_change_lvkeeper_noteResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<cz.octopuspro.types.WsChangeLvkeeperNoteResponse> wsChangeLvkeeperNoteResult;

    /**
     * Gets the value of the wsChangeLvkeeperNoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsChangeLvkeeperNoteResponse }{@code >}
     *     
     */
    public JAXBElement<cz.octopuspro.types.WsChangeLvkeeperNoteResponse> getWsChangeLvkeeperNoteResult() {
        return wsChangeLvkeeperNoteResult;
    }

    /**
     * Sets the value of the wsChangeLvkeeperNoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsChangeLvkeeperNoteResponse }{@code >}
     *     
     */
    public void setWsChangeLvkeeperNoteResult(JAXBElement<cz.octopuspro.types.WsChangeLvkeeperNoteResponse> value) {
        this.wsChangeLvkeeperNoteResult = value;
    }

}

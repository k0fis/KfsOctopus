
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_change_lvkeeper_note_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_change_lvkeeper_note_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}RequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdLvKeeper" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_change_lvkeeper_note_Request", propOrder = {
    "idLvKeeper",
    "note"
})
public class WsChangeLvkeeperNoteRequest
    extends RequestBase
{

    @XmlElement(name = "IdLvKeeper")
    protected Integer idLvKeeper;
    @XmlElementRef(name = "Note", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> note;

    /**
     * Gets the value of the idLvKeeper property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLvKeeper() {
        return idLvKeeper;
    }

    /**
     * Sets the value of the idLvKeeper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLvKeeper(Integer value) {
        this.idLvKeeper = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNote(JAXBElement<String> value) {
        this.note = value;
    }

}

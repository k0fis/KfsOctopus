
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.WsOctop1ACriteria;


/**
 * <p>Java class for ws_octop_1a_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_octop_1a_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}RequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Criteria" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.Criteria}ws_octop_1a_Criteria" minOccurs="0"/&gt;
 *         &lt;element name="IdSearchProfile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_octop_1a_Request", propOrder = {
    "criteria",
    "idSearchProfile",
    "idUser"
})
public class WsOctop1ARequest
    extends RequestBase
{

    @XmlElementRef(name = "Criteria", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsOctop1ACriteria> criteria;
    @XmlElementRef(name = "IdSearchProfile", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idSearchProfile;
    @XmlElement(name = "IdUser")
    protected Integer idUser;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsOctop1ACriteria }{@code >}
     *     
     */
    public JAXBElement<WsOctop1ACriteria> getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsOctop1ACriteria }{@code >}
     *     
     */
    public void setCriteria(JAXBElement<WsOctop1ACriteria> value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the idSearchProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdSearchProfile() {
        return idSearchProfile;
    }

    /**
     * Sets the value of the idSearchProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdSearchProfile(JAXBElement<Integer> value) {
        this.idSearchProfile = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUser(Integer value) {
        this.idUser = value;
    }

}


package cz.octopuspro.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_remove_KN_property_from_lvkeeper_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_remove_KN_property_from_lvkeeper_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}RequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdNemovitost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TypNemovitosti" type="{http://www.octopuspro.cz/types/}iTypNemovitosti" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_remove_KN_property_from_lvkeeper_Request", propOrder = {
    "idNemovitost",
    "idUser",
    "typNemovitosti"
})
public class WsRemoveKNPropertyFromLvkeeperRequest
    extends RequestBase
{

    @XmlElement(name = "IdNemovitost")
    protected Integer idNemovitost;
    @XmlElement(name = "IdUser")
    protected Integer idUser;
    @XmlElement(name = "TypNemovitosti")
    @XmlSchemaType(name = "string")
    protected ITypNemovitosti typNemovitosti;

    /**
     * Gets the value of the idNemovitost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdNemovitost() {
        return idNemovitost;
    }

    /**
     * Sets the value of the idNemovitost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdNemovitost(Integer value) {
        this.idNemovitost = value;
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

    /**
     * Gets the value of the typNemovitosti property.
     * 
     * @return
     *     possible object is
     *     {@link ITypNemovitosti }
     *     
     */
    public ITypNemovitosti getTypNemovitosti() {
        return typNemovitosti;
    }

    /**
     * Sets the value of the typNemovitosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITypNemovitosti }
     *     
     */
    public void setTypNemovitosti(ITypNemovitosti value) {
        this.typNemovitosti = value;
    }

}

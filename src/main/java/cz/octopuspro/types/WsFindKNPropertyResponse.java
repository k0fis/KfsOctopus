
package cz.octopuspro.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_find_KN_property_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_find_KN_property_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdNemovitosti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Nalezena" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "ws_find_KN_property_Response", propOrder = {
    "idNemovitosti",
    "nalezena",
    "typNemovitosti"
})
public class WsFindKNPropertyResponse
    extends ResponseBase
{

    @XmlElement(name = "IdNemovitosti")
    protected Integer idNemovitosti;
    @XmlElement(name = "Nalezena")
    protected Boolean nalezena;
    @XmlElement(name = "TypNemovitosti")
    @XmlSchemaType(name = "string")
    protected ITypNemovitosti typNemovitosti;

    /**
     * Gets the value of the idNemovitosti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdNemovitosti() {
        return idNemovitosti;
    }

    /**
     * Sets the value of the idNemovitosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdNemovitosti(Integer value) {
        this.idNemovitosti = value;
    }

    /**
     * Gets the value of the nalezena property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNalezena() {
        return nalezena;
    }

    /**
     * Sets the value of the nalezena property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNalezena(Boolean value) {
        this.nalezena = value;
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

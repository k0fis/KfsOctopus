
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOV_SubRegionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_SubRegionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}RequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSubRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_SubRegionRequest", propOrder = {
    "idRegion",
    "idSubRegion"
})
public class LOVSubRegionRequest
    extends RequestBase
{

    @XmlElementRef(name = "IdRegion", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idRegion;
    @XmlElementRef(name = "IdSubRegion", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idSubRegion;

    /**
     * Gets the value of the idRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdRegion() {
        return idRegion;
    }

    /**
     * Sets the value of the idRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdRegion(JAXBElement<Integer> value) {
        this.idRegion = value;
    }

    /**
     * Gets the value of the idSubRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdSubRegion() {
        return idSubRegion;
    }

    /**
     * Sets the value of the idSubRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdSubRegion(JAXBElement<Integer> value) {
        this.idSubRegion = value;
    }

}

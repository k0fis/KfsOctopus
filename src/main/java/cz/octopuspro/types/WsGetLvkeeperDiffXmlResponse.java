
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ws_get_lvkeeper_diff_xml_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_get_lvkeeper_diff_xml_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiffXml" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Nalezeno" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_get_lvkeeper_diff_xml_Response", propOrder = {
    "diffXml",
    "nalezeno"
})
public class WsGetLvkeeperDiffXmlResponse
    extends ResponseBase
{

    @XmlElementRef(name = "DiffXml", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<WsGetLvkeeperDiffXmlResponse.DiffXml> diffXml;
    @XmlElement(name = "Nalezeno")
    protected Boolean nalezeno;

    /**
     * Gets the value of the diffXml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsGetLvkeeperDiffXmlResponse.DiffXml }{@code >}
     *     
     */
    public JAXBElement<WsGetLvkeeperDiffXmlResponse.DiffXml> getDiffXml() {
        return diffXml;
    }

    /**
     * Sets the value of the diffXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsGetLvkeeperDiffXmlResponse.DiffXml }{@code >}
     *     
     */
    public void setDiffXml(JAXBElement<WsGetLvkeeperDiffXmlResponse.DiffXml> value) {
        this.diffXml = value;
    }

    /**
     * Gets the value of the nalezeno property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNalezeno() {
        return nalezeno;
    }

    /**
     * Sets the value of the nalezeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNalezeno(Boolean value) {
        this.nalezeno = value;
    }


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
     *         &lt;any processContents='lax' minOccurs="0"/&gt;
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
        "any"
    })
    public static class DiffXml {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}

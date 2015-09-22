
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cz.octopuspro.types.THitResponse;


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
 *         &lt;element name="get_tHitResult" type="{http://www.octopuspro.cz/types/}tHitResponse" minOccurs="0"/&gt;
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
    "getTHitResult"
})
@XmlRootElement(name = "get_tHitResponse")
public class GetTHitResponse {

    @XmlElementRef(name = "get_tHitResult", namespace = "http://octopuspro.cz/OctopusProService", type = JAXBElement.class, required = false)
    protected JAXBElement<THitResponse> getTHitResult;

    /**
     * Gets the value of the getTHitResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link THitResponse }{@code >}
     *     
     */
    public JAXBElement<THitResponse> getGetTHitResult() {
        return getTHitResult;
    }

    /**
     * Sets the value of the getTHitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link THitResponse }{@code >}
     *     
     */
    public void setGetTHitResult(JAXBElement<THitResponse> value) {
        this.getTHitResult = value;
    }

}


package org.datacontract.schemas._2004._07.octop_actionservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributePriceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributePriceDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WindowPx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributePriceDTO", propOrder = {
    "price",
    "windowPx"
})
public class PairingAttributePriceDTO
    extends PairingAttributeDTO
{

    @XmlElement(name = "Price")
    protected BigDecimal price;
    @XmlElement(name = "WindowPx")
    protected Double windowPx;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the windowPx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWindowPx() {
        return windowPx;
    }

    /**
     * Sets the value of the windowPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWindowPx(Double value) {
        this.windowPx = value;
    }

}


package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributeCoordinateDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributeCoordinateDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoordinateType" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}iCoordinateType" minOccurs="0"/&gt;
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributeCoordinateDTO", propOrder = {
    "coordinateType",
    "radius",
    "x",
    "y"
})
public class PairingAttributeCoordinateDTO
    extends PairingAttributeDTO
{

    @XmlElement(name = "CoordinateType")
    @XmlSchemaType(name = "string")
    protected ICoordinateType coordinateType;
    @XmlElement(name = "Radius")
    protected Double radius;
    @XmlElement(name = "X")
    protected Double x;
    @XmlElement(name = "Y")
    protected Double y;

    /**
     * Gets the value of the coordinateType property.
     * 
     * @return
     *     possible object is
     *     {@link ICoordinateType }
     *     
     */
    public ICoordinateType getCoordinateType() {
        return coordinateType;
    }

    /**
     * Sets the value of the coordinateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICoordinateType }
     *     
     */
    public void setCoordinateType(ICoordinateType value) {
        this.coordinateType = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadius(Double value) {
        this.radius = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX(Double value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setY(Double value) {
        this.y = value;
    }

}

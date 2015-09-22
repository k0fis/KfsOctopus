
package org.datacontract.schemas._2004._07.octop_actionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOftSearchProfileRegionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftSearchProfileRegionDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tSearchProfileRegionDTO" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}tSearchProfileRegionDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftSearchProfileRegionDTO", propOrder = {
    "tSearchProfileRegionDTO"
})
public class ArrayOftSearchProfileRegionDTO {

    @XmlElement(nillable = true)
    protected List<TSearchProfileRegionDTO> tSearchProfileRegionDTO;

    /**
     * Gets the value of the tSearchProfileRegionDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tSearchProfileRegionDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTSearchProfileRegionDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSearchProfileRegionDTO }
     * 
     * 
     */
    public List<TSearchProfileRegionDTO> getTSearchProfileRegionDTO() {
        if (tSearchProfileRegionDTO == null) {
            tSearchProfileRegionDTO = new ArrayList<TSearchProfileRegionDTO>();
        }
        return this.tSearchProfileRegionDTO;
    }

}

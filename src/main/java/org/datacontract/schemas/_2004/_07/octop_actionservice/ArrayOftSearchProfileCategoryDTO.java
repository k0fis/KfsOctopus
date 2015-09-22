
package org.datacontract.schemas._2004._07.octop_actionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOftSearchProfileCategoryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOftSearchProfileCategoryDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tSearchProfileCategoryDTO" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}tSearchProfileCategoryDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOftSearchProfileCategoryDTO", propOrder = {
    "tSearchProfileCategoryDTO"
})
public class ArrayOftSearchProfileCategoryDTO {

    @XmlElement(nillable = true)
    protected List<TSearchProfileCategoryDTO> tSearchProfileCategoryDTO;

    /**
     * Gets the value of the tSearchProfileCategoryDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tSearchProfileCategoryDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTSearchProfileCategoryDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSearchProfileCategoryDTO }
     * 
     * 
     */
    public List<TSearchProfileCategoryDTO> getTSearchProfileCategoryDTO() {
        if (tSearchProfileCategoryDTO == null) {
            tSearchProfileCategoryDTO = new ArrayList<TSearchProfileCategoryDTO>();
        }
        return this.tSearchProfileCategoryDTO;
    }

}

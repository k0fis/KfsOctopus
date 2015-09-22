
package org.datacontract.schemas._2004._07.octop_actionservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOwnershipDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOwnershipDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OwnershipDTO" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}OwnershipDTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOwnershipDTO", propOrder = {
    "ownershipDTO"
})
public class ArrayOfOwnershipDTO {

    @XmlElement(name = "OwnershipDTO", nillable = true)
    protected List<OwnershipDTO> ownershipDTO;

    /**
     * Gets the value of the ownershipDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownershipDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnershipDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnershipDTO }
     * 
     * 
     */
    public List<OwnershipDTO> getOwnershipDTO() {
        if (ownershipDTO == null) {
            ownershipDTO = new ArrayList<OwnershipDTO>();
        }
        return this.ownershipDTO;
    }

}

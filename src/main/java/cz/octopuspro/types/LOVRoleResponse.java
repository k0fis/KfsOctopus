
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfRoleDTO;


/**
 * <p>Java class for LOV_RoleResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOV_RoleResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}ResponseBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Roles" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOfRoleDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOV_RoleResponse", propOrder = {
    "roles"
})
public class LOVRoleResponse
    extends ResponseBase
{

    @XmlElementRef(name = "Roles", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoleDTO> roles;

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoleDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoleDTO> getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoleDTO }{@code >}
     *     
     */
    public void setRoles(JAXBElement<ArrayOfRoleDTO> value) {
        this.roles = value;
    }

}

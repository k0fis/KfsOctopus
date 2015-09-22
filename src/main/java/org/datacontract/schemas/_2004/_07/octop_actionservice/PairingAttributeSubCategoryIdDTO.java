
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributeSubCategoryIdDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributeSubCategoryIdDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeDTO"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubCategoryByt" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}SubCategoryBytDTO" minOccurs="0"/&gt;
 *         &lt;element name="SubCategoryKomercniProstor" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}SubCategoryKomercniProstorDTO" minOccurs="0"/&gt;
 *         &lt;element name="SubCategoryParcela" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}SubCategoryParcelaDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributeSubCategoryIdDTO", propOrder = {
    "subCategoryByt",
    "subCategoryKomercniProstor",
    "subCategoryParcela"
})
public class PairingAttributeSubCategoryIdDTO
    extends PairingAttributeDTO
{

    @XmlElementRef(name = "SubCategoryByt", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<SubCategoryBytDTO> subCategoryByt;
    @XmlElementRef(name = "SubCategoryKomercniProstor", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<SubCategoryKomercniProstorDTO> subCategoryKomercniProstor;
    @XmlElementRef(name = "SubCategoryParcela", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<SubCategoryParcelaDTO> subCategoryParcela;

    /**
     * Gets the value of the subCategoryByt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubCategoryBytDTO }{@code >}
     *     
     */
    public JAXBElement<SubCategoryBytDTO> getSubCategoryByt() {
        return subCategoryByt;
    }

    /**
     * Sets the value of the subCategoryByt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubCategoryBytDTO }{@code >}
     *     
     */
    public void setSubCategoryByt(JAXBElement<SubCategoryBytDTO> value) {
        this.subCategoryByt = value;
    }

    /**
     * Gets the value of the subCategoryKomercniProstor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubCategoryKomercniProstorDTO }{@code >}
     *     
     */
    public JAXBElement<SubCategoryKomercniProstorDTO> getSubCategoryKomercniProstor() {
        return subCategoryKomercniProstor;
    }

    /**
     * Sets the value of the subCategoryKomercniProstor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubCategoryKomercniProstorDTO }{@code >}
     *     
     */
    public void setSubCategoryKomercniProstor(JAXBElement<SubCategoryKomercniProstorDTO> value) {
        this.subCategoryKomercniProstor = value;
    }

    /**
     * Gets the value of the subCategoryParcela property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubCategoryParcelaDTO }{@code >}
     *     
     */
    public JAXBElement<SubCategoryParcelaDTO> getSubCategoryParcela() {
        return subCategoryParcela;
    }

    /**
     * Sets the value of the subCategoryParcela property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubCategoryParcelaDTO }{@code >}
     *     
     */
    public void setSubCategoryParcela(JAXBElement<SubCategoryParcelaDTO> value) {
        this.subCategoryParcela = value;
    }

}

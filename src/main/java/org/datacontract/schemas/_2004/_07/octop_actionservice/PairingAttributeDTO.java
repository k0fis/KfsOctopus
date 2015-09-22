
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PairingAttributeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PairingAttributeDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MatchHitsWithNullValuesForOptionalAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PairingAttributeDTO", propOrder = {
    "matchHitsWithNullValuesForOptionalAttributes"
})
@XmlSeeAlso({
    PairingAttributeAreaDTO.class,
    PairingAttributeBuildingNumberDTO.class,
    PairingAttributeCategoryIdDTO.class,
    PairingAttributeCommercialModeIdDTO.class,
    PairingAttributeCoordinateDTO.class,
    PairingAttributeCountryIdDTO.class,
    PairingAttributeFulltextDTO.class,
    PairingAttributeMunicipalityDTO.class,
    PairingAttributeOfferTypeIdDTO.class,
    PairingAttributeOwnershipIdDTO.class,
    PairingAttributePriceDTO.class,
    PairingAttributeStreetDTO.class,
    PairingAttributeSubCategoryIdDTO.class,
    PairingAttributeSubRegionIdDTO.class
})
public class PairingAttributeDTO {

    @XmlElement(name = "MatchHitsWithNullValuesForOptionalAttributes")
    protected Boolean matchHitsWithNullValuesForOptionalAttributes;

    /**
     * Gets the value of the matchHitsWithNullValuesForOptionalAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchHitsWithNullValuesForOptionalAttributes() {
        return matchHitsWithNullValuesForOptionalAttributes;
    }

    /**
     * Sets the value of the matchHitsWithNullValuesForOptionalAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchHitsWithNullValuesForOptionalAttributes(Boolean value) {
        this.matchHitsWithNullValuesForOptionalAttributes = value;
    }

}

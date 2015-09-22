
package cz.octopuspro.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeAreaDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeBuildingNumberDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeCategoryIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeCommercialModeIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeCoordinateDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeCountryIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeFulltextDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeMunicipalityDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeOfferTypeIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeOwnershipIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributePriceDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeStreetDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeSubCategoryIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeSubRegionIdDTO;


/**
 * <p>Java class for ws_pairing_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_pairing_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}RequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeAreaDTO" minOccurs="0"/&gt;
 *         &lt;element name="BuildingCpCo" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeBuildingNumberDTO" minOccurs="0"/&gt;
 *         &lt;element name="CategoryId" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeCategoryIdDTO"/&gt;
 *         &lt;element name="CommercialModeId" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeCommercialModeIdDTO"/&gt;
 *         &lt;element name="Coordinate" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeCoordinateDTO" minOccurs="0"/&gt;
 *         &lt;element name="CountryId" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeCountryIdDTO"/&gt;
 *         &lt;element name="Fulltext" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeFulltextDTO" minOccurs="0"/&gt;
 *         &lt;element name="IdRealAgencyClient" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Municipality" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeMunicipalityDTO" minOccurs="0"/&gt;
 *         &lt;element name="OfferTypeId" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeOfferTypeIdDTO"/&gt;
 *         &lt;element name="OwnershipId" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeOwnershipIdDTO" minOccurs="0"/&gt;
 *         &lt;element name="PairingSourceType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Price" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributePriceDTO" minOccurs="0"/&gt;
 *         &lt;element name="ResultAgeDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Street" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeStreetDTO" minOccurs="0"/&gt;
 *         &lt;element name="SubCategoryId" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeSubCategoryIdDTO" minOccurs="0"/&gt;
 *         &lt;element name="SubRegionId" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}PairingAttributeSubRegionIdDTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_pairing_Request", propOrder = {
    "area",
    "buildingCpCo",
    "categoryId",
    "commercialModeId",
    "coordinate",
    "countryId",
    "fulltext",
    "idRealAgencyClient",
    "idUser",
    "municipality",
    "offerTypeId",
    "ownershipId",
    "pairingSourceType",
    "price",
    "resultAgeDays",
    "street",
    "subCategoryId",
    "subRegionId"
})
public class WsPairingRequest
    extends RequestBase
{

    @XmlElementRef(name = "Area", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeAreaDTO> area;
    @XmlElementRef(name = "BuildingCpCo", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeBuildingNumberDTO> buildingCpCo;
    @XmlElement(name = "CategoryId", required = true, nillable = true)
    protected PairingAttributeCategoryIdDTO categoryId;
    @XmlElement(name = "CommercialModeId", required = true, nillable = true)
    protected PairingAttributeCommercialModeIdDTO commercialModeId;
    @XmlElementRef(name = "Coordinate", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeCoordinateDTO> coordinate;
    @XmlElement(name = "CountryId", required = true, nillable = true)
    protected PairingAttributeCountryIdDTO countryId;
    @XmlElementRef(name = "Fulltext", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeFulltextDTO> fulltext;
    @XmlElementRef(name = "IdRealAgencyClient", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idRealAgencyClient;
    @XmlElement(name = "IdUser")
    protected int idUser;
    @XmlElementRef(name = "Municipality", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeMunicipalityDTO> municipality;
    @XmlElement(name = "OfferTypeId", required = true, nillable = true)
    protected PairingAttributeOfferTypeIdDTO offerTypeId;
    @XmlElementRef(name = "OwnershipId", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeOwnershipIdDTO> ownershipId;
    @XmlElement(name = "PairingSourceType")
    protected int pairingSourceType;
    @XmlElementRef(name = "Price", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributePriceDTO> price;
    @XmlElement(name = "ResultAgeDays")
    protected int resultAgeDays;
    @XmlElementRef(name = "Street", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeStreetDTO> street;
    @XmlElementRef(name = "SubCategoryId", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeSubCategoryIdDTO> subCategoryId;
    @XmlElementRef(name = "SubRegionId", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PairingAttributeSubRegionIdDTO> subRegionId;

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeAreaDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeAreaDTO> getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeAreaDTO }{@code >}
     *     
     */
    public void setArea(JAXBElement<PairingAttributeAreaDTO> value) {
        this.area = value;
    }

    /**
     * Gets the value of the buildingCpCo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeBuildingNumberDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeBuildingNumberDTO> getBuildingCpCo() {
        return buildingCpCo;
    }

    /**
     * Sets the value of the buildingCpCo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeBuildingNumberDTO }{@code >}
     *     
     */
    public void setBuildingCpCo(JAXBElement<PairingAttributeBuildingNumberDTO> value) {
        this.buildingCpCo = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link PairingAttributeCategoryIdDTO }
     *     
     */
    public PairingAttributeCategoryIdDTO getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingAttributeCategoryIdDTO }
     *     
     */
    public void setCategoryId(PairingAttributeCategoryIdDTO value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the commercialModeId property.
     * 
     * @return
     *     possible object is
     *     {@link PairingAttributeCommercialModeIdDTO }
     *     
     */
    public PairingAttributeCommercialModeIdDTO getCommercialModeId() {
        return commercialModeId;
    }

    /**
     * Sets the value of the commercialModeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingAttributeCommercialModeIdDTO }
     *     
     */
    public void setCommercialModeId(PairingAttributeCommercialModeIdDTO value) {
        this.commercialModeId = value;
    }

    /**
     * Gets the value of the coordinate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeCoordinateDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeCoordinateDTO> getCoordinate() {
        return coordinate;
    }

    /**
     * Sets the value of the coordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeCoordinateDTO }{@code >}
     *     
     */
    public void setCoordinate(JAXBElement<PairingAttributeCoordinateDTO> value) {
        this.coordinate = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link PairingAttributeCountryIdDTO }
     *     
     */
    public PairingAttributeCountryIdDTO getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingAttributeCountryIdDTO }
     *     
     */
    public void setCountryId(PairingAttributeCountryIdDTO value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the fulltext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeFulltextDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeFulltextDTO> getFulltext() {
        return fulltext;
    }

    /**
     * Sets the value of the fulltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeFulltextDTO }{@code >}
     *     
     */
    public void setFulltext(JAXBElement<PairingAttributeFulltextDTO> value) {
        this.fulltext = value;
    }

    /**
     * Gets the value of the idRealAgencyClient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdRealAgencyClient() {
        return idRealAgencyClient;
    }

    /**
     * Sets the value of the idRealAgencyClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdRealAgencyClient(JAXBElement<Integer> value) {
        this.idRealAgencyClient = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the municipality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeMunicipalityDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeMunicipalityDTO> getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeMunicipalityDTO }{@code >}
     *     
     */
    public void setMunicipality(JAXBElement<PairingAttributeMunicipalityDTO> value) {
        this.municipality = value;
    }

    /**
     * Gets the value of the offerTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link PairingAttributeOfferTypeIdDTO }
     *     
     */
    public PairingAttributeOfferTypeIdDTO getOfferTypeId() {
        return offerTypeId;
    }

    /**
     * Sets the value of the offerTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PairingAttributeOfferTypeIdDTO }
     *     
     */
    public void setOfferTypeId(PairingAttributeOfferTypeIdDTO value) {
        this.offerTypeId = value;
    }

    /**
     * Gets the value of the ownershipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeOwnershipIdDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeOwnershipIdDTO> getOwnershipId() {
        return ownershipId;
    }

    /**
     * Sets the value of the ownershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeOwnershipIdDTO }{@code >}
     *     
     */
    public void setOwnershipId(JAXBElement<PairingAttributeOwnershipIdDTO> value) {
        this.ownershipId = value;
    }

    /**
     * Gets the value of the pairingSourceType property.
     * 
     */
    public int getPairingSourceType() {
        return pairingSourceType;
    }

    /**
     * Sets the value of the pairingSourceType property.
     * 
     */
    public void setPairingSourceType(int value) {
        this.pairingSourceType = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributePriceDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributePriceDTO> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributePriceDTO }{@code >}
     *     
     */
    public void setPrice(JAXBElement<PairingAttributePriceDTO> value) {
        this.price = value;
    }

    /**
     * Gets the value of the resultAgeDays property.
     * 
     */
    public int getResultAgeDays() {
        return resultAgeDays;
    }

    /**
     * Sets the value of the resultAgeDays property.
     * 
     */
    public void setResultAgeDays(int value) {
        this.resultAgeDays = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeStreetDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeStreetDTO> getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeStreetDTO }{@code >}
     *     
     */
    public void setStreet(JAXBElement<PairingAttributeStreetDTO> value) {
        this.street = value;
    }

    /**
     * Gets the value of the subCategoryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeSubCategoryIdDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeSubCategoryIdDTO> getSubCategoryId() {
        return subCategoryId;
    }

    /**
     * Sets the value of the subCategoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeSubCategoryIdDTO }{@code >}
     *     
     */
    public void setSubCategoryId(JAXBElement<PairingAttributeSubCategoryIdDTO> value) {
        this.subCategoryId = value;
    }

    /**
     * Gets the value of the subRegionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeSubRegionIdDTO }{@code >}
     *     
     */
    public JAXBElement<PairingAttributeSubRegionIdDTO> getSubRegionId() {
        return subRegionId;
    }

    /**
     * Sets the value of the subRegionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PairingAttributeSubRegionIdDTO }{@code >}
     *     
     */
    public void setSubRegionId(JAXBElement<PairingAttributeSubRegionIdDTO> value) {
        this.subRegionId = value;
    }

}


package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tSearchProfileDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tSearchProfileDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvertAgeDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_IdSubRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_LV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_LocalitySelectionMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_Obec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_Ulice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_ViewExecution" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_ViewFinished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_Vlastnik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_omezeniPrava" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_omezeniPrava_extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_podleKU_IdRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_podleKU_IdSubRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EXEK_podleKU_kodKatastralUzemi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExekuceSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdSearchProfile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OfferType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OnlyNews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PriceFrom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PriceTo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RefreshEachNminutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SearchProfileCategories" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOftSearchProfileCategoryDTO" minOccurs="0"/&gt;
 *         &lt;element name="SearchProfileRegions" type="{http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects}ArrayOftSearchProfileRegionDTO" minOccurs="0"/&gt;
 *         &lt;element name="UniqueInPortals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSearchProfileDTO", propOrder = {
    "advertAgeDays",
    "exekIdSubRegion",
    "exeklv",
    "exekLocalitySelectionMode",
    "exekObec",
    "exekUlice",
    "exekViewExecution",
    "exekViewFinished",
    "exekVlastnik",
    "exekDateFrom",
    "exekDateTo",
    "exekOmezeniPrava",
    "exekOmezeniPravaExtended",
    "exekPodleKUIdRegion",
    "exekPodleKUIdSubRegion",
    "exekPodleKUKodKatastralUzemi",
    "exekuceSet",
    "fullText",
    "idSearchProfile",
    "offerType",
    "onlyNews",
    "position",
    "priceFrom",
    "priceTo",
    "profileName",
    "profileType",
    "refreshEachNminutes",
    "searchProfileCategories",
    "searchProfileRegions",
    "uniqueInPortals"
})
public class TSearchProfileDTO {

    @XmlElementRef(name = "AdvertAgeDays", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> advertAgeDays;
    @XmlElementRef(name = "EXEK_IdSubRegion", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exekIdSubRegion;
    @XmlElementRef(name = "EXEK_LV", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exeklv;
    @XmlElementRef(name = "EXEK_LocalitySelectionMode", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exekLocalitySelectionMode;
    @XmlElementRef(name = "EXEK_Obec", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exekObec;
    @XmlElementRef(name = "EXEK_Ulice", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exekUlice;
    @XmlElementRef(name = "EXEK_ViewExecution", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exekViewExecution;
    @XmlElementRef(name = "EXEK_ViewFinished", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> exekViewFinished;
    @XmlElementRef(name = "EXEK_Vlastnik", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exekVlastnik;
    @XmlElementRef(name = "EXEK_dateFrom", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> exekDateFrom;
    @XmlElementRef(name = "EXEK_dateTo", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> exekDateTo;
    @XmlElementRef(name = "EXEK_omezeniPrava", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exekOmezeniPrava;
    @XmlElementRef(name = "EXEK_omezeniPrava_extended", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exekOmezeniPravaExtended;
    @XmlElementRef(name = "EXEK_podleKU_IdRegion", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exekPodleKUIdRegion;
    @XmlElementRef(name = "EXEK_podleKU_IdSubRegion", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exekPodleKUIdSubRegion;
    @XmlElementRef(name = "EXEK_podleKU_kodKatastralUzemi", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> exekPodleKUKodKatastralUzemi;
    @XmlElementRef(name = "ExekuceSet", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exekuceSet;
    @XmlElementRef(name = "FullText", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullText;
    @XmlElement(name = "IdSearchProfile")
    protected Integer idSearchProfile;
    @XmlElement(name = "OfferType")
    protected Integer offerType;
    @XmlElement(name = "OnlyNews")
    protected Boolean onlyNews;
    @XmlElement(name = "Position")
    protected Integer position;
    @XmlElementRef(name = "PriceFrom", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priceFrom;
    @XmlElementRef(name = "PriceTo", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> priceTo;
    @XmlElementRef(name = "ProfileName", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileName;
    @XmlElement(name = "ProfileType")
    protected Integer profileType;
    @XmlElement(name = "RefreshEachNminutes")
    protected Integer refreshEachNminutes;
    @XmlElementRef(name = "SearchProfileCategories", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOftSearchProfileCategoryDTO> searchProfileCategories;
    @XmlElementRef(name = "SearchProfileRegions", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOftSearchProfileRegionDTO> searchProfileRegions;
    @XmlElement(name = "UniqueInPortals")
    protected Boolean uniqueInPortals;

    /**
     * Gets the value of the advertAgeDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAdvertAgeDays() {
        return advertAgeDays;
    }

    /**
     * Sets the value of the advertAgeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAdvertAgeDays(JAXBElement<Integer> value) {
        this.advertAgeDays = value;
    }

    /**
     * Gets the value of the exekIdSubRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKIdSubRegion() {
        return exekIdSubRegion;
    }

    /**
     * Sets the value of the exekIdSubRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKIdSubRegion(JAXBElement<Integer> value) {
        this.exekIdSubRegion = value;
    }

    /**
     * Gets the value of the exeklv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKLV() {
        return exeklv;
    }

    /**
     * Sets the value of the exeklv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKLV(JAXBElement<Integer> value) {
        this.exeklv = value;
    }

    /**
     * Gets the value of the exekLocalitySelectionMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKLocalitySelectionMode() {
        return exekLocalitySelectionMode;
    }

    /**
     * Sets the value of the exekLocalitySelectionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKLocalitySelectionMode(JAXBElement<Integer> value) {
        this.exekLocalitySelectionMode = value;
    }

    /**
     * Gets the value of the exekObec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXEKObec() {
        return exekObec;
    }

    /**
     * Sets the value of the exekObec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXEKObec(JAXBElement<String> value) {
        this.exekObec = value;
    }

    /**
     * Gets the value of the exekUlice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXEKUlice() {
        return exekUlice;
    }

    /**
     * Sets the value of the exekUlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXEKUlice(JAXBElement<String> value) {
        this.exekUlice = value;
    }

    /**
     * Gets the value of the exekViewExecution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKViewExecution() {
        return exekViewExecution;
    }

    /**
     * Sets the value of the exekViewExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKViewExecution(JAXBElement<Integer> value) {
        this.exekViewExecution = value;
    }

    /**
     * Gets the value of the exekViewFinished property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEXEKViewFinished() {
        return exekViewFinished;
    }

    /**
     * Sets the value of the exekViewFinished property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEXEKViewFinished(JAXBElement<Boolean> value) {
        this.exekViewFinished = value;
    }

    /**
     * Gets the value of the exekVlastnik property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXEKVlastnik() {
        return exekVlastnik;
    }

    /**
     * Sets the value of the exekVlastnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXEKVlastnik(JAXBElement<String> value) {
        this.exekVlastnik = value;
    }

    /**
     * Gets the value of the exekDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXEKDateFrom() {
        return exekDateFrom;
    }

    /**
     * Sets the value of the exekDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXEKDateFrom(JAXBElement<XMLGregorianCalendar> value) {
        this.exekDateFrom = value;
    }

    /**
     * Gets the value of the exekDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXEKDateTo() {
        return exekDateTo;
    }

    /**
     * Sets the value of the exekDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXEKDateTo(JAXBElement<XMLGregorianCalendar> value) {
        this.exekDateTo = value;
    }

    /**
     * Gets the value of the exekOmezeniPrava property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKOmezeniPrava() {
        return exekOmezeniPrava;
    }

    /**
     * Sets the value of the exekOmezeniPrava property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKOmezeniPrava(JAXBElement<Integer> value) {
        this.exekOmezeniPrava = value;
    }

    /**
     * Gets the value of the exekOmezeniPravaExtended property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXEKOmezeniPravaExtended() {
        return exekOmezeniPravaExtended;
    }

    /**
     * Sets the value of the exekOmezeniPravaExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXEKOmezeniPravaExtended(JAXBElement<String> value) {
        this.exekOmezeniPravaExtended = value;
    }

    /**
     * Gets the value of the exekPodleKUIdRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKPodleKUIdRegion() {
        return exekPodleKUIdRegion;
    }

    /**
     * Sets the value of the exekPodleKUIdRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKPodleKUIdRegion(JAXBElement<Integer> value) {
        this.exekPodleKUIdRegion = value;
    }

    /**
     * Gets the value of the exekPodleKUIdSubRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKPodleKUIdSubRegion() {
        return exekPodleKUIdSubRegion;
    }

    /**
     * Sets the value of the exekPodleKUIdSubRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKPodleKUIdSubRegion(JAXBElement<Integer> value) {
        this.exekPodleKUIdSubRegion = value;
    }

    /**
     * Gets the value of the exekPodleKUKodKatastralUzemi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEXEKPodleKUKodKatastralUzemi() {
        return exekPodleKUKodKatastralUzemi;
    }

    /**
     * Sets the value of the exekPodleKUKodKatastralUzemi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEXEKPodleKUKodKatastralUzemi(JAXBElement<Integer> value) {
        this.exekPodleKUKodKatastralUzemi = value;
    }

    /**
     * Gets the value of the exekuceSet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExekuceSet() {
        return exekuceSet;
    }

    /**
     * Sets the value of the exekuceSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExekuceSet(JAXBElement<String> value) {
        this.exekuceSet = value;
    }

    /**
     * Gets the value of the fullText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullText() {
        return fullText;
    }

    /**
     * Sets the value of the fullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullText(JAXBElement<String> value) {
        this.fullText = value;
    }

    /**
     * Gets the value of the idSearchProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSearchProfile() {
        return idSearchProfile;
    }

    /**
     * Sets the value of the idSearchProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSearchProfile(Integer value) {
        this.idSearchProfile = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOfferType(Integer value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the onlyNews property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyNews() {
        return onlyNews;
    }

    /**
     * Sets the value of the onlyNews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyNews(Boolean value) {
        this.onlyNews = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Gets the value of the priceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriceFrom() {
        return priceFrom;
    }

    /**
     * Sets the value of the priceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriceFrom(JAXBElement<Integer> value) {
        this.priceFrom = value;
    }

    /**
     * Gets the value of the priceTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPriceTo() {
        return priceTo;
    }

    /**
     * Sets the value of the priceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPriceTo(JAXBElement<Integer> value) {
        this.priceTo = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileName(JAXBElement<String> value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProfileType(Integer value) {
        this.profileType = value;
    }

    /**
     * Gets the value of the refreshEachNminutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefreshEachNminutes() {
        return refreshEachNminutes;
    }

    /**
     * Sets the value of the refreshEachNminutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefreshEachNminutes(Integer value) {
        this.refreshEachNminutes = value;
    }

    /**
     * Gets the value of the searchProfileCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftSearchProfileCategoryDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOftSearchProfileCategoryDTO> getSearchProfileCategories() {
        return searchProfileCategories;
    }

    /**
     * Sets the value of the searchProfileCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftSearchProfileCategoryDTO }{@code >}
     *     
     */
    public void setSearchProfileCategories(JAXBElement<ArrayOftSearchProfileCategoryDTO> value) {
        this.searchProfileCategories = value;
    }

    /**
     * Gets the value of the searchProfileRegions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftSearchProfileRegionDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOftSearchProfileRegionDTO> getSearchProfileRegions() {
        return searchProfileRegions;
    }

    /**
     * Sets the value of the searchProfileRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOftSearchProfileRegionDTO }{@code >}
     *     
     */
    public void setSearchProfileRegions(JAXBElement<ArrayOftSearchProfileRegionDTO> value) {
        this.searchProfileRegions = value;
    }

    /**
     * Gets the value of the uniqueInPortals property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUniqueInPortals() {
        return uniqueInPortals;
    }

    /**
     * Sets the value of the uniqueInPortals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUniqueInPortals(Boolean value) {
        this.uniqueInPortals = value;
    }

}

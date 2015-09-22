
package org.datacontract.schemas._2004._07.octop_actionservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tHitDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tHitDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvertID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BodyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientSMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommercialMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DateOfFirstRelease" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateOfGrab" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateOfLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DetailURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HitRepeatCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCountry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdHit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdPortal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdRA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdVlastnictvi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdZUJ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Obec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfferType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Phone1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Phone2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Phone3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PhoneRepeatCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Publisher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SubRegion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="jtskx" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="jtsky" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="kodKatastralUzemi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nameRA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tHitDTO", propOrder = {
    "advertID",
    "area",
    "bodyText",
    "clientSMS",
    "commercialMode",
    "dateOfFirstRelease",
    "dateOfGrab",
    "dateOfLastChange",
    "detailURL",
    "email",
    "hitRepeatCount",
    "idCategory",
    "idCountry",
    "idHit",
    "idPortal",
    "idRA",
    "idRegion",
    "idVlastnictvi",
    "idZUJ",
    "locality",
    "obec",
    "offerType",
    "phone1",
    "phone2",
    "phone3",
    "phoneRepeatCount",
    "price",
    "publisher",
    "subCategory",
    "subRegion",
    "type",
    "jtskx",
    "jtsky",
    "kodKatastralUzemi",
    "nameRA"
})
public class THitDTO {

    @XmlElementRef(name = "AdvertID", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advertID;
    @XmlElementRef(name = "Area", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> area;
    @XmlElementRef(name = "BodyText", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bodyText;
    @XmlElementRef(name = "ClientSMS", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientSMS;
    @XmlElementRef(name = "CommercialMode", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> commercialMode;
    @XmlElementRef(name = "DateOfFirstRelease", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfFirstRelease;
    @XmlElement(name = "DateOfGrab")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfGrab;
    @XmlElementRef(name = "DateOfLastChange", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfLastChange;
    @XmlElementRef(name = "DetailURL", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detailURL;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "HitRepeatCount", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> hitRepeatCount;
    @XmlElementRef(name = "IdCategory", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCategory;
    @XmlElementRef(name = "IdCountry", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCountry;
    @XmlElement(name = "IdHit")
    protected Integer idHit;
    @XmlElement(name = "IdPortal")
    protected Integer idPortal;
    @XmlElementRef(name = "IdRA", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idRA;
    @XmlElementRef(name = "IdRegion", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idRegion;
    @XmlElementRef(name = "IdVlastnictvi", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idVlastnictvi;
    @XmlElementRef(name = "IdZUJ", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idZUJ;
    @XmlElementRef(name = "Locality", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locality;
    @XmlElementRef(name = "Obec", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obec;
    @XmlElementRef(name = "OfferType", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> offerType;
    @XmlElementRef(name = "Phone1", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> phone1;
    @XmlElementRef(name = "Phone2", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> phone2;
    @XmlElementRef(name = "Phone3", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> phone3;
    @XmlElementRef(name = "PhoneRepeatCount", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> phoneRepeatCount;
    @XmlElementRef(name = "Price", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> price;
    @XmlElementRef(name = "Publisher", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> publisher;
    @XmlElementRef(name = "SubCategory", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subCategory;
    @XmlElementRef(name = "SubRegion", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> subRegion;
    @XmlElement(name = "Type")
    protected Integer type;
    @XmlElementRef(name = "jtskx", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> jtskx;
    @XmlElementRef(name = "jtsky", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> jtsky;
    @XmlElementRef(name = "kodKatastralUzemi", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> kodKatastralUzemi;
    @XmlElementRef(name = "nameRA", namespace = "http://schemas.datacontract.org/2004/07/Octop.ActionService.DataTransferObjects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nameRA;

    /**
     * Gets the value of the advertID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvertID() {
        return advertID;
    }

    /**
     * Sets the value of the advertID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvertID(JAXBElement<String> value) {
        this.advertID = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setArea(JAXBElement<Integer> value) {
        this.area = value;
    }

    /**
     * Gets the value of the bodyText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBodyText() {
        return bodyText;
    }

    /**
     * Sets the value of the bodyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBodyText(JAXBElement<String> value) {
        this.bodyText = value;
    }

    /**
     * Gets the value of the clientSMS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientSMS() {
        return clientSMS;
    }

    /**
     * Sets the value of the clientSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientSMS(JAXBElement<String> value) {
        this.clientSMS = value;
    }

    /**
     * Gets the value of the commercialMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCommercialMode() {
        return commercialMode;
    }

    /**
     * Sets the value of the commercialMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCommercialMode(JAXBElement<Integer> value) {
        this.commercialMode = value;
    }

    /**
     * Gets the value of the dateOfFirstRelease property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfFirstRelease() {
        return dateOfFirstRelease;
    }

    /**
     * Sets the value of the dateOfFirstRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfFirstRelease(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfFirstRelease = value;
    }

    /**
     * Gets the value of the dateOfGrab property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfGrab() {
        return dateOfGrab;
    }

    /**
     * Sets the value of the dateOfGrab property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfGrab(XMLGregorianCalendar value) {
        this.dateOfGrab = value;
    }

    /**
     * Gets the value of the dateOfLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfLastChange() {
        return dateOfLastChange;
    }

    /**
     * Sets the value of the dateOfLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfLastChange(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfLastChange = value;
    }

    /**
     * Gets the value of the detailURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetailURL() {
        return detailURL;
    }

    /**
     * Sets the value of the detailURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetailURL(JAXBElement<String> value) {
        this.detailURL = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the hitRepeatCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHitRepeatCount() {
        return hitRepeatCount;
    }

    /**
     * Sets the value of the hitRepeatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHitRepeatCount(JAXBElement<Integer> value) {
        this.hitRepeatCount = value;
    }

    /**
     * Gets the value of the idCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCategory() {
        return idCategory;
    }

    /**
     * Sets the value of the idCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCategory(JAXBElement<Integer> value) {
        this.idCategory = value;
    }

    /**
     * Gets the value of the idCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCountry(JAXBElement<Integer> value) {
        this.idCountry = value;
    }

    /**
     * Gets the value of the idHit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdHit() {
        return idHit;
    }

    /**
     * Sets the value of the idHit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdHit(Integer value) {
        this.idHit = value;
    }

    /**
     * Gets the value of the idPortal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPortal() {
        return idPortal;
    }

    /**
     * Sets the value of the idPortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPortal(Integer value) {
        this.idPortal = value;
    }

    /**
     * Gets the value of the idRA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdRA() {
        return idRA;
    }

    /**
     * Sets the value of the idRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdRA(JAXBElement<Integer> value) {
        this.idRA = value;
    }

    /**
     * Gets the value of the idRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdRegion() {
        return idRegion;
    }

    /**
     * Sets the value of the idRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdRegion(JAXBElement<Integer> value) {
        this.idRegion = value;
    }

    /**
     * Gets the value of the idVlastnictvi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdVlastnictvi() {
        return idVlastnictvi;
    }

    /**
     * Sets the value of the idVlastnictvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdVlastnictvi(JAXBElement<Integer> value) {
        this.idVlastnictvi = value;
    }

    /**
     * Gets the value of the idZUJ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdZUJ() {
        return idZUJ;
    }

    /**
     * Sets the value of the idZUJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdZUJ(JAXBElement<String> value) {
        this.idZUJ = value;
    }

    /**
     * Gets the value of the locality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocality() {
        return locality;
    }

    /**
     * Sets the value of the locality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocality(JAXBElement<String> value) {
        this.locality = value;
    }

    /**
     * Gets the value of the obec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObec() {
        return obec;
    }

    /**
     * Sets the value of the obec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObec(JAXBElement<String> value) {
        this.obec = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOfferType(JAXBElement<Integer> value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPhone1(JAXBElement<Long> value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPhone2(JAXBElement<Long> value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the phone3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPhone3() {
        return phone3;
    }

    /**
     * Sets the value of the phone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPhone3(JAXBElement<Long> value) {
        this.phone3 = value;
    }

    /**
     * Gets the value of the phoneRepeatCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPhoneRepeatCount() {
        return phoneRepeatCount;
    }

    /**
     * Sets the value of the phoneRepeatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPhoneRepeatCount(JAXBElement<Integer> value) {
        this.phoneRepeatCount = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrice(JAXBElement<Integer> value) {
        this.price = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublisher(JAXBElement<String> value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubCategory(JAXBElement<Integer> value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the subRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSubRegion() {
        return subRegion;
    }

    /**
     * Sets the value of the subRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSubRegion(JAXBElement<Integer> value) {
        this.subRegion = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setType(Integer value) {
        this.type = value;
    }

    /**
     * Gets the value of the jtskx property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getJtskx() {
        return jtskx;
    }

    /**
     * Sets the value of the jtskx property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setJtskx(JAXBElement<Long> value) {
        this.jtskx = value;
    }

    /**
     * Gets the value of the jtsky property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getJtsky() {
        return jtsky;
    }

    /**
     * Sets the value of the jtsky property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setJtsky(JAXBElement<Long> value) {
        this.jtsky = value;
    }

    /**
     * Gets the value of the kodKatastralUzemi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getKodKatastralUzemi() {
        return kodKatastralUzemi;
    }

    /**
     * Sets the value of the kodKatastralUzemi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setKodKatastralUzemi(JAXBElement<Integer> value) {
        this.kodKatastralUzemi = value;
    }

    /**
     * Gets the value of the nameRA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNameRA() {
        return nameRA;
    }

    /**
     * Sets the value of the nameRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNameRA(JAXBElement<String> value) {
        this.nameRA = value;
    }

}

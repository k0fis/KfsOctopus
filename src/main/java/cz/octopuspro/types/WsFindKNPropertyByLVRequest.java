
package cz.octopuspro.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_find_KN_property_by_LV_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_find_KN_property_by_LV_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.octopuspro.cz/types/}RequestBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CisloJednotky" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CisloParcelyVedlejsi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CisloParcelyZakladni" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CisloStavby" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KodCastObec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KodKatastralUzemi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="KodObec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PuvodParcely" type="{http://www.octopuspro.cz/types/}iPuvodParcely" minOccurs="0"/&gt;
 *         &lt;element name="PuvodParcelyPodTyp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="TypNemovitosti" type="{http://www.octopuspro.cz/types/}iTypNemovitosti" minOccurs="0"/&gt;
 *         &lt;element name="TypParcely" type="{http://www.octopuspro.cz/types/}iTypParcely" minOccurs="0"/&gt;
 *         &lt;element name="TypStavby" type="{http://www.octopuspro.cz/types/}iTypStavby" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_find_KN_property_by_LV_Request", propOrder = {
    "cisloJednotky",
    "cisloParcelyVedlejsi",
    "cisloParcelyZakladni",
    "cisloStavby",
    "kodCastObec",
    "kodKatastralUzemi",
    "kodObec",
    "lv",
    "puvodParcely",
    "puvodParcelyPodTyp",
    "typNemovitosti",
    "typParcely",
    "typStavby"
})
public class WsFindKNPropertyByLVRequest
    extends RequestBase
{

    @XmlElementRef(name = "CisloJednotky", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cisloJednotky;
    @XmlElementRef(name = "CisloParcelyVedlejsi", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cisloParcelyVedlejsi;
    @XmlElementRef(name = "CisloParcelyZakladni", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cisloParcelyZakladni;
    @XmlElementRef(name = "CisloStavby", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cisloStavby;
    @XmlElementRef(name = "KodCastObec", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> kodCastObec;
    @XmlElementRef(name = "KodKatastralUzemi", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> kodKatastralUzemi;
    @XmlElementRef(name = "KodObec", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> kodObec;
    @XmlElementRef(name = "LV", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lv;
    @XmlList
    @XmlElement(name = "PuvodParcely")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> puvodParcely;
    @XmlElementRef(name = "PuvodParcelyPodTyp", namespace = "http://www.octopuspro.cz/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> puvodParcelyPodTyp;
    @XmlElement(name = "TypNemovitosti")
    @XmlSchemaType(name = "string")
    protected ITypNemovitosti typNemovitosti;
    @XmlList
    @XmlElement(name = "TypParcely")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> typParcely;
    @XmlList
    @XmlElement(name = "TypStavby")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> typStavby;

    /**
     * Gets the value of the cisloJednotky property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCisloJednotky() {
        return cisloJednotky;
    }

    /**
     * Sets the value of the cisloJednotky property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCisloJednotky(JAXBElement<Integer> value) {
        this.cisloJednotky = value;
    }

    /**
     * Gets the value of the cisloParcelyVedlejsi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCisloParcelyVedlejsi() {
        return cisloParcelyVedlejsi;
    }

    /**
     * Sets the value of the cisloParcelyVedlejsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCisloParcelyVedlejsi(JAXBElement<Integer> value) {
        this.cisloParcelyVedlejsi = value;
    }

    /**
     * Gets the value of the cisloParcelyZakladni property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCisloParcelyZakladni() {
        return cisloParcelyZakladni;
    }

    /**
     * Sets the value of the cisloParcelyZakladni property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCisloParcelyZakladni(JAXBElement<Integer> value) {
        this.cisloParcelyZakladni = value;
    }

    /**
     * Gets the value of the cisloStavby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCisloStavby() {
        return cisloStavby;
    }

    /**
     * Sets the value of the cisloStavby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCisloStavby(JAXBElement<Integer> value) {
        this.cisloStavby = value;
    }

    /**
     * Gets the value of the kodCastObec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getKodCastObec() {
        return kodCastObec;
    }

    /**
     * Sets the value of the kodCastObec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setKodCastObec(JAXBElement<Integer> value) {
        this.kodCastObec = value;
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
     * Gets the value of the kodObec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getKodObec() {
        return kodObec;
    }

    /**
     * Sets the value of the kodObec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setKodObec(JAXBElement<Integer> value) {
        this.kodObec = value;
    }

    /**
     * Gets the value of the lv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLV() {
        return lv;
    }

    /**
     * Sets the value of the lv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLV(JAXBElement<Integer> value) {
        this.lv = value;
    }

    /**
     * Gets the value of the puvodParcely property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the puvodParcely property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPuvodParcely().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPuvodParcely() {
        if (puvodParcely == null) {
            puvodParcely = new ArrayList<String>();
        }
        return this.puvodParcely;
    }

    /**
     * Gets the value of the puvodParcelyPodTyp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPuvodParcelyPodTyp() {
        return puvodParcelyPodTyp;
    }

    /**
     * Sets the value of the puvodParcelyPodTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPuvodParcelyPodTyp(JAXBElement<Short> value) {
        this.puvodParcelyPodTyp = value;
    }

    /**
     * Gets the value of the typNemovitosti property.
     * 
     * @return
     *     possible object is
     *     {@link ITypNemovitosti }
     *     
     */
    public ITypNemovitosti getTypNemovitosti() {
        return typNemovitosti;
    }

    /**
     * Sets the value of the typNemovitosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITypNemovitosti }
     *     
     */
    public void setTypNemovitosti(ITypNemovitosti value) {
        this.typNemovitosti = value;
    }

    /**
     * Gets the value of the typParcely property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typParcely property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypParcely().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypParcely() {
        if (typParcely == null) {
            typParcely = new ArrayList<String>();
        }
        return this.typParcely;
    }

    /**
     * Gets the value of the typStavby property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typStavby property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypStavby().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypStavby() {
        if (typStavby == null) {
            typStavby = new ArrayList<String>();
        }
        return this.typStavby;
    }

}

package kfs.kfsbotoctopus.domain;

import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import kfs.kfscrm.api.KfsCrmDetail;
import kfs.kfscrm.domain.KfsContact;
import kfs.kfscrm.domain.KfsNoContact;
import kfs.kfsvaalib.kfsForm.KfsField;
import kfs.kfsvaalib.kfsForm.KfsMField;

/**
 *
 * @author pavedrim
 */
@Entity
public class OctoAdvert implements KfsCrmDetail {

    @Override
    public Timestamp getDetailDate() {
        return getImported();
    }

    @Override
    public String getDetailName() {
        return "O inzerat";
    }

    @Override
    public String getDetailText() {
        return getBodyText().substring(0, 50);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private KfsContact contact;
    @OneToOne
    private KfsNoContact noContact;

    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 10, readOnly = true))
    @OneToOne
    private OctoCategory category;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 20, readOnly = true))
    @OneToOne
    private OctoSubcategory subCategory;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 30, readOnly = true))
    @OneToOne
    private OctoOfferType offerType;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 40, readOnly = true))
    @OneToOne
    private OctoCommercialMode commercialMode;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 50, readOnly = true))
    @OneToOne
    private OctoRegion region;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 60, readOnly = true))
    @OneToOne
    private OctoSubRegion subregion;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 70, readOnly = true))
    @Lob
    private String bodyText;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 80, readOnly = true))
    private String phone1;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 90, readOnly = true))
    private String phone2;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 100, readOnly = true))
    private String phone3;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 110, readOnly = true))
    private Timestamp dateOfFirstRelease;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 120, readOnly = true))
    private Timestamp dateOfLastChange;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 130, readOnly = true))
    private String detailURL;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 140, readOnly = true))
    private String clientSMS;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 150, readOnly = true))
    private Integer price;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 160, readOnly = true))
    private String locality; // street
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 170, readOnly = true))
    private Integer area; //plocha
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 180, readOnly = true))
    @OneToOne
    private OctoCountry country;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 190, readOnly = true))
    @OneToOne
    private OctoOwnership ownerhip;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 200, readOnly = true))
    private String email;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 210, readOnly = true))
    private String publisher;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 220, readOnly = true))
    private Long jtskx;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 230, readOnly = true))
    private Long jtsky;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 240, readOnly = true))
    private Integer kodKatastralUzemi;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 250, readOnly = true))
    private String obec;
    
    @KfsMField(@KfsField(name = "OctoAdvertDlg", pos = 260, readOnly = true))
    private Timestamp imported;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KfsContact getContact() {
        return contact;
    }

    public void setContact(KfsContact contact) {
        this.contact = contact;
    }

    public KfsNoContact getNoContact() {
        return noContact;
    }

    public void setNoContact(KfsNoContact noContact) {
        this.noContact = noContact;
    }

    public OctoCategory getCategory() {
        return category;
    }

    public void setCategory(OctoCategory category) {
        this.category = category;
    }

    public OctoSubcategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(OctoSubcategory subCategory) {
        this.subCategory = subCategory;
    }

    public OctoOfferType getOfferType() {
        return offerType;
    }

    public void setOfferType(OctoOfferType offerType) {
        this.offerType = offerType;
    }

    public OctoCommercialMode getCommercialMode() {
        return commercialMode;
    }

    public void setCommercialMode(OctoCommercialMode commercialMode) {
        this.commercialMode = commercialMode;
    }

    public OctoRegion getRegion() {
        return region;
    }

    public void setRegion(OctoRegion region) {
        this.region = region;
    }

    public OctoSubRegion getSubregion() {
        return subregion;
    }

    public void setSubregion(OctoSubRegion subregion) {
        this.subregion = subregion;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public Timestamp getDateOfFirstRelease() {
        return dateOfFirstRelease;
    }

    public void setDateOfFirstRelease(Timestamp dateOfFirstRelease) {
        this.dateOfFirstRelease = dateOfFirstRelease;
    }

    public Timestamp getDateOfLastChange() {
        return dateOfLastChange;
    }

    public void setDateOfLastChange(Timestamp dateOfLastChange) {
        this.dateOfLastChange = dateOfLastChange;
    }

    public String getDetailURL() {
        return detailURL;
    }

    public void setDetailURL(String detailURL) {
        this.detailURL = detailURL;
    }

    public String getClientSMS() {
        return clientSMS;
    }

    public void setClientSMS(String clientSMS) {
        this.clientSMS = clientSMS;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public OctoCountry getCountry() {
        return country;
    }

    public void setCountry(OctoCountry country) {
        this.country = country;
    }

    public OctoOwnership getOwnerhip() {
        return ownerhip;
    }

    public void setOwnerhip(OctoOwnership ownerhip) {
        this.ownerhip = ownerhip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getJtskx() {
        return jtskx;
    }

    public void setJtskx(Long jtskx) {
        this.jtskx = jtskx;
    }

    public Long getJtsky() {
        return jtsky;
    }

    public void setJtsky(Long jtsky) {
        this.jtsky = jtsky;
    }

    public Integer getKodKatastralUzemi() {
        return kodKatastralUzemi;
    }

    public void setKodKatastralUzemi(Integer kodKatastralUzemi) {
        this.kodKatastralUzemi = kodKatastralUzemi;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public Timestamp getImported() {
        return imported;
    }

    public void setImported(Timestamp imported) {
        this.imported = imported;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OctoAdvert other = (OctoAdvert) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}

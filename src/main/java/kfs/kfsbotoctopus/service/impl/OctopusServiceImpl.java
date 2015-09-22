package kfs.kfsbotoctopus.service.impl;

import cz.octopuspro.octopusproservice.*;
import cz.octopuspro.types.*;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.NoResultException;
import kfs.kfsPhoneService.service.PhoneService;
import kfs.kfsbotoctopus.dao.*;
import kfs.kfsbotoctopus.domain.*;
import kfs.kfsbotoctopus.service.OctopusReplyService;
import kfs.kfsbotoctopus.service.OctopusService;
import kfs.kfscrm.api.KfsCrmDetailLoader;
import kfs.kfscrm.domain.KfsContact;
import kfs.kfscrm.service.CrmService;
import kfs.mailingservice.service.MailingService;
import org.apache.log4j.Logger;
import org.datacontract.schemas._2004._07.octop_actionservice.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author pavedrim
 */
@Service
@Transactional
public class OctopusServiceImpl implements OctopusService, InitializingBean, KfsCrmDetailLoader<OctoAdvert> {

    final Logger log = Logger.getLogger(getClass());

    @Value("${octo.autoloadCountersOnInit}")
    private boolean autoloadCountersOnInit;

    @Autowired
    private CrmService crmService;
    @Autowired(required = false)
    private MailingService mailingService;
    @Autowired(required = false)
    private PhoneService phoneService;

    @Autowired
    private OctoAdvertDao advertDao;
    @Autowired
    private OctoCategoryDao categoryDao;
    @Autowired
    private OctoOfferTypeDao offerTypeDao;
    @Autowired
    private OctoSubcategoryDao subcategoryDao;
    @Autowired
    private OctoCommercialModeDao commercialModeDao;
    @Autowired
    private OctoRegionDao regionDao;
    @Autowired
    private OctoSubRegionDao subregionDao;
    @Autowired
    private OctoCountryDao countryDao;
    @Autowired
    private OctoOwnershipDao ownershipDao;
    @Autowired
    private OctopusReplyService octopusReplyService;

    private IOctopusService octosvc;

    @Value("${octo.profilePrefix}")
    private String profilePrefix;
    @Value("${octo.clientId}")
    private int clientId;
    @Value("${octo.clientTag}")
    private String clientTag;
    @Value("${octo.clientUsername}")
    private String clientUsername;
    @Value("${octo.clientPwd}")
    private String clientPwd;

    @Value("${octo.username}")
    private String username;

    @Value("${octo.w8ms}")
    private long octoW8ms;

    private cz.octopuspro.types.ObjectFactory ofa;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Initializing OctopusPro services");
        URL url = getClass().getResource("/wsdl/OctopusProService.svc.wsdl_wsdl0.wsdl");
        if (false) {
            try {
                OctopusProService op = new OctopusProService(url);
                ofa = new cz.octopuspro.types.ObjectFactory();
                octosvc = op.getBasicHttpEndpoint();
                log.info("Initializing OctopusPro services done");
            } catch (Exception ex) {
                log.error("Cannot init octo service");
            }
        }
        crmService.registerContactDetail(OctoAdvert.class, this);
    }

    private void addOcto(THitDTO q) {
        OctoAdvert oa = new OctoAdvert();
        if ((q.getIdCategory() != null) && !q.getIdCategory().isNil() && (q.getIdCategory().getValue() != null)) {
            oa.setCategory(getCatagory(q.getIdCategory().getValue()));
        }
        if ((q.getSubCategory() != null) && !q.getSubCategory().isNil() && (q.getSubCategory().getValue() != null)) {
            oa.setSubCategory(getSubcategory(q.getSubCategory().getValue()));
        }
        if ((q.getOfferType() != null) && !q.getOfferType().isNil() && (q.getOfferType().getValue() != null)) {
            oa.setOfferType(getOfferType(q.getOfferType().getValue()));
        }
        if ((q.getCommercialMode() != null) && !q.getCommercialMode().isNil() && (q.getCommercialMode().getValue() != null)) {
            oa.setCommercialMode(getCommercialMode(q.getCommercialMode().getValue()));
        }
        if ((q.getIdRegion() != null) && !q.getIdRegion().isNil() && (q.getIdRegion().getValue() != null)) {
            oa.setRegion(getRegion(q.getIdRegion().getValue()));
        }
        if ((q.getSubRegion() != null) && !q.getSubRegion().isNil() && (q.getSubRegion().getValue() != null)) {
            oa.setSubregion(getSubregion(q.getSubRegion().getValue()));
        }
        if ((q.getBodyText() != null) && q.getBodyText().isNil()) {
            oa.setBodyText(q.getBodyText().getValue());
        }
        if ((q.getPhone1() != null) && q.getPhone1().isNil() && (q.getPhone1().getValue() != null)) {
            oa.setPhone1(q.getPhone1().getValue().toString());
            if (phoneService != null) {
                oa.setPhone1(phoneService.getczValidPhone(oa.getPhone1()));
            }
        }
        if ((q.getPhone2() != null) && q.getPhone2().isNil() && (q.getPhone2().getValue() != null)) {
            oa.setPhone2(q.getPhone2().getValue().toString());
            if (phoneService != null) {
                oa.setPhone1(phoneService.getczValidPhone(oa.getPhone1()));
            }
        }
        if ((q.getPhone3() != null) && q.getPhone3().isNil() && (q.getPhone3().getValue() != null)) {
            oa.setPhone3(q.getPhone3().getValue().toString());
            if (phoneService != null) {
                oa.setPhone1(phoneService.getczValidPhone(oa.getPhone1()));
            }
        }
        if ((q.getDateOfFirstRelease() != null) && !q.getDateOfFirstRelease().isNil() && (q.getDateOfFirstRelease().getValue() != null)) {
            oa.setDateOfFirstRelease(new Timestamp(q.getDateOfFirstRelease().getValue().toGregorianCalendar().getTimeInMillis()));
        }
        if ((q.getDateOfLastChange() != null) && !q.getDateOfLastChange().isNil() && (q.getDateOfLastChange().getValue() != null)) {
            oa.setDateOfLastChange(new Timestamp(q.getDateOfLastChange().getValue().toGregorianCalendar().getTimeInMillis()));
        }
        if ((q.getDetailURL() != null) && !q.getDetailURL().isNil()) {
            oa.setDetailURL(q.getDetailURL().getValue());
        }
        if ((q.getClientSMS() != null) && !q.getClientSMS().isNil()) {
            oa.setClientSMS(q.getClientSMS().getValue());
        }
        if ((q.getPrice() != null) && !q.getPrice().isNil()) {
            oa.setPrice(q.getPrice().getValue());
        }
        if ((q.getLocality() != null) && !q.getLocality().isNil()) {
            oa.setLocality(q.getLocality().getValue());
        }
        if ((q.getArea() != null) && q.getArea().isNil()) {
            oa.setArea(q.getArea().getValue());
        }
        if ((q.getIdCountry() != null) && q.getIdCountry().isNil() && (q.getIdCountry().getValue() != null)) {
            oa.setCountry(getCountry(q.getIdCountry().getValue()));
        }
        if ((q.getIdVlastnictvi() != null) && !q.getIdVlastnictvi().isNil() && (q.getIdVlastnictvi().getValue() != null)) {
            oa.setOwnerhip(getOwnerhip(q.getIdVlastnictvi().getValue()));
        }
        if ((q.getEmail() != null) && !q.getEmail().isNil()) {
            oa.setEmail(q.getEmail().getValue());
            if ((mailingService != null) && !mailingService.isValidEmailAddress(oa.getEmail())) {
                log.error("Invalid mail: " + oa.getEmail());
                oa.setEmail(null);
            }
        }
        if ((q.getPublisher() != null) && !q.getPublisher().isNil()) {
            oa.setPublisher(q.getPublisher().getValue());
        }
        if ((q.getJtskx() != null) && !q.getJtskx().isNil()) {
            oa.setJtskx(q.getJtskx().getValue());
        }
        if ((q.getJtsky() != null) && !q.getJtsky().isNil()) {
            oa.setJtsky(q.getJtsky().getValue());
        }
        if ((q.getKodKatastralUzemi() != null) && !q.getKodKatastralUzemi().isNil()) {
            oa.setKodKatastralUzemi(q.getKodKatastralUzemi().getValue());
        }
        if ((q.getObec() != null) && !q.getObec().isNil()) {
            oa.setObec(q.getObec().getValue());
        }
        oa.setImported(new Timestamp(new Date().getTime()));
        KfsContact co = null;
        if (oa.getPhone1() != null) {
            co = crmService.contactFindByPhone(oa.getPhone1(), username);
        }
        if ((co == null) && (oa.getPhone2() != null)) {
            co = crmService.contactFindByPhone(oa.getPhone2(), username);
        }
        if ((co == null) && (oa.getPhone3() != null)) {
            co = crmService.contactFindByPhone(oa.getPhone3(), username);
        }
        if ((co == null) && (oa.getEmail() != null)) {
            co = crmService.contactFindByMail(oa.getEmail(), username);
        }
        if (co != null) {
            if (oa.getPhone1() != null) {
                crmService.contactAddPhone(co, oa.getPhone1(), true, username);
            }
            if (oa.getPhone2() != null) {
                crmService.contactAddPhone(co, oa.getPhone2(), false, username);
            }
            if (oa.getPhone3() != null) {
                crmService.contactAddPhone(co, oa.getPhone3(), false, username);
            }
            if (oa.getEmail() != null) {
                crmService.contactAddMail(co, oa.getEmail(), true, username);
            }
            oa.setContact(co);
        } else {
            oa.setNoContact(crmService.nocontactCreate(username));
        }
        advertDao.insert(oa);
        if (co == null) {
            return;
        }
        if (co.isBlacklist()) {
            return;
        }
        octopusReplyService.replyOctopus(oa, co);
    }

    private <T extends RequestBase> T prepareRb(T rb) {
        rb.setClientTag(ofa.createRequestBaseClientTag(clientTag));
        rb.setClientUsername(ofa.createRequestBaseClientUsername(clientUsername));
        rb.setClientPassword(ofa.createRequestBaseClientPassword(clientPwd));
        rb.setRequestId(ofa.createRequestBaseRequestId("C0f15-" + UUID.randomUUID().toString()));
        return rb;
    }

    OctoOwnership getOwnerhip(Integer oid) {
        try {
            return ownershipDao.findById(oid);
        } catch (NoResultException ex) {
            log.warn("Try to use Ownership: " + oid);
        }
        OctoOwnership o = new OctoOwnership();
        o.setId(oid);
        o.setName(oid.toString());
        ownershipDao.insert(o);
        return o;
    }

    OctoCountry getCountry(Integer cid) {
        try {
            return countryDao.findById(cid);
        } catch (NoResultException ex) {
            log.warn("Try to use Country: " + cid);
        }
        OctoCountry oc = new OctoCountry();
        oc.setId(cid);
        oc.setName(cid.toString());
        countryDao.insert(oc);
        return oc;
    }

    OctoSubRegion getSubregion(Integer rid) {
        try {
            return subregionDao.findById(rid);
        } catch (NoResultException ex) {
            log.warn("Try to use SubRegion: " + rid);
        }
        OctoSubRegion or = new OctoSubRegion();
        or.setIdSubRegion(rid);
        or.setSubRegionName(rid.toString());
        return or;
    }

    OctoRegion getRegion(Integer rid) {
        try {
            return regionDao.findById(rid);
        } catch (NoResultException ex) {
            log.warn("Try to use Region: " + rid);
        }
        OctoRegion or = new OctoRegion();
        or.setIdRegion(rid);
        or.setRegionName(rid.toString());
        return or;
    }

    OctoCommercialMode getCommercialMode(Integer cmid) {
        try {
            return commercialModeDao.findById(cmid);
        } catch (NoResultException ex) {
            log.warn("Try to use CommercialMode: " + cmid);
        }
        OctoCommercialMode cm = new OctoCommercialMode();
        cm.setIdCommercialMode(cmid);
        cm.setCommercialModeName(cmid.toString());
        commercialModeDao.insert(cm);
        return cm;
    }

    OctoOfferType getOfferType(Integer id) {
        try {
            return offerTypeDao.findById(id);
        } catch (NoResultException ex) {
            log.warn("Try to use OfferType: " + id);
        }
        OctoOfferType oo = new OctoOfferType();
        oo.setId(id);
        oo.setName(id.toString());
        offerTypeDao.insert(oo);
        return oo;
    }

    OctoSubcategory getSubcategory(Integer sid) {
        try {
            return subcategoryDao.findById(sid);
        } catch (NoResultException ex) {
            log.warn("Try to find Subatagory with id: " + sid);
        }
        OctoSubcategory oc = new OctoSubcategory();
        oc.setIdSubCategory(sid);
        oc.setSubCategoryName(sid.toString());
        subcategoryDao.insert(oc);
        return oc;
    }

    OctoCategory getCatagory(Integer idCatagory) {
        try {
            return categoryDao.findById(idCatagory);
        } catch (NoResultException ex) {
            log.warn("Try to find Catagory with id: " + idCatagory);
        }
        OctoCategory oc = new OctoCategory();
        oc.setIdCategory(idCatagory);
        oc.setCategoryName(idCatagory.toString());
        categoryDao.insert(oc);
        return oc;
    }

    private <T extends ResponseBase> T check(String name, T resp) {
        if (resp.getAcknowledge() == AcknowledgeType.FAILURE) {
            String msg;
            if (!resp.getMessage().isNil() && (resp.getMessage().getValue() != null)) {
                msg = resp.getMessage().getValue();
            } else {
                msg = "";
            }
            log.error("Cannot call " + name + ": " + msg + ".");
        }
        return resp;
    }

    public int loadOwnership() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVOwnershipResponse res = check("GetLOVOwnership",
                octosvc.wsOctopGetLOVOwnership(prepareRb(ofa.createLOVOwnershipRequest())));
        if ((res != null)
                && (res.getOwnerships() != null)
                && (!res.getOwnerships().isNil())
                && (res.getOwnerships().getValue() != null)
                && (res.getOwnerships().getValue().getOwnershipDTO() != null)) {
            for (OwnershipDTO cado : res.getOwnerships().getValue().getOwnershipDTO()) {
                OctoOwnership oc = ownershipDao.findById(cado.getIdOwnership());
                if (oc == null) {
                    oc = new OctoOwnership();
                    oc.setId(cado.getIdOwnership());
                    oc.setName(cado.getOwnershipName().getValue());
                    ownershipDao.insert(oc);
                    ins++;
                } else {
                    oc.setName(cado.getOwnershipName().getValue());
                    ownershipDao.update(oc);
                }
            }
        } else {
            log.error("GetLOVOwnership return null");
        }
        return ins;
    }

    public int loadCountry() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVCountryResponse res = check("GetLOVCountry",
                octosvc.wsOctopGetLOVCountry(prepareRb(ofa.createLOVCountryRequest())));
        if ((res != null)
                && (res.getCountries() != null)
                && (!res.getCountries().isNil())
                && (res.getCountries().getValue() != null)
                && (res.getCountries().getValue().getCountryDTO() != null)) {
            for (CountryDTO cado : res.getCountries().getValue().getCountryDTO()) {
                OctoCountry oc = countryDao.findById(cado.getIdCountry());
                if (oc == null) {
                    oc = new OctoCountry();
                    oc.setId(cado.getIdCountry());
                    oc.setName(cado.getCountryName().getValue());
                    countryDao.insert(oc);
                    ins++;
                } else {
                    oc.setName(cado.getCountryName().getValue());
                    countryDao.update(oc);
                }
            }
        } else {
            log.error("GetLOVCountry return null");
        }
        return ins;
    }

    public int loadSubRegion() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVSubRegionReponse res = check("GetLOVSubRegion",
                octosvc.wsOctopGetLOVSubRegion(prepareRb(ofa.createLOVSubRegionRequest())));
        if ((res != null)
                && (res.getSubRegions() != null)
                && (!res.getSubRegions().isNil())
                && (res.getSubRegions().getValue() != null)
                && (res.getSubRegions().getValue().getSubRegionDTO() != null)) {
            for (SubRegionDTO cado : res.getSubRegions().getValue().getSubRegionDTO()) {
                OctoSubRegion oc = subregionDao.findById(cado.getIdSubRegion());
                if (oc == null) {
                    oc = new OctoSubRegion();
                    oc.setIdRegion(cado.getIdRegion());
                    oc.setIdSubRegion(cado.getIdSubRegion());
                    oc.setSubRegionName(cado.getSubRegionName().getValue());
                    subregionDao.insert(oc);
                    ins++;
                } else {
                    oc.setIdRegion(cado.getIdRegion());
                    oc.setSubRegionName(cado.getSubRegionName().getValue());
                    subregionDao.update(oc);
                }
            }
        } else {
            log.error("GetLOVCommercialMode return null");
        }
        return ins;
    }

    public int loadRegion() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVRegionResponse res = check("GetLOVRegion",
                octosvc.wsOctopGetLOVRegion(prepareRb(ofa.createLOVRegionRequest())));
        if ((res != null)
                && (res.getRegions() != null)
                && (!res.getRegions().isNil())
                && (res.getRegions().getValue() != null)
                && (res.getRegions().getValue().getRegionDTO() != null)) {
            for (RegionDTO cado : res.getRegions().getValue().getRegionDTO()) {
                OctoRegion oc = regionDao.findById(cado.getIdRegion());
                if (oc == null) {
                    oc = new OctoRegion();
                    oc.setIdRegion(cado.getIdRegion());
                    oc.setRegion(cado.getRegion());
                    oc.setRegionName(cado.getRegionName().getValue());
                    regionDao.insert(oc);
                    ins++;
                } else {
                    oc.setRegion(cado.getRegion());
                    oc.setRegionName(cado.getRegionName().getValue());
                    regionDao.update(oc);
                }
            }
        } else {
            log.error("GetLOVCommercialMode return null");
        }
        return ins;
    }

    public int loadComercialMode() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVCommercialModeResponse res = check("GetLOVCommercialMode",
                octosvc.wsOctopGetLOVCommercialMode(prepareRb(ofa.createLOVCommercialModeRequest())));
        if ((res != null)
                && (res.getCommercialModes() != null)
                && (!res.getCommercialModes().isNil())
                && (res.getCommercialModes().getValue() != null)
                && (res.getCommercialModes().getValue().getCommercialModeDTO() != null)) {
            for (CommercialModeDTO cado : res.getCommercialModes().getValue().getCommercialModeDTO()) {
                OctoCommercialMode oc = commercialModeDao.findById(cado.getIdCommercialMode());
                if (oc == null) {
                    oc = new OctoCommercialMode();
                    oc.setCommercialMode(cado.getCommercialMode());
                    oc.setCommercialModeName(cado.getCommercialModeName().getValue());
                    oc.setIdCommercialMode(cado.getIdCommercialMode());
                    commercialModeDao.insert(oc);
                    ins++;
                } else {
                    oc.setCommercialMode(cado.getCommercialMode());
                    oc.setCommercialModeName(cado.getCommercialModeName().getValue());
                    commercialModeDao.update(oc);
                }
            }
        } else {
            log.error("GetLOVCommercialMode return null");
        }
        return ins;
    }

    public int loadSubcategory() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVSubCategoryResponse res = check("GetLOVSubCategory",
                octosvc.wsOctopGetLOVSubCategory(prepareRb(ofa.createLOVSubCategoryRequest())));
        if ((res != null)
                && (res.getSubCategories() != null)
                && (!res.getSubCategories().isNil())
                && (res.getSubCategories().getValue() != null)
                && (res.getSubCategories().getValue().getSubCategoryDTO() != null)) {
            for (SubCategoryDTO cado : res.getSubCategories().getValue().getSubCategoryDTO()) {
                OctoSubcategory oc = subcategoryDao.findById(cado.getIdSubCategory());
                if (oc == null) {
                    oc = new OctoSubcategory();
                    oc.setIdCategory(cado.getIdCategory());
                    oc.setIdSubCategory(cado.getIdSubCategory());
                    oc.setSubCategory(cado.getSubCategory());
                    oc.setSubCategoryName(cado.getSubCategoryName().getValue());
                    subcategoryDao.insert(oc);
                    ins++;
                } else {
                    oc.setIdCategory(cado.getIdCategory());
                    oc.setSubCategory(cado.getSubCategory());
                    oc.setSubCategoryName(cado.getSubCategoryName().getValue());
                    subcategoryDao.update(oc);
                }
            }
        } else {
            log.error("GetLOVSubCategory return null");
        }
        return ins;
    }

    public int loadCategory() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVCategoryResponse res = check("GetLOVCategory",
                octosvc.wsOctopGetLOVCategory(prepareRb(ofa.createLOVCategoryRequest())));
        if ((res != null)
                && (res.getCategories() != null)
                && (!res.getCategories().isNil())
                && (res.getCategories().getValue() != null)
                && (res.getCategories().getValue().getCategoryDTO() != null)) {
            for (CategoryDTO cado : res.getCategories().getValue().getCategoryDTO()) {
                OctoCategory oc = categoryDao.findById(cado.getIdCategory());
                if (oc == null) {
                    oc = new OctoCategory();
                    oc.setCategory(cado.getCategory());
                    oc.setIdCategory(cado.getIdCategory());
                    oc.setCategoryName(cado.getCategoryName().getValue());
                    categoryDao.insert(oc);
                    ins++;
                } else {
                    oc.setCategory(cado.getCategory());
                    oc.setCategoryName(cado.getCategoryName().getValue());
                    categoryDao.update(oc);
                }
            }
        } else {
            log.error("GetLOVCategory return null");
        }
        return ins;
    }

    public int loadOfferType() {
        int ins = 0;
        if (!tryLogin()) {
            log.warn("Cannot login into octo service");
            return ins;
        }
        LOVOfferTypeResponse otres = check("LOVOfferType",
                octosvc.wsOctopGetLOVOfferType(prepareRb(ofa.createLOVOfferTypeRequest())));
        if ((otres.getOfferTypes() != null)
                && (!otres.getOfferTypes().isNil())
                && (otres.getOfferTypes().getValue() != null)
                && (otres.getOfferTypes().getValue().getOfferTypeDTO() != null)) {
            for (OfferTypeDTO otdo : otres.getOfferTypes().getValue().getOfferTypeDTO()) {
                if ((otdo.getOfferTypeName() != null)
                        && (!otdo.getOfferTypeName().isNil())
                        && (otdo.getOfferTypeName().getValue() != null)) {
                    OctoOfferType oot = offerTypeDao.findById(otdo.getOfferType());
                    if (oot == null) {
                        oot = new OctoOfferType();
                        oot.setId(otdo.getOfferType());
                        oot.setName(otdo.getOfferTypeName().getValue());
                        log.info("OfferTypeDTO: " + oot.getId() + ", " + oot.getName());
                        offerTypeDao.insert(oot);
                        ins++;
                    } else {
                        oot.setName(otdo.getOfferTypeName().getValue());
                        log.info("OfferTypeDTO - update: " + oot.getId() + ", " + oot.getName());
                        offerTypeDao.update(oot);

                    }
                } else {
                    log.error("OfferTypeDTO is null");
                }

            }
        } else {
            log.error("LOVOfferType return null");
        }
        return ins;
    }

    public boolean tryLogin() {
        WsTryLoginRequest tlre = prepareRb(ofa.createWsTryLoginRequest());
        if (octosvc == null) {
            log.error("octosvc is null");
            return false;
        }
        ResponseBase tlr = check("TryLogin", octosvc.wsTryLogin(tlre));
        if (tlr.getAcknowledge() == AcknowledgeType.FAILURE) {
            log.error("Cannot login");
            return false;
        }
        log.trace("Logged");
        return true;
    }

    @Override
    public void advertLoad() {
        if (!tryLogin()) {
            return;
        }

        RequestBase rb = prepareRb(new RequestBase());

        TUserResponse au = octosvc.wsOctopGetAvailableUsers(rb);
        List<TUserDTO> aus;
        if ((au != null) && (!au.getTUsers().isNil()) && (au.getTUsers().getValue() != null)
                && (au.getTUsers().getValue().getTUserDTO() != null)) {
            aus = au.getTUsers().getValue().getTUserDTO();
        } else {
            log.error("wsOctopGetAvailableUsers returns null");
            return;
        }
        Integer userId = null;
        for (TUserDTO usr : aus) {
            userId = usr.getIdUser();
            log.info("UserId: " + userId);
        }
        if (userId == null) {
            log.error("User Id is null");
            return;
        }

        TSearchProfileRequest tspr = prepareRb(new TSearchProfileRequest());
        tspr.setIdUser(userId);
        List<TSearchProfileDTO> ltspdtop;
        TSearchProfileResponse tspre = octosvc.wsOctopGetSearchProfilesForUser(tspr);
        if ((tspre != null) && (tspre.getTSearchProfiles() != null)
                && (!tspre.getTSearchProfiles().isNil())
                && (tspre.getTSearchProfiles().getValue() != null)
                && tspre.getTSearchProfiles().getValue().getTSearchProfileDTO() != null) {
            ltspdtop = tspre.getTSearchProfiles().getValue().getTSearchProfileDTO();
        } else {
            log.error("TSearchProfileResponse returns null value");
            return;
        }
        ArrayList<Integer> spl = new ArrayList<>();
        for (TSearchProfileDTO sp : ltspdtop) {
            if (sp.getProfileName().isNil()) {
                log.info("proile name is nill");
                continue;
            }
            log.info("proile name : " + sp.getProfileName().getValue());
            if (sp.getProfileName().getValue().startsWith(profilePrefix)) {
                spl.add(sp.getIdSearchProfile());
            }
        }

        if (spl.isEmpty()) {
            log.info("No Search profile id for dl advert");
            return;
        }
        for (Integer sp : spl) {
            WsOctop1ACriteria crit = new WsOctop1ACriteria();
            crit.setPage(4000);
            crit.setPageSize(1);
            WsOctop1ARequest rq = prepareRb(ofa.createWsOctop1ARequest());
            rq.setIdUser(userId);
            rq.setIdSearchProfile(ofa.createLOVCategoryRequestIdCategory(sp));
            rq.setCriteria(ofa.createWsOctop1ARequestCriteria(crit));
            THitResponse rs = check("", octosvc.wsOctop1A(rq));
            if ((rs != null) && (rs.getTHits() != null) && !rs.getTHits().isNil()
                    && (rs.getTHits().getValue() != null)
                    && (rs.getTHits().getValue().getTHitDTO() != null)) {
                for (THitDTO hit : rs.getTHits().getValue().getTHitDTO()) {
                    addOcto(hit);
                }
            }
        }
    }

    private void w8Ovto() {
        try {
            Thread.sleep(octoW8ms);
        } catch (InterruptedException ex) {
            log.error("Cannot wait " + octoW8ms, ex);
        }
    }

    @Override
    public int countersLoad() {
        int ins = 0;
        if (autoloadCountersOnInit) {
            log.info("Load Regions");
            ins += loadRegion();
            log.info("Load Regions Done");
            w8Ovto();
            log.info("Load Subregions");
            ins += loadSubRegion();
            log.info("Load Subregions Done");
            w8Ovto();
            log.info("Load ComercialMode");
            ins += loadComercialMode();
            log.info("Load ComercialMode Done");
            w8Ovto();
            log.info("Load Category");
            ins += loadCategory();
            log.info("Load Category Done");
            w8Ovto();
            log.info("Load Subcategory");
            ins += loadSubcategory();
            log.info("Load Subcategory Done");
            w8Ovto();
            log.info("Load OfferType");
            ins += loadOfferType();
            log.info("Load OfferType Done");
            w8Ovto();
            log.info("Load Country");
            ins += loadCountry();
            log.info("Load Country Done");
            w8Ovto();
            log.info("Load Ownership");
            ins += loadOwnership();
            log.info("Load Ownership Done");
        }
        return ins;
    }

    @Override
    public List<OctoAdvert> loadByContact(KfsContact contact) {
        return advertDao.loadByContact(contact);
    }

    public boolean isAutoloadCountersOnInit() {
        return autoloadCountersOnInit;
    }

    public void setAutoloadCountersOnInit(boolean autoloadCountersOnInit) {
        this.autoloadCountersOnInit = autoloadCountersOnInit;
    }

    public void setProfilePrefix(String profilePrefix) {
        this.profilePrefix = profilePrefix;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setClientTag(String clientTag) {
        this.clientTag = clientTag;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }

    public void setClientPwd(String clientPwd) {
        this.clientPwd = clientPwd;
    }

    @Override
    public List<OctoCategory> categoryLoad() {
        return categoryDao.loadAll();
    }

    @Override
    public List<OctoSubcategory> subcategoryLoad() {
        return subcategoryDao.loadAll();
    }

    @Override
    public List<OctoOfferType> offerTypeLoad() {
        return offerTypeDao.loadAll();
    }

    @Override
    public List<OctoCommercialMode> commercialModeLoad() {
        return commercialModeDao.loadAll();
    }

    @Override
    public List<OctoRegion> regionLoad() {
        return regionDao.loadAll();
    }

    @Override
    public List<OctoSubRegion> subregionLoad() {
        return subregionDao.loadAll();
    }

    @Override
    public List<OctoCountry> countryLoad() {
        return countryDao.loadAll();
    }

    @Override
    public List<OctoOwnership> ownershipLoad() {
        return ownershipDao.loadAll();
    }

}

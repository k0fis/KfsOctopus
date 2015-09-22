
package cz.octopuspro.octopusproservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import cz.octopuspro.types.LOVCategoryRequest;
import cz.octopuspro.types.LOVCategoryResponse;
import cz.octopuspro.types.LOVCommercialModeRequest;
import cz.octopuspro.types.LOVCommercialModeResponse;
import cz.octopuspro.types.LOVCountryRequest;
import cz.octopuspro.types.LOVCountryResponse;
import cz.octopuspro.types.LOVOfferTypeRequest;
import cz.octopuspro.types.LOVOfferTypeResponse;
import cz.octopuspro.types.LOVOwnershipRequest;
import cz.octopuspro.types.LOVOwnershipResponse;
import cz.octopuspro.types.LOVRegionRequest;
import cz.octopuspro.types.LOVRegionResponse;
import cz.octopuspro.types.LOVRoleRequest;
import cz.octopuspro.types.LOVRoleResponse;
import cz.octopuspro.types.LOVSubCategoryRequest;
import cz.octopuspro.types.LOVSubCategoryResponse;
import cz.octopuspro.types.LOVSubRegionReponse;
import cz.octopuspro.types.LOVSubRegionRequest;
import cz.octopuspro.types.RequestBase;
import cz.octopuspro.types.ResponseBase;
import cz.octopuspro.types.THitRequest;
import cz.octopuspro.types.THitResponse;
import cz.octopuspro.types.TSearchProfileRequest;
import cz.octopuspro.types.TSearchProfileResponse;
import cz.octopuspro.types.WsAddKNPropertyToLvkeeperRequest;
import cz.octopuspro.types.WsChangeLvkeeperNoteRequest;
import cz.octopuspro.types.WsFindKNPropertyByLVRequest;
import cz.octopuspro.types.WsGetLvkeeperDiffXmlRequest;
import cz.octopuspro.types.WsOctop1ARequest;
import cz.octopuspro.types.WsOctop1BRequest;
import cz.octopuspro.types.WsPairingRequest;
import cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperRequest;
import cz.octopuspro.types.WsTryLoginRequest;
import org.datacontract.schemas._2004._07.octop_actionservice.TUserResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.octopuspro.octopusproservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTHitRequest_QNAME = new QName("http://octopuspro.cz/OctopusProService", "request");
    private final static QName _GetTHitResponseGetTHitResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "get_tHitResult");
    private final static QName _WsOctop1AResponseWsOctop1AResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_1aResult");
    private final static QName _WsOctop1BResponseWsOctop1BResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_1bResult");
    private final static QName _WsOctopGetAvailableUsersResponseWsOctopGetAvailableUsersResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_AvailableUsersResult");
    private final static QName _WsOctopGetSearchProfilesForUserResponseWsOctopGetSearchProfilesForUserResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_SearchProfiles_For_UserResult");
    private final static QName _WsOctopGetLOVOfferTypeResponseWsOctopGetLOVOfferTypeResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_OfferTypeResult");
    private final static QName _WsOctopGetLOVCategoryResponseWsOctopGetLOVCategoryResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_CategoryResult");
    private final static QName _WsOctopGetLOVSubCategoryResponseWsOctopGetLOVSubCategoryResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_SubCategoryResult");
    private final static QName _WsOctopGetLOVCommercialModeResponseWsOctopGetLOVCommercialModeResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_CommercialModeResult");
    private final static QName _WsOctopGetLOVRegionResponseWsOctopGetLOVRegionResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_RegionResult");
    private final static QName _WsOctopGetLOVSubRegionResponseWsOctopGetLOVSubRegionResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_SubRegionResult");
    private final static QName _WsOctopGetLOVRoleResponseWsOctopGetLOVRoleResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_RoleResult");
    private final static QName _WsOctopGetLOVCountryResponseWsOctopGetLOVCountryResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_CountryResult");
    private final static QName _WsOctopGetLOVOwnershipResponseWsOctopGetLOVOwnershipResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_get_LOV_OwnershipResult");
    private final static QName _WsFindKNPropertyResponseWsFindKNPropertyResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_find_KN_propertyResult");
    private final static QName _WsAddKNPropertyToLvkeeperResponseWsAddKNPropertyToLvkeeperResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_add_KN_property_to_lvkeeperResult");
    private final static QName _WsRemoveKNPropertyFromLvkeeperResponseWsRemoveKNPropertyFromLvkeeperResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_remove_KN_property_from_lvkeeperResult");
    private final static QName _WsGetLvkeeperDiffXmlResponseWsGetLvkeeperDiffXmlResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_get_lvkeeper_diff_xmlResult");
    private final static QName _WsChangeLvkeeperNoteResponseWsChangeLvkeeperNoteResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_change_lvkeeper_noteResult");
    private final static QName _WsOctopPairingResponseWsOctopPairingResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_octop_pairingResult");
    private final static QName _HelloWorldResponseHelloWorldResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "HelloWorldResult");
    private final static QName _WsTryLoginResponseWsTryLoginResult_QNAME = new QName("http://octopuspro.cz/OctopusProService", "ws_tryLoginResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.octopuspro.octopusproservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTHit }
     * 
     */
    public GetTHit createGetTHit() {
        return new GetTHit();
    }

    /**
     * Create an instance of {@link GetTHitResponse }
     * 
     */
    public GetTHitResponse createGetTHitResponse() {
        return new GetTHitResponse();
    }

    /**
     * Create an instance of {@link WsOctop1A }
     * 
     */
    public WsOctop1A createWsOctop1A() {
        return new WsOctop1A();
    }

    /**
     * Create an instance of {@link WsOctop1AResponse }
     * 
     */
    public WsOctop1AResponse createWsOctop1AResponse() {
        return new WsOctop1AResponse();
    }

    /**
     * Create an instance of {@link WsOctop1B }
     * 
     */
    public WsOctop1B createWsOctop1B() {
        return new WsOctop1B();
    }

    /**
     * Create an instance of {@link WsOctop1BResponse }
     * 
     */
    public WsOctop1BResponse createWsOctop1BResponse() {
        return new WsOctop1BResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetAvailableUsers }
     * 
     */
    public WsOctopGetAvailableUsers createWsOctopGetAvailableUsers() {
        return new WsOctopGetAvailableUsers();
    }

    /**
     * Create an instance of {@link WsOctopGetAvailableUsersResponse }
     * 
     */
    public WsOctopGetAvailableUsersResponse createWsOctopGetAvailableUsersResponse() {
        return new WsOctopGetAvailableUsersResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetSearchProfilesForUser }
     * 
     */
    public WsOctopGetSearchProfilesForUser createWsOctopGetSearchProfilesForUser() {
        return new WsOctopGetSearchProfilesForUser();
    }

    /**
     * Create an instance of {@link WsOctopGetSearchProfilesForUserResponse }
     * 
     */
    public WsOctopGetSearchProfilesForUserResponse createWsOctopGetSearchProfilesForUserResponse() {
        return new WsOctopGetSearchProfilesForUserResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVOfferType }
     * 
     */
    public WsOctopGetLOVOfferType createWsOctopGetLOVOfferType() {
        return new WsOctopGetLOVOfferType();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVOfferTypeResponse }
     * 
     */
    public WsOctopGetLOVOfferTypeResponse createWsOctopGetLOVOfferTypeResponse() {
        return new WsOctopGetLOVOfferTypeResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVCategory }
     * 
     */
    public WsOctopGetLOVCategory createWsOctopGetLOVCategory() {
        return new WsOctopGetLOVCategory();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVCategoryResponse }
     * 
     */
    public WsOctopGetLOVCategoryResponse createWsOctopGetLOVCategoryResponse() {
        return new WsOctopGetLOVCategoryResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVSubCategory }
     * 
     */
    public WsOctopGetLOVSubCategory createWsOctopGetLOVSubCategory() {
        return new WsOctopGetLOVSubCategory();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVSubCategoryResponse }
     * 
     */
    public WsOctopGetLOVSubCategoryResponse createWsOctopGetLOVSubCategoryResponse() {
        return new WsOctopGetLOVSubCategoryResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVCommercialMode }
     * 
     */
    public WsOctopGetLOVCommercialMode createWsOctopGetLOVCommercialMode() {
        return new WsOctopGetLOVCommercialMode();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVCommercialModeResponse }
     * 
     */
    public WsOctopGetLOVCommercialModeResponse createWsOctopGetLOVCommercialModeResponse() {
        return new WsOctopGetLOVCommercialModeResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVRegion }
     * 
     */
    public WsOctopGetLOVRegion createWsOctopGetLOVRegion() {
        return new WsOctopGetLOVRegion();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVRegionResponse }
     * 
     */
    public WsOctopGetLOVRegionResponse createWsOctopGetLOVRegionResponse() {
        return new WsOctopGetLOVRegionResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVSubRegion }
     * 
     */
    public WsOctopGetLOVSubRegion createWsOctopGetLOVSubRegion() {
        return new WsOctopGetLOVSubRegion();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVSubRegionResponse }
     * 
     */
    public WsOctopGetLOVSubRegionResponse createWsOctopGetLOVSubRegionResponse() {
        return new WsOctopGetLOVSubRegionResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVRole }
     * 
     */
    public WsOctopGetLOVRole createWsOctopGetLOVRole() {
        return new WsOctopGetLOVRole();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVRoleResponse }
     * 
     */
    public WsOctopGetLOVRoleResponse createWsOctopGetLOVRoleResponse() {
        return new WsOctopGetLOVRoleResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVCountry }
     * 
     */
    public WsOctopGetLOVCountry createWsOctopGetLOVCountry() {
        return new WsOctopGetLOVCountry();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVCountryResponse }
     * 
     */
    public WsOctopGetLOVCountryResponse createWsOctopGetLOVCountryResponse() {
        return new WsOctopGetLOVCountryResponse();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVOwnership }
     * 
     */
    public WsOctopGetLOVOwnership createWsOctopGetLOVOwnership() {
        return new WsOctopGetLOVOwnership();
    }

    /**
     * Create an instance of {@link WsOctopGetLOVOwnershipResponse }
     * 
     */
    public WsOctopGetLOVOwnershipResponse createWsOctopGetLOVOwnershipResponse() {
        return new WsOctopGetLOVOwnershipResponse();
    }

    /**
     * Create an instance of {@link WsFindKNProperty }
     * 
     */
    public WsFindKNProperty createWsFindKNProperty() {
        return new WsFindKNProperty();
    }

    /**
     * Create an instance of {@link cz.octopuspro.octopusproservice.WsFindKNPropertyResponse }
     * 
     */
    public cz.octopuspro.octopusproservice.WsFindKNPropertyResponse createWsFindKNPropertyResponse() {
        return new cz.octopuspro.octopusproservice.WsFindKNPropertyResponse();
    }

    /**
     * Create an instance of {@link WsAddKNPropertyToLvkeeper }
     * 
     */
    public WsAddKNPropertyToLvkeeper createWsAddKNPropertyToLvkeeper() {
        return new WsAddKNPropertyToLvkeeper();
    }

    /**
     * Create an instance of {@link cz.octopuspro.octopusproservice.WsAddKNPropertyToLvkeeperResponse }
     * 
     */
    public cz.octopuspro.octopusproservice.WsAddKNPropertyToLvkeeperResponse createWsAddKNPropertyToLvkeeperResponse() {
        return new cz.octopuspro.octopusproservice.WsAddKNPropertyToLvkeeperResponse();
    }

    /**
     * Create an instance of {@link WsRemoveKNPropertyFromLvkeeper }
     * 
     */
    public WsRemoveKNPropertyFromLvkeeper createWsRemoveKNPropertyFromLvkeeper() {
        return new WsRemoveKNPropertyFromLvkeeper();
    }

    /**
     * Create an instance of {@link cz.octopuspro.octopusproservice.WsRemoveKNPropertyFromLvkeeperResponse }
     * 
     */
    public cz.octopuspro.octopusproservice.WsRemoveKNPropertyFromLvkeeperResponse createWsRemoveKNPropertyFromLvkeeperResponse() {
        return new cz.octopuspro.octopusproservice.WsRemoveKNPropertyFromLvkeeperResponse();
    }

    /**
     * Create an instance of {@link WsGetLvkeeperDiffXml }
     * 
     */
    public WsGetLvkeeperDiffXml createWsGetLvkeeperDiffXml() {
        return new WsGetLvkeeperDiffXml();
    }

    /**
     * Create an instance of {@link cz.octopuspro.octopusproservice.WsGetLvkeeperDiffXmlResponse }
     * 
     */
    public cz.octopuspro.octopusproservice.WsGetLvkeeperDiffXmlResponse createWsGetLvkeeperDiffXmlResponse() {
        return new cz.octopuspro.octopusproservice.WsGetLvkeeperDiffXmlResponse();
    }

    /**
     * Create an instance of {@link WsChangeLvkeeperNote }
     * 
     */
    public WsChangeLvkeeperNote createWsChangeLvkeeperNote() {
        return new WsChangeLvkeeperNote();
    }

    /**
     * Create an instance of {@link cz.octopuspro.octopusproservice.WsChangeLvkeeperNoteResponse }
     * 
     */
    public cz.octopuspro.octopusproservice.WsChangeLvkeeperNoteResponse createWsChangeLvkeeperNoteResponse() {
        return new cz.octopuspro.octopusproservice.WsChangeLvkeeperNoteResponse();
    }

    /**
     * Create an instance of {@link WsOctopPairing }
     * 
     */
    public WsOctopPairing createWsOctopPairing() {
        return new WsOctopPairing();
    }

    /**
     * Create an instance of {@link WsOctopPairingResponse }
     * 
     */
    public WsOctopPairingResponse createWsOctopPairingResponse() {
        return new WsOctopPairingResponse();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link WsTryLogin }
     * 
     */
    public WsTryLogin createWsTryLogin() {
        return new WsTryLogin();
    }

    /**
     * Create an instance of {@link WsTryLoginResponse }
     * 
     */
    public WsTryLoginResponse createWsTryLoginResponse() {
        return new WsTryLoginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THitRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = GetTHit.class)
    public JAXBElement<THitRequest> createGetTHitRequest(THitRequest value) {
        return new JAXBElement<THitRequest>(_GetTHitRequest_QNAME, THitRequest.class, GetTHit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "get_tHitResult", scope = GetTHitResponse.class)
    public JAXBElement<THitResponse> createGetTHitResponseGetTHitResult(THitResponse value) {
        return new JAXBElement<THitResponse>(_GetTHitResponseGetTHitResult_QNAME, THitResponse.class, GetTHitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsOctop1ARequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctop1A.class)
    public JAXBElement<WsOctop1ARequest> createWsOctop1ARequest(WsOctop1ARequest value) {
        return new JAXBElement<WsOctop1ARequest>(_GetTHitRequest_QNAME, WsOctop1ARequest.class, WsOctop1A.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_1aResult", scope = WsOctop1AResponse.class)
    public JAXBElement<THitResponse> createWsOctop1AResponseWsOctop1AResult(THitResponse value) {
        return new JAXBElement<THitResponse>(_WsOctop1AResponseWsOctop1AResult_QNAME, THitResponse.class, WsOctop1AResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsOctop1BRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctop1B.class)
    public JAXBElement<WsOctop1BRequest> createWsOctop1BRequest(WsOctop1BRequest value) {
        return new JAXBElement<WsOctop1BRequest>(_GetTHitRequest_QNAME, WsOctop1BRequest.class, WsOctop1B.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_1bResult", scope = WsOctop1BResponse.class)
    public JAXBElement<THitResponse> createWsOctop1BResponseWsOctop1BResult(THitResponse value) {
        return new JAXBElement<THitResponse>(_WsOctop1BResponseWsOctop1BResult_QNAME, THitResponse.class, WsOctop1BResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetAvailableUsers.class)
    public JAXBElement<RequestBase> createWsOctopGetAvailableUsersRequest(RequestBase value) {
        return new JAXBElement<RequestBase>(_GetTHitRequest_QNAME, RequestBase.class, WsOctopGetAvailableUsers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_AvailableUsersResult", scope = WsOctopGetAvailableUsersResponse.class)
    public JAXBElement<TUserResponse> createWsOctopGetAvailableUsersResponseWsOctopGetAvailableUsersResult(TUserResponse value) {
        return new JAXBElement<TUserResponse>(_WsOctopGetAvailableUsersResponseWsOctopGetAvailableUsersResult_QNAME, TUserResponse.class, WsOctopGetAvailableUsersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSearchProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetSearchProfilesForUser.class)
    public JAXBElement<TSearchProfileRequest> createWsOctopGetSearchProfilesForUserRequest(TSearchProfileRequest value) {
        return new JAXBElement<TSearchProfileRequest>(_GetTHitRequest_QNAME, TSearchProfileRequest.class, WsOctopGetSearchProfilesForUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSearchProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_SearchProfiles_For_UserResult", scope = WsOctopGetSearchProfilesForUserResponse.class)
    public JAXBElement<TSearchProfileResponse> createWsOctopGetSearchProfilesForUserResponseWsOctopGetSearchProfilesForUserResult(TSearchProfileResponse value) {
        return new JAXBElement<TSearchProfileResponse>(_WsOctopGetSearchProfilesForUserResponseWsOctopGetSearchProfilesForUserResult_QNAME, TSearchProfileResponse.class, WsOctopGetSearchProfilesForUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOfferTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVOfferType.class)
    public JAXBElement<LOVOfferTypeRequest> createWsOctopGetLOVOfferTypeRequest(LOVOfferTypeRequest value) {
        return new JAXBElement<LOVOfferTypeRequest>(_GetTHitRequest_QNAME, LOVOfferTypeRequest.class, WsOctopGetLOVOfferType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOfferTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_OfferTypeResult", scope = WsOctopGetLOVOfferTypeResponse.class)
    public JAXBElement<LOVOfferTypeResponse> createWsOctopGetLOVOfferTypeResponseWsOctopGetLOVOfferTypeResult(LOVOfferTypeResponse value) {
        return new JAXBElement<LOVOfferTypeResponse>(_WsOctopGetLOVOfferTypeResponseWsOctopGetLOVOfferTypeResult_QNAME, LOVOfferTypeResponse.class, WsOctopGetLOVOfferTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVCategory.class)
    public JAXBElement<LOVCategoryRequest> createWsOctopGetLOVCategoryRequest(LOVCategoryRequest value) {
        return new JAXBElement<LOVCategoryRequest>(_GetTHitRequest_QNAME, LOVCategoryRequest.class, WsOctopGetLOVCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_CategoryResult", scope = WsOctopGetLOVCategoryResponse.class)
    public JAXBElement<LOVCategoryResponse> createWsOctopGetLOVCategoryResponseWsOctopGetLOVCategoryResult(LOVCategoryResponse value) {
        return new JAXBElement<LOVCategoryResponse>(_WsOctopGetLOVCategoryResponseWsOctopGetLOVCategoryResult_QNAME, LOVCategoryResponse.class, WsOctopGetLOVCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVSubCategory.class)
    public JAXBElement<LOVSubCategoryRequest> createWsOctopGetLOVSubCategoryRequest(LOVSubCategoryRequest value) {
        return new JAXBElement<LOVSubCategoryRequest>(_GetTHitRequest_QNAME, LOVSubCategoryRequest.class, WsOctopGetLOVSubCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_SubCategoryResult", scope = WsOctopGetLOVSubCategoryResponse.class)
    public JAXBElement<LOVSubCategoryResponse> createWsOctopGetLOVSubCategoryResponseWsOctopGetLOVSubCategoryResult(LOVSubCategoryResponse value) {
        return new JAXBElement<LOVSubCategoryResponse>(_WsOctopGetLOVSubCategoryResponseWsOctopGetLOVSubCategoryResult_QNAME, LOVSubCategoryResponse.class, WsOctopGetLOVSubCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCommercialModeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVCommercialMode.class)
    public JAXBElement<LOVCommercialModeRequest> createWsOctopGetLOVCommercialModeRequest(LOVCommercialModeRequest value) {
        return new JAXBElement<LOVCommercialModeRequest>(_GetTHitRequest_QNAME, LOVCommercialModeRequest.class, WsOctopGetLOVCommercialMode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCommercialModeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_CommercialModeResult", scope = WsOctopGetLOVCommercialModeResponse.class)
    public JAXBElement<LOVCommercialModeResponse> createWsOctopGetLOVCommercialModeResponseWsOctopGetLOVCommercialModeResult(LOVCommercialModeResponse value) {
        return new JAXBElement<LOVCommercialModeResponse>(_WsOctopGetLOVCommercialModeResponseWsOctopGetLOVCommercialModeResult_QNAME, LOVCommercialModeResponse.class, WsOctopGetLOVCommercialModeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRegionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVRegion.class)
    public JAXBElement<LOVRegionRequest> createWsOctopGetLOVRegionRequest(LOVRegionRequest value) {
        return new JAXBElement<LOVRegionRequest>(_GetTHitRequest_QNAME, LOVRegionRequest.class, WsOctopGetLOVRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_RegionResult", scope = WsOctopGetLOVRegionResponse.class)
    public JAXBElement<LOVRegionResponse> createWsOctopGetLOVRegionResponseWsOctopGetLOVRegionResult(LOVRegionResponse value) {
        return new JAXBElement<LOVRegionResponse>(_WsOctopGetLOVRegionResponseWsOctopGetLOVRegionResult_QNAME, LOVRegionResponse.class, WsOctopGetLOVRegionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubRegionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVSubRegion.class)
    public JAXBElement<LOVSubRegionRequest> createWsOctopGetLOVSubRegionRequest(LOVSubRegionRequest value) {
        return new JAXBElement<LOVSubRegionRequest>(_GetTHitRequest_QNAME, LOVSubRegionRequest.class, WsOctopGetLOVSubRegion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubRegionReponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_SubRegionResult", scope = WsOctopGetLOVSubRegionResponse.class)
    public JAXBElement<LOVSubRegionReponse> createWsOctopGetLOVSubRegionResponseWsOctopGetLOVSubRegionResult(LOVSubRegionReponse value) {
        return new JAXBElement<LOVSubRegionReponse>(_WsOctopGetLOVSubRegionResponseWsOctopGetLOVSubRegionResult_QNAME, LOVSubRegionReponse.class, WsOctopGetLOVSubRegionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRoleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVRole.class)
    public JAXBElement<LOVRoleRequest> createWsOctopGetLOVRoleRequest(LOVRoleRequest value) {
        return new JAXBElement<LOVRoleRequest>(_GetTHitRequest_QNAME, LOVRoleRequest.class, WsOctopGetLOVRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_RoleResult", scope = WsOctopGetLOVRoleResponse.class)
    public JAXBElement<LOVRoleResponse> createWsOctopGetLOVRoleResponseWsOctopGetLOVRoleResult(LOVRoleResponse value) {
        return new JAXBElement<LOVRoleResponse>(_WsOctopGetLOVRoleResponseWsOctopGetLOVRoleResult_QNAME, LOVRoleResponse.class, WsOctopGetLOVRoleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCountryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVCountry.class)
    public JAXBElement<LOVCountryRequest> createWsOctopGetLOVCountryRequest(LOVCountryRequest value) {
        return new JAXBElement<LOVCountryRequest>(_GetTHitRequest_QNAME, LOVCountryRequest.class, WsOctopGetLOVCountry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_CountryResult", scope = WsOctopGetLOVCountryResponse.class)
    public JAXBElement<LOVCountryResponse> createWsOctopGetLOVCountryResponseWsOctopGetLOVCountryResult(LOVCountryResponse value) {
        return new JAXBElement<LOVCountryResponse>(_WsOctopGetLOVCountryResponseWsOctopGetLOVCountryResult_QNAME, LOVCountryResponse.class, WsOctopGetLOVCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOwnershipRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopGetLOVOwnership.class)
    public JAXBElement<LOVOwnershipRequest> createWsOctopGetLOVOwnershipRequest(LOVOwnershipRequest value) {
        return new JAXBElement<LOVOwnershipRequest>(_GetTHitRequest_QNAME, LOVOwnershipRequest.class, WsOctopGetLOVOwnership.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOwnershipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_get_LOV_OwnershipResult", scope = WsOctopGetLOVOwnershipResponse.class)
    public JAXBElement<LOVOwnershipResponse> createWsOctopGetLOVOwnershipResponseWsOctopGetLOVOwnershipResult(LOVOwnershipResponse value) {
        return new JAXBElement<LOVOwnershipResponse>(_WsOctopGetLOVOwnershipResponseWsOctopGetLOVOwnershipResult_QNAME, LOVOwnershipResponse.class, WsOctopGetLOVOwnershipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsFindKNPropertyByLVRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsFindKNProperty.class)
    public JAXBElement<WsFindKNPropertyByLVRequest> createWsFindKNPropertyRequest(WsFindKNPropertyByLVRequest value) {
        return new JAXBElement<WsFindKNPropertyByLVRequest>(_GetTHitRequest_QNAME, WsFindKNPropertyByLVRequest.class, WsFindKNProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsFindKNPropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_find_KN_propertyResult", scope = cz.octopuspro.octopusproservice.WsFindKNPropertyResponse.class)
    public JAXBElement<cz.octopuspro.types.WsFindKNPropertyResponse> createWsFindKNPropertyResponseWsFindKNPropertyResult(cz.octopuspro.types.WsFindKNPropertyResponse value) {
        return new JAXBElement<cz.octopuspro.types.WsFindKNPropertyResponse>(_WsFindKNPropertyResponseWsFindKNPropertyResult_QNAME, cz.octopuspro.types.WsFindKNPropertyResponse.class, cz.octopuspro.octopusproservice.WsFindKNPropertyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAddKNPropertyToLvkeeperRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsAddKNPropertyToLvkeeper.class)
    public JAXBElement<WsAddKNPropertyToLvkeeperRequest> createWsAddKNPropertyToLvkeeperRequest(WsAddKNPropertyToLvkeeperRequest value) {
        return new JAXBElement<WsAddKNPropertyToLvkeeperRequest>(_GetTHitRequest_QNAME, WsAddKNPropertyToLvkeeperRequest.class, WsAddKNPropertyToLvkeeper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_add_KN_property_to_lvkeeperResult", scope = cz.octopuspro.octopusproservice.WsAddKNPropertyToLvkeeperResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse> createWsAddKNPropertyToLvkeeperResponseWsAddKNPropertyToLvkeeperResult(org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse>(_WsAddKNPropertyToLvkeeperResponseWsAddKNPropertyToLvkeeperResult_QNAME, org.datacontract.schemas._2004._07.octop_actionservice_message.WsAddKNPropertyToLvkeeperResponse.class, cz.octopuspro.octopusproservice.WsAddKNPropertyToLvkeeperResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsRemoveKNPropertyFromLvkeeperRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsRemoveKNPropertyFromLvkeeper.class)
    public JAXBElement<WsRemoveKNPropertyFromLvkeeperRequest> createWsRemoveKNPropertyFromLvkeeperRequest(WsRemoveKNPropertyFromLvkeeperRequest value) {
        return new JAXBElement<WsRemoveKNPropertyFromLvkeeperRequest>(_GetTHitRequest_QNAME, WsRemoveKNPropertyFromLvkeeperRequest.class, WsRemoveKNPropertyFromLvkeeper.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_remove_KN_property_from_lvkeeperResult", scope = cz.octopuspro.octopusproservice.WsRemoveKNPropertyFromLvkeeperResponse.class)
    public JAXBElement<cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse> createWsRemoveKNPropertyFromLvkeeperResponseWsRemoveKNPropertyFromLvkeeperResult(cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse value) {
        return new JAXBElement<cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse>(_WsRemoveKNPropertyFromLvkeeperResponseWsRemoveKNPropertyFromLvkeeperResult_QNAME, cz.octopuspro.types.WsRemoveKNPropertyFromLvkeeperResponse.class, cz.octopuspro.octopusproservice.WsRemoveKNPropertyFromLvkeeperResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetLvkeeperDiffXmlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsGetLvkeeperDiffXml.class)
    public JAXBElement<WsGetLvkeeperDiffXmlRequest> createWsGetLvkeeperDiffXmlRequest(WsGetLvkeeperDiffXmlRequest value) {
        return new JAXBElement<WsGetLvkeeperDiffXmlRequest>(_GetTHitRequest_QNAME, WsGetLvkeeperDiffXmlRequest.class, WsGetLvkeeperDiffXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_get_lvkeeper_diff_xmlResult", scope = cz.octopuspro.octopusproservice.WsGetLvkeeperDiffXmlResponse.class)
    public JAXBElement<cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse> createWsGetLvkeeperDiffXmlResponseWsGetLvkeeperDiffXmlResult(cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse value) {
        return new JAXBElement<cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse>(_WsGetLvkeeperDiffXmlResponseWsGetLvkeeperDiffXmlResult_QNAME, cz.octopuspro.types.WsGetLvkeeperDiffXmlResponse.class, cz.octopuspro.octopusproservice.WsGetLvkeeperDiffXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsChangeLvkeeperNoteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsChangeLvkeeperNote.class)
    public JAXBElement<WsChangeLvkeeperNoteRequest> createWsChangeLvkeeperNoteRequest(WsChangeLvkeeperNoteRequest value) {
        return new JAXBElement<WsChangeLvkeeperNoteRequest>(_GetTHitRequest_QNAME, WsChangeLvkeeperNoteRequest.class, WsChangeLvkeeperNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link cz.octopuspro.types.WsChangeLvkeeperNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_change_lvkeeper_noteResult", scope = cz.octopuspro.octopusproservice.WsChangeLvkeeperNoteResponse.class)
    public JAXBElement<cz.octopuspro.types.WsChangeLvkeeperNoteResponse> createWsChangeLvkeeperNoteResponseWsChangeLvkeeperNoteResult(cz.octopuspro.types.WsChangeLvkeeperNoteResponse value) {
        return new JAXBElement<cz.octopuspro.types.WsChangeLvkeeperNoteResponse>(_WsChangeLvkeeperNoteResponseWsChangeLvkeeperNoteResult_QNAME, cz.octopuspro.types.WsChangeLvkeeperNoteResponse.class, cz.octopuspro.octopusproservice.WsChangeLvkeeperNoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsPairingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsOctopPairing.class)
    public JAXBElement<WsPairingRequest> createWsOctopPairingRequest(WsPairingRequest value) {
        return new JAXBElement<WsPairingRequest>(_GetTHitRequest_QNAME, WsPairingRequest.class, WsOctopPairing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_octop_pairingResult", scope = WsOctopPairingResponse.class)
    public JAXBElement<THitResponse> createWsOctopPairingResponseWsOctopPairingResult(THitResponse value) {
        return new JAXBElement<THitResponse>(_WsOctopPairingResponseWsOctopPairingResult_QNAME, THitResponse.class, WsOctopPairingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "HelloWorldResult", scope = HelloWorldResponse.class)
    public JAXBElement<String> createHelloWorldResponseHelloWorldResult(String value) {
        return new JAXBElement<String>(_HelloWorldResponseHelloWorldResult_QNAME, String.class, HelloWorldResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTryLoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "request", scope = WsTryLogin.class)
    public JAXBElement<WsTryLoginRequest> createWsTryLoginRequest(WsTryLoginRequest value) {
        return new JAXBElement<WsTryLoginRequest>(_GetTHitRequest_QNAME, WsTryLoginRequest.class, WsTryLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://octopuspro.cz/OctopusProService", name = "ws_tryLoginResult", scope = WsTryLoginResponse.class)
    public JAXBElement<ResponseBase> createWsTryLoginResponseWsTryLoginResult(ResponseBase value) {
        return new JAXBElement<ResponseBase>(_WsTryLoginResponseWsTryLoginResult_QNAME, ResponseBase.class, WsTryLoginResponse.class, value);
    }

}

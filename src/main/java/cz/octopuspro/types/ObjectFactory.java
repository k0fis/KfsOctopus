
package cz.octopuspro.types;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfCategoryDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfCommercialModeDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfCountryDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfOfferTypeDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfOwnershipDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfRegionDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfRoleDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfSubCategoryDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOfSubRegionDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOftHitDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.ArrayOftSearchProfileDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeAreaDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeBuildingNumberDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeCoordinateDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeFulltextDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeMunicipalityDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeOwnershipIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributePriceDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeStreetDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeSubCategoryIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.PairingAttributeSubRegionIdDTO;
import org.datacontract.schemas._2004._07.octop_actionservice.WsOctop1ACriteria;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.octopuspro.types package. 
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

    private final static QName _THitRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "tHitRequest");
    private final static QName _RequestBase_QNAME = new QName("http://www.octopuspro.cz/types/", "RequestBase");
    private final static QName _THitResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "tHitResponse");
    private final static QName _ResponseBase_QNAME = new QName("http://www.octopuspro.cz/types/", "ResponseBase");
    private final static QName _AcknowledgeType_QNAME = new QName("http://www.octopuspro.cz/types/", "AcknowledgeType");
    private final static QName _WsOctop1ARequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_octop_1a_Request");
    private final static QName _WsOctop1BRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_octop_1b_Request");
    private final static QName _TSearchProfileRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "tSearchProfileRequest");
    private final static QName _TSearchProfileResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "tSearchProfileResponse");
    private final static QName _LOVOfferTypeRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_OfferTypeRequest");
    private final static QName _LOVOfferTypeResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_OfferTypeResponse");
    private final static QName _LOVCategoryRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_CategoryRequest");
    private final static QName _LOVCategoryResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_CategoryResponse");
    private final static QName _LOVSubCategoryRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_SubCategoryRequest");
    private final static QName _LOVSubCategoryResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_SubCategoryResponse");
    private final static QName _LOVCommercialModeRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_CommercialModeRequest");
    private final static QName _LOVCommercialModeResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_CommercialModeResponse");
    private final static QName _LOVRegionRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_RegionRequest");
    private final static QName _LOVRegionResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_RegionResponse");
    private final static QName _LOVSubRegionRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_SubRegionRequest");
    private final static QName _LOVSubRegionReponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_SubRegionReponse");
    private final static QName _LOVRoleRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_RoleRequest");
    private final static QName _LOVRoleResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_RoleResponse");
    private final static QName _LOVCountryRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_CountryRequest");
    private final static QName _LOVCountryResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_CountryResponse");
    private final static QName _LOVOwnershipRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_OwnershipRequest");
    private final static QName _LOVOwnershipResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "LOV_OwnershipResponse");
    private final static QName _WsFindKNPropertyByLVRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_find_KN_property_by_LV_Request");
    private final static QName _IPuvodParcely_QNAME = new QName("http://www.octopuspro.cz/types/", "iPuvodParcely");
    private final static QName _ITypNemovitosti_QNAME = new QName("http://www.octopuspro.cz/types/", "iTypNemovitosti");
    private final static QName _ITypParcely_QNAME = new QName("http://www.octopuspro.cz/types/", "iTypParcely");
    private final static QName _ITypStavby_QNAME = new QName("http://www.octopuspro.cz/types/", "iTypStavby");
    private final static QName _WsFindKNPropertyResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_find_KN_property_Response");
    private final static QName _WsAddKNPropertyToLvkeeperRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_add_KN_property_to_lvkeeper_Request");
    private final static QName _WsRemoveKNPropertyFromLvkeeperRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_remove_KN_property_from_lvkeeper_Request");
    private final static QName _WsRemoveKNPropertyFromLvkeeperResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_remove_KN_property_from_lvkeeper_Response");
    private final static QName _WsGetLvkeeperDiffXmlRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_get_lvkeeper_diff_xml_Request");
    private final static QName _WsGetLvkeeperDiffXmlResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_get_lvkeeper_diff_xml_Response");
    private final static QName _WsChangeLvkeeperNoteRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_change_lvkeeper_note_Request");
    private final static QName _WsChangeLvkeeperNoteResponse_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_change_lvkeeper_note_Response");
    private final static QName _WsPairingRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_pairing_Request");
    private final static QName _WsTryLoginRequest_QNAME = new QName("http://www.octopuspro.cz/types/", "ws_tryLogin_Request");
    private final static QName _RequestBaseAction_QNAME = new QName("http://www.octopuspro.cz/types/", "Action");
    private final static QName _RequestBaseClientPassword_QNAME = new QName("http://www.octopuspro.cz/types/", "ClientPassword");
    private final static QName _RequestBaseClientTag_QNAME = new QName("http://www.octopuspro.cz/types/", "ClientTag");
    private final static QName _RequestBaseClientUsername_QNAME = new QName("http://www.octopuspro.cz/types/", "ClientUsername");
    private final static QName _RequestBaseLoadOptions_QNAME = new QName("http://www.octopuspro.cz/types/", "LoadOptions");
    private final static QName _RequestBaseRequestId_QNAME = new QName("http://www.octopuspro.cz/types/", "RequestId");
    private final static QName _WsTryLoginRequestIdUser_QNAME = new QName("http://www.octopuspro.cz/types/", "IdUser");
    private final static QName _WsPairingRequestArea_QNAME = new QName("http://www.octopuspro.cz/types/", "Area");
    private final static QName _WsPairingRequestBuildingCpCo_QNAME = new QName("http://www.octopuspro.cz/types/", "BuildingCpCo");
    private final static QName _WsPairingRequestCoordinate_QNAME = new QName("http://www.octopuspro.cz/types/", "Coordinate");
    private final static QName _WsPairingRequestFulltext_QNAME = new QName("http://www.octopuspro.cz/types/", "Fulltext");
    private final static QName _WsPairingRequestIdRealAgencyClient_QNAME = new QName("http://www.octopuspro.cz/types/", "IdRealAgencyClient");
    private final static QName _WsPairingRequestMunicipality_QNAME = new QName("http://www.octopuspro.cz/types/", "Municipality");
    private final static QName _WsPairingRequestOwnershipId_QNAME = new QName("http://www.octopuspro.cz/types/", "OwnershipId");
    private final static QName _WsPairingRequestPrice_QNAME = new QName("http://www.octopuspro.cz/types/", "Price");
    private final static QName _WsPairingRequestStreet_QNAME = new QName("http://www.octopuspro.cz/types/", "Street");
    private final static QName _WsPairingRequestSubCategoryId_QNAME = new QName("http://www.octopuspro.cz/types/", "SubCategoryId");
    private final static QName _WsPairingRequestSubRegionId_QNAME = new QName("http://www.octopuspro.cz/types/", "SubRegionId");
    private final static QName _ResponseBaseBuild_QNAME = new QName("http://www.octopuspro.cz/types/", "Build");
    private final static QName _ResponseBaseComparationId_QNAME = new QName("http://www.octopuspro.cz/types/", "ComparationId");
    private final static QName _ResponseBaseMessage_QNAME = new QName("http://www.octopuspro.cz/types/", "Message");
    private final static QName _ResponseBaseReservationId_QNAME = new QName("http://www.octopuspro.cz/types/", "ReservationId");
    private final static QName _ResponseBaseVersion_QNAME = new QName("http://www.octopuspro.cz/types/", "Version");
    private final static QName _WsChangeLvkeeperNoteRequestNote_QNAME = new QName("http://www.octopuspro.cz/types/", "Note");
    private final static QName _WsGetLvkeeperDiffXmlResponseDiffXml_QNAME = new QName("http://www.octopuspro.cz/types/", "DiffXml");
    private final static QName _WsFindKNPropertyByLVRequestCisloJednotky_QNAME = new QName("http://www.octopuspro.cz/types/", "CisloJednotky");
    private final static QName _WsFindKNPropertyByLVRequestCisloParcelyVedlejsi_QNAME = new QName("http://www.octopuspro.cz/types/", "CisloParcelyVedlejsi");
    private final static QName _WsFindKNPropertyByLVRequestCisloParcelyZakladni_QNAME = new QName("http://www.octopuspro.cz/types/", "CisloParcelyZakladni");
    private final static QName _WsFindKNPropertyByLVRequestCisloStavby_QNAME = new QName("http://www.octopuspro.cz/types/", "CisloStavby");
    private final static QName _WsFindKNPropertyByLVRequestKodCastObec_QNAME = new QName("http://www.octopuspro.cz/types/", "KodCastObec");
    private final static QName _WsFindKNPropertyByLVRequestKodKatastralUzemi_QNAME = new QName("http://www.octopuspro.cz/types/", "KodKatastralUzemi");
    private final static QName _WsFindKNPropertyByLVRequestKodObec_QNAME = new QName("http://www.octopuspro.cz/types/", "KodObec");
    private final static QName _WsFindKNPropertyByLVRequestLV_QNAME = new QName("http://www.octopuspro.cz/types/", "LV");
    private final static QName _WsFindKNPropertyByLVRequestPuvodParcelyPodTyp_QNAME = new QName("http://www.octopuspro.cz/types/", "PuvodParcelyPodTyp");
    private final static QName _LOVOwnershipResponseOwnerships_QNAME = new QName("http://www.octopuspro.cz/types/", "Ownerships");
    private final static QName _LOVOwnershipRequestIdOwnership_QNAME = new QName("http://www.octopuspro.cz/types/", "IdOwnership");
    private final static QName _LOVCountryResponseCountries_QNAME = new QName("http://www.octopuspro.cz/types/", "Countries");
    private final static QName _LOVCountryRequestIdCountry_QNAME = new QName("http://www.octopuspro.cz/types/", "IdCountry");
    private final static QName _LOVRoleResponseRoles_QNAME = new QName("http://www.octopuspro.cz/types/", "Roles");
    private final static QName _LOVRoleRequestRole_QNAME = new QName("http://www.octopuspro.cz/types/", "Role");
    private final static QName _LOVSubRegionReponseSubRegions_QNAME = new QName("http://www.octopuspro.cz/types/", "SubRegions");
    private final static QName _LOVSubRegionRequestIdRegion_QNAME = new QName("http://www.octopuspro.cz/types/", "IdRegion");
    private final static QName _LOVSubRegionRequestIdSubRegion_QNAME = new QName("http://www.octopuspro.cz/types/", "IdSubRegion");
    private final static QName _LOVRegionResponseRegions_QNAME = new QName("http://www.octopuspro.cz/types/", "Regions");
    private final static QName _LOVCommercialModeResponseCommercialModes_QNAME = new QName("http://www.octopuspro.cz/types/", "CommercialModes");
    private final static QName _LOVCommercialModeRequestCommercialMode_QNAME = new QName("http://www.octopuspro.cz/types/", "CommercialMode");
    private final static QName _LOVSubCategoryResponseSubCategories_QNAME = new QName("http://www.octopuspro.cz/types/", "SubCategories");
    private final static QName _LOVSubCategoryRequestIdCategory_QNAME = new QName("http://www.octopuspro.cz/types/", "IdCategory");
    private final static QName _LOVSubCategoryRequestSubCategory_QNAME = new QName("http://www.octopuspro.cz/types/", "SubCategory");
    private final static QName _LOVCategoryResponseCategories_QNAME = new QName("http://www.octopuspro.cz/types/", "Categories");
    private final static QName _LOVOfferTypeResponseOfferTypes_QNAME = new QName("http://www.octopuspro.cz/types/", "OfferTypes");
    private final static QName _LOVOfferTypeRequestOfferType_QNAME = new QName("http://www.octopuspro.cz/types/", "OfferType");
    private final static QName _TSearchProfileResponseTSearchProfiles_QNAME = new QName("http://www.octopuspro.cz/types/", "tSearchProfiles");
    private final static QName _WsOctop1BRequestIdSearchProfile_QNAME = new QName("http://www.octopuspro.cz/types/", "IdSearchProfile");
    private final static QName _WsOctop1ARequestCriteria_QNAME = new QName("http://www.octopuspro.cz/types/", "Criteria");
    private final static QName _THitResponseTHits_QNAME = new QName("http://www.octopuspro.cz/types/", "tHits");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.octopuspro.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsGetLvkeeperDiffXmlResponse }
     * 
     */
    public WsGetLvkeeperDiffXmlResponse createWsGetLvkeeperDiffXmlResponse() {
        return new WsGetLvkeeperDiffXmlResponse();
    }

    /**
     * Create an instance of {@link THitRequest }
     * 
     */
    public THitRequest createTHitRequest() {
        return new THitRequest();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link THitResponse }
     * 
     */
    public THitResponse createTHitResponse() {
        return new THitResponse();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link WsOctop1ARequest }
     * 
     */
    public WsOctop1ARequest createWsOctop1ARequest() {
        return new WsOctop1ARequest();
    }

    /**
     * Create an instance of {@link WsOctop1BRequest }
     * 
     */
    public WsOctop1BRequest createWsOctop1BRequest() {
        return new WsOctop1BRequest();
    }

    /**
     * Create an instance of {@link TSearchProfileRequest }
     * 
     */
    public TSearchProfileRequest createTSearchProfileRequest() {
        return new TSearchProfileRequest();
    }

    /**
     * Create an instance of {@link TSearchProfileResponse }
     * 
     */
    public TSearchProfileResponse createTSearchProfileResponse() {
        return new TSearchProfileResponse();
    }

    /**
     * Create an instance of {@link LOVOfferTypeRequest }
     * 
     */
    public LOVOfferTypeRequest createLOVOfferTypeRequest() {
        return new LOVOfferTypeRequest();
    }

    /**
     * Create an instance of {@link LOVOfferTypeResponse }
     * 
     */
    public LOVOfferTypeResponse createLOVOfferTypeResponse() {
        return new LOVOfferTypeResponse();
    }

    /**
     * Create an instance of {@link LOVCategoryRequest }
     * 
     */
    public LOVCategoryRequest createLOVCategoryRequest() {
        return new LOVCategoryRequest();
    }

    /**
     * Create an instance of {@link LOVCategoryResponse }
     * 
     */
    public LOVCategoryResponse createLOVCategoryResponse() {
        return new LOVCategoryResponse();
    }

    /**
     * Create an instance of {@link LOVSubCategoryRequest }
     * 
     */
    public LOVSubCategoryRequest createLOVSubCategoryRequest() {
        return new LOVSubCategoryRequest();
    }

    /**
     * Create an instance of {@link LOVSubCategoryResponse }
     * 
     */
    public LOVSubCategoryResponse createLOVSubCategoryResponse() {
        return new LOVSubCategoryResponse();
    }

    /**
     * Create an instance of {@link LOVCommercialModeRequest }
     * 
     */
    public LOVCommercialModeRequest createLOVCommercialModeRequest() {
        return new LOVCommercialModeRequest();
    }

    /**
     * Create an instance of {@link LOVCommercialModeResponse }
     * 
     */
    public LOVCommercialModeResponse createLOVCommercialModeResponse() {
        return new LOVCommercialModeResponse();
    }

    /**
     * Create an instance of {@link LOVRegionRequest }
     * 
     */
    public LOVRegionRequest createLOVRegionRequest() {
        return new LOVRegionRequest();
    }

    /**
     * Create an instance of {@link LOVRegionResponse }
     * 
     */
    public LOVRegionResponse createLOVRegionResponse() {
        return new LOVRegionResponse();
    }

    /**
     * Create an instance of {@link LOVSubRegionRequest }
     * 
     */
    public LOVSubRegionRequest createLOVSubRegionRequest() {
        return new LOVSubRegionRequest();
    }

    /**
     * Create an instance of {@link LOVSubRegionReponse }
     * 
     */
    public LOVSubRegionReponse createLOVSubRegionReponse() {
        return new LOVSubRegionReponse();
    }

    /**
     * Create an instance of {@link LOVRoleRequest }
     * 
     */
    public LOVRoleRequest createLOVRoleRequest() {
        return new LOVRoleRequest();
    }

    /**
     * Create an instance of {@link LOVRoleResponse }
     * 
     */
    public LOVRoleResponse createLOVRoleResponse() {
        return new LOVRoleResponse();
    }

    /**
     * Create an instance of {@link LOVCountryRequest }
     * 
     */
    public LOVCountryRequest createLOVCountryRequest() {
        return new LOVCountryRequest();
    }

    /**
     * Create an instance of {@link LOVCountryResponse }
     * 
     */
    public LOVCountryResponse createLOVCountryResponse() {
        return new LOVCountryResponse();
    }

    /**
     * Create an instance of {@link LOVOwnershipRequest }
     * 
     */
    public LOVOwnershipRequest createLOVOwnershipRequest() {
        return new LOVOwnershipRequest();
    }

    /**
     * Create an instance of {@link LOVOwnershipResponse }
     * 
     */
    public LOVOwnershipResponse createLOVOwnershipResponse() {
        return new LOVOwnershipResponse();
    }

    /**
     * Create an instance of {@link WsFindKNPropertyByLVRequest }
     * 
     */
    public WsFindKNPropertyByLVRequest createWsFindKNPropertyByLVRequest() {
        return new WsFindKNPropertyByLVRequest();
    }

    /**
     * Create an instance of {@link WsFindKNPropertyResponse }
     * 
     */
    public WsFindKNPropertyResponse createWsFindKNPropertyResponse() {
        return new WsFindKNPropertyResponse();
    }

    /**
     * Create an instance of {@link WsAddKNPropertyToLvkeeperRequest }
     * 
     */
    public WsAddKNPropertyToLvkeeperRequest createWsAddKNPropertyToLvkeeperRequest() {
        return new WsAddKNPropertyToLvkeeperRequest();
    }

    /**
     * Create an instance of {@link WsRemoveKNPropertyFromLvkeeperRequest }
     * 
     */
    public WsRemoveKNPropertyFromLvkeeperRequest createWsRemoveKNPropertyFromLvkeeperRequest() {
        return new WsRemoveKNPropertyFromLvkeeperRequest();
    }

    /**
     * Create an instance of {@link WsRemoveKNPropertyFromLvkeeperResponse }
     * 
     */
    public WsRemoveKNPropertyFromLvkeeperResponse createWsRemoveKNPropertyFromLvkeeperResponse() {
        return new WsRemoveKNPropertyFromLvkeeperResponse();
    }

    /**
     * Create an instance of {@link WsGetLvkeeperDiffXmlRequest }
     * 
     */
    public WsGetLvkeeperDiffXmlRequest createWsGetLvkeeperDiffXmlRequest() {
        return new WsGetLvkeeperDiffXmlRequest();
    }

    /**
     * Create an instance of {@link WsChangeLvkeeperNoteRequest }
     * 
     */
    public WsChangeLvkeeperNoteRequest createWsChangeLvkeeperNoteRequest() {
        return new WsChangeLvkeeperNoteRequest();
    }

    /**
     * Create an instance of {@link WsChangeLvkeeperNoteResponse }
     * 
     */
    public WsChangeLvkeeperNoteResponse createWsChangeLvkeeperNoteResponse() {
        return new WsChangeLvkeeperNoteResponse();
    }

    /**
     * Create an instance of {@link WsPairingRequest }
     * 
     */
    public WsPairingRequest createWsPairingRequest() {
        return new WsPairingRequest();
    }

    /**
     * Create an instance of {@link WsTryLoginRequest }
     * 
     */
    public WsTryLoginRequest createWsTryLoginRequest() {
        return new WsTryLoginRequest();
    }

    /**
     * Create an instance of {@link WsGetLvkeeperDiffXmlResponse.DiffXml }
     * 
     */
    public WsGetLvkeeperDiffXmlResponse.DiffXml createWsGetLvkeeperDiffXmlResponseDiffXml() {
        return new WsGetLvkeeperDiffXmlResponse.DiffXml();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THitRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "tHitRequest")
    public JAXBElement<THitRequest> createTHitRequest(THitRequest value) {
        return new JAXBElement<THitRequest>(_THitRequest_QNAME, THitRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "RequestBase")
    public JAXBElement<RequestBase> createRequestBase(RequestBase value) {
        return new JAXBElement<RequestBase>(_RequestBase_QNAME, RequestBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link THitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "tHitResponse")
    public JAXBElement<THitResponse> createTHitResponse(THitResponse value) {
        return new JAXBElement<THitResponse>(_THitResponse_QNAME, THitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ResponseBase")
    public JAXBElement<ResponseBase> createResponseBase(ResponseBase value) {
        return new JAXBElement<ResponseBase>(_ResponseBase_QNAME, ResponseBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcknowledgeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "AcknowledgeType")
    public JAXBElement<AcknowledgeType> createAcknowledgeType(AcknowledgeType value) {
        return new JAXBElement<AcknowledgeType>(_AcknowledgeType_QNAME, AcknowledgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsOctop1ARequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_octop_1a_Request")
    public JAXBElement<WsOctop1ARequest> createWsOctop1ARequest(WsOctop1ARequest value) {
        return new JAXBElement<WsOctop1ARequest>(_WsOctop1ARequest_QNAME, WsOctop1ARequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsOctop1BRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_octop_1b_Request")
    public JAXBElement<WsOctop1BRequest> createWsOctop1BRequest(WsOctop1BRequest value) {
        return new JAXBElement<WsOctop1BRequest>(_WsOctop1BRequest_QNAME, WsOctop1BRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSearchProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "tSearchProfileRequest")
    public JAXBElement<TSearchProfileRequest> createTSearchProfileRequest(TSearchProfileRequest value) {
        return new JAXBElement<TSearchProfileRequest>(_TSearchProfileRequest_QNAME, TSearchProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSearchProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "tSearchProfileResponse")
    public JAXBElement<TSearchProfileResponse> createTSearchProfileResponse(TSearchProfileResponse value) {
        return new JAXBElement<TSearchProfileResponse>(_TSearchProfileResponse_QNAME, TSearchProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOfferTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_OfferTypeRequest")
    public JAXBElement<LOVOfferTypeRequest> createLOVOfferTypeRequest(LOVOfferTypeRequest value) {
        return new JAXBElement<LOVOfferTypeRequest>(_LOVOfferTypeRequest_QNAME, LOVOfferTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOfferTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_OfferTypeResponse")
    public JAXBElement<LOVOfferTypeResponse> createLOVOfferTypeResponse(LOVOfferTypeResponse value) {
        return new JAXBElement<LOVOfferTypeResponse>(_LOVOfferTypeResponse_QNAME, LOVOfferTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_CategoryRequest")
    public JAXBElement<LOVCategoryRequest> createLOVCategoryRequest(LOVCategoryRequest value) {
        return new JAXBElement<LOVCategoryRequest>(_LOVCategoryRequest_QNAME, LOVCategoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_CategoryResponse")
    public JAXBElement<LOVCategoryResponse> createLOVCategoryResponse(LOVCategoryResponse value) {
        return new JAXBElement<LOVCategoryResponse>(_LOVCategoryResponse_QNAME, LOVCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubCategoryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_SubCategoryRequest")
    public JAXBElement<LOVSubCategoryRequest> createLOVSubCategoryRequest(LOVSubCategoryRequest value) {
        return new JAXBElement<LOVSubCategoryRequest>(_LOVSubCategoryRequest_QNAME, LOVSubCategoryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_SubCategoryResponse")
    public JAXBElement<LOVSubCategoryResponse> createLOVSubCategoryResponse(LOVSubCategoryResponse value) {
        return new JAXBElement<LOVSubCategoryResponse>(_LOVSubCategoryResponse_QNAME, LOVSubCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCommercialModeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_CommercialModeRequest")
    public JAXBElement<LOVCommercialModeRequest> createLOVCommercialModeRequest(LOVCommercialModeRequest value) {
        return new JAXBElement<LOVCommercialModeRequest>(_LOVCommercialModeRequest_QNAME, LOVCommercialModeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCommercialModeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_CommercialModeResponse")
    public JAXBElement<LOVCommercialModeResponse> createLOVCommercialModeResponse(LOVCommercialModeResponse value) {
        return new JAXBElement<LOVCommercialModeResponse>(_LOVCommercialModeResponse_QNAME, LOVCommercialModeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRegionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_RegionRequest")
    public JAXBElement<LOVRegionRequest> createLOVRegionRequest(LOVRegionRequest value) {
        return new JAXBElement<LOVRegionRequest>(_LOVRegionRequest_QNAME, LOVRegionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_RegionResponse")
    public JAXBElement<LOVRegionResponse> createLOVRegionResponse(LOVRegionResponse value) {
        return new JAXBElement<LOVRegionResponse>(_LOVRegionResponse_QNAME, LOVRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubRegionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_SubRegionRequest")
    public JAXBElement<LOVSubRegionRequest> createLOVSubRegionRequest(LOVSubRegionRequest value) {
        return new JAXBElement<LOVSubRegionRequest>(_LOVSubRegionRequest_QNAME, LOVSubRegionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVSubRegionReponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_SubRegionReponse")
    public JAXBElement<LOVSubRegionReponse> createLOVSubRegionReponse(LOVSubRegionReponse value) {
        return new JAXBElement<LOVSubRegionReponse>(_LOVSubRegionReponse_QNAME, LOVSubRegionReponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRoleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_RoleRequest")
    public JAXBElement<LOVRoleRequest> createLOVRoleRequest(LOVRoleRequest value) {
        return new JAXBElement<LOVRoleRequest>(_LOVRoleRequest_QNAME, LOVRoleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_RoleResponse")
    public JAXBElement<LOVRoleResponse> createLOVRoleResponse(LOVRoleResponse value) {
        return new JAXBElement<LOVRoleResponse>(_LOVRoleResponse_QNAME, LOVRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCountryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_CountryRequest")
    public JAXBElement<LOVCountryRequest> createLOVCountryRequest(LOVCountryRequest value) {
        return new JAXBElement<LOVCountryRequest>(_LOVCountryRequest_QNAME, LOVCountryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_CountryResponse")
    public JAXBElement<LOVCountryResponse> createLOVCountryResponse(LOVCountryResponse value) {
        return new JAXBElement<LOVCountryResponse>(_LOVCountryResponse_QNAME, LOVCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOwnershipRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_OwnershipRequest")
    public JAXBElement<LOVOwnershipRequest> createLOVOwnershipRequest(LOVOwnershipRequest value) {
        return new JAXBElement<LOVOwnershipRequest>(_LOVOwnershipRequest_QNAME, LOVOwnershipRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOVOwnershipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LOV_OwnershipResponse")
    public JAXBElement<LOVOwnershipResponse> createLOVOwnershipResponse(LOVOwnershipResponse value) {
        return new JAXBElement<LOVOwnershipResponse>(_LOVOwnershipResponse_QNAME, LOVOwnershipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsFindKNPropertyByLVRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_find_KN_property_by_LV_Request")
    public JAXBElement<WsFindKNPropertyByLVRequest> createWsFindKNPropertyByLVRequest(WsFindKNPropertyByLVRequest value) {
        return new JAXBElement<WsFindKNPropertyByLVRequest>(_WsFindKNPropertyByLVRequest_QNAME, WsFindKNPropertyByLVRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "iPuvodParcely")
    public JAXBElement<List<String>> createIPuvodParcely(List<String> value) {
        return new JAXBElement<List<String>>(_IPuvodParcely_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ITypNemovitosti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "iTypNemovitosti")
    public JAXBElement<ITypNemovitosti> createITypNemovitosti(ITypNemovitosti value) {
        return new JAXBElement<ITypNemovitosti>(_ITypNemovitosti_QNAME, ITypNemovitosti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "iTypParcely")
    public JAXBElement<List<String>> createITypParcely(List<String> value) {
        return new JAXBElement<List<String>>(_ITypParcely_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "iTypStavby")
    public JAXBElement<List<String>> createITypStavby(List<String> value) {
        return new JAXBElement<List<String>>(_ITypStavby_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsFindKNPropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_find_KN_property_Response")
    public JAXBElement<WsFindKNPropertyResponse> createWsFindKNPropertyResponse(WsFindKNPropertyResponse value) {
        return new JAXBElement<WsFindKNPropertyResponse>(_WsFindKNPropertyResponse_QNAME, WsFindKNPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAddKNPropertyToLvkeeperRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_add_KN_property_to_lvkeeper_Request")
    public JAXBElement<WsAddKNPropertyToLvkeeperRequest> createWsAddKNPropertyToLvkeeperRequest(WsAddKNPropertyToLvkeeperRequest value) {
        return new JAXBElement<WsAddKNPropertyToLvkeeperRequest>(_WsAddKNPropertyToLvkeeperRequest_QNAME, WsAddKNPropertyToLvkeeperRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsRemoveKNPropertyFromLvkeeperRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_remove_KN_property_from_lvkeeper_Request")
    public JAXBElement<WsRemoveKNPropertyFromLvkeeperRequest> createWsRemoveKNPropertyFromLvkeeperRequest(WsRemoveKNPropertyFromLvkeeperRequest value) {
        return new JAXBElement<WsRemoveKNPropertyFromLvkeeperRequest>(_WsRemoveKNPropertyFromLvkeeperRequest_QNAME, WsRemoveKNPropertyFromLvkeeperRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsRemoveKNPropertyFromLvkeeperResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_remove_KN_property_from_lvkeeper_Response")
    public JAXBElement<WsRemoveKNPropertyFromLvkeeperResponse> createWsRemoveKNPropertyFromLvkeeperResponse(WsRemoveKNPropertyFromLvkeeperResponse value) {
        return new JAXBElement<WsRemoveKNPropertyFromLvkeeperResponse>(_WsRemoveKNPropertyFromLvkeeperResponse_QNAME, WsRemoveKNPropertyFromLvkeeperResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetLvkeeperDiffXmlRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_get_lvkeeper_diff_xml_Request")
    public JAXBElement<WsGetLvkeeperDiffXmlRequest> createWsGetLvkeeperDiffXmlRequest(WsGetLvkeeperDiffXmlRequest value) {
        return new JAXBElement<WsGetLvkeeperDiffXmlRequest>(_WsGetLvkeeperDiffXmlRequest_QNAME, WsGetLvkeeperDiffXmlRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetLvkeeperDiffXmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_get_lvkeeper_diff_xml_Response")
    public JAXBElement<WsGetLvkeeperDiffXmlResponse> createWsGetLvkeeperDiffXmlResponse(WsGetLvkeeperDiffXmlResponse value) {
        return new JAXBElement<WsGetLvkeeperDiffXmlResponse>(_WsGetLvkeeperDiffXmlResponse_QNAME, WsGetLvkeeperDiffXmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsChangeLvkeeperNoteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_change_lvkeeper_note_Request")
    public JAXBElement<WsChangeLvkeeperNoteRequest> createWsChangeLvkeeperNoteRequest(WsChangeLvkeeperNoteRequest value) {
        return new JAXBElement<WsChangeLvkeeperNoteRequest>(_WsChangeLvkeeperNoteRequest_QNAME, WsChangeLvkeeperNoteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsChangeLvkeeperNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_change_lvkeeper_note_Response")
    public JAXBElement<WsChangeLvkeeperNoteResponse> createWsChangeLvkeeperNoteResponse(WsChangeLvkeeperNoteResponse value) {
        return new JAXBElement<WsChangeLvkeeperNoteResponse>(_WsChangeLvkeeperNoteResponse_QNAME, WsChangeLvkeeperNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsPairingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_pairing_Request")
    public JAXBElement<WsPairingRequest> createWsPairingRequest(WsPairingRequest value) {
        return new JAXBElement<WsPairingRequest>(_WsPairingRequest_QNAME, WsPairingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTryLoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ws_tryLogin_Request")
    public JAXBElement<WsTryLoginRequest> createWsTryLoginRequest(WsTryLoginRequest value) {
        return new JAXBElement<WsTryLoginRequest>(_WsTryLoginRequest_QNAME, WsTryLoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Action", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseAction(String value) {
        return new JAXBElement<String>(_RequestBaseAction_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ClientPassword", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseClientPassword(String value) {
        return new JAXBElement<String>(_RequestBaseClientPassword_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ClientTag", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseClientTag(String value) {
        return new JAXBElement<String>(_RequestBaseClientTag_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ClientUsername", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseClientUsername(String value) {
        return new JAXBElement<String>(_RequestBaseClientUsername_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LoadOptions", scope = RequestBase.class)
    public JAXBElement<ArrayOfstring> createRequestBaseLoadOptions(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RequestBaseLoadOptions_QNAME, ArrayOfstring.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "RequestId", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseRequestId(String value) {
        return new JAXBElement<String>(_RequestBaseRequestId_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdUser", scope = WsTryLoginRequest.class)
    public JAXBElement<Integer> createWsTryLoginRequestIdUser(Integer value) {
        return new JAXBElement<Integer>(_WsTryLoginRequestIdUser_QNAME, Integer.class, WsTryLoginRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeAreaDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Area", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeAreaDTO> createWsPairingRequestArea(PairingAttributeAreaDTO value) {
        return new JAXBElement<PairingAttributeAreaDTO>(_WsPairingRequestArea_QNAME, PairingAttributeAreaDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeBuildingNumberDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "BuildingCpCo", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeBuildingNumberDTO> createWsPairingRequestBuildingCpCo(PairingAttributeBuildingNumberDTO value) {
        return new JAXBElement<PairingAttributeBuildingNumberDTO>(_WsPairingRequestBuildingCpCo_QNAME, PairingAttributeBuildingNumberDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeCoordinateDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Coordinate", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeCoordinateDTO> createWsPairingRequestCoordinate(PairingAttributeCoordinateDTO value) {
        return new JAXBElement<PairingAttributeCoordinateDTO>(_WsPairingRequestCoordinate_QNAME, PairingAttributeCoordinateDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeFulltextDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Fulltext", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeFulltextDTO> createWsPairingRequestFulltext(PairingAttributeFulltextDTO value) {
        return new JAXBElement<PairingAttributeFulltextDTO>(_WsPairingRequestFulltext_QNAME, PairingAttributeFulltextDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdRealAgencyClient", scope = WsPairingRequest.class)
    public JAXBElement<Integer> createWsPairingRequestIdRealAgencyClient(Integer value) {
        return new JAXBElement<Integer>(_WsPairingRequestIdRealAgencyClient_QNAME, Integer.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeMunicipalityDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Municipality", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeMunicipalityDTO> createWsPairingRequestMunicipality(PairingAttributeMunicipalityDTO value) {
        return new JAXBElement<PairingAttributeMunicipalityDTO>(_WsPairingRequestMunicipality_QNAME, PairingAttributeMunicipalityDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeOwnershipIdDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "OwnershipId", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeOwnershipIdDTO> createWsPairingRequestOwnershipId(PairingAttributeOwnershipIdDTO value) {
        return new JAXBElement<PairingAttributeOwnershipIdDTO>(_WsPairingRequestOwnershipId_QNAME, PairingAttributeOwnershipIdDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributePriceDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Price", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributePriceDTO> createWsPairingRequestPrice(PairingAttributePriceDTO value) {
        return new JAXBElement<PairingAttributePriceDTO>(_WsPairingRequestPrice_QNAME, PairingAttributePriceDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeStreetDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Street", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeStreetDTO> createWsPairingRequestStreet(PairingAttributeStreetDTO value) {
        return new JAXBElement<PairingAttributeStreetDTO>(_WsPairingRequestStreet_QNAME, PairingAttributeStreetDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeSubCategoryIdDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "SubCategoryId", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeSubCategoryIdDTO> createWsPairingRequestSubCategoryId(PairingAttributeSubCategoryIdDTO value) {
        return new JAXBElement<PairingAttributeSubCategoryIdDTO>(_WsPairingRequestSubCategoryId_QNAME, PairingAttributeSubCategoryIdDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PairingAttributeSubRegionIdDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "SubRegionId", scope = WsPairingRequest.class)
    public JAXBElement<PairingAttributeSubRegionIdDTO> createWsPairingRequestSubRegionId(PairingAttributeSubRegionIdDTO value) {
        return new JAXBElement<PairingAttributeSubRegionIdDTO>(_WsPairingRequestSubRegionId_QNAME, PairingAttributeSubRegionIdDTO.class, WsPairingRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Build", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseBuild(String value) {
        return new JAXBElement<String>(_ResponseBaseBuild_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ComparationId", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseComparationId(String value) {
        return new JAXBElement<String>(_ResponseBaseComparationId_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Message", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseMessage(String value) {
        return new JAXBElement<String>(_ResponseBaseMessage_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "ReservationId", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseReservationId(String value) {
        return new JAXBElement<String>(_ResponseBaseReservationId_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Version", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseVersion(String value) {
        return new JAXBElement<String>(_ResponseBaseVersion_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Note", scope = WsChangeLvkeeperNoteRequest.class)
    public JAXBElement<String> createWsChangeLvkeeperNoteRequestNote(String value) {
        return new JAXBElement<String>(_WsChangeLvkeeperNoteRequestNote_QNAME, String.class, WsChangeLvkeeperNoteRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetLvkeeperDiffXmlResponse.DiffXml }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "DiffXml", scope = WsGetLvkeeperDiffXmlResponse.class)
    public JAXBElement<WsGetLvkeeperDiffXmlResponse.DiffXml> createWsGetLvkeeperDiffXmlResponseDiffXml(WsGetLvkeeperDiffXmlResponse.DiffXml value) {
        return new JAXBElement<WsGetLvkeeperDiffXmlResponse.DiffXml>(_WsGetLvkeeperDiffXmlResponseDiffXml_QNAME, WsGetLvkeeperDiffXmlResponse.DiffXml.class, WsGetLvkeeperDiffXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Note", scope = WsAddKNPropertyToLvkeeperRequest.class)
    public JAXBElement<String> createWsAddKNPropertyToLvkeeperRequestNote(String value) {
        return new JAXBElement<String>(_WsChangeLvkeeperNoteRequestNote_QNAME, String.class, WsAddKNPropertyToLvkeeperRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "CisloJednotky", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestCisloJednotky(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestCisloJednotky_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "CisloParcelyVedlejsi", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestCisloParcelyVedlejsi(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestCisloParcelyVedlejsi_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "CisloParcelyZakladni", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestCisloParcelyZakladni(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestCisloParcelyZakladni_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "CisloStavby", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestCisloStavby(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestCisloStavby_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "KodCastObec", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestKodCastObec(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestKodCastObec_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "KodKatastralUzemi", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestKodKatastralUzemi(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestKodKatastralUzemi_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "KodObec", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestKodObec(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestKodObec_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "LV", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Integer> createWsFindKNPropertyByLVRequestLV(Integer value) {
        return new JAXBElement<Integer>(_WsFindKNPropertyByLVRequestLV_QNAME, Integer.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "PuvodParcelyPodTyp", scope = WsFindKNPropertyByLVRequest.class)
    public JAXBElement<Short> createWsFindKNPropertyByLVRequestPuvodParcelyPodTyp(Short value) {
        return new JAXBElement<Short>(_WsFindKNPropertyByLVRequestPuvodParcelyPodTyp_QNAME, Short.class, WsFindKNPropertyByLVRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnershipDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Ownerships", scope = LOVOwnershipResponse.class)
    public JAXBElement<ArrayOfOwnershipDTO> createLOVOwnershipResponseOwnerships(ArrayOfOwnershipDTO value) {
        return new JAXBElement<ArrayOfOwnershipDTO>(_LOVOwnershipResponseOwnerships_QNAME, ArrayOfOwnershipDTO.class, LOVOwnershipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdOwnership", scope = LOVOwnershipRequest.class)
    public JAXBElement<Integer> createLOVOwnershipRequestIdOwnership(Integer value) {
        return new JAXBElement<Integer>(_LOVOwnershipRequestIdOwnership_QNAME, Integer.class, LOVOwnershipRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Countries", scope = LOVCountryResponse.class)
    public JAXBElement<ArrayOfCountryDTO> createLOVCountryResponseCountries(ArrayOfCountryDTO value) {
        return new JAXBElement<ArrayOfCountryDTO>(_LOVCountryResponseCountries_QNAME, ArrayOfCountryDTO.class, LOVCountryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdCountry", scope = LOVCountryRequest.class)
    public JAXBElement<Integer> createLOVCountryRequestIdCountry(Integer value) {
        return new JAXBElement<Integer>(_LOVCountryRequestIdCountry_QNAME, Integer.class, LOVCountryRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoleDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Roles", scope = LOVRoleResponse.class)
    public JAXBElement<ArrayOfRoleDTO> createLOVRoleResponseRoles(ArrayOfRoleDTO value) {
        return new JAXBElement<ArrayOfRoleDTO>(_LOVRoleResponseRoles_QNAME, ArrayOfRoleDTO.class, LOVRoleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Role", scope = LOVRoleRequest.class)
    public JAXBElement<Integer> createLOVRoleRequestRole(Integer value) {
        return new JAXBElement<Integer>(_LOVRoleRequestRole_QNAME, Integer.class, LOVRoleRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubRegionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "SubRegions", scope = LOVSubRegionReponse.class)
    public JAXBElement<ArrayOfSubRegionDTO> createLOVSubRegionReponseSubRegions(ArrayOfSubRegionDTO value) {
        return new JAXBElement<ArrayOfSubRegionDTO>(_LOVSubRegionReponseSubRegions_QNAME, ArrayOfSubRegionDTO.class, LOVSubRegionReponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdRegion", scope = LOVSubRegionRequest.class)
    public JAXBElement<Integer> createLOVSubRegionRequestIdRegion(Integer value) {
        return new JAXBElement<Integer>(_LOVSubRegionRequestIdRegion_QNAME, Integer.class, LOVSubRegionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdSubRegion", scope = LOVSubRegionRequest.class)
    public JAXBElement<Integer> createLOVSubRegionRequestIdSubRegion(Integer value) {
        return new JAXBElement<Integer>(_LOVSubRegionRequestIdSubRegion_QNAME, Integer.class, LOVSubRegionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRegionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Regions", scope = LOVRegionResponse.class)
    public JAXBElement<ArrayOfRegionDTO> createLOVRegionResponseRegions(ArrayOfRegionDTO value) {
        return new JAXBElement<ArrayOfRegionDTO>(_LOVRegionResponseRegions_QNAME, ArrayOfRegionDTO.class, LOVRegionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdRegion", scope = LOVRegionRequest.class)
    public JAXBElement<Integer> createLOVRegionRequestIdRegion(Integer value) {
        return new JAXBElement<Integer>(_LOVSubRegionRequestIdRegion_QNAME, Integer.class, LOVRegionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommercialModeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "CommercialModes", scope = LOVCommercialModeResponse.class)
    public JAXBElement<ArrayOfCommercialModeDTO> createLOVCommercialModeResponseCommercialModes(ArrayOfCommercialModeDTO value) {
        return new JAXBElement<ArrayOfCommercialModeDTO>(_LOVCommercialModeResponseCommercialModes_QNAME, ArrayOfCommercialModeDTO.class, LOVCommercialModeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "CommercialMode", scope = LOVCommercialModeRequest.class)
    public JAXBElement<Integer> createLOVCommercialModeRequestCommercialMode(Integer value) {
        return new JAXBElement<Integer>(_LOVCommercialModeRequestCommercialMode_QNAME, Integer.class, LOVCommercialModeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubCategoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "SubCategories", scope = LOVSubCategoryResponse.class)
    public JAXBElement<ArrayOfSubCategoryDTO> createLOVSubCategoryResponseSubCategories(ArrayOfSubCategoryDTO value) {
        return new JAXBElement<ArrayOfSubCategoryDTO>(_LOVSubCategoryResponseSubCategories_QNAME, ArrayOfSubCategoryDTO.class, LOVSubCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdCategory", scope = LOVSubCategoryRequest.class)
    public JAXBElement<Integer> createLOVSubCategoryRequestIdCategory(Integer value) {
        return new JAXBElement<Integer>(_LOVSubCategoryRequestIdCategory_QNAME, Integer.class, LOVSubCategoryRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "SubCategory", scope = LOVSubCategoryRequest.class)
    public JAXBElement<Integer> createLOVSubCategoryRequestSubCategory(Integer value) {
        return new JAXBElement<Integer>(_LOVSubCategoryRequestSubCategory_QNAME, Integer.class, LOVSubCategoryRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Categories", scope = LOVCategoryResponse.class)
    public JAXBElement<ArrayOfCategoryDTO> createLOVCategoryResponseCategories(ArrayOfCategoryDTO value) {
        return new JAXBElement<ArrayOfCategoryDTO>(_LOVCategoryResponseCategories_QNAME, ArrayOfCategoryDTO.class, LOVCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdCategory", scope = LOVCategoryRequest.class)
    public JAXBElement<Integer> createLOVCategoryRequestIdCategory(Integer value) {
        return new JAXBElement<Integer>(_LOVSubCategoryRequestIdCategory_QNAME, Integer.class, LOVCategoryRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfferTypeDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "OfferTypes", scope = LOVOfferTypeResponse.class)
    public JAXBElement<ArrayOfOfferTypeDTO> createLOVOfferTypeResponseOfferTypes(ArrayOfOfferTypeDTO value) {
        return new JAXBElement<ArrayOfOfferTypeDTO>(_LOVOfferTypeResponseOfferTypes_QNAME, ArrayOfOfferTypeDTO.class, LOVOfferTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "OfferType", scope = LOVOfferTypeRequest.class)
    public JAXBElement<Integer> createLOVOfferTypeRequestOfferType(Integer value) {
        return new JAXBElement<Integer>(_LOVOfferTypeRequestOfferType_QNAME, Integer.class, LOVOfferTypeRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftSearchProfileDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "tSearchProfiles", scope = TSearchProfileResponse.class)
    public JAXBElement<ArrayOftSearchProfileDTO> createTSearchProfileResponseTSearchProfiles(ArrayOftSearchProfileDTO value) {
        return new JAXBElement<ArrayOftSearchProfileDTO>(_TSearchProfileResponseTSearchProfiles_QNAME, ArrayOftSearchProfileDTO.class, TSearchProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdSearchProfile", scope = WsOctop1BRequest.class)
    public JAXBElement<Integer> createWsOctop1BRequestIdSearchProfile(Integer value) {
        return new JAXBElement<Integer>(_WsOctop1BRequestIdSearchProfile_QNAME, Integer.class, WsOctop1BRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsOctop1ACriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "Criteria", scope = WsOctop1ARequest.class)
    public JAXBElement<WsOctop1ACriteria> createWsOctop1ARequestCriteria(WsOctop1ACriteria value) {
        return new JAXBElement<WsOctop1ACriteria>(_WsOctop1ARequestCriteria_QNAME, WsOctop1ACriteria.class, WsOctop1ARequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "IdSearchProfile", scope = WsOctop1ARequest.class)
    public JAXBElement<Integer> createWsOctop1ARequestIdSearchProfile(Integer value) {
        return new JAXBElement<Integer>(_WsOctop1BRequestIdSearchProfile_QNAME, Integer.class, WsOctop1ARequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOftHitDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.octopuspro.cz/types/", name = "tHits", scope = THitResponse.class)
    public JAXBElement<ArrayOftHitDTO> createTHitResponseTHits(ArrayOftHitDTO value) {
        return new JAXBElement<ArrayOftHitDTO>(_THitResponseTHits_QNAME, ArrayOftHitDTO.class, THitResponse.class, value);
    }

}

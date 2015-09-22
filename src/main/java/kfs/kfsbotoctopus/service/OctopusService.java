package kfs.kfsbotoctopus.service;

import java.util.List;
import kfs.kfsbotoctopus.domain.*;

/**
 *
 * @author pavedrim
 */
public interface OctopusService {
    
    int countersLoad();
    void advertLoad();
    
    
    List<OctoCategory> categoryLoad();
    List<OctoSubcategory> subcategoryLoad();
    List<OctoOfferType> offerTypeLoad();
    List<OctoCommercialMode> commercialModeLoad();
    List<OctoRegion> regionLoad();
    List<OctoSubRegion> subregionLoad();
    List<OctoCountry> countryLoad();
    List<OctoOwnership> ownershipLoad();
}

package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoSubRegion;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoSubRegionDao extends BaseDao<OctoSubRegion, Integer>{

    public List<OctoSubRegion> loadAll();
    
}

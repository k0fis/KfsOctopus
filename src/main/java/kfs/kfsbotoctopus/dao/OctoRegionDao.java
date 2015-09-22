package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoRegion;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoRegionDao extends BaseDao<OctoRegion, Integer>{

    public List<OctoRegion> loadAll();
    
}

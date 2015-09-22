package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoCommercialMode;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoCommercialModeDao extends BaseDao<OctoCommercialMode, Integer>{

    public List<OctoCommercialMode> loadAll();
    
}

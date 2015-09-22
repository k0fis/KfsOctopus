package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoOwnership;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoOwnershipDao extends BaseDao<OctoOwnership, Integer>{

    public List<OctoOwnership> loadAll();
    
}

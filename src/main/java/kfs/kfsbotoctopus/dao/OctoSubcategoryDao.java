package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoSubcategory;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoSubcategoryDao extends BaseDao<OctoSubcategory, Integer>{

    public List<OctoSubcategory> loadAll();
    
}

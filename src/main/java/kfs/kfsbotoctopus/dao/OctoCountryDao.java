package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoCountry;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoCountryDao extends BaseDao<OctoCountry, Integer>{

    public List<OctoCountry> loadAll();
    
}

package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoCategory;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoCategoryDao extends BaseDao<OctoCategory, Integer>{

    public List<OctoCategory> loadAll();

}

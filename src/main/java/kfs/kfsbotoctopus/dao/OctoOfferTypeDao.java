package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoOfferType;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoOfferTypeDao extends BaseDao<OctoOfferType, Integer>{

    public List<OctoOfferType> loadAll();

}

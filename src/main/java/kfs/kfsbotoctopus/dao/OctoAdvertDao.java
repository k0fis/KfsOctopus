package kfs.kfsbotoctopus.dao;

import java.util.List;
import kfs.kfsbotoctopus.domain.OctoAdvert;
import kfs.kfscrm.domain.KfsContact;
import kfs.springutils.BaseDao;

/**
 *
 * @author pavedrim
 */
public interface OctoAdvertDao extends BaseDao<OctoAdvert, Long>{

    public List<OctoAdvert> loadByContact(KfsContact contact);

}

package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoSubRegionDao;
import kfs.kfsbotoctopus.domain.OctoSubRegion;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoSubRegionDaoJpa extends BaseDaoJpa<OctoSubRegion, Integer> implements OctoSubRegionDao{

    @Override
    protected Class<OctoSubRegion> getDataClass() {
        return OctoSubRegion.class;
    }

    @Override
    protected Integer getId(OctoSubRegion data) {
        return data.getIdSubRegion();
    }

    @Override
    public List<OctoSubRegion> loadAll() {
        return em.createQuery("SELECT a FROM OctoSubRegion a").getResultList();
    }

}

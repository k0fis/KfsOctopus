package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoRegionDao;
import kfs.kfsbotoctopus.domain.OctoRegion;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoRegionDaoJpa extends BaseDaoJpa<OctoRegion, Integer> implements OctoRegionDao{

    @Override
    protected Class<OctoRegion> getDataClass() {
        return OctoRegion.class;
    }

    @Override
    protected Integer getId(OctoRegion data) {
        return data.getIdRegion();
    }

    @Override
    public List<OctoRegion> loadAll() {
        return em.createQuery("SELECT a FROM OctoRegion a").getResultList();
    }

}

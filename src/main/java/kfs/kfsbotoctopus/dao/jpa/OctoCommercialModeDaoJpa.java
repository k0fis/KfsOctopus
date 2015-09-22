package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoCommercialModeDao;
import kfs.kfsbotoctopus.domain.OctoCommercialMode;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoCommercialModeDaoJpa extends BaseDaoJpa<OctoCommercialMode, Integer> implements OctoCommercialModeDao{

    @Override
    protected Class<OctoCommercialMode> getDataClass() {
        return OctoCommercialMode.class;
    }

    @Override
    protected Integer getId(OctoCommercialMode data) {
        return data.getIdCommercialMode();
    }
    
    @Override
    public List<OctoCommercialMode> loadAll() {
        return em.createQuery("SELECT a FROM OctoCommercialMode a").getResultList();
    }

}

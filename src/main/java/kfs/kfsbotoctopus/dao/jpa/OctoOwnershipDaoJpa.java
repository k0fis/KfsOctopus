package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoOwnershipDao;
import kfs.kfsbotoctopus.domain.OctoOwnership;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoOwnershipDaoJpa extends BaseDaoJpa<OctoOwnership, Integer> implements OctoOwnershipDao{

    @Override
    protected Class<OctoOwnership> getDataClass() {
        return OctoOwnership.class;
    }

    @Override
    protected Integer getId(OctoOwnership data) {
        return data.getId();
    }

    @Override
    public List<OctoOwnership> loadAll() {
        return em.createQuery("SELECT a FROM OctoOwnership a").getResultList();
    }

}

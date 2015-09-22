package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoOfferTypeDao;
import kfs.kfsbotoctopus.domain.OctoOfferType;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoOfferTypeDaoJpa extends BaseDaoJpa<OctoOfferType, Integer> implements OctoOfferTypeDao{

    @Override
    protected Class<OctoOfferType> getDataClass() {
        return OctoOfferType.class;
    }

    @Override
    protected Integer getId(OctoOfferType data) {
        return data.getId();
    }

    @Override
    public List<OctoOfferType> loadAll() {
        return em.createQuery("SELECT a FROM OctoOfferType a").getResultList();
    }

}

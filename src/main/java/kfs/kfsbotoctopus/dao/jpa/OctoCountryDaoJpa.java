package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoCountryDao;
import kfs.kfsbotoctopus.domain.OctoCountry;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoCountryDaoJpa extends BaseDaoJpa<OctoCountry, Integer> implements OctoCountryDao{

    @Override
    protected Class<OctoCountry> getDataClass() {
        return OctoCountry.class;
    }

    @Override
    protected Integer getId(OctoCountry data) {
        return data.getId();
    }

    @Override
    public List<OctoCountry> loadAll() {
        return em.createQuery("SELECT a FROM OctoCountry a").getResultList();
    }

}

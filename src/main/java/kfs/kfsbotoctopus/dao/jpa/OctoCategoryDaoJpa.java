package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoCategoryDao;
import kfs.kfsbotoctopus.domain.OctoCategory;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoCategoryDaoJpa extends BaseDaoJpa<OctoCategory, Integer> implements OctoCategoryDao{

    @Override
    protected Class<OctoCategory> getDataClass() {
        return OctoCategory.class;
    }

    @Override
    protected Integer getId(OctoCategory data) {
        return data.getIdCategory();
    }

    @Override
    public List<OctoCategory> loadAll() {
        return em.createQuery("SELECT a FROM OctoCategory a").getResultList();
    }

}

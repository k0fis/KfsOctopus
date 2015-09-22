package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoSubcategoryDao;
import kfs.kfsbotoctopus.domain.OctoSubcategory;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoSubcategoryDaoJpa extends BaseDaoJpa<OctoSubcategory, Integer> implements OctoSubcategoryDao{

    @Override
    protected Class<OctoSubcategory> getDataClass() {
        return OctoSubcategory.class;
    }

    @Override
    protected Integer getId(OctoSubcategory data) {
        return data.getIdSubCategory();
    }

    @Override
    public List<OctoSubcategory> loadAll() {
        return em.createQuery("SELECT a FROM OctoSubcategory a").getResultList();
    }

}

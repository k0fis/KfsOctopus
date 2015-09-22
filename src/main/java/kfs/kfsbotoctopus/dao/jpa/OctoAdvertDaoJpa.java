package kfs.kfsbotoctopus.dao.jpa;

import java.util.List;
import kfs.kfsbotoctopus.dao.OctoAdvertDao;
import kfs.kfsbotoctopus.domain.OctoAdvert;
import kfs.kfscrm.domain.KfsContact;
import kfs.springutils.BaseDaoJpa;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pavedrim
 */
@Repository
public class OctoAdvertDaoJpa extends BaseDaoJpa<OctoAdvert, Long> implements OctoAdvertDao{

    @Override
    protected Class<OctoAdvert> getDataClass() {
        return OctoAdvert.class;
    }

    @Override
    protected Long getId(OctoAdvert data) {
        return data.getId();
    }

    @Override
    public List<OctoAdvert> loadByContact(KfsContact contact) {
        return em.createQuery("SELECT a FROM OctoAdvert a WHERE a.contact = :contact ORDER BY a.imported DESC")
                .setParameter("contact", contact)
                .getResultList();
    }

}

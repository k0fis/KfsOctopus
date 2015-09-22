package kfs.kfsbotoctopus.domain;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pavedrim
 */
@Entity
public class OctoSubRegion {

    private Integer idRegion;
    @Id
    private Integer idSubRegion;
    private String subRegionName;

    public Integer getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    public Integer getIdSubRegion() {
        return idSubRegion;
    }

    public void setIdSubRegion(Integer idSubRegion) {
        this.idSubRegion = idSubRegion;
    }

    public String getSubRegionName() {
        return subRegionName;
    }

    public void setSubRegionName(String subRegionName) {
        this.subRegionName = subRegionName;
    }

    @Override
    public String toString() {
        return subRegionName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idSubRegion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OctoSubRegion other = (OctoSubRegion) obj;
        if (!Objects.equals(this.idSubRegion, other.idSubRegion)) {
            return false;
        }
        return true;
    }

    
}

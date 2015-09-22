package kfs.kfsbotoctopus.domain;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pavedrim
 */
@Entity
public class OctoCommercialMode {

    private Integer commercialMode;
    private String commercialModeName;
    @Id
    private Integer idCommercialMode;

    public Integer getCommercialMode() {
        return commercialMode;
    }

    public void setCommercialMode(Integer commercialMode) {
        this.commercialMode = commercialMode;
    }

    public String getCommercialModeName() {
        return commercialModeName;
    }

    public void setCommercialModeName(String commercialModeName) {
        this.commercialModeName = commercialModeName;
    }

    public Integer getIdCommercialMode() {
        return idCommercialMode;
    }

    public void setIdCommercialMode(Integer idCommercialMode) {
        this.idCommercialMode = idCommercialMode;
    }

    @Override
    public String toString() {
        return commercialModeName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.idCommercialMode);
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
        final OctoCommercialMode other = (OctoCommercialMode) obj;
        if (!Objects.equals(this.idCommercialMode, other.idCommercialMode)) {
            return false;
        }
        return true;
    }
    
    
    
}

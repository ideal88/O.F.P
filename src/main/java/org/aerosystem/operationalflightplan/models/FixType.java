package org.aerosystem.operationalflightplan.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class FixType {
    @Id
    private  String fixTypeID;
    private String fixTypeDescription;
    @OneToMany(mappedBy = "fixType")
    private Set<Fix> fixes;

    public String getFixTypeID() {
        return fixTypeID;
    }

    public void setFixTypeID(String fixTypeID) {
        this.fixTypeID = fixTypeID;
    }

    public String getFixTypeDescription() {
        return fixTypeDescription;
    }

    public void setFixTypeDescription(String fixTypeDescription) {
        this.fixTypeDescription = fixTypeDescription;
    }

    public Set<Fix> getFixes() {
        return fixes;
    }

    public void setFixes(Set<Fix> fixes) {
        this.fixes = fixes;
    }
}

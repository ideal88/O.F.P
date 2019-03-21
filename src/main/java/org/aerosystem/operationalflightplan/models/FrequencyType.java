package org.aerosystem.operationalflightplan.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class FrequencyType {
    @Id
    private String frequencyTypeID;
   private String FrequencyTypeDescription;
   @OneToMany(mappedBy = "frequencyType")
   private Set<Frequency> frequencies;

    public String getFrequencyTypeID() {
        return frequencyTypeID;
    }

    public void setFrequencyTypeID(String frequencyTypeID) {
        this.frequencyTypeID = frequencyTypeID;
    }

    public String getFrequencyTypeDescription() {
        return FrequencyTypeDescription;
    }

    public void setFrequencyTypeDescription(String frequencyTypeDescription) {
        FrequencyTypeDescription = frequencyTypeDescription;
    }

    public Set<Frequency> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(Set<Frequency> frequencies) {
        this.frequencies = frequencies;
    }
}

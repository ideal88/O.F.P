package um.ofp.ofp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class RunwaySurfaceType {
    @Id
   private String runwaySurfaceTypeID;
   private String runwaySurufaceDescription;
   @OneToMany(mappedBy = "runwaySurfaceType")
   private Set<Runway> runways;

    public String getRunwaySurfaceTypeID() {
        return runwaySurfaceTypeID;
    }

    public void setRunwaySurfaceTypeID(String runwaySurfaceTypeID) {
        this.runwaySurfaceTypeID = runwaySurfaceTypeID;
    }

    public String getRunwaySurufaceDescription() {
        return runwaySurufaceDescription;
    }

    public void setRunwaySurufaceDescription(String runwaySurufaceDescription) {
        this.runwaySurufaceDescription = runwaySurufaceDescription;
    }

    public Set<Runway> getRunways() {
        return runways;
    }

    public void setRunways(Set<Runway> runways) {
        this.runways = runways;
    }
}

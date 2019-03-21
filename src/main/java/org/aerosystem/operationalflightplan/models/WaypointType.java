package org.aerosystem.operationalflightplan.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class WaypointType {
    @Id
    private String waypointTypeID;
    private String waypointTypeDescription;
    @OneToMany(mappedBy = "waypointType")
    private Set<Waypoint> waypoints;

    public String getWaypointTypeID() {
        return waypointTypeID;
    }

    public void setWaypointTypeID(String waypointTypeID) {
        this.waypointTypeID = waypointTypeID;
    }

    public String getWaypointTypeDescription() {
        return waypointTypeDescription;
    }

    public void setWaypointTypeDescription(String waypointTypeDescription) {
        this.waypointTypeDescription = waypointTypeDescription;
    }

    public Set<Waypoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(Set<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }
}

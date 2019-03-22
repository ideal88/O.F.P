package org.aerosystem.operationalflightplan.services;

import org.aerosystem.operationalflightplan.models.Waypoint;

import java.util.Optional;
import java.util.Set;


public interface WaypointService {
    Set<Waypoint> getWaypointsInCountry(String countryID);
    Optional<Waypoint> getWaypointById(String country, String waypointID);
    boolean isWaypoint(String waypointID);

}

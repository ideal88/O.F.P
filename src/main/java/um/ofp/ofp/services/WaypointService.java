package um.ofp.ofp.services;

import jdk.nashorn.internal.runtime.options.Option;
import um.ofp.ofp.models.Waypoint;

import java.util.Optional;
import java.util.Set;

public interface WaypointService {
    Set<Waypoint> getWaypointsInCountry(String cointryID);
    Waypoint getwaypointById(String waypointID);
    boolean isWaypoint(String waypointID);

}

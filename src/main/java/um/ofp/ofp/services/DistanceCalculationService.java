package um.ofp.ofp.services;

import um.ofp.ofp.models.Waypoint;

public interface DistanceCalculationService {
    Double distanceBetweenTwoWaypointsInNauticalMiles(Waypoint fromWaypoint, Waypoint toWaypoint);
}

package org.aerosystem.operationalflightplan.services;

import org.aerosystem.operationalflightplan.models.Waypoint;

public interface DistanceCalculationService {
    Double distanceBetweenTwoWaypointsInNauticalMiles(Waypoint fromWaypoint, Waypoint toWaypoint);
}

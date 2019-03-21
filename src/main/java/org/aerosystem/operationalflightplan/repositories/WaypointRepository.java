package org.aerosystem.operationalflightplan.repositories;

import org.aerosystem.operationalflightplan.models.Country;
import org.aerosystem.operationalflightplan.models.Waypoint;
import org.aerosystem.operationalflightplan.models.WaypointType;
import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;
import java.util.Optional;

public interface WaypointRepository extends CrudRepository<Waypoint,String> {

    HashSet<Waypoint> findByCountry(Country country);
    Optional<Waypoint> findByWaypointType(Waypoint waypoint);
    Optional<Waypoint> findByCountryAndWaypointType(Country country, WaypointType waypointType);
    Optional<Waypoint> findByCountryAndWaypointName(Country country,String waypointName);

}

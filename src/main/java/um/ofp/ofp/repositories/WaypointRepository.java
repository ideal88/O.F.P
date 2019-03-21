package um.ofp.ofp.repositories;

import org.springframework.data.repository.CrudRepository;
import um.ofp.ofp.models.Country;
import um.ofp.ofp.models.Waypoint;
import um.ofp.ofp.models.WaypointType;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public interface WaypointRepository extends CrudRepository<Waypoint,String> {

    HashSet<Waypoint> findByCountry(Country country);
    Optional<Waypoint> findByWaypointType(Waypoint waypoint);
    Optional<Waypoint> findByCountryAndWaypointType(Country country, WaypointType waypointType);
    Optional<Waypoint> findByCountryAndWaypointName(Country country,String waypointName);

}

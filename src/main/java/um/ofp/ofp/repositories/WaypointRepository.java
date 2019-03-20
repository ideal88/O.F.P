package um.ofp.ofp.repositories;

import org.springframework.data.repository.CrudRepository;
import um.ofp.ofp.models.Country;
import um.ofp.ofp.models.Waypoint;
import um.ofp.ofp.models.WaypointType;

import java.util.Optional;
import java.util.Set;

public interface WaypointRepository extends CrudRepository<Waypoint,String> {

    Set<Waypoint> findByCountry(Country country);
    Optional<Waypoint> findByWaypointType(Waypoint waypoint);
    Optional<Waypoint> findByCountryAndWaypointType(Country country, WaypointType waypointType);

}

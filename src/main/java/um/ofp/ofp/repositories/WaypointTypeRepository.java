package um.ofp.ofp.repositories;

import org.springframework.data.repository.CrudRepository;
import um.ofp.ofp.models.Waypoint;
import um.ofp.ofp.models.WaypointType;

public interface WaypointTypeRepository extends CrudRepository<WaypointType,String> {
    WaypointType findByWaypointTypeID(String waypointTypeID);
}

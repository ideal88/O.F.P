package org.aerosystem.operationalflightplan.repositories;

import org.aerosystem.operationalflightplan.models.WaypointType;
import org.springframework.data.repository.CrudRepository;

public interface WaypointTypeRepository extends CrudRepository<WaypointType,String> {
    WaypointType findByWaypointTypeID(String waypointTypeID);
}

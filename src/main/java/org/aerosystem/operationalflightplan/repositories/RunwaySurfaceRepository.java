package org.aerosystem.operationalflightplan.repositories;

import org.aerosystem.operationalflightplan.models.RunwaySurfaceType;
import org.springframework.data.repository.CrudRepository;

public interface RunwaySurfaceRepository extends CrudRepository<RunwaySurfaceType,String> {

}

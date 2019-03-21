package org.aerosystem.operationalflightplan.repositories;

import org.aerosystem.operationalflightplan.models.FixType;
import org.springframework.data.repository.CrudRepository;

public interface FixTypeRepository extends CrudRepository<FixType,String> {
}

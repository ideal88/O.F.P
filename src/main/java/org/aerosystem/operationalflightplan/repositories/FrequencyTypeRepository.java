package org.aerosystem.operationalflightplan.repositories;

import org.aerosystem.operationalflightplan.models.FrequencyType;
import org.springframework.data.repository.CrudRepository;

public interface FrequencyTypeRepository extends CrudRepository<FrequencyType,String> {
}

package org.aerosystem.operationalflightplan.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.aerosystem.operationalflightplan.models.Country;

@Service
public interface CountryRepository extends CrudRepository<Country,String> {
    Country findByCountryID(String id);

}

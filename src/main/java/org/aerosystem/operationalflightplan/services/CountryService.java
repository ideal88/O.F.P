package org.aerosystem.operationalflightplan.services;

import org.aerosystem.operationalflightplan.models.Country;


public interface CountryService {
    Iterable<Country> getAllCounries();

}

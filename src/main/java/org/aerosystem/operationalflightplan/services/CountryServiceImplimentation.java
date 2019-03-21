package org.aerosystem.operationalflightplan.services;

import org.aerosystem.operationalflightplan.models.Country;
import org.aerosystem.operationalflightplan.repositories.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImplimentation implements CountryService {


    CountryRepository countryRepository;

    public CountryServiceImplimentation(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Iterable<Country> getAllCounries() {
        return countryRepository.findAll();
    }
}

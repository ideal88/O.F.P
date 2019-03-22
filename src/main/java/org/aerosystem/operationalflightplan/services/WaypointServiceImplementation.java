package org.aerosystem.operationalflightplan.services;

import org.aerosystem.operationalflightplan.models.Country;
import org.aerosystem.operationalflightplan.models.Waypoint;
import org.aerosystem.operationalflightplan.repositories.CountryRepository;
import org.springframework.stereotype.Service;
import org.aerosystem.operationalflightplan.repositories.WaypointRepository;

import java.util.Optional;
import java.util.Set;

@Service
public  class WaypointServiceImplementation implements WaypointService {

    final private WaypointRepository waypointRepository;
    final private CountryRepository countryRepository;

    public WaypointServiceImplementation(WaypointRepository waypointRepository, CountryRepository countryRepository) {
        this.waypointRepository = waypointRepository;
        this.countryRepository = countryRepository;
    }

    @Override
    public Set<Waypoint> getWaypointsInCountry(String countryID) {
        Country country = countryRepository.findByCountryID(countryID);
        return waypointRepository.findByCountry(country);
    }

    @Override
    public Optional<Waypoint> getWaypointById(String countryID, String waypointID) {
        //waypointID = String.format("%-" + 30 + "s", waypointID);
        Country country = countryRepository.findById(countryID).get();
        return  waypointRepository.findByCountryAndWaypointName(country,waypointID);
    }

    @Override
    public boolean isWaypoint(String waypointID) {
        return false;
    }
}

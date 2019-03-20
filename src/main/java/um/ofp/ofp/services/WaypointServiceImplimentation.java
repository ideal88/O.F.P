package um.ofp.ofp.services;

import org.springframework.stereotype.Service;
import um.ofp.ofp.models.Country;
import um.ofp.ofp.models.Waypoint;
import um.ofp.ofp.repositories.CountryRepository;
import um.ofp.ofp.repositories.WaypointRepository;

import java.util.Optional;
import java.util.Set;

@Service
public  class WaypointServiceImplimentation implements WaypointService {

    final private WaypointRepository waypointRepository;
    final private CountryRepository countryRepository;

    public WaypointServiceImplimentation(WaypointRepository waypointRepository, CountryRepository countryRepository) {
        this.waypointRepository = waypointRepository;
        this.countryRepository = countryRepository;
    }

    @Override
    public Set<Waypoint> getWaypointsInCountry(String countryID) {
        Country country = countryRepository.findByCountryID(countryID);
        return waypointRepository.findByCountry(country);
    }

    @Override
    public Waypoint getwaypointById(String waypointID) {
        return null;
    }

    @Override
    public boolean isWaypoint(String waypointID) {
        return false;
    }
}

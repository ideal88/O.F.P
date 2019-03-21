package org.aerosystem.operationalflightplan.services;

import org.aerosystem.operationalflightplan.models.Waypoint;
import org.aerosystem.operationalflightplan.repositories.CountryRepository;
import org.aerosystem.operationalflightplan.repositories.WaypointRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class WaypointServiceImplementationTest {
    WaypointService waypointService;

    @Mock
    WaypointRepository waypointRepository;
    @Mock
    CountryRepository countryRepository;

    @Before
    public  void setWaypointService()
    {
        MockitoAnnotations.initMocks(this);
        waypointService = new WaypointServiceImplementation(waypointRepository,countryRepository);
    }



    @Test
    public void getWaypointsInCountry() {
        int numberOfWaypoints =56;
        String countryCode = "ZI";
       // Waypoint waypoint = waypointService.getwaypointById("ZI","UTULI").get();
       // assertEquals("UTULI" ,waypoint.getWaypointName());
        Set<Waypoint> waypointSetInZimbabwe = waypointService.getWaypointsInCountry(countryCode);
        assertEquals(numberOfWaypoints,waypointSetInZimbabwe.size());
    }

    @Test
    public void getwaypointById() {
    }

    @Test
    public void isWaypoint() {
    }
}

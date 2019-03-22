package org.aerosystem.operationalflightplan.services;

import org.aerosystem.operationalflightplan.models.Waypoint;
import org.aerosystem.operationalflightplan.repositories.CountryRepository;
import org.aerosystem.operationalflightplan.repositories.WaypointRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(Parameterized.class)
public class WaypointServiceImplementationTest {

   private String countryID;
   private HashSet<Waypoint> waypoints;

    public WaypointServiceImplementationTest(String countryID, HashSet<Waypoint> waypoints) {
        this.countryID = countryID;
        this.waypoints = waypoints;
    }

    @Parameterized.Parameters
    public static Collection data() {
        Set<Waypoint> waypointsZI = new HashSet<>();
        Waypoint waypointZI1 = new Waypoint();
        waypointZI1.setWaypointID("UTULI");
        Waypoint waypointZI2 = new Waypoint();
        waypointZI2.setWaypointID("VGO1");
        waypointsZI.add(waypointZI1);

        Set<Waypoint> waypointsSA = new HashSet<>();
        Waypoint waypointSA1 = new Waypoint();
        waypointSA1.setWaypointID("NEGSAG");
        Waypoint waypointSA2 = new Waypoint();
        waypointSA2.setWaypointID("VGO");
        waypointsSA.add(waypointSA1);
        waypointsSA.add(waypointSA2);

       return Arrays.asList(new Object[][] {{"ZI",waypointsZI},{"SA",waypointsSA}});
    }

    private WaypointService waypointService;

    @Mock
    private WaypointRepository waypointRepository;
    @Mock
    private CountryRepository countryRepository;

    @Before
    public  void setWaypointService()
    {
        MockitoAnnotations.initMocks(this);
        waypointService = new WaypointServiceImplementation(waypointRepository,countryRepository);
    }


    @Test
   // @Ignore
    public void getWaypointsInCountry() {


        when(waypointService.getWaypointsInCountry("ZI")).thenReturn(cuntryWaypoints(countryID));
        assertEquals(waypoints.size(),waypointService.getWaypointsInCountry(countryID).size());


    }
    private Set<Waypoint> cuntryWaypoints(String countr){
    Set<Waypoint> waypointsZI = new HashSet<>();
    Waypoint waypointZI1 = new Waypoint();
    waypointZI1.setWaypointID("UTULI");
    Waypoint waypointZI2 = new Waypoint();
    waypointZI2.setWaypointID("VGO1");
    waypointsZI.add(waypointZI1);

    Set<Waypoint> waypointsSA = new HashSet<>();
    Waypoint waypointSA1 = new Waypoint();
    waypointSA1.setWaypointID("NEGSAG");
    Waypoint waypointSA2 = new Waypoint();
    waypointSA2.setWaypointID("VGO");
    waypointsSA.add(waypointSA1);
    waypointsSA.add(waypointSA2);
    switch (countr){
        case "ZI": return waypointsZI;
        case "SA": return waypointsSA;
        default: return null;
    }


}

}

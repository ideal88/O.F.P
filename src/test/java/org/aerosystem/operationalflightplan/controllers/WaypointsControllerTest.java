package org.aerosystem.operationalflightplan.controllers;

import org.aerosystem.operationalflightplan.services.CountryService;
import org.aerosystem.operationalflightplan.services.DistanceCalculationService;
import org.aerosystem.operationalflightplan.services.WaypointService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.assertEquals;

public class WaypointsControllerTest {

    @Mock
    private WaypointService waypointService;
    @Mock
    private CountryService countryService;
    @Mock
    private DistanceCalculationService distanceCalculationService;
    @Mock
    private Model model;

    private WaypointController waypointController;

 @Before
 public void init()
 {
     MockitoAnnotations.initMocks(this);
     waypointController = new WaypointController(countryService,waypointService,distanceCalculationService);
 }

    @Test
    public void getIndex()
    {
   assertEquals("waypoints/index",waypointController.ListAllWaypoints(model));
  verify(waypointService,times(1)).getWaypointsInCountry(any());

    }
}

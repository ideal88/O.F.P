package um.ofp.ofp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import um.ofp.ofp.services.CountryService;
import um.ofp.ofp.services.DistanceCalculationService;
import um.ofp.ofp.services.WaypointService;



@Controller
public class WaypointController {

private final CountryService countryService;
private final WaypointService waypointService;
private final DistanceCalculationService distanceCalculationService;

    public WaypointController(CountryService countryService, WaypointService waypointService, DistanceCalculationService distanceCalculationService) {
        this.countryService = countryService;
        this.waypointService = waypointService;
        this.distanceCalculationService = distanceCalculationService;
    }

    @RequestMapping({"/waypoints/","/waypoints/index"})
     String ListAllWaypoints(Model model)
    {

        model.addAttribute("waypoints",waypointService.getWaypointsInCountry(""));
        model.addAttribute("countries",countryService.getAllCounries());
                 return "waypoints/index";
    }

    @PostMapping({"/waypoints/","/waypoints/index"})
    public String ListAllWaypoints(Model model,String countryID)
    {

        model.addAttribute("waypoints",waypointService.getWaypointsInCountry(countryID));
        model.addAttribute("countries",countryService.getAllCounries());
       model.addAttribute("distance",distanceCalculationService.distanceBetweenTwoWaypointsInNauticalMiles(
                waypointService.getwaypointById("ZI","VGO").get()
                ,waypointService.getwaypointById("ZI","UTULI").get()
        ));
        return "waypoints/index";
    }
}

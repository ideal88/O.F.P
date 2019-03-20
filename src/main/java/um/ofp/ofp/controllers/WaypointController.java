package um.ofp.ofp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import um.ofp.ofp.services.CountryService;
import um.ofp.ofp.services.WaypointService;



@Controller
public class WaypointController {

private final CountryService countryService;
private final WaypointService waypointService;

    public WaypointController(CountryService countryRepository, WaypointService waypointService) {
        this.countryService = countryRepository;
        this.waypointService = waypointService;
    }

    @RequestMapping({"/waypoints/","/waypoints/index"})
    @PostMapping({"/waypoints/","/waypoints/index"})
    public String ListAllWaypoints(Model model,String countryID)
    {
        model.addAttribute("waypoints",waypointService.getWaypointsInCountry(countryID));
        model.addAttribute("countries",countryService.getAllCounries());
        return "waypoints/index";
    }
}

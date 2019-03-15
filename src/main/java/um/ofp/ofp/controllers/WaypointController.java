package um.ofp.ofp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import um.ofp.ofp.models.Country;
import um.ofp.ofp.models.WaypointType;
import um.ofp.ofp.repositories.CountryRepository;
import um.ofp.ofp.repositories.WaypointRepository;
import um.ofp.ofp.repositories.WaypointTypeRepository;

import java.util.Collection;
import java.util.Map;

@Controller
public class WaypointController {
    private WaypointRepository waypointRepository;
    private CountryRepository countryRepository;
    private WaypointTypeRepository waypointTypeRepository ;

    public WaypointController(WaypointRepository waypointRepository, CountryRepository countryRepository, WaypointTypeRepository waypointTypeRepository)
    {
        this.waypointRepository = waypointRepository;
        this.countryRepository = countryRepository;
        this.waypointTypeRepository = waypointTypeRepository;
    }


    @RequestMapping({"/waypoints/","/waypoints/index"})
    @PostMapping({"/waypoints/","/waypoints/index"})
    public String ListAllWaypoints(Model model,String countryID)
    {
        System.out.println(countryID);
        Country country = countryRepository.findByCountryID(countryID);

        model.addAttribute("waypoints",waypointRepository.findByCountry(country));
        model.addAttribute("countries",countryRepository.findAll());
        return "waypoints/index";
    }
}

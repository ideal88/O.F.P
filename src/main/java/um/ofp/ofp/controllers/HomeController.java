package um.ofp.ofp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/","","/index"})
    public String index(Model model){

        model.addAttribute("myName","Deal");
        return "index";
    }

}

package spring.pfa.g4.CommuteEase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import spring.pfa.g4.CommuteEase.model.Parent;
import spring.pfa.g4.CommuteEase.service.ParentService;

@Controller
public class driverController {

    @Autowired
    @GetMapping("/drivers")
    public String drivers() {

        return "drivers";


    }
}

package spring.pfa.g4.CommuteEase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import spring.pfa.g4.CommuteEase.model.Bus;
import spring.pfa.g4.CommuteEase.service.BusService;

@Controller
public class BusController {

    @Autowired
    private BusService busService;


    @GetMapping("/addBus")
    public String saveBusForm(Model model){
        return "addBus";
    }

    @PostMapping("/saveBus")
    public String saveBus(@ModelAttribute Bus bus) {
        busService.saveBus(bus);
        return "redirect:/listBus";

    }

    @GetMapping("/listBus")

    public String getAllBus(Model model) {
        model.addAttribute("listBus",busService.getAllBus());
        return "list_Bus";
    }


    @GetMapping("UpdateBus/{id}")
    public String UpdateBus(@PathVariable(value="id") int id, Model model) {
        //get bus from service
        Bus bus=busService.getBusById(id);

        // set bus as a model attribute
        model.addAttribute("bus",bus);

        return "Update_Bus";
    }
    @GetMapping("DeleteBus/{id}")
    public String DeleteBus(@PathVariable(value="id") int id,Model model) {
        this.busService.DeleteBusById(id);
        return "redirect:/listBus";
    }
}



package spring.pfa.g4.CommuteEase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.pfa.g4.CommuteEase.model.Agence;
import spring.pfa.g4.CommuteEase.service.AgenceService;


@Controller
public class AgenceController {


    @Autowired
    private AgenceService agenceService;


    @PostMapping("/saveAgence")
    public String saveAgence(@ModelAttribute Agence agence) {

        agenceService.saveAgence(agence);
        return "redirect:/listAgences";

    }

    @GetMapping("/listAgences")

    public String getAllAgences(Model model) {
       model.addAttribute("listAgences",agenceService.getAllAgences());
       return "list_Agences";
    }

    @GetMapping("/addAgence")
    public String saveAgenceForm(Model model){
        return "addAgence";
    }


    @GetMapping("UpdateAgence/{id}")
    public String UpdateAgence(@PathVariable(value="id") int id,Model model) {
        //get agence from service
            Agence agence=agenceService.getAgenceById(id);

        // set agence as a model attribute
        model.addAttribute("agence",agence);

        return "Update_Agence";
    }
    @GetMapping("DeleteAgence/{id}")
    public String DeleteAgence(@PathVariable(value="id") int id,Model model) {
        this.agenceService.DeleteAgenceById(id);
        return "redirect:/listAgences";
    }
}

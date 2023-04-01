package spring.pfa.g4.CommuteEase.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spring.pfa.g4.CommuteEase.model.Parent;
import spring.pfa.g4.CommuteEase.service.ParentService;


@Controller
public class parentFromController {
	private ParentService parentService;

	@GetMapping("/addParentFrom")
	public String addParentFrom(String nom , Model model) {
		nom = "a";
		//Parent p =  parentService.getParentByNom(nom);
		//String parentEmail = p.getEmail();
		//model.addAttribute("parentEmail",parentEmail );
		return "addParentFom";

	}

	@PostMapping("/registerParent")
	public String ParentRegister(@ModelAttribute Parent parent){

		System.out.println(parent.toString());
		parentService.saveParent(parent);

		return "addParentFom";
	}

}

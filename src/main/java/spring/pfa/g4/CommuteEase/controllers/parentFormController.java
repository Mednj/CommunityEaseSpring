package spring.pfa.g4.CommuteEase.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spring.pfa.g4.CommuteEase.model.Etudiant;
import spring.pfa.g4.CommuteEase.model.Parent;


@Controller
public class parentFormController {

	@Autowired
	private  ParentController parentController;
	@Autowired
	private EtudiantController etudiantController;

	@GetMapping("/ParentForm2")
	public String addParentFrom(String nom , Model model) {
		nom = "a";
		//Parent p =  parentService.getParentByNom(nom);
		//String parentEmail = p.getEmail();
		//model.addAttribute("parentEmail",parentEmail );
		return "index";

	}

	@PostMapping("/registerParent")
	public String ParentRegister(@ModelAttribute Parent parent, @ModelAttribute Etudiant etudiant){

		System.out.println(parent.toString());
		System.out.println(etudiant.toString());
		etudiant.setParent(parent);
		parentController.saveParent(parent);
		etudiantController.saveEtudiant(etudiant);



		return "index";
	}

	@GetMapping("/ShowStudents")
	public String showStudentPage(@ModelAttribute Etudiant etudiant, Model model){

		model.addAttribute("etudiants" ,etudiantController.getAllEtudiants());
		System.out.println(etudiantController.getAllEtudiants());
		return "ShowStudents";
	}
}

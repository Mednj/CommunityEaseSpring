package spring.pfa.g4.CommuteEase.controllers;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.pfa.g4.CommuteEase.model.Etudiant;
import spring.pfa.g4.CommuteEase.service.EtudiantService;
import spring.pfa.g4.CommuteEase.service.ParentService;
import spring.pfa.g4.CommuteEase.repository.EtudiantRepository;


@RestController

@RequestMapping("/etudiant")

public class EtudiantController {



	@Autowired
	private EtudiantService etudiantService;
	@PostMapping("/add")


	public Etudiant saveEtudiant(@RequestBody Etudiant etudiant) {
		return etudiantService.saveEtudiant(etudiant);
	}

	@GetMapping("/getAll")

	public List<Etudiant> getAllEtudiants() {
		return etudiantService.getAllEtudiants();
	}

	public void deleteEtudiant(Integer id) {
		etudiantService.deleteEtudiant(id);
	}

	public void updateEtudiant(Integer id, Etudiant etudiant) {
		etudiantService.updateEtudiant(id, etudiant);
	}

	public void countEtudiant(Integer id) {
		etudiantService.countEtudiant(id);
	}




}
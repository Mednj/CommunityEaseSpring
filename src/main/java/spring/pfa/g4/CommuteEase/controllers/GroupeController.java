package spring.pfa.g4.CommuteEase.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.pfa.g4.CommuteEase.model.Groupe;
import spring.pfa.g4.CommuteEase.service.GroupeService;

@RestController




@RequestMapping("/groupe")
public class GroupeController {
	 @Autowired
	    private GroupeService groupeService;

	 
	 
	 @PostMapping("/add")
	public Groupe save(@RequestBody Groupe groupe) {
		return groupeService.saveGroupe(groupe);
	}
	    @GetMapping("/all")

	public List<Groupe> geta() {
		return groupeService.getAllGroups();
	}
	    
	    

	public void deleteGroupe(Integer id) {
		groupeService.deleteGroupe(id);
	}

	public void updateGroupe(Integer id, Groupe groupe) {
		groupeService.updateGroupe(id, groupe);
	}

	public void countGroupe(Integer id) {
		groupeService.countGroupe(id);
	}
	 

}

package spring.pfa.g4.CommuteEase.controllers;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.pfa.g4.CommuteEase.model.Parent;
import spring.pfa.g4.CommuteEase.service.ParentService;

@RestController


@RequestMapping("/parent")

public class ParentController {
	

	    @Autowired
	    private ParentService parentService;



	    @GetMapping("/all")
	     List<Parent> list(){
	        return parentService.getAllParents();
	    }
	    
	    @PostMapping("/add")

		public Parent saveParent(@RequestBody Parent parent) {
			return parentService.saveParent(parent);
		}

	    @GetMapping("/getP")


		public Parent getParentByNom(String nom) {
			return parentService.getParentByNom(nom);
		}

		public void deleteParent(Integer id) {
			parentService.deleteParent(id);
		}

		public void updateParent(Integer id, Parent parent) {
			parentService.updateParent(id, parent);
		}

		@GetMapping("/findbyid/{id}")
		public Optional<Parent> getParentById(@PathVariable Integer id) {
			return parentService.getParentById(id);
		}
			public void countParent(Integer id) {
				parentService.countParent(id);
			}
	    
	    
	    
	    
	    
	    
}

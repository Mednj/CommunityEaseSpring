package spring.pfa.g4.CommuteEase.service;


import spring.pfa.g4.CommuteEase.repository.ParentRepository;

import java.util.List;
import java.util.Optional;

import spring.pfa.g4.CommuteEase.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ParentServiceImpl  implements ParentService {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    
    public Parent saveParent(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }

	@Override
	public Parent getParentByNom(String nom) {
		// TODO Auto-generated method stub
		return parentRepository.findByNom(nom);
	}

	@Override
	public void deleteParent(Integer id) {
		// TODO Auto-generated method stub
		 parentRepository.deleteById(id);
		
	}

	@Override
	
	public void updateParent(Integer id,Parent parent) {
		// TODO Auto-generated method stub
		
		Parent s=parentRepository.findById(id).get();
		s.setNom(parent.getNom());
		s.setPrenom(parent.getPrenom());
		s.setEmail(parent.getEmail());
		s.setAddress(parent.getAddress());
		s.setTel(parent.getTel());
		parentRepository.save(s);
		
	}

	@Override
	public void countParent(Integer id) {
		// TODO Auto-generated method stub
		parentRepository.count();
		
	}

	@Override
	public Optional<Parent> getParentById(Integer id) {
		return parentRepository.findById(id);
	}


}

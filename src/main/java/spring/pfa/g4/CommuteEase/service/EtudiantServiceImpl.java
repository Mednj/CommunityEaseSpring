package spring.pfa.g4.CommuteEase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.pfa.g4.CommuteEase.model.Etudiant;
import spring.pfa.g4.CommuteEase.repository.EtudiantRepository;
import spring.pfa.g4.CommuteEase.repository.ParentRepository;

@Service
public class EtudiantServiceImpl implements EtudiantService  {
	
	  @Autowired
	    private EtudiantRepository etudiantRepository;
	@Override
	public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);

	}

	@Override
	public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
	}

	@Override
	public void deleteEtudiant(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEtudiant(Integer id, Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void countEtudiant(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

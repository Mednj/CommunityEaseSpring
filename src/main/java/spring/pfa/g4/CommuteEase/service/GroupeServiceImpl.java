package spring.pfa.g4.CommuteEase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.pfa.g4.CommuteEase.model.Groupe;
import spring.pfa.g4.CommuteEase.repository.GroupeRepository;

@Service

public class GroupeServiceImpl implements GroupeService {

	@Autowired
    private GroupeRepository groupeRepository;
	
	@Override
	public Groupe saveGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
        return groupeRepository.save(groupe);
	}

	@Override
	public List<Groupe> getAllGroups() {
		// TODO Auto-generated method stub
        return groupeRepository.findAll();
	}

	@Override
	public void deleteGroupe(Integer id) {
		 groupeRepository.deleteById(id);
		
	}

	@Override
	public void updateGroupe(Integer id, Groupe groupe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void countGroupe(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Groupe getGroupeBygroupNumber(int groupeNumber) {
		return groupeRepository.findGroupeByGroupNumber(groupeNumber);
	}


}

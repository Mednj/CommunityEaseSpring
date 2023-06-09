package spring.pfa.g4.CommuteEase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.pfa.g4.CommuteEase.model.Agence;
import spring.pfa.g4.CommuteEase.repository.AgenceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AgenceServiceImpl implements AgenceService{

    @Autowired
    private AgenceRepository agenceRepository;


    @Override
    public void saveAgence(Agence agence){
       this.agenceRepository.save(agence);

    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }


    @Override
    public Agence getAgenceById(int id){

        return agenceRepository.findById(id).get();
    }

    @Override
    public void DeleteAgenceById(int id){
        this.agenceRepository.deleteById(id);

    }


}

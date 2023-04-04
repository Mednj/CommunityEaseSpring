package spring.pfa.g4.CommuteEase.service;

import spring.pfa.g4.CommuteEase.model.Agence;

import java.util.List;

public interface AgenceService {

    public void saveAgence(Agence agence);
    public List<Agence> getAllAgences();
    public Agence getAgenceById(int id);

    public void DeleteAgenceById(int id);


}

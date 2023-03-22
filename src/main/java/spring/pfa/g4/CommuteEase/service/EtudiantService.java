package spring.pfa.g4.CommuteEase.service;

import java.util.List;


import spring.pfa.g4.CommuteEase.model.Etudiant;

public interface EtudiantService {
	public Etudiant saveEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
    public void deleteEtudiant(Integer id);
    public void updateEtudiant(Integer id,Etudiant etudiant);
    public void countEtudiant(Integer id);

}

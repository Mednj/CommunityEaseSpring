package spring.pfa.g4.CommuteEase.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Groupe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	
	/*@OneToMany(mappedBy = "grp")
	 private List<Etudiant> Etudiant;
    
	public List<Etudiant> getEtudiant() {
		return Etudiant;
	}
	public void setEtudiant(List<Etudiant> etudiant) {
		Etudiant = etudiant;
	}*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	private String nom;

}

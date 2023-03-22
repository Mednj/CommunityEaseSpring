package spring.pfa.g4.CommuteEase.model;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nom;

private String prenom;
private String niveau;


@ManyToOne
private Groupe grp;
public Groupe getGrp() {
	return grp;
}
public void setGrp(Groupe grp) {
	this.grp = grp;
}
public Parent getParent() {
	return parent;
}
public void setParent(Parent parent) {
	this.parent = parent;
}
@ManyToOne
private Parent parent;

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNiveau() {
	return niveau;
}
public void setNiveau(String niveau) {
	this.niveau = niveau;
}



	
	
	
	
	
}

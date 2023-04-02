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

	public int getId() {
		return id;
	}

	private String snom;

private String sprenom;
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

public String getSnom() {
	return snom;
}
public void setSnom(String nom) {
	this.snom = nom;
}
public String getSprenom() {
	return sprenom;
}
public void setSprenom(String prenom) {
	this.sprenom = prenom;
}
public String getNiveau() {
	return niveau;
}
public void setNiveau(String niveau) {
	this.niveau = niveau;
}



	
	
	
	
	
}

package spring.pfa.g4.CommuteEase.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Groupe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	private int groupNumber;

	// Group times
	private String morningFirst;
	private String morningLast;
	private String eveningFirst;
	private String eveningLast;

	public Groupe(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getMorningFirst() {
		return morningFirst;
	}

	public void setMorningFirst(String morningFirst) {
		this.morningFirst = morningFirst;
	}

	public String getMorningLast() {
		return morningLast;
	}

	public void setMorningLast(String morningLast) {
		this.morningLast = morningLast;
	}

	public String getEveningFirst() {
		return eveningFirst;
	}

	public void setEveningFirst(String eveningFirst) {
		this.eveningFirst = eveningFirst;
	}

	public String getEveningLast() {
		return eveningLast;
	}

	public void setEveningLast(String eveningLast) {
		this.eveningLast = eveningLast;
	}

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

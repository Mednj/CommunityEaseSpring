package spring.pfa.g4.CommuteEase.model;


import java.util.List;

import jakarta.persistence.OneToMany;


import jakarta.persistence.Entity;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;

	@Entity
	
	public class Parent {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String nom;
	    private String prenom;
	    private String email;
	    private String address;
	    private String tel;

		@Override
		public String toString() {
			return "Parent{" +
					"id=" + id +
					", nom='" + nom + '\'' +
					", prenom='" + prenom + '\'' +
					", email='" + email + '\'' +
					", address='" + address + '\'' +
					", tel='" + tel + '\'' +
					'}';
		}
	    
	    /*@OneToMany(mappedBy = "parent")
	    
		 private List<Etudiant> etudiant;
	    
	    
	    


		public void setEtudiant(List<Etudiant> etudiant) {
			this.etudiant = etudiant;
		}


		public List<Etudiant> getEtudiant() {
			return etudiant;
		}*/

		
		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		

	    public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

	    

	    public Parent() {
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String name) {
	        this.nom = name;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
	}



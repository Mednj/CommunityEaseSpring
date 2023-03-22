package spring.pfa.g4.CommuteEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.pfa.g4.CommuteEase.model.Etudiant;
import spring.pfa.g4.CommuteEase.model.Parent;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer>{

}

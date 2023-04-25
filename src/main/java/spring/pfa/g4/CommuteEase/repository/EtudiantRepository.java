package spring.pfa.g4.CommuteEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.pfa.g4.CommuteEase.model.Etudiant;

public interface StudentRepository extends JpaRepository<Etudiant,Integer>{

}

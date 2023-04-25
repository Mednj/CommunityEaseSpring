package spring.pfa.g4.CommuteEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.pfa.g4.CommuteEase.model.Agence;

@Repository
public interface AgenceRepository extends JpaRepository<Agence,Integer> {


}

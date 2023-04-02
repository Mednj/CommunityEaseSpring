package spring.pfa.g4.CommuteEase.repository;
import java.util.List;





import spring.pfa.g4.CommuteEase.model.Parent;


import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ParentRepository extends JpaRepository<Parent,Integer> {
    Parent findByNom(String parNom);

}

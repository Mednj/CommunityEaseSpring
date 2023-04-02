package spring.pfa.g4.CommuteEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.pfa.g4.CommuteEase.model.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe,Integer> {
        public Groupe findGroupeByGroupNumber(int groupeNumber);
}

package spring.pfa.g4.CommuteEase.service;
import java.util.List;

import spring.pfa.g4.CommuteEase.model.Groupe;

public interface GroupeService {
	public Groupe saveGroupe(Groupe groupe);
    public List<Groupe> getAllGroups();
    public void deleteGroupe(Integer id);
    public void updateGroupe(Integer id,Groupe groupe);
    public void countGroupe(Integer id);

    public Groupe getGroupeBygroupNumber(int groupeNumber);
}

package spring.pfa.g4.CommuteEase.service;

import java.util.List;
import java.util.Optional;


import spring.pfa.g4.CommuteEase.model.Parent;

public interface ParentService {


    public Parent saveParent(Parent parent);
    public  List<Parent> getAllParents();
    public Parent getParentByNom(String nom);
    public void deleteParent(Integer id);
    public void updateParent(Integer id,Parent parent);
    public void countParent(Integer id);

    public Optional<Parent> getParentById(Integer id);


}

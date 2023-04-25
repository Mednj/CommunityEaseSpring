package spring.pfa.g4.CommuteEase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.pfa.g4.CommuteEase.model.Etudiant;
import spring.pfa.g4.CommuteEase.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;


	@Override
	public void saveStudent(Etudiant student){
		this.studentRepository.save(student);

	}

	@Override
	public List<Etudiant> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Etudiant getStudentById(int id){

		return studentRepository.findById(id).get();
	}

	@Override
	public void DeleteStudentById(int id){
		this.studentRepository.deleteById(id);

	}

}

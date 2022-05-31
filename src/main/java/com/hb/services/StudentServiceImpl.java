package com.hb.services;

import com.hb.domain.Student;
import com.hb.repository.StudentRepository;

public class StudentServiceImpl implements IStudentService {

	private static final StudentRepository repo = new StudentRepository();

	@Override
	public void createStudent(Student student) {
		
		repo.createStudent(student);
		
	}

	@Override
	public void getStudent(Integer id) {
		
		repo.getStudent(id);
		
	}

	@Override
	public void deleteStudent(Integer id) {
		
		repo.deleteStudent(id);
		
	}

	@Override
	public void updateStudent(Student student) {
		
		
		
	}
	

	
	

}

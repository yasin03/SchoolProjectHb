package com.hb.services;

import com.hb.domain.Student;

public interface IStudentService {
	public void createStudent(Student student);
	public void getStudent(Integer id);
	public void deleteStudent(Integer id);
	public void updateStudent(Student student);
}

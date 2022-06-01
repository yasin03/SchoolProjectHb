package com.hb.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.hb.enums.CourseEnums;
import com.hb.enums.LocationEnums;


@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	private String courseName;
	
	


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="course_id")
	private Teacher teacher;
	
	@ManyToMany(mappedBy="courseList",cascade = CascadeType.ALL)
	private List<Student>students=new ArrayList<>();
	
	@Enumerated (EnumType.STRING)
	private CourseEnums type;

	public int getId() {
		return id;
	}

	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public CourseEnums getType() {
		return type;
	}


	public void setType(CourseEnums type) {
		this.type = type;
	}


	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudentList() {
		return students;
	}

	public void setStudentList(List<Student> studentList) {
		this.students = studentList;
	}
	
	public void setLocation(LocationEnums home) {
		
		
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", teacher=" + teacher + ", students="
				+ students + "]";
	}


	

	
	

}

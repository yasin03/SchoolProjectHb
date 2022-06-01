package com.hb.services;

import com.hb.domain.Course;
import com.hb.repository.CourseRepository;

public class CourseServiceImpl implements ICourseService {
	
	private static final CourseRepository repo= new CourseRepository();

	@Override
	public void saveCourse(Course course) {
		repo.saveCourse(course);
		
	}

	@Override
	public Course foundCourse(int id) {
		
		return repo.getCourse(id);
	}

	@Override
	public void removeCourse(Course course) {
		repo.removeCourse(course);
		
	}
	
	

}

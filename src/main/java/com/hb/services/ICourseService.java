package com.hb.services;

import com.hb.domain.Course;

public interface ICourseService {
	
	public void saveCourse(Course course);
	public Course foundCourse(int id);
	public void removeCourse(Course course);

}

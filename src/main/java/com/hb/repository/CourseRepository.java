package com.hb.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hb.domain.Course;
import com.hb.utils.HibernateUtil;

public class CourseRepository {
	
	public void saveCourse(Course courses) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		session.save(courses);
		tx.commit();
		session.close();	
	}

	
	public Course getCourse(int id) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		Course foundCourse=session.get(Course.class,id);
		tx.commit();
		session.close();
		return foundCourse;
	}
	
	public void removeCourse(Course course) {
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.remove(course);
		tx.commit();
		session.close();
	}
}

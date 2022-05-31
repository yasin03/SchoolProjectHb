package com.hb.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hb.domain.Student;
import com.hb.utils.HibernateUtil;

public class StudentRepository {

	public void createStudent(Student student) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(student);

		tx.commit();
		session.close();
	}

	public void deleteStudent(Integer id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.remove(id);

		tx.commit();
		session.close();
	}

	public Student getStudent(Integer id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student foundStudent = session.get(Student.class, id);

		tx.commit();
		session.close();
		return foundStudent;
	}

	public void updateStudent(Integer id, Student student) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Student foundStudent = session.get(Student.class,id);

		tx.commit();
		session.close();
	}

}

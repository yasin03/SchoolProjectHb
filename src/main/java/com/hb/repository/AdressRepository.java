package com.hb.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hb.domain.Adress;
import com.hb.utils.HibernateUtil;

public class AdressRepository {
	

	public void saveAdress(Adress adress) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(adress);

		tx.commit();
		session.close();
		
	}

	
	public Adress findById(int id) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Adress adress = session.get(Adress.class,id);

		tx.commit();
		session.close();
		
			return adress;
	}
	

	public Adress UpdateAdress(int id, String adres ) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Adress adress = session.get(Adress.class,id);
		
		adress.setAdress(adres);

		
		tx.commit();
		session.close();
		
		
		return adress;
	}

}

package com.prowings.inheritance.mappedsuperclass;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestMappedSuperClassStrategy {

	public static void main(String[] args) {
		


		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		MyEmployee myEmployee = new MyEmployee("Ram", "Mechanical",99,5.7);
		
		session.save(myEmployee);
		
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
		
		
		
	}
	
	
}

package com.learning.any;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateTest {
	public static void main(String[] args) {
		
		/* optional method:
		 * SessionFactory sessionFactory = new
		 * Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 */	
	Configuration cfg= new Configuration();	
	SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	update obj = new update();	
	obj.setId(4164);
	obj.setName("suraj");
	obj.setSub("physics");
	session.save(obj);
	List<update> li = session.createQuery("from update").list();	
	for(update ui:li) {
		System.out.println(ui.getId()+" "+ui.getName()+" "+" "+ui.getSub());
	}
	 	transaction.commit();
	}
		
}

package com.learning.any;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.beginTransaction();
    	students s=new students();
    	s.setId(1023);
    	s.setName("Virat");
    	s.setSub("maths");
    	session.save(s);
    	t.commit();
    	session.close();
    	
    	
    	
	}

} 

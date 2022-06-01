package com.learning.any;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demotest {
	public static void main(String[] args) {
         Configuration cfg = new Configuration();
         cfg.configure("hibernate.cfg.xml");
         
         SessionFactory sf = cfg.buildSessionFactory();
         Session sess = sf.openSession();
         Transaction transaction = sess.beginTransaction();
         demo d = new demo();
         d.setId(1234);
         d.setName("suraj");
         d.setSub("social");
         sess.save(d);
         transaction.commit();
         sess.close();
	}
}

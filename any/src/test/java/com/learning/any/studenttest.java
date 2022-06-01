package com.learning.any;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class studenttest {
public static void main(String[] args) {
	/*
	 * System.out.println("Connecting to database"); Configuration cfg = new
	 * Configuration(); cfg.configure("hibernate.cfg.xml"); SessionFactory sess =
	 * cfg.buildSessionFactory(); Session sf = sess.openSession(); Transaction
	 * transaction = sf.beginTransaction(); System.out.println("created");
	 * transaction.commit();
	 */
	
	System.out.println("connecting to database");
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = null;
	Transaction transaction = null;
	
	try {
		student st = new student();
		session = sf.openSession();
		transaction = session.beginTransaction();
		/*
		 * st =(student) session.get(student.class,125); System.out.println(""+st);
		 */
		SQLQuery query = session.createSQLQuery("select * from newdemo");
		List<student> stt = query.list();
		for(student s:stt) {
			System.out.println(s.getId());
		}
		/*
		 * List<student> students =
		 * session.createQuery("from student where id = 125 and name = 'suraj'").list();
		 * for(student i:students) {
		 * System.out.println(i.getId()+" "+i.getName()+" "+i.getSub()); }
		 */
		transaction.commit();
		
	}catch(Exception e) {
		System.err.println("error");
		e.printStackTrace();
	}
	finally {
		session.close();
	}
}
}

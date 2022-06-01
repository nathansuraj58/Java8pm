package com.learning.OneToOneUnidirectional;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.learning.OneToOneUnidirectional.Teacher;
import com.learning.OneToOneUnidirectional.TeacherDetails;

public class AppTest 
{
	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class).buildSessionFactory();

		// create session
		Session session = null;
		Transaction transaction =null;

		try {

			// create the objects
			session = factory.openSession();
			Teacher temp1 = new Teacher("ross","B", "er@greatlearning.com");

			TeacherDetails temp2 = new TeacherDetails("nyc",21);

			// associate the objects
			temp1.setTeacherDetails(temp2);
		

			// start transaction
			transaction= session.beginTransaction();

			// save the teacher
			session.save(temp1);
			

			// commit transaction
			transaction.commit();

		} finally {
			factory.close();
		}
	}
}

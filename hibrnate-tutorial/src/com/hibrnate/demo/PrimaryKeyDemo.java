package com.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// create 3 student object
			System.out.println("creating a 3  student object...");
			Student tempStudent = new Student("Mohamed", "SLIMAN", "mohamedsliman789@gmail.com");
			Student tempStudent1 = new Student("zaid", "el Emrani", "zaid@gmail.com");
			Student tempStudent2 = new Student("ayoub", "hohow", "ayoub@gmail.com");
			// start a transaction
			session.beginTransaction();
			// save the student object
			System.out.println("Saving the student ....");
			session.save(tempStudent);
			session.save(tempStudent1);
			session.save(tempStudent2);
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}
	}



package com.hibrnate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
	
			// start a transaction
			session.beginTransaction();
			// save the student object
			
			//query Student
			List<Student> theStudent = session.createQuery("from Student").list();
			// display the student 
			DisplayStudent(theStudent);
			
			//query Student : Last Name 
			theStudent = session.createQuery("from Student where lastName='SLIMAN'").list();	
			DisplayStudent(theStudent);
					// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

	private static void DisplayStudent(List<Student> theStudent) {
		for(Student tempStudent : theStudent)
		{
			System.out.println(tempStudent);
		}
	}

}

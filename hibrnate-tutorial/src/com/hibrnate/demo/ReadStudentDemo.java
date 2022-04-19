package com.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// create a student object
			System.out.println("creating new student object...");
			Student tempStudent = new Student("Anouar", "BOHBOUH", "Anouar@gmail.com");
			// start a transaction
			session.beginTransaction();
			// save the student object
			System.out.println("Saving the student ....");
			System.out.println(tempStudent);
			session.save(tempStudent);
			// commit transaction
			session.getTransaction().commit();
			// my new Code 
			// find out the student's id : primary key 
			System.out.println("Saved student.generate ID "+tempStudent.getId());
			
			// now get a new session and start transaction 
			session=factory.getCurrentSession();
			session.beginTransaction();
			// retrive student based on the id :primary key
			System.out.println("\nGetting student with ID "+tempStudent.getId());
			Student myStudent = session.get(Student.class, tempStudent.getId());
			System.out.println("Get Complete "+myStudent);
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}

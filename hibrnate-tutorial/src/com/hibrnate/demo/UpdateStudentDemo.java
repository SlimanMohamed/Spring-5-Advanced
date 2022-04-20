package com.hibrnate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			int studentId = 1;

			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			// retrive student based on the id :primary key
			System.out.println("\nGetting student with ID " + studentId);
			Student myStudent = session.get(Student.class, studentId);
			System.out.println("Updating Student ... ");
			myStudent.setFirstName("HAMID");
			// commit the transaction
			session.getTransaction().commit();

			// New Code
			session = factory.getCurrentSession();
			session.beginTransaction();

			// updating the email for all student
			System.out.println("updating the email for all student ");
			session.createQuery("update Student set email='electronique268@gmail.com'").executeUpdate();
			// commit the transaction
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}

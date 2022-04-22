package com.hibrnate.demo.one.to.many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.many.Course;

public class CreateDemo {

	public static void main(String[] args) {
//create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			// create a Object 
//			
			Instructor tempInstructor = new Instructor("Ismail", "SLIMAN","Ismail@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("https://www.youtube.com","Ismail");
			// Associate the Object 
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			// Note : this will Also save the detail Object 
			// because of cascadeType.ALL
		System.out.println("Saving instructor :"+tempInstructor);
		session.save(tempInstructor);
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}

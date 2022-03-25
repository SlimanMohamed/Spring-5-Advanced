package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		// call methode on the bean
		System.out.println(theCoach.getDailyWorkout());
		// close the context
		context.close();

	}

}

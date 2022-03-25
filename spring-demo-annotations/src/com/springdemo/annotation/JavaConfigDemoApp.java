package com.springdemo.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read the spring configJava Class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call the methode on the bean
		System.out.println(theCoach.getDailyWorkout());
		// call a methode to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();

	}

}

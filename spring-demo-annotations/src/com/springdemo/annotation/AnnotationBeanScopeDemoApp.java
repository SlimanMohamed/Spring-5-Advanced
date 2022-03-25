package com.springdemo.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load Spring config file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// revieve bean from spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are the same
		boolean result = (theCoach == alphaCoach);

		// print out the result
		System.out.println("\nPointing to the same Object " + result);
		System.out.println("\nmemory location for theCoach :" + theCoach);
		System.out.println("\nmemory location for alphaCoach :" + alphaCoach);

		// Close the context
		context.close();
	}

}

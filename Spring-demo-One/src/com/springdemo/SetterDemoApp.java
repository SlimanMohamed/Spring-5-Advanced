package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
 
	//Load the spring Configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//retrieve bean from spring container 
				 CricketCoach theCoach= context.getBean("myCricketCoach",CricketCoach.class);
	//call the method of the bean
		//... let's come back to this ....
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//call our new melthods to get the literal values 
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
	//close the context
				 context.close();

	}

}

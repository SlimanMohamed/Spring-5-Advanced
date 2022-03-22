package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the Object
		Coach theCoach = new TrackCoach();
		
		// use the Object 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}

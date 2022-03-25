package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// Add the fields for emailAddress and teams

	private String emailAddress;
	private String team;

	// Create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg Constructor");

	}

	// our setter Methode
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside Setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast Bolling 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFotune();
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside Setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside Setter method - setTeam");
		this.team = team;
	}

}

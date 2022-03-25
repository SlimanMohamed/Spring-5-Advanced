package com.springdemo.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService thefortuneService) {
//		this.fortuneService = thefortuneService;
//	}
	public TennisCoach() {
		System.out.println(">>inside default constructor");
	}

	// define my int method
	@PostConstruct
	public void doMyStartupStuff() {

		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

	// define a setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>inside Setter Injection ");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}

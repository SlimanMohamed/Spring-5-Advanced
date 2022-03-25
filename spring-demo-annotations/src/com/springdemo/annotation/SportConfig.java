package com.springdemo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
	
	//define the bean for our sad Fortune service
	@Bean
	public FortuneService SadFortuneService() {
		 return new SadFortuneService(); 
	}
	
	// define the bean for our swim Coach  and inject the dependency 

	public Coach SwimCoach() {
		return new SwimCoach(SadFortuneService());
	}
	
}

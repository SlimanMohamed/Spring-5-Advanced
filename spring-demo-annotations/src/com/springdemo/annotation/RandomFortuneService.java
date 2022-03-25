package com.springdemo.annotation;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of String
	private String[] data = { "Mohamed", "SLIMAN", "zaid", "Ayoub", "Yassir", "Anouar" };

	// Create a number Random Generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// Pick a random String from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];

		return theFortune;
	}

}

package com.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need the controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "Helloworld-form";
	}

	// need the controller method to show the proces HTML form
	@RequestMapping("/procesForm")
	public String procesForm() {
		return "helloWorld";
	}

	// New Controller method to read from data
	// Add the Data to the Model
	@RequestMapping("/procesFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {
		// Read the request parameter from the HTML Form

		String theName = request.getParameter("studentName");

		// Convert the Data to all caps
		theName = theName.toUpperCase();

		// Create the message
		String result = "Yo!" + theName;
		// Add the message to the Model
		model.addAttribute("message", result);
		return "helloWorld";
	}
	@RequestMapping("/procesFormVersionThree")
	public String procesFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// Convert the Data to all caps
		theName = theName.toUpperCase();

		// Create the message
		String result = "Hello My Friend " + theName;
		// Add the message to the Model
		model.addAttribute("message", result);
		return "helloWorld";
	}

}

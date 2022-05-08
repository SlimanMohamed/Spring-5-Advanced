package com.mohamed.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohamed.springdemo.dao.CustomerDAO;
import com.mohamed.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//need to inject the customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@GetMapping("/list")
	public String listCustomer(Model themodel ) {
		
		// get customer from the DAO
		List<Customer> theCustomers= customerDAO.getCustomers();
		// Add the customers to the model 
		themodel.addAttribute("customers",theCustomers);
		return "list-costumer";
		}
	}


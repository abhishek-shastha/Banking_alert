package com.shastha.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.shastha.kafka.CustomerEntry;
import com.shastha.kafka.service.CustomerService;

/**
 *This Controller Class has following functionalities.
 * >> 1.creating an End point.
 * >> 2.Receives all the Customer details data from service class method using getAll method.
 * 
 * @author Jishnu Prasad
 * @version 1.0
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ConsumerController 
{
	
	//Autowiring of CustomerService class
	@Autowired
	CustomerService customerService;
	
	/**
	 * This method is used to return data which is received by calling Service class method 
	 * It is mapped to /getAllCustomers url
	 * 
	 * @return it is used return customer details and it's return type is String
	 */
	@RequestMapping("/getAllCustomers")
	
	public String getAll()
	{
	 //calling service class method getMessage
	 return	customerService.getMessage().toString();
	}

}

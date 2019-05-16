package com.shastha.kafka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.shastha.kafka.service.ConsumerAlertService;
/**
 * This is the controller class of consume Alert
 * 
 * @author Dheeraj Das
 * @version 1.0
 * 
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ConsumeAlertController {
	
	/**
	 * Creating object of consumerAlertService by using autowire annotation.
	 */
	@Autowired
	ConsumerAlertService service;
	
	/**
	 * 
	 * 	This method is using get mapping to give rest end point to call this method.
	 *  After that this will call the alert service method to get the details of all alerts and returns that through the rest end point. 
	 * 
	 * @return Returns all alerts
	 * 
	 */
	@GetMapping("/getAllAlertGroups")
	public String getAllAlertGroups()
	{
		//returns alert data after getting the details from the service method
		return service.getData().toString();
	}

}

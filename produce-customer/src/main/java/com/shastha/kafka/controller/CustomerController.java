package com.shastha.kafka.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shastha.kafka.CustomerEntry;
import com.shastha.kafka.model.Customer;
import com.shastha.kafka.service.CustomerService;

/**
 * 
 * Controller Class has following functionalities.
 *  >> 1.creating an End point /customer .
 *  >> 2.receiving Customer class object.
 *  >> 3.Serialize received object.
 *  >> 4.Passing Serialized object into Service class .
 *  
 * @author Jishnu Prasad
 * @version 1.0
 * 
 */



@RestController
public class CustomerController {
	
	// Creating object of service class CustomerService.
	@Autowired
	CustomerService customerService;
	
	/**
	 * 
	 * This method has Customer object as it's parameter.
	 * Object is received using Post method.
	 * Received object is Serialized using CustomerEntry class object.
	 * Serialized object is Passed into service class method.
	 * 
	 * @param customer This parameter accepts Customer object.
	 * 
	 */
	@PostMapping("/addCustomers")
	public void setCustomer(@RequestBody Customer customer){

		//	Creating object of Avro Generated  CustomerEntry class.
	    //Receiving Customer object and setting it into CustomerEntry object for Serialization.	
		CustomerEntry customerEntry=CustomerEntry.newBuilder()
			.setCustomerId(customer.getId())  
			.setCustomerName(customer.getName())
			.setEmailId(customer.getEmailId())
			.setPhoneNumber(customer.getPhoneNumber())
			.setAlertStatus(customer.isAlertStatus())
			.build();
      //Passing CustomerEntry object into Service class Method createMessage.
      customerService.createMessage(customerEntry);
 
}
}
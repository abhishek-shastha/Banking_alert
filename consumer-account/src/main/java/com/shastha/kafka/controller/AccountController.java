package com.shastha.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shastha.kafka.service.AccountService;
/**
 * This controller class have get mapping which gives all accounts detail.
 * 
 * @author RAHUL A P
 * @version 1.0
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AccountController {
	
	//Creating an object of account service class.
	@Autowired
	public AccountService consumerAccount;
	
	/**
	 * This method is used to get all account details.
	 * 
	 * @return all customer account details.
	 */
    @GetMapping("/getAllAccountDetails")
	public String accountDetails()
	{
    	//Returns all account details.
		return consumerAccount.getMessage().toString(); 
	}
	
}

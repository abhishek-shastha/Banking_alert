package com.shastha.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.shastha.kafka.AccountManageEntry;
import com.shastha.kafka.model.Account;
import com.shastha.kafka.service.AccountService;

/**
 * 
 * This is a controller class create a rest-end point declared as "/add".
 * Method is used to  accessed account details by avro auto-generated-serialized java class.
 * 
 * @author RAHUL A P
 * @version 1.0
 * 
 */
@RestController
public class AccountController {
	
	//Created an object to the account service method.
	@Autowired
	public AccountService accountService;
	
	/**
	 * Method is used to access Account details from  AccountManageEntry.java.
	 * @param account This parameter accepts account details.
	 *  
	 */
	@PostMapping("/add")
	public void addAccount(@RequestBody Account account)
	{
		
		//Create an object in AccountManageEntry.
     	AccountManageEntry.Builder accountManageEntry = AccountManageEntry.newBuilder();
		//Set values to the account manage entry object.
     	accountManageEntry.setAccountNumber(account.getAccountNumber());
		accountManageEntry.setAccountType(account.getAccountType());
		accountManageEntry.setCustomerIds(account.getCustomerIds());
		accountManageEntry.setAlertGroup(account.getAlertGroup());
		accountManageEntry.setAlertStatus(account.isAlertStatus());
		accountManageEntry.setAvailableBalance(account.getAvailableBalance());
		accountManageEntry.setActualBalance(account.getActualBalance());
		
		//Account service class has produce account method, call it, and pass AccountManageEntry object.
		accountService.produceAccount(accountManageEntry.build());
	
	
		
		
		
	}

	

}

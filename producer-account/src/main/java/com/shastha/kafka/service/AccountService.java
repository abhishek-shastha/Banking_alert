package com.shastha.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import com.shastha.kafka.AccountManageEntry;
import com.shastha.kafka.AccountNumber;

/**
 * This is a service class which is used to created kafka topic and send message in key,value pair.
 *
 *@author RAHUL A P
 *@version 1.0
 */
@Component
public class AccountService {
	
	//Create an object kafkaTemplate and it is used to send message to topic.  
	@Autowired
	private KafkaTemplate<AccountNumber, AccountManageEntry> kafkaTemplate;
	
	/**
	 * 
	 * This is a produce account method to retrieve account details.
	 * 
	 * @param addAccount This parameter accept account details.
	 * 
	 */
	public void produceAccount(AccountManageEntry addAccount)
	{
		//Topic is created and send message in key,value pair.
		kafkaTemplate.send("account-details", new AccountNumber(addAccount.getAccountNumber()), addAccount);
	}

}

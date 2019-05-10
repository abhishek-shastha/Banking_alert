package com.shastha.kafka.service;

import java.util.ArrayList;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.shastha.kafka.AccountManageEntry;
import com.shastha.kafka.AccountNumber;

/**
 * The class is used for access messages from topic.							
 * 
 * @author RAHUL A P
 * @version 1.0
 */
@Component
public class AccountService {
	
	
	//Create an array list object.
	ArrayList<AccountManageEntry> list = new ArrayList<AccountManageEntry>();
	
	/**
	 * The method is used to retrieve all messages from topic in key-value pair.
	 * Messages are stored in array list.
	 * KafkaListener used to access topics.
	 * 
	 * @param retrieve all messages from topic in key-value pair hold it in consumer record object.
	 */
	@KafkaListener(topics = {"account"})
	public void readMessage(ConsumerRecord<AccountNumber, AccountManageEntry> consumerRecord)
	{
		//
		list.add(consumerRecord.value());
	}
	/**
	 * The method is used to get all messages.
	 * 
	 * @return list of account details.
	 */
	public ArrayList<AccountManageEntry> getMessage()
	{
		//Returns list of all account details.
		return list;
	}
	
	
}

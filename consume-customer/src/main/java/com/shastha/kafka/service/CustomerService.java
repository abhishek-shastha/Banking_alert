package com.shastha.kafka.service;



import java.util.ArrayList;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.shastha.kafka.CustomerEntry;
import com.shastha.kafka.CustomerId;

/**
 * This class is used as a service class for the entire project.
 * This class read from the Kafka topic and returns the record.
 * 
 * @author Jishnu Prasad
 *@version 1.0
 */
@Component
public class CustomerService 
{
	//creating an ArrayList object
	ArrayList<CustomerEntry>list=new ArrayList<CustomerEntry>();
	//reading from topic name customer-details using KafkaLitsener
	@KafkaListener(topics= {"customer-details"})
	/**
	 * This method is used store records retrieved using KafkaLitsener.
	 * The received record is stored into an ArrayList.
	 * @param record it is used to hold ConsumerRecord object.
	 */
	public void readMessage(ConsumerRecord<CustomerId,CustomerEntry> record)
	{
    //Value of the record is Added into ArrayList
	list.add(record.value());
		
	}
	/**
	 * This method is used to return the ArrayList in which records are stored.
	 * Type of this method is Generic ArrayList of CustomerEntry type.
	 * @return it returns the ArrayList object
	 */
	public ArrayList<CustomerEntry> getMessage()
	{
	//Returns ArrayList object which includes customer records
		return list;
	}


		
}

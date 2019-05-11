package com.shastha.kafka.service;

import java.util.Properties;

import org.apache.avro.reflect.AvroSchema;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.shastha.kafka.CustomerEntry;
import com.shastha.kafka.CustomerId;
import com.shastha.kafka.model.Customer;

/**
 * This class is used as a Services Class for the entire project.
 * Service class receives the Serialized object from controller class.
 * Sending this object into kafka topic.
 * 
 * @author Jishnu Prasad
 * @version 1.0
 */

@Component
public class CustomerService {
	
	
	//Creating Object of KafkaTemplate, CustomerId & CustomerEntry are the Generic Classes .
    @Autowired
    KafkaTemplate<CustomerId,CustomerEntry>producerTemp;

/**
 *Method has CustomerEntry class object as its parameter.
 *Sending this object into kafka topic.
 *@param customer This parameter accepts CustomerEntry object.
 
 */
  public void createMessage(CustomerEntry customer)
  {
	  
	//Sending message into kafka-topic customer-details.
	producerTemp.send("customers", new CustomerId(customer.getCustomerId()), customer);
	
  }
}

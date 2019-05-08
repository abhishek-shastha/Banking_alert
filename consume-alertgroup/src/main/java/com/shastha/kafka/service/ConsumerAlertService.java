package com.shastha.kafka.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.shastha.kafka.AlertGroupEntry;
import com.shastha.kafka.AlertGroupId;
/**
 * 
 * This is the service class of alert.
 * This class is for consuming data from alert kafka topic.
 * 
 * @author Dheeraj Das
 * @version 1.0
 *
 */
@Component
public class ConsumerAlertService {

	//Creating object of alert group entry list 
	List<AlertGroupEntry> data = new ArrayList<AlertGroupEntry>();
	
	/**\
	 * 
	 * This method is using kafka listener annotation to read data from kafka topic.
	 * This method will read data from topic and stores to an alert group entry list.
	 * 
	 * @param consumerRecord This consumer record will store the data, which is reading from kafka topic
	 * 
	 */
	@KafkaListener(topics = {"AlertGroups"})
    public void readTopic(ConsumerRecord<AlertGroupId,AlertGroupEntry> consumerRecord) {
		
		//Adding data from consumerRecord to list object called data
		data.add(consumerRecord.value());
    }
	
	/**
	 * 
	 * This getData method will return the list of alertGroupEntry
	 * 
	 * @return data Returns list of alertGroupEntry
	 */
	public List<AlertGroupEntry> getData() {
		
		// Returns list object data
		return data;
	}
}

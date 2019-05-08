package com.shastha.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


import com.shastha.kafka.AlertGroupId;
import com.shastha.kafka.AlertGroupEntry;


/**
 * 
 * This is a service class of kafka producer alert group
 * 
 * @author Dheeraj Das
 * @version 1.0
 *
 */
@Component
public class KafkaProducerService {

	/**
	 * Creating the object of kafka template where the key will be AlertGroupId and value will be the AlertGroupEntry
	 */
	@Autowired
	private KafkaTemplate<AlertGroupId, AlertGroupEntry> kafkaTemplate;
	/**
	 * 
	 * This method sends the alert group data to specified kafka topic.
	 * 
	 * @param alertGroup Receives input of alert group entry
	 */
	public void send(AlertGroupEntry alertGroup) {
		
		//Sending alert group details to AlertGroups kafka topic 
		kafkaTemplate.send("AlertGroups", new AlertGroupId(alertGroup.getGroupId()), alertGroup);
}
}

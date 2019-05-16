package com.shastha.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.shastha.kafka.AlertGroupEntry;
import com.shastha.kafka.model.AlertGroup;
import com.shastha.kafka.service.KafkaProducerService;

/**
 * 
 * This is an controller class of producer alert group application
 * This class contains rest end points for methods
 * 
 * @author Dheeraj Das
 * @version 1.0
 * 
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AlertGroupController {
	
	/**
	 * Creating object of kafka producer service also using autowire annotation for that
	 */
	@Autowired
	KafkaProducerService service;
	
	/**
	 * 
	 * This addAlertgroup method have post mapping annotation to post data from the client application.
	 * This method is sending new alert group data to alert group service method.
	 * 
	 * @param alertGroup The alertGroup parameter is a type of AlertGroup which will stores the data that comes through the rest end point.
	 *
	 */
	@PostMapping("/addAlertGroup")
	public void addAlertGroup(@RequestBody AlertGroup alertGroup)
	{
		//Creating the object of AlertGroupEntry builder class.
		AlertGroupEntry.Builder alertGroupBuilder = AlertGroupEntry.newBuilder();
		//setting the groupId from alertGroup to alertGroupBuilder.
		alertGroupBuilder.setGroupId(alertGroup.getGroupId());
		//Setting the rules from alertGroup to alertGroupBuilder
		alertGroupBuilder.setRules(alertGroup.getRules());
		//Setting the channels from alertGroup to AlertGroupBulder
		alertGroupBuilder.setChannels(alertGroup.getChannels());
		
		//Sending the alertGroupBuilder to service method.
		service.send(alertGroupBuilder.build());
	}
}


package com.shastha.kafka.model;

import java.util.List;

import com.shastha.kafka.AlertChannel;
import com.shastha.kafka.AlertRule;

/**
 * 
 * This alert group class contails all the variables and their getters and setters etc.
 * 
 * @author Dheeraj Das 
 * @version 1.0
 *
 */
public class AlertGroup {

	private String groupId;
	private List<AlertRule> rules ;
	private List<AlertChannel> channels;
	
	/**
	 * 
	 * This method is for getting group id.
	 * 
	 * @return groupId Returns the group id value
	 */
	public String getGroupId() {
		return groupId;
	}
	/**
	 * 
	 * This method sets the group id
	 * 
	 * @param groupId This parameter will take group id as input to set the value.
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * 
	 * This method is for getting the rules.
	 * 
	 * @return rules Returns the rules 
	 */
	public List<com.shastha.kafka.AlertRule> getRules() {
		return rules;
	}
	/**
	 * 
	 * This method sets the list of rules.
	 * 
	 * @param rules This parameter will take input as a list of alert rule.
	 */
	public void setRules(List<com.shastha.kafka.AlertRule> rules) {
		this.rules = rules;
	}
	/**
	 * 
	 * This method is for getting the alert channels.
	 * 
	 * @return channels Returns list of channels
	 */
	public List<AlertChannel> getChannels() {
		return channels;
	}
	/**
	 * 
	 * This method sets the alert channels.
	 * 
	 * @param channels This parameter will take input as a list of alert channels.
	 */
	public void setChannels(List<AlertChannel> channels) {
		this.channels = channels;
	}
}
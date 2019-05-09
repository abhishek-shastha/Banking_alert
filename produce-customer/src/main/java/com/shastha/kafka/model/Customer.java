package com.shastha.kafka.model;
/**
 * This class is used for Modeling the object.
 * 
 * @author Jishnu Prasad
 * @version 1.0
 *
 */
public class Customer {
	//Required variables for Customer Details.
	private String id;
	private String name;
	private String emailId;
	private long phoneNumber;
	private boolean alertStatus;
	
	//Getters and Setters for the variables.
	/**
	 * 
	 * @return This method Returns Customer Id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * This method is used to set Customer Id
	 * @param id  It refers to Customer id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 
	 * @return This method Returns Customer name
	 */
	public String getName() {
		return name;
	}
	/**
	 * This method is used to set Customer name
	 * @param name It refers to the Customer name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return This method returns Email Id of Customer
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * This method is used to set Email Id of Customer
	 * @param emailId It refers to the Email id of Customer
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * 
	 * @return This method returns Phone Number of Customer
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * This method is used to set phone Number of Customer
	 * @param phoneNumber it refers to the Phone Number of Customer
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 
	 * @return This method returns Alert Status either True or false
	 */
	public boolean isAlertStatus() {
		return alertStatus;
	}
	/**
	 * This method is used to Set Alert Status 
	 * @param alertStatus It refers to the Alert Status of Customer
	 */
	public void setAlertStatus(boolean alertStatus) {
		this.alertStatus = alertStatus;
	}

	/**
	 *Creating Parameterized Constructor.
	 * @param id it Refers to Customers id
	 * @param name it Refers to Customer name
	 * @param emailId it Refers to Customer Email Id
	 * @param phoneNumber it Refers to Customer Phone Number
	 * @param alertStatus it Refers to Status, whether it is True or False
	 */
	public Customer(String id, String name, String emailId, long phoneNumber, boolean alertStatus) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.alertStatus = alertStatus;
	}
	
}

package com.shastha.kafka.model;

import java.util.List;

/**
 * 
 * This is an account class which contains different setters and getters related to account details.
 * 
 * @author RAHUL A P
 * @version 1.0
 */

public class Account {
	
	private String accountNumber;
	private String accountType;
	private List<String> customerIds;
	private String alertGroup;
	private boolean alertStatus;
	private double availableBalance;
	private double actualBalance;
	
	
	/**
	 * This is a constructor which holds different parameters of account.
	 * 
	 * @param accountNumber This parameter is used to accept account number.
	 * @param accountType   This parameter is used to accept account type.
	 * @param customerIds   This parameter is used to accept customer id.
	 * @param alertGroup    This parameter is used to accept alert group.
	 * @param alertStatus   This parameter is used to accept alert status.
	 * @param availableBalance This parameter is used to accept available balance.
	 * @param actualBalance This parameter is used to accept actual balance.
	 */
	public Account(String accountNumber, String accountType, List<String> customerIds, String alertGroup,
			boolean alertStatus, double availableBalance, double actualBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.customerIds = customerIds;
		this.alertGroup = alertGroup;
		this.alertStatus = alertStatus;
		this.availableBalance = availableBalance;
		this.actualBalance = actualBalance;
	}
	
	/**
	 * Method is used to get account number.
	 * @return accountNumber.
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * Method is used to set account number.
	 * @param accountNumber.
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Method is used to get account type.
	 * @return accountType.
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * Method is used to set account type.
	 * @param accountType.
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * Method is used get customer id's.
	 * @return customerIds.
	 */
	public List<String> getCustomerIds() {
		return customerIds;
	}
	/**
	 * Method is used to set customer id's.
	 * @param customerIds.
	 */
	public void setCustomerIds(List<String> customerIds) {
		this.customerIds = customerIds;
	}
	/**
	 * Method is used to get alert group.
	 * @return alertGroup.
	 */
	public String getAlertGroup() {
		return alertGroup;
	}
    /**
     * Method is used to set alert group.
     * @param alertGroup.
     */
	public void setAlertGroup(String alertGroup) {
		this.alertGroup = alertGroup;
	}
	/**
	 * Method is used to get alert status.
	 * @return alertStatus.
	 */
	public boolean isAlertStatus() {
		return alertStatus;
	}
	/**
	 * Method is used to set alert status.
	 * @param alertStatus.
	 */
	public void setAlertStatus(boolean alertStatus) {
		this.alertStatus = alertStatus;
	}
	/**
	 * Method is used to get available balance.
	 * @return availableBalance.
	 */
	public double getAvailableBalance() {
		return availableBalance;
	}
	/**
	 * Method is used to set available balance.
	 * @param availableBalance.
	 */
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	/**
	 * Method is used to get actual balance.
	 * @return actualBalance.
	 */
	public double getActualBalance() {
		return actualBalance;
	}
	/**
	 * Method is used to set actual balance.
	 * @param actualBalance.
	 */
	public void setActualBalance(double actualBalance) {
		this.actualBalance = actualBalance;
	}
	
	
	
	
	
}

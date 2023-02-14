package com.nestjavatraining.entity;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String dateOfBirth;
	private  ArrayList<Account> accounts = new ArrayList<>();
	
	public Customer(int customerId, String firstName, String dateOfBirth, ArrayList<Account> accounts) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.accounts = accounts;
	}
	public Customer(String firstName, String dateOfBirth,int customerId) {
		super();
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.customerId = customerId;

	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", dateOfBirth=" + dateOfBirth
				+ ", accounts=" + accounts + "]";
	}
	
	
	
	

	

}

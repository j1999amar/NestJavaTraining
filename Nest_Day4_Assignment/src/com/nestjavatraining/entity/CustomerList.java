package com.nestjavatraining.entity;

import java.util.ArrayList;

public class CustomerList {
	public static ArrayList<Customer> customerList=new ArrayList<>();

	

	public CustomerList(ArrayList<Customer> customerList) {
		super();
		this.customerList = customerList;
	}



	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}



	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}



	@Override
	public String toString() {
		return "CustomerList [customerList=" + customerList + "]";
	}
	
}

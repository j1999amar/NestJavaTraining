package com.nestjavatraining.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.CustomerList;

public class CustomerServiceImpl implements CustomerService {
	private int customerId = 100;
	ArrayList<Customer> customers = new ArrayList<>();
    CustomerList customerList = new CustomerList(customers);


	Scanner scanner = new Scanner(System.in);

	@Override
	public void createCustomer() {
		System.out.println("Enter the name");
		String name;
		name = scanner.next();
		String dob;
		System.out.println("Enter the dob");
		dob = scanner.next();	
	    customers.add(new Customer(name,dob,customerId++));
	}
}

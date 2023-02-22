package com.nestjavatraining.comparator;

import java.util.Comparator;

import com.nestjavatraining.customersortingentity.Customer;

public class CustomerAgeComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}

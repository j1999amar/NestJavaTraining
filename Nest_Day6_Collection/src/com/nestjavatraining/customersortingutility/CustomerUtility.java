package com.nestjavatraining.customersortingutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.nestjavatraining.customersortingentity.Customer;

public class CustomerUtility {

	

	public static void main(String[] args) {
		int age;
		String name;
		Scanner scanner = new Scanner(System.in);

		ArrayList<Customer> a = new ArrayList<Customer>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the name ");
			name = scanner.next();
			System.out.println("Enter the age ");
			age = scanner.nextInt();
			a.add(new Customer(name, age));

		}
		Collections.sort( (ArrayList<Customer>) a);
		System.out.println(a);
		for(Customer customer:a) {
			System.out.println(customer.getName());
		}

		
	}

}

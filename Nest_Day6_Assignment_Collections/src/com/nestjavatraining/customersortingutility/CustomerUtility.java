package com.nestjavatraining.customersortingutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.nestjavatraining.customersortingentity.Customer;

public class CustomerUtility {

	public static void main(String[] args) {
		int age;
		String name;
		Scanner scanner = new Scanner(System.in);

		ArrayList<Customer> a = new ArrayList<Customer>();

		System.out.println("Enter the number of record need to enter");
		int record = scanner.nextInt();

		for (int i = 0; i < record; i++) {
			System.out.println("Enter the name ");
			name = scanner.next();
			System.out.println("Enter the age ");
			age = scanner.nextInt();
			a.add(new Customer(name, age));

		}
		int choice = scanner.nextInt();

		if (choice == 1) {
			Collections.sort(a,(Customer o1, Customer o2)-> o1.getName().compareTo(o2.getName()));
			
			for (Customer customer : a) {
				System.out.println(customer);
			}
			
		} else if (choice == 2) {
			Collections.sort(a,(Customer o1, Customer o2)->o1.getAge()-o2.getAge());

			for (Customer customer : a) {
				System.out.println(customer);
			}

		}
	}
}

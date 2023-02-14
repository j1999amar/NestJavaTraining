package com.nestjavatraining.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.CustomerList;
import com.nestjavatraining.service.AccountServiceImpl;
import com.nestjavatraining.service.CustomerServiceImpl;

public class BankUtility {

	public static void main(String[] args) {
		Account account;
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
		Boolean flag = true;
		Scanner scanner = new Scanner(System.in);

		while (flag) {
			System.out.println("Enter the choice \n\n1.Create Customer\n2.Existing Customer\n3.Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				customerServiceImpl.createCustomer();
				break;
			case 2:
				System.out.println("Enter Customer Id");
				int customerId = scanner.nextInt();

				while (flag) {

					System.out.println("Enter the choice\n1.Create Account\n2.Deposit Amount\n3.Withdrawal Amount\n4.Display Accounts\n5.Exit");
					int existingCustomerChoice = scanner.nextInt();
					if (existingCustomerChoice == 1) {
						accountServiceImpl.createAccount(customerId);
					} else if (existingCustomerChoice == 2) {
						accountServiceImpl.depositAmount(customerId);
					} else if (existingCustomerChoice == 3) {
						accountServiceImpl.withDrawAmount(customerId);
					} else if (existingCustomerChoice == 4) {
						accountServiceImpl.displayAccounts(customerId);
					}else if(existingCustomerChoice == 5) {
						
						System.exit(0);
					}else {
						System.out.println("Invaild Entry");

					}
				}
				break;

			

			}
		}
	}

}

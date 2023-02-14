package com.nestjavatraining.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.service.SavingsAccountImpl;

public class BankUtility {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		SavingsAccount savingsAccount = null;
		SavingsAccountImpl savingsAccountImpl = new SavingsAccountImpl();
		ArrayList<SavingsAccount> accountsList = new ArrayList<>();

		String accountNumber;
		double depositAmount;
		double withdrawAmount;
		boolean flag = true;
		Customer customer=null;

		while (flag) {
			System.out.println("1.Create Account 2.Deposit Amount 3.Withdraw Amount 4.Display Accounts 5.Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:

				System.out.println("Enter account type (1.Womens Savings Account 2.Savings Max Account)");
				int savingsAccountChoice = scanner.nextInt();

				savingsAccount = savingsAccountImpl.createAccount(savingsAccountChoice);
				customer=savingsAccountImpl.createCustomer(savingsAccount);
				accountsList.add(savingsAccount);
				System.out.println("Customer Name" +customer.getCustomerName()+savingsAccount.getAccountBalance()+savingsAccount.getAccountName());
				System.out.println("Account added successfully");
				break;
			case 2:
				// Deposit

				System.out.println("Enter account number:");
				accountNumber = scanner.next().toUpperCase();
				System.out.println("Enter amount to deposit:");
				depositAmount = scanner.nextDouble();
				savingsAccountImpl.depositAmount(accountNumber, depositAmount, accountsList);

				break;
			case 3:
				// Withdraw
				System.out.println("Enter account number:");
				accountNumber = scanner.next().toUpperCase();
				System.out.println("Enter amount to withdraw:");
				withdrawAmount = scanner.nextDouble();
				savingsAccountImpl.withdrawAmount(accountNumber, withdrawAmount, accountsList);
				break;
			case 4:
				// Display all accounts
				System.out.println("SlNo\tAccountCode\tAccountType\tCreateDate\tExpiryDate\tBalance\tFreeLimit");

				savingsAccountImpl.displayAllAccount(accountsList);
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid choice");
			}

		}
	}
}

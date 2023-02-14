package com.nestjavatraining.service;

import java.util.Scanner;

import com.nestjavatraining.entity.Account;
import com.nestjavatraining.entity.ActiveCurrentAccount;
import com.nestjavatraining.entity.Customer;
import com.nestjavatraining.entity.CustomerList;
import com.nestjavatraining.entity.MaxAdvantageAccount;
import com.nestjavatraining.entity.SavingAccounts;
import com.nestjavatraining.entity.SavingMaxAccount;
import com.nestjavatraining.entity.WomenSavingAccount;

public class AccountServiceImpl implements AccountService {
	Scanner scanner = new Scanner(System.in);
	public static int womenSavingAccountIncrement = 100;
	public static int SavingMaxAccountIncrement = 100;
	public static int maxAdvantageAccount = 100;
	public static int activeCurrentAccount = 100;

	CustomerList customerList;

	@Override
	public Account createAccount(int customerId) {
		Account account = null;
		System.out.println("Create Account");
		int accountType;
		for (Customer customerAccount : CustomerList.customerList) {
			if (customerAccount.getCustomerId() == customerId) {
				System.out.println("Account Type \n1.Saving Account \n2.Current Account");
				switch (accountType = scanner.nextInt()) {
				case 1:
					System.out.println("Saving Account Type \n1.Women Saving Account \n2.Saving Max Account");
					int savingAccountTypeChoice = scanner.nextInt();
					switch (savingAccountTypeChoice) {
					case 1:
						account = new WomenSavingAccount("WSA" + Integer.toString(womenSavingAccountIncrement),
								"Women Saving Account", "10 Feb 2023 ", "Not Expired", 0, 0, 2);
						womenSavingAccountIncrement++;
						customerAccount.getAccounts().add(account);
						System.out.println("Women Saving Account Created Successfully");
						break;
					case 2:
						account = new SavingMaxAccount("SMA" + Integer.toString(SavingMaxAccountIncrement),
								"Saving Max Account", "01 JAN 2023 ", "Not Expired", 0, 0, 0);
						SavingMaxAccountIncrement++;
						customerAccount.getAccounts().add(account);
						System.out.println("Saving Max Account Created Successfully");
						break;
					}
					break;
				case 2:
					System.out.println("Current Account Type \n1.Max Advantage Account\n2.Active Current Account");
					int currentAccountTypeChoice = scanner.nextInt();
					switch (currentAccountTypeChoice) {
					case 1:
						account = new MaxAdvantageAccount("MAA" + Integer.toString(maxAdvantageAccount),
								"Max Advantage Account", "29 JUN 2023 ", "Not Expired", 0, 1000000);
						maxAdvantageAccount++;
						customerAccount.getAccounts().add(account);
						System.out.println("Max Advantage Account Created Successfully");
						break;
					case 2:
						account = new ActiveCurrentAccount("ACA" + Integer.toString(activeCurrentAccount),
								"Saving Max Account", "30 OCT 2023 ", "Not Expired", 0, 500000);
						SavingMaxAccountIncrement++;
						customerAccount.getAccounts().add(account);
						System.out.println("Active Current Account Created Successfully");
						break;
					}
				}
			}

		}
		return account;
	}

	@Override
	public void depositAmount(int customerId) {
		for (Customer customerAccount : CustomerList.customerList) {
			if (customerAccount.getCustomerId() == customerId) {
				System.out.println("Enter Account Code No");
				String accountCode = scanner.next();
				for (Account pickAccount : customerAccount.getAccounts()) {
					if (pickAccount.getAccountCode().equals(accountCode)) {
						System.out.println("Deposit Amount");
						System.out.println("Enter the Amount");
						int depositCash = scanner.nextInt();
						pickAccount.setBalance(depositCash);
						System.out.println(pickAccount.getAccountCode() + " " + pickAccount.getAccountName() + " "
								+ pickAccount.getBalance());
					}
				}
			}
		}
	}

	@Override
	public void withDrawAmount(int customerId) {
		for (Customer customerAccount : CustomerList.customerList) {
			if (customerAccount.getCustomerId() == customerId) {
				System.out.println("Enter Account Code No");
				String accountCode = scanner.next();
				for (Account pickAccount : customerAccount.getAccounts()) {
					if (pickAccount.getAccountCode().equals(accountCode)) {
						System.out.println("Withdraw Amount");
						System.out.println("Enter the Amount");
						int withDrawAmount = scanner.nextInt();
						if (withDrawAmount < pickAccount.getBalance()) {
							int balance = pickAccount.getBalance() - withDrawAmount;
							pickAccount.setBalance(balance);
							System.out.println(pickAccount.getAccountCode() + pickAccount.getAccountName()
									+ pickAccount.getBalance());
						} else {
							System.out.println("Insufficient Balance");
						}
					}
				}
			}
		}
	}

	@Override
	public void displayAccounts(int customerId) {
		System.out.printf("%-10s %-15s %-30s %-20s %-15s %-15s \n", "Account Code", "First Name", "Account Type",
				"Opening Date", "Balance", "Freelimit");

		for (Customer customerAccount : CustomerList.customerList) {
			if (customerAccount.getCustomerId() == customerId) {
				for (Account pickAccount : customerAccount.getAccounts()) {
					if (pickAccount instanceof WomenSavingAccount) {
						System.out.printf("%-10s %-15s %-30s %-20s %-15s %-15s \n", pickAccount.getAccountCode(),
								customerAccount.getFirstName(), pickAccount.getAccountName(),
								pickAccount.getOpeningDate(),  pickAccount.getBalance(), ((WomenSavingAccount) pickAccount).getFreeLimit());
								


					} else if (pickAccount instanceof SavingMaxAccount) {
						System.out.printf("%-10s %-15s %-30s %-20s %-15s %-15s \n", pickAccount.getAccountCode(),
								customerAccount.getFirstName(), pickAccount.getAccountName(),
								pickAccount.getOpeningDate(),  pickAccount.getBalance(), "NIL");

					} else if (pickAccount instanceof MaxAdvantageAccount) {
						System.out.printf("%-10s %-15s %-30s %-20s %-15s %-15s \n", pickAccount.getAccountCode(),
								customerAccount.getFirstName(), pickAccount.getAccountName(),
								pickAccount.getOpeningDate(),  pickAccount.getBalance(), "NIL");

					} else if (pickAccount instanceof ActiveCurrentAccount) {
						System.out.printf("%-10s %-15s %-30s %-20s %-15s %-15s \n", pickAccount.getAccountCode(),
								customerAccount.getFirstName(), pickAccount.getAccountName(),
								pickAccount.getOpeningDate(),  pickAccount.getBalance(), "NIL");
					}

				}

			}
		}
	}

}

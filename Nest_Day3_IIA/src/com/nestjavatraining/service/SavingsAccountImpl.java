package com.nestjavatraining.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.nestjavatraining.entity.SavingMaxAccount;
import com.nestjavatraining.entity.SavingsAccount;
import com.nestjavatraining.entity.WomenSavingAccount;

public class SavingsAccountImpl implements AccountService {
	Scanner scanner = new Scanner(System.in);
	private static int womensSavingsAccountIncrementer = 100;
	private static int savingsMaxAccountIncrementer = 100;

	@Override
	public SavingsAccount createAccount(int choice) {
		SavingsAccount savingsAccount = null;
		if (choice == 1) {
			savingsAccount = new WomenSavingAccount("WSA"+Integer.toString(womensSavingsAccountIncrementer), "Women Savings Account", "Feb 10 2023", "Not Expired",
					1000, 3);
			womensSavingsAccountIncrementer++;

		} else if (choice == 2) {
			savingsAccount = new SavingMaxAccount("SMA"+Integer.toString(savingsMaxAccountIncrementer), "Savings Max Account", "Jan 10 2023", "Not Expired", 2000,
					5);
	        savingsMaxAccountIncrementer++;

		}
		return savingsAccount;
	}

	@Override
	public void depositAmount(String accountNumber, double depositAmount, ArrayList<SavingsAccount> accountsList) {
		boolean existFlag = false;
		for (SavingsAccount account : accountsList) {
			if (account.getAccountCode().equals(accountNumber)) {
				account.setAccountBalance(depositAmount);
				existFlag = true;
				System.out.println("Amount deposit successfull");
			}
		}
		if (!existFlag) {
			System.out.println("Invalid Account");
		}
	}

	@Override
	public void withdrawAmount(String accountNumber, double withdrawAmount, ArrayList<SavingsAccount> accountsList) {
		boolean existFlag = false;
		for (SavingsAccount account : accountsList) {
			if (account.getAccountCode().equals(accountNumber)) {
				existFlag = true;

				double currentAccountBalance = account.getAccountBalance();
				if (currentAccountBalance > withdrawAmount) {
					account.setAccountBalance(currentAccountBalance - withdrawAmount);
					System.out.println("Withdrawal successfull");
				} else {
					System.out.println("Insufficient Balance!");
				}

			}
			if (!existFlag) {
				System.out.println("Invalid Account");
			}

		}

	}

	public void displayAllAccount(ArrayList<SavingsAccount> accountsList) {
		int counter = 1;
		
		for (SavingsAccount account : accountsList){
	         System.out.println(Integer.toString(counter) +'\t'+ account);
	         counter++;
		}
		
//		for (SavingsAccount account : accountsList) {
//			if (account instanceof WomenSavingAccount) {
//				WomenSavingAccount womenAccount = (WomenSavingAccount) account;
//				System.out.println(counter + "\t" + womenAccount.getAccountCode() + "\t" + womenAccount.getAccountName()
//						+ "\t" + womenAccount.getOpeningDate() + "\t" + womenAccount.getExpiryDate() + "\t"
//						+ womenAccount.getAccountBalance() + "\t" + womenAccount.getFreeLimit());
//				counter++;
//			}
//			if (account instanceof SavingMaxAccount) {
//				SavingMaxAccount savingMaxAccount = (SavingMaxAccount) account;
//				System.out.println(
//						counter + "\t" + savingMaxAccount.getAccountCode() + "\t" + savingMaxAccount.getAccountName()
//								+ "\t" + savingMaxAccount.getOpeningDate() + "\t" + savingMaxAccount.getExpiryDate()
//								+ "\t" + savingMaxAccount.getAccountBalance() + "\t" + "NIL");
//				counter++;
//			}
//		
//		
//		}
	}
}

package com.nestjavatraining.entity;

public class SavingMaxAccount extends SavingAccounts {
	
	private int fdInterestRate=7;

	public SavingMaxAccount(String accountCode, String accountName, String openingDate, String expiryDate, int balance,
			int savingAccountInterestRate, int fdInterestRate) {
		super(accountCode, accountName, openingDate, expiryDate, balance, savingAccountInterestRate);
		this.fdInterestRate = fdInterestRate;
	}

	
	

	
	
	
	

}

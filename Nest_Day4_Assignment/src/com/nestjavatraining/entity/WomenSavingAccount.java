package com.nestjavatraining.entity;

public class WomenSavingAccount extends SavingAccounts {
	
	private int freeLimit=2;

	

	

	public WomenSavingAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			int balance, int savingAccountInterestRate, int freeLimit) {
		super(accountCode, accountName, openingDate, expiryDate, balance, savingAccountInterestRate);
		this.freeLimit = freeLimit;
	}

	public int getFreeLimit() {
		return freeLimit;
	}

	public void setFreeLimit(int freeLimit) {
		this.freeLimit = freeLimit;
	}
	
	

}

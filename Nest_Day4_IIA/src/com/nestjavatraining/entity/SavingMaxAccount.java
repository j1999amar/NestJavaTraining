package com.nestjavatraining.entity;

public class SavingMaxAccount extends SavingsAccount {

	private int interestRate=10;
	
	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	

	public SavingMaxAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance, int interestRate) {
		super(accountCode, accountName, openingDate, expiryDate, accountBalance);
		this.interestRate = interestRate;
	}

	public SavingMaxAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance) {
		super(accountCode, accountName, openingDate, expiryDate, accountBalance);
		
		
	}
	
	

}

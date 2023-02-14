package com.nestjavatraining.entity;

public class CurrentAccounts extends Account {
	
	private double maxTransaction;

	public CurrentAccounts(String accountCode, String accountName, String openingDate, String expiryDate, int balance,
			double maxTransaction) {
		super(accountCode, accountName, openingDate, expiryDate, balance);
		this.maxTransaction = maxTransaction;
	}

	public double getMaxTransaction() {
		return maxTransaction;
	}

	public void setMaxTransaction(double maxTransaction) {
		this.maxTransaction = maxTransaction;
	}
	
	
	

}

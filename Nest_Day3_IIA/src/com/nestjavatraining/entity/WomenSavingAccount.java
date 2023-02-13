package com.nestjavatraining.entity;

public class WomenSavingAccount extends SavingsAccount {

	private int freeLimit;

	public int getFreeLimit() {
		return freeLimit;
	}

	public void setFreeLimit(int freeLimit) {
		this.freeLimit = freeLimit;
	}

	public WomenSavingAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance, int freeLimit) {
		super(accountCode, accountName, openingDate, expiryDate, accountBalance);
		this.freeLimit = freeLimit;
	}
	

	@Override
	public String toString() {
//		return super.toString()+"\n"+"WomenSavingsAccount [freeLimit=" + freeLimit + "]";
		String forTableFormat = Integer.toString(freeLimit);
		return super.toString() +"       "+ forTableFormat;
	}


}

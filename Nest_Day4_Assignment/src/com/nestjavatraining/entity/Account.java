package com.nestjavatraining.entity;

public class Account {
	
	private String accountCode;
	private String accountName;
	private String openingDate;
	private String expiryDate;
	private int balance;
	public Account(String accountCode, String accountName, String openingDate, String expiryDate, int balance) {
		super();
		this.accountCode = accountCode;
		this.accountName = accountName;
		this.openingDate = openingDate;
		this.expiryDate = expiryDate;
		this.balance = balance;
	}
	
	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountCode=" + accountCode + ", accountName=" + accountName + ", openingDate=" + openingDate
				+ ", expiryDate=" + expiryDate + ", balance=" + balance + "]";
	}
	
	
	
	

}
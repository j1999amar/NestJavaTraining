package com.nestjavatraining.entity;

public class Account {

	private String accountNo;
	private String accountName;
	private String accountType;
	private int balance;
	
	public Account(String accountNo, String accountName, String accountType, int balance) 
	{

		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

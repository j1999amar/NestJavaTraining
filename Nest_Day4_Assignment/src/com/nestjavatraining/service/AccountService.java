package com.nestjavatraining.service;

import java.util.ArrayList;

import com.nestjavatraining.entity.Account;

public interface AccountService {
	
	public Account createAccount(int customerId);
	public void depositAmount(int customerId);
	public void withDrawAmount(int customerId);
	public void displayAccounts(int customerId);


	

}

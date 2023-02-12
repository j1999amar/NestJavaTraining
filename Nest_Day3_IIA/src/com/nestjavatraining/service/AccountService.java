package com.nestjavatraining.service;

import java.util.ArrayList;

import com.nestjavatraining.entity.SavingsAccount;

public interface AccountService {

	public SavingsAccount createAccount(int choice);
	public void depositAmount(String accountNumber,double depositAmount,ArrayList<SavingsAccount> accountsList);
	public void withdrawAmount(String accountNumber,double depositAmount,ArrayList<SavingsAccount> accountsList);

}

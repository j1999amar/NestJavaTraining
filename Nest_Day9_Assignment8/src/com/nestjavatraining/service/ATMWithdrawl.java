package com.nestjavatraining.service;

//import java.util.ArrayList;
import java.util.List;

import com.nestjavatraining.entity.Account;

public class ATMWithdrawl implements AccountService {

	

	@Override
	public void checkDeposit(String accCode3,List<Account> accountList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawFromAtm(String accCode, int withdrawAmount, List<Account> accountList) {
		// TODO Auto-generated method stub
		
		int foundAccount=0;
		
		for(Account acc:accountList)
		{
			if(acc.getAccountNo().equals(accCode))
			{
				foundAccount=1;
				
				if(acc.getBalance() < withdrawAmount)
				{
					System.out.println("Account balance is low\n");
					break;
				}
				else
				{
					acc.setBalance(acc.getBalance()-withdrawAmount);
					System.out.println("New balance after ATM withdrawl is "+acc.getBalance());
					break;
				}
			}
		}
		
		if(foundAccount==0)
		{
			System.out.println("Invalid Account No..Try again");
		}
		
	}

	@Override
	public void depositCash(String accCode1, int depositAmount, List<Account> accountList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawCash(String accCode2, int withdrawCash, List<Account> accountList) {
		// TODO Auto-generated method stub
		
	}

	

}

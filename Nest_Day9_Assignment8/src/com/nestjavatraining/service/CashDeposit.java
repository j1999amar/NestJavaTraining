package com.nestjavatraining.service;

import java.util.List;

import com.nestjavatraining.entity.Account;

public class CashDeposit implements AccountService {


	@Override
	public void withdrawFromAtm(String accCode, int withdrawAmount, List<Account> accountList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkDeposit(String accCode3,List<Account> accountList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositCash(String accCode1, int depositAmount, List<Account> accountList) {

		int foundAccount=0;
		
		for(Account acc:accountList)
		{
			if(acc.getAccountNo().equals(accCode1))
			{
				foundAccount=1;
				
				acc.setBalance(acc.getBalance()+depositAmount);
				System.out.println("New balance after Cash deposit is "+acc.getBalance());
				break;
			
			}
		}
		
		if(foundAccount==0)
		{
			System.out.println("Invalid Account No..Try again");
		}
	}

	@Override
	public void withdrawCash(String accCode2, int withdrawCash, List<Account> accountList) {
		// TODO Auto-generated method stub
		
	}

	
}

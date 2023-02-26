package com.nestjavatraining.service;

import java.util.List;

import com.nestjavatraining.entity.Account;

public class CheckDeposit implements AccountService {


	@Override
	public void checkDeposit(String accCode3,List<Account> accountList) {
		
		int foundAccount=0;
		
		for(Account acc:accountList)
		{
			if(accCode3.equals(acc.getAccountNo()))
			{
				foundAccount=1;
				
				System.out.println("Account details:\n");
				System.out.println("Account No : "+acc.getAccountNo());
				System.out.println("Account Name : "+acc.getAccountName());
				System.out.println("Account Type : "+acc.getAccountType());
				System.out.println("Account Balance : "+acc.getBalance());
				break;
			}
		}
		
		if(foundAccount==0)
		{
			System.out.println("Invalid Account No..Try again");
		}
		
	}

	@Override
	public void withdrawFromAtm(String accCode, int withdrawAmount, List<Account> accountList) {
		// TODO Auto-generated method stub
		
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

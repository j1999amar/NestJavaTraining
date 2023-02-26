package com.nestjavatraining.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nestjavatrainig.entity.Account;
import com.nestjavatraining.service.ATMWithdrawl;
import com.nestjavatraining.service.AccountService;
import com.nestjavatraining.service.CashDeposit;
import com.nestjavatraining.service.CashWithdrawl;
import com.nestjavatraining.service.CheckDeposit;

public class Utility {

	public static void main(String[] args) 
	{
		List<Account> accountList = new ArrayList<Account>();
		
		AccountService accountService = null;

		Scanner scanner = new Scanner(System.in);
		
		Account account = new Account("SAC001","Savings Account","Savings",20000);
		accountList.add(account);
		
		int exit=0;
		int choice=0;
		do
		{
			System.out.println("1 : ATM Withdrawl\n2 : Cash Deposit\n3 : Cash Withdrawl\n4 : Check Deposit\n");
			System.out.println("Enter your choice:");
			
			choice=scanner.nextInt();
			
			
			switch(choice)
			{
				case 1: System.out.println("Enter account code to withdraw from:");
						
						String accCode=scanner.next();
					
						System.out.println("Enter Amount to withdraw from Atm:");
						
						int withdrawAmount = scanner.nextInt();
						
						accountService = new ATMWithdrawl(); 
						
						accountService.withdrawFromAtm(accCode,withdrawAmount,accountList);
						
						break;
						
				case 2: System.out.println("Enter account code to deposit cash:");
				
						String accCode1=scanner.next();
					
						System.out.println("Enter Amount to deposit :");
						
						int depositAmount = scanner.nextInt();
						
						accountService = new CashDeposit(); 
						
						accountService.depositCash(accCode1,depositAmount,accountList);
						
						break;
						
				case 3: System.out.println("Enter account code to withdraw from:");
				
						String accCode2=scanner.next();
					
						System.out.println("Enter Amount to withdraw from Account:");
						
						int withdrawCash = scanner.nextInt();
						
						accountService = new CashWithdrawl(); 
						
						accountService.withdrawCash(accCode2,withdrawCash,accountList);
						
						break;
					
				case 4: System.out.println("Enter account code to check deposit:");
						
						String accCode3=scanner.next();
						
						accountService = new CheckDeposit();
						
						accountService.checkDeposit(accCode3,accountList);
						
						break;
					
				default: System.out.println("Wrong choice..Try again");
						
			}
			
			System.out.println("\nDo you want to continue?");
			System.out.println("1 - exit \n0 - continue");
			
			exit = scanner.nextInt();
			
		}while(exit!=1);
		
		scanner.close();
	}

}

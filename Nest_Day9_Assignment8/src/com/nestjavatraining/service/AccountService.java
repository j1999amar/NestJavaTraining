package com.nestjavatraining.service;

//import java.util.ArrayList;
import java.util.List;

import com.nestjavatrainig.entity.Account;

public interface AccountService {

	public void withdrawFromAtm(String accCode,int withdrawAmount,List<Account> accountList);
	public void depositCash(String accCode1,int depositAmount,List<Account> accountList);
	public void withdrawCash(String accCode2,int withdrawCash,List<Account> accountList);
	public void checkDeposit(String accCode3,List<Account> accountList);
	
}

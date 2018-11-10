package com.capg.parallel.service;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.capg.parallel.bean.Customer;
import com.capg.parallel.dao.CustomerDAOImp;
import com.capg.parallel.dao.ICustomerDAO;
import com.capg.parallel.ui.Bank;

public class CustomerServiceImp implements ICustomerService {
ICustomerDAO dao = new CustomerDAOImp();
Bank b = new Bank();
Scanner sc = new Scanner(System.in);
int ac;
	@Override
	public boolean addCustomer(Customer c) {
		 
		return dao.addCustomer(c);
	}	

	@Override
	public Customer showBalance(int accountNum) {
		
		return dao.showBalance(accountNum);
	}

	@Override
	public Customer deposit(int accountNum) {
		// TODO Auto-generated method stub
		return dao.deposit(accountNum);
	}

	@Override
	public Customer withDraw(int accountNum) {
		// TODO Auto-generated method stub
		return dao.withDraw(accountNum);
	}

	@Override
	public Customer fundTransfer(int accountNum) {
	
		return dao.fundTransfer(accountNum);
	}

	@Override
	public ArrayList<Customer> printTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean validateData(Customer c) {
		
		boolean isValid = false;
		if(c.getName().length()<4){
			if(c.getBalance()>500){
				
				isValid = true;
			}
		}
		return isValid;	
		
		
	}
	public boolean validateAccountNum(Customer c)
	{
		System.out.println("Enter account number..");
		ac = sc.nextInt();
		boolean isValid = false;
		if(Bank.randNum==ac)
		{
			isValid = true;
		}
		return isValid;
		
	}
}
	/*public boolean validatePin(Customer c)
	{
		boolean status = false;
		int 
		if(c.getPin().length>4) {
			
		}
		
		return false;
			}

}
*/
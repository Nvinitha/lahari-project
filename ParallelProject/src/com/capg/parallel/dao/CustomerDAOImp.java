package com.capg.parallel.dao;

import java.util.ArrayList;


import java.util.Scanner;

import com.capg.parallel.bean.Customer;

public class CustomerDAOImp implements ICustomerDAO {
	Scanner sc = new Scanner(System.in);

	ArrayList<Customer> custList = new ArrayList<Customer>();
	Customer c = new Customer();
	
	@Override
	public boolean addCustomer(Customer c) {
		
		return custList.add(c);
		}
	@Override
	public Customer showBalance(int accountNum) {
	
	
	return null;
	}

	@Override
	public Customer deposit(int accountNum) {
		System.out.println("enter the amount you want to deposit..");
		int amount = sc.nextInt();

		System.out.println("you have deposited "+amount);
		double total = amount + c.getBalance();
		c.setBalance(total);
		
		System.out.println("dear"+c.getName()+"your total balance is "+total);

		return null;
	}

	@Override
	public Customer withDraw(int accountNum) {
		System.out.println("enter the amount you want to withDraw..");
		int amount = sc.nextInt();
		System.out.println("you have withdraw "+amount);
		double total = c.getBalance()-amount;
c.setBalance(total);
		System.out.println("your total balance is "+total);
		return null;
	}

	@Override
	public Customer fundTransfer(int accountNum) {
	System.out.println("Enter the account number you want to transfer..");
	int acn=sc.nextInt();
	System.out.println("enter amount to be transfered");
	int amount=sc.nextInt();
	if(amount>c.getBalance())
	{
		System.out.println("Insufficient Balance");
	
	}
	else
	{
		System.out.println("Transcation done successfully , Your curent balnace" +(c.getBalance()-amount));
	}
		return null;
	}

	@Override
	public ArrayList<Customer> printTransactions() {
		// TODO Auto-generated method stub
		return null;
	}

}

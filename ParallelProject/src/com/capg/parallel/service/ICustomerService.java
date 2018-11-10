package com.capg.parallel.service;

import java.util.ArrayList;

import com.capg.parallel.bean.Customer;

public interface ICustomerService {

	public boolean addCustomer(Customer c);
	
	public Customer showBalance(int accountNum);
	public Customer deposit(int accountNum);
	public Customer withDraw(int accountNum);
	public Customer fundTransfer(int accountNum);
	
	public ArrayList<Customer> printTransactions();

	public boolean validateData(Customer c);

	public boolean validateAccountNum(Customer c);
	
	
}

package com.capg.parallel.dao;

import java.util.ArrayList;

import com.capg.parallel.bean.Customer;

public interface ICustomerDAO {

	public boolean addCustomer(Customer c);
	
	public Customer showBalance(int accountNum);
	public Customer deposit(int accountNum);
	public Customer withDraw(int accountNum);
	public Customer fundTransfer(int accountNum);
	
	public ArrayList<Customer> printTransactions();
	
	
}

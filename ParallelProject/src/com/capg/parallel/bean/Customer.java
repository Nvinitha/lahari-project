package com.capg.parallel.bean;

public class Customer {
 private  String name;
 private long phoneNum;
 private  static double balance;
 private int amount;
 private static int randNum;
 private static int pin;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhoneNum() {
	return phoneNum;
}
public void setPhoneNum(long phoneNum) {
	this.phoneNum = phoneNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public int getAccountNum() {
	return randNum;
}
public void setAccountNum(int accountNum) {
	this.randNum = randNum;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin=pin;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", phoneNum=" + phoneNum + ", balance="
			+ balance + ", amount=" + amount + ", accountNum=" + randNum
			+ "]";
}
 
 

}
 

 
 

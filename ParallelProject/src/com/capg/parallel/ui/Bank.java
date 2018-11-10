package com.capg.parallel.ui;

import java.util.Random;
import java.util.Scanner;

import com.capg.parallel.bean.Customer;
import com.capg.parallel.service.CustomerServiceImp;
import com.capg.parallel.service.ICustomerService;

public class Bank {

	static Scanner sc = new Scanner(System.in);
	public static int randNum;
	static Customer c = new Customer();
	static Random r = new Random();
	//ICustomerService service = new CustomerServiceImp();

	public static void main(String[] args) {

		while (true) {
			System.out.println("***Welcome to XYZ Bank***");
			System.out.println("press 1 to create account");
			System.out.println("press  2 to show Balance");
			System.out.println("press 3 to deposit");
			System.out.println("press 4 to WithDraw");
			System.out.println("press 5 to fundTransfer");
			System.out.println("press 6 to print transactions");
			System.out.println("press 7 to exit");

			ICustomerService service = new CustomerServiceImp();

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				Bank.addCustomer();

				break;
			case 2:

				boolean isadded = service.validateAccountNum(c);
				if (isadded == true) {
					System.out.println("your balance is" + c.getBalance());

				}

				else {
					System.out.println("invalid acc num");
				}
				break;
			case 3:

				boolean isAccepted = service.validateAccountNum(c);
				if (isAccepted == true) {
					service.deposit(randNum);
				} else {
					System.out.println("invalid acc num");
				}
				break;
			case 4:
				boolean t = service.validateAccountNum(c);
				if (t == true) {
					service.withDraw(randNum);
				} else {
					System.out.println("invalid acc num");
				}

				break;
			case 5:
				boolean ft = service.validateAccountNum(c);
				if (ft == true) {
					service.fundTransfer(randNum);
				}

				break;
			case 6:

				break;
			case 7:

				break;

			default:
				break;
			}

		}
	}

	public static void addCustomer() {

		System.out.println("Enter CustomerName..");
		String name = sc.next();

		System.out.println("Enter PhoneNumber..");

		long phoneNum = sc.nextLong();

		for (int i = 0; i < 10; i++) {
			randNum = r.nextInt();
		}
		if (randNum < 0) {
			randNum = randNum * -1;
		}

		System.out.println("Your Account Number is " + randNum);
		System.out.println("Enter the 4 digits to generate a pin");
		int pin = sc.nextInt();
		System.out.println("Re-enter the pin for confirmation");
		int pin1 = sc.nextInt();
		if (pin1 == pin) {
			System.out.println("pin generated successfully..");
			System.out
					.println("Your account number  has been successfully generated.");

			System.out
					.println("enter the minimum balance to deposit in your account.. ");
			double balance = sc.nextDouble();
		
			System.out.println(name + ", your account number is" + randNum
					+ " and your current balance is " + balance);

			c.setName(name);
			c.setPhoneNum(phoneNum);
			c.setAccountNum(randNum);
			c.setBalance(balance);

			System.out.println(c);

		} else {
			System.out.println("Entered pin is wrong");
		}

	}
}

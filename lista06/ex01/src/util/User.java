package util;

import java.util.Locale;
import java.util.Scanner;

public class User{
	private int number;
	public String name;
	private double balance;
	
	//constructor
	public User() {
		this.number = 0;
		this.name = "null";
		this.balance = 0;
	}
	

	public User(int num, String holder, char yn, Scanner sc) {
		
		this.number = num;
		this.name = holder;
		if (yn == 'y' ) {
			System.out.print("Enter initial deposit value: ");
			this.balance = sc.nextDouble();
		}else if(yn == 'n') {
			this.balance = 0;
		} else {
			this.number = 9999;
			this.name = "ERROR!";
			this.balance = 0;
		}
	}
	//gets
	public double getBalance() {
		return this.balance;
	}
	public int getNumber() {
		return this.number;
	}
	public String getName() {
		return this.name;
	}
	
	
	//sets
	public void deposit(Scanner sc) {
		System.out.print("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		if(deposit < 0) {
			System.out.printf("\nError!");
			return;
		} else {
			this.balance = this.balance + deposit;
		}
		System.out.println("Updated account data: ");
		this.showAccount();
		return;
	}
	
	public void withdraw(Scanner sc) {
		System.out.print("Enter a withdraw value: ");
		double value = sc.nextDouble();
		this.balance = this.balance - value-5;
		System.out.println("Updated account data: ");
		this.showAccount();
		return;
	}
	
	public void showAccount() {
		
		System.out.printf("\nAccount %d, Holder: %s, Balance: $ %.2f\n",this.number,this.name,this.balance);
		return;
	}
	

}

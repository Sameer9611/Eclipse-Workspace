package com.demo1;
import java.util.Scanner;
public class AccountImpl implements Bank { // gives error as plz emplement unimplemented methods
	public void getSavingAccount() {
		System.out.println("Enter Your Name:");
		String name = new Scanner(System.in).nextLine();// can use but cannot close this way
		System.out.println("Enter Your Balance:");
		float bal = new Scanner(System.in).nextFloat();
		getUserDetails(name, bal);
	}
	public void getUserDetails(String name, float balance) {
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
	}
	public static void main(String[] args) {
		new AccountImpl(). getSavingAccount();
		}
	
}

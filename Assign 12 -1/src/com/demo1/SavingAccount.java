package com.demo1;

import java.util.Scanner;
public class SavingAccount extends Account{
	static String accountType ="Saving"; // static makes directly avaliable and also we are not going to change it so no problem
	long balance;
	
	
	public void getSavingAccountDetails() {
		System.out.print("Total Balance is>>>");
		Scanner sc1 =new Scanner(System.in);
		balance = sc1.nextInt();
		sc1.close();
		getPrintSavingAccountInformation(accountType,balance);// best way to give local variables call to another method as arguments as other wise it cannot be done
		
	}
	public void getPrintSavingAccountInformation(String a,long b) {
		System.out.println("Account Type>>>"+a);
		System.out.println("Account Balance>>>"+b);
	}
	public static void main(String[] args) {
		SavingAccount savingaccount = new SavingAccount();
		savingaccount.getAccountDetails();
		savingaccount.getSavingAccountDetails();
		
	}

}

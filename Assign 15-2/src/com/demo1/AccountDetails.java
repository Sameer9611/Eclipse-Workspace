package com.demo1;
import java.util.Scanner;

public class AccountDetails {
	public void getAccountDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id =sc.nextInt();
		System.out.println("enter acc number:");
		int acc =sc.nextInt();
		System.out.println("enter balance:");
		int bal =sc.nextInt();
		//setting these values
		Account ac =new Account();
		ac.setId(id);
		ac.setAccountNUmber(acc);
		ac.setBalance(bal);
		getWithdrawDetails(ac);//object as argument givven
		
	}
	private static int getWithdrawDetails(Account xx ) {//expecting anything which hass Account as datatype ie. object reference ac
		int currentBalance=0;
		System.out.println("enter withdrawal amount>>>");
		Scanner sc =new Scanner(System.in);
		int withdrawal = sc.nextInt();
		//Account ac =new Account();>>>instead of this give argument Account ac; 
		if(xx.getBalance()>=withdrawal) {
			currentBalance=xx.getBalance()-withdrawal;
		}
		else if(xx.getBalance()<= withdrawal) {
			currentBalance =xx.getBalance();
			System.out.println("insufficent balance! your current balance is "+currentBalance);
		}
		System.out.println("current balance is>>"+currentBalance);
		return currentBalance;
		
	}

}

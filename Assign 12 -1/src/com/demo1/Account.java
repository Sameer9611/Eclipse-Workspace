package com.demo1;
import java.util.*;
public class Account {
	int accountNumber;
	String accountName;
	
	public void getAccountDetails() {
		System.out.print("Enter Account Number>>>");
		Scanner sc1 =new Scanner(System.in);
		accountNumber =sc1.nextInt();
		System.out.print("Enter Account Name>>>");
		accountName = sc1.next();
		getPrintAccountInformation(accountNumber,accountName);
		
	}
	public void getPrintAccountInformation(int a,String b) {
		System.out.println("Account Number>>>"+accountNumber);
		System.out.println("Account Name>>>"+accountName);
	}	
}

package com.multilevelinheritance;

public class SBIBank extends Bank {
	int bankId = 245;

	public void getBankDetails() {
		System.out.println("This is SBIBank class method");
	}

	public void getTotalUsersCount() {
		System.out.println("Total count is>>700000");
	}

}

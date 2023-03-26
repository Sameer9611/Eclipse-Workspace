package com.overriding;

public class HDFCBank extends RBIBank {

	public void calculateSI(int noOfYears, int amount, float interestRate) {

		double SI = (amount * interestRate * noOfYears * 1.2) / 100;
		System.out.println("SI by HDFCBank>> " + SI);
	}
}

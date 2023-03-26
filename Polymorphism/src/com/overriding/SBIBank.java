package com.overriding;

public class SBIBank extends RBIBank {
	public void calculateSI(int noOfYears, int amount, float interestRate) {

		double SI = (amount * interestRate * noOfYears * 1.5) / 100;

		System.out.println("SI by SBIBank>>" + SI);
	}
}

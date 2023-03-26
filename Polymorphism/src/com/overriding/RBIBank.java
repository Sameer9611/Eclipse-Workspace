package com.overriding;

public class RBIBank {
	public void calculateSI(int noOfYears, int amount, float interestRate) {

		float SI = (amount * interestRate * noOfYears) / 100;
		System.out.println("SI using RBIBank >> " + SI);
	}
}

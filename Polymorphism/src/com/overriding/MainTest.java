package com.overriding;

public class MainTest {

	public static void main(String[] args) {

		RBIBank rbiBank = new RBIBank();
		// rbiBank.calculateSI(10, 100000, 8.5f);

		SBIBank sbiBank = new SBIBank();
		// sbiBank.calculateSI(10, 100000, 8.5f);

		HDFCBank hdfcBank = new HDFCBank();
		// hdfcBank.calculateSI(10, 100000, 8.5f);

		RBIBank bank = new SBIBank();
		bank.calculateSI(12, 100000, 8.52f);
	}

}

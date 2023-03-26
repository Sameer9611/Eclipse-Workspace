package com.demo1;

public class Test {
	public static void main(String[] args) {
		ICICIBank b1 = new ICICIBank();
		b1.getICICIBankDetails();
		SBIBank b2 = new SBIBank();
		b2.getSBIBankDetails();
		HDFCBank b3 = new HDFCBank();
		b3.getHDFCBankDetails();
		
	}

}

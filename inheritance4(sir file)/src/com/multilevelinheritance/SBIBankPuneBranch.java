package com.multilevelinheritance;

public class SBIBankPuneBranch extends SBIBank {
    int bankId=101;
    
    public void getBankDetails() {
		System.out.println("This is SBIBankPuneBranch class method");
	}
    
    public void getSBIBankPuneBranchEmployeeCount() {
    	System.out.println("Employee count is>>1000");
    }
    
}

package com.multilevelinheritance;

public class Test {

	public static void main(String[] args) {

		Bank bank = new Bank();
		System.out.println("bank object");
		System.out.println(bank.bankId); // 123
		bank.getBankDetails();
		bank.getData();
		System.out.println("----------------------------------------------------");
		
		
		SBIBank sbiBank = new SBIBank();
		System.out.println("SBIbank object");
		System.out.println(sbiBank.bankId);//245
		sbiBank.getBankDetails();
		sbiBank.getData();
		sbiBank.getTotalUsersCount();
		System.out.println("----------------------------------------------------");
		
		
		SBIBankPuneBranch branch = new SBIBankPuneBranch();
		System.out.println("SBIPuneBranchbank object");
		System.out.println(branch.bankId); //101
		branch.getBankDetails();
		branch.getTotalUsersCount();
		branch.getSBIBankPuneBranchEmployeeCount();
		branch.getData();
		System.out.println("----------------------------------------------------");
		
		
	
		
		
		
		
		

	}

}

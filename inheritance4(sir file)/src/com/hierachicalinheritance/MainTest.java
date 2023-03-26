package com.hierachicalinheritance;

public class MainTest {
   
	  public static void main(String[] args) {
		
		  Loan loan = new Loan();//parent class
		  CarLoan carloan = new CarLoan();// child class
		  
		  loan.getData();
		  loan.knowTheInterestRate(); 
		  carloan.getData();
		  carloan.knowTheInterestRate();
		  
		  
	}
}

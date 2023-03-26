package com.demo1;
import java.util.Scanner;
public class SBIBank extends Bank {
	static { 
		System.out.println("welcome to SBI");
	}
	double getCalculateInterest(double principleAmount,int tenure,float rateOfInterest) {
		double interestSBI = principleAmount*tenure*(rateOfInterest/100);
		return interestSBI;
	}
	void getSBIBankDetails(){
		System.out.print("Enter Principle Amount>>>");
		Scanner sc1 =new Scanner(System.in);
		principleAmount =sc1.nextDouble();
		System.out.print("Enter Tenure>>>");
		tenure = sc1.nextInt();
		System.out.print("Enter Rate of Interest>>>");
		rateOfInterest = sc1.nextFloat();
		System.out.println("Interest Earned is >>>"+getCalculateInterest(principleAmount,tenure,rateOfInterest));;
	}

}

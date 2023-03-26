package com.demo1;
import java.util.Scanner;
public class ICICIBank extends Bank { 
	static { 
		System.out.println("welcome to ICICI");
	}
	double getCalculateInterest(double principleAmount,int tenure,float rateOfInterest) {
		double interestICIC = principleAmount*tenure*(rateOfInterest/100);
		return interestICIC;
		
	}
	void getICICIBankDetails(){
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

package com.demo1;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance {
	int duration;
	
	 public void getTermPolicyDetails() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter Duration>>>");
		duration =sc1.nextInt();
		sc1.close();
		getTermPolicyInformation(duration);
	}
	
	void getTermPolicyInformation(int a){
		System.out.println("duration is>>>"+a);

	}
}

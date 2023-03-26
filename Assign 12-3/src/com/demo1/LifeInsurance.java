package com.demo1;
import java.util.Scanner;
public class LifeInsurance extends Insurance {
	int premiumAmount;
	public void getLifeInsuranceDetails() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter Premium Amount>>>");
		premiumAmount =sc1.nextInt();
		getLifeInsuranceInformation(premiumAmount);
		sc1.close();

	}
	void getLifeInsuranceInformation(int a) {
		System.out.println("Premium Amount is>>>"+a);
	}

}

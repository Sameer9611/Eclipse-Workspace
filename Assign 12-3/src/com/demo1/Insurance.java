package com.demo1;
import java.util.Scanner;
public class Insurance {
	int id;
	String personName;
	String insuranceCompany;
	
	public void getInsuranceDetails() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter ID>>>");
		id =sc1.nextInt();
		System.out.print("Enter Name>>>");
		personName =sc1.next();
		System.out.print("Enter Insurance Company >>>");
		insuranceCompany =sc1.next();
		getInsuranceInformation(id, personName,insuranceCompany);
		//sc1.close();
		
	}
	void getInsuranceInformation(int a, String b,String c) {
		System.out.println("ID is>>>"+a);
		System.out.println("Name is>>>"+b);
		System.out.println("Insurance Company is>>>"+c);
	}

}

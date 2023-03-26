package com.demo1;
import java.util.Scanner;

public class Policy {
	int policy_id;   // can also use getter setter by making them private
	String policy_name;
	int premium_amount;
	
	Policy(int x,String y,int z){
		this.policy_id =x;
		this.policy_name=y;
		this.premium_amount=z;
	}
	
	public static Policy getPolicyDetails() {
		
		System.out.print("enter policyid>>");
		Scanner sc1 = new Scanner(System.in);
		int x =sc1.nextInt();
		System.out.print("enter policy name>>");
		Scanner sc2 = new Scanner(System.in);
		String y =sc2.nextLine();
		System.out.print("enter premium amount>>");
		Scanner sc3 = new Scanner(System.in);
		int z =sc3.nextInt();
		sc1.close();
		sc2.close();
		sc3.close();
		
		Policy p = new Policy(x,y,z);
		return p;
	}
	
	@Override
	public String toString() {
		return "Policy [policy_id=" + policy_id + ", policy_name=" + policy_name + ", premium_amount=" + premium_amount
				+ "]";
	}

	public static void main(String[] args) {
		System.out.println("policy details are>>>"+getPolicyDetails());
	}
}

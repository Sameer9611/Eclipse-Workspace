package com.test;
import com.demo1.TermPolicy;
public class MainTest {
	public static void main(String[] args) {
		TermPolicy tp = new TermPolicy();
		tp.getInsuranceDetails(); // only avaliable if  method is public(no inheritance so protected not allowed, and def,private not allowed)
		tp.getLifeInsuranceDetails();
		tp.getTermPolicyDetails();
	}

}
// getter setter can also be used
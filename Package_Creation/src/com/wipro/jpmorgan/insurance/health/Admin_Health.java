package com.wipro.jpmorgan.insurance.health;

public class Admin_Health {
	public static void main(String[] args) {
		Admin_Health admin_health = new Admin_Health();
		admin_health.getName();  // even though we have here main method and print name
	}							//  still if we import this class there we have to firse create object and class the method to print
								// ie. main method is not imported
	public void getName() {
		System.out.println("Name of admin is >>> Sam >>>admin health ");
	}
	public void getPassword() {
		System.out.println("Abc_133");
	}

}

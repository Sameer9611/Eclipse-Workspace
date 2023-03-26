package com.wipro.jpmorgan.insurance;
import com.wipro.jpmorgan.insurance.health.Admin_Health;  // importing
public class Admin {
	public static void main(String[] args) {
		Admin_Health admin_health =new Admin_Health();
		admin_health.getName();        // imported stuff
		admin_health.getPassword();
		getName();
		getPassword();		
	}
	public static void getName() {
			System.out.println("Name of admin is >>> Kam >>> admin ");
	}
	public static void getPassword() {
			System.out.println("xyz_123");
	}
			
}

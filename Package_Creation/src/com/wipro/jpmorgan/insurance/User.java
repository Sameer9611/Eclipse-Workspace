package com.wipro.jpmorgan.insurance;
import com.wipro.jpmorgan.insurance.health.User_Health;
public class User {
	public static void main(String[] args) {
		User_Health user_health = new User_Health();
		user_health.getName();
		user_health.getDetails();
		getName();
		getDetails();
		
	}
	public static  void getName() {
		System.out.println("Name of admin is >>> jack >>> user");
	}
	public static void getDetails() {
		System.out.println("Handicap");
	}
}

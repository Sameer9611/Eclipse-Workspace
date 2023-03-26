package com.demo1;

public class UserEmpl2 extends UserEmpl {
	@Override// so overrides from both interfaces
	public void getData3() {//no confusion in calling as both interfaces had just common name and no body
	System.out.println("getData3** method");	
	}
}

package com.demo;

public class Department {
	private int depID;
	private String depName;
	private String strength;
	
	
	public Department(int depID, String depName, String strength) {
		super();
		this.depID = depID;
		this.depName = depName;
		this.strength = strength;
	}


	@Override
	public String toString() {
		return "Department [depID=" + depID + ", depName=" + depName + ", strength=" + strength + "]";
	}
	//Employee [empID=101, name=Sameer, skillSet=Backend Dev, department=com.demo.Department@2758fe70]
	//if no to-String present here

	
}

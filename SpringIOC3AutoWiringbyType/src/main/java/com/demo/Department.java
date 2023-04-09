package com.demo;

public class Department {
	private int depID;
	private String depName;
	private String strength;
	
	public int getDepID() {
		return depID;
	}
	public void setDepID(int depID) {
		this.depID = depID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Department [depID=" + depID + ", depName=" + depName + ", strength=" + strength + "]";
	}
	//Employee [empID=101, name=Sameer, skillSet=Backend Dev, department=com.demo.Department@2758fe70]
	//if no to-String present here

	
}

package com.demo;

public class Employee {
	private int empID;
	private String name;
	private String skillSet;
	
	private Department dep1;/*classes when dependent on eachother must go for autowiring*/
	
	public Employee(int empID, String name, String skillSet, Department dep1) {
		super();
		this.empID = empID;
		this.name = name;
		this.skillSet = skillSet;
		this.dep1 = dep1;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", skillSet=" + skillSet + ", dep1=" + dep1 + "]";
	}
	
	


}

package com.demo;

public class Employee {
	private int empID;
	private String name;
	private String skillSet;
	
	private Department department;/*classes when dependent on eachother must go for autowiring*/
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", skillSet=" + skillSet + ", department=" + department
				+ "]";
	}


}

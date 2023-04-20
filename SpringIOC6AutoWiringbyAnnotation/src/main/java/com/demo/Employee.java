package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private int empID;
	private String name;
	private String skillSet;
	@Autowired//here in case of multiple beans checks for dep1 named bean>+context config  +context http there
	//@Qualifier("dep3")>>check by applying>>it specifically tells use dep3 bean to qualify in case of multiple beans
	private Department dep1;//@Autowired can also be used above setter of dep1
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
	public Department getDep1() {
		return dep1;
	}
	public void setDep1(Department dep1) {
		this.dep1 = dep1;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", skillSet=" + skillSet + ", dep1=" + dep1 + "]";
	}
	
	


}

/*@Autowired is very smart:
 * 1)if i have a single bean for  that autowired object , names of object and bean does not matter>it will inject perfectly
 * 2)when i have multiple beans then it will check if one bean is present where object name=bean name , and will inject
 * 3)if names does not match and have multiple beans gives a error named expected single qualifing bean
 * 4)@qualifier : bean solves that problem by qualifing specific bean only
 * */

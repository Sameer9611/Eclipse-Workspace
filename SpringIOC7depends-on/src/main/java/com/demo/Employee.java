package com.demo;

public class Employee {
	
	private int empId;
	private String nameemp;
	private String city;
	private int salary;
	private Department department;
	
	
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getNameemp() {
		return nameemp;
	}
	public void setNameemp(String nameemp) {
		this.nameemp = nameemp;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", nameemp=" + nameemp + ", city=" + city + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	
//step1:create maven project (select simple project) to get src/main/resources folder
//step2:add spring-core,spring-context dependencies,also a properties tag is missing add that too
//step3:create POJO class(this class)	
//step4:create input file(diff market names: spring.xml,application.xml) in resources folder : add metadata:beans,bean tags(copy or google directly)
}

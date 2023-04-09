package com.demo;

public class Employee {
	private int empID;
	private String name;
	private String city;
	private int salary;

	/*only difference betn setter/getter>>no fields given >>default values--------------constructor>>error if any constructor paramter is missing*/
	public Employee(int a,String b, String c,int d) {
		super();
		this.empID=a;
		this.name=b;
		this.city=c;
		this.salary=d;
	}


	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	

}

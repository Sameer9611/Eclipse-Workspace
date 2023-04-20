package com.demo;

import java.util.List;

public class Employee {
	private int empID;
	private String name;
	private String city;
	private int salary;
	private List<Integer> mylist;

	/*only difference betn setter/getter>>no fields given >>default values--------------constructor>>error if any constructor paramter is missing*/
	public Employee(int a,String b, String c,int d,List e) {
		super();
		this.empID=a;
		this.name=b;
		this.city=c;
		this.salary=d;
		this.mylist=e;
		System.out.println("in 1st constructor");
	}
	public Employee(String a,String b, String c,String d,List e) {
		super();
		this.empID=Integer.parseInt(a);
		this.name=b;
		this.city=c;
		this.salary=Integer.parseInt(d);
		this.mylist=e;
		System.out.println("in 2nd constructor");
	}


	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", city=" + city + ", salary=" + salary + ",mylist="+mylist+"]";
	}
	

}

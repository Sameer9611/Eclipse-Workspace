package com.demo;

public class Employee {
	private String name;// create private variables(declaration)
	private int salary;
	private static String country="India"; //(not compulsion) static cause we are not gonna change its value so problem in making it static
	// hence only use common copy and save memory,but as private net to create getter
	public void setName(String name1) { //can be name(instead of name1)no problem
		this.name = name1; //private variable are initialized
	}
	public String getName() { // right click >>> source (setter getter)
		return name; // returns name ie. from from global private variable
	}
	public void setSalary(int salary1) {// can be 'salary' no problem
		if(salary1>=0) {
			this.salary = salary1;      // condition to avoid negative value
		}
		else {
			this.salary=0;
			System.out.println("entered salary is negative so default value is 0");
		}
		}
	public int getSalary() {
		return salary;
	}
	public static String getCountry() {
		return country;
	}
	// as global variables are private . now they cannot be accessed any where out side
	// the class ,so to call them or use them or modify them have to go to setter and getter
	// hence makes easy to operate them. and provide stability
	

}

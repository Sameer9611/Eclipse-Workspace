package com.demo;
// even though variables are private and not accesibe in another class but here we access the getter method(which is public)not directly the variables
public class Test {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("Sameer");//employee1.name=" "; >>> cannot be accessed as private variable 
		employee1.setSalary(20000); // even if we put negative value it sets and gets,to avoid negative we have if else conditon in setter of salary
		// check by printing getters
		System.out.println(employee1.getName()); // again employee1.name=" ";will not work 
		System.out.println("salary is "+employee1.getSalary());// cause they are private
		System.out.println("country is "+Employee.getCountry());// as getter is also static can be accessed in static way>> className.methodname
	}
	

}

//now u can use scanner class for inputing the value so,becomes dynamic

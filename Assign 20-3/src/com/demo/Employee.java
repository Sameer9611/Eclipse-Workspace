package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

//question is different; assign 20-2 answer it; here what solution in notes
public class Employee {
	
	private String employee;
	
	
	@Override
	public String toString() {
		return "Employee [employee=" + employee + "]";
	}



	public Employee(String x){
		this.employee=x;
	}
	

	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Three Employee Names:");
		// lets take 3 employees
		for(int i=1;i<=3;i++) {
			String input=sc.nextLine();
			Employee emp =new Employee(input);
			al.add(emp);//need to add something with Employee as datatype which is also a class
		}
		System.out.println(al);//printing objects need tostring
		//ouput:Employee [employee=sam], Employee [employee=tam], Employee [employee=ram]]
		
		//iterating by foreach>>just like using Iterator class 
		
		for (Employee x: al) {
			System.out.println(x);
//			Employee [employee=sam]
//			Employee [employee=tam]
//			Employee [employee=ram]
			
		}
		
		
	}

}

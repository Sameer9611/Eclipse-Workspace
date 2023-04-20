package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	ApplicationContext applicationContext=	new ClassPathXmlApplicationContext("inputfile.xml");
	Employee employee1=(Employee)applicationContext.getBean("emp1");
		System.out.println(employee1);
		Employee employee2=(Employee)applicationContext.getBean("emp2");
		System.out.println(employee2);
		/*when we getbean "emp" from inputfile.xml it creates the bean emp then assigns value 
		 * sees the autowiring then checks the fields >then it noticies the Department department
		 *then goes to bean with same type(Department (com.demo.Department) creates it injects it here
		 *:hence no need of gettingbean"dep"*/
	}

}

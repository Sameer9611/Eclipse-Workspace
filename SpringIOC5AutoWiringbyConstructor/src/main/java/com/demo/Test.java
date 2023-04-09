package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	ApplicationContext applicationContext=	new ClassPathXmlApplicationContext("inputfile.xml");
	Employee employee=(Employee)applicationContext.getBean("emp");
		System.out.println(employee);
		/*when we getbean "emp" from inputfile.xml it creates the bean emp then assigns value 
		 * sees the autowiring then checks the fields >then it noticies the Department department
		 *then goes to bean with same type(Department (com.demo.Department) creates it injects it here
		 *:hence no need of gettingbean"dep"*/
	}

}

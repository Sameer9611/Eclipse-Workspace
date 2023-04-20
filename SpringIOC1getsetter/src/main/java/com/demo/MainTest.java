package com.demo;



import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.collections.Collections;

public class MainTest {
	public static void main(String[] args) {
		Employee employee1= new Employee();
		System.out.println(employee1);//Employee [empId=0, nameemp=null, city=null, salary=0]

		
		Resource resource = new ClassPathResource("spring.xml");//input file
		
		BeanFactory beanFactory= new XmlBeanFactory(resource);
		 //now user will demand a bean of employee class by using getbean
		Employee employee2=(Employee) beanFactory.getBean("emp");//this is very much lossly coupled as compared to line 15(ignore property injection)
		System.out.println(employee2);//to string
	
	
		/*either of both dooes the work*/
		
		ApplicationContext applicationContext1=new ClassPathXmlApplicationContext("spring.xml");//applicationcontext is a interface(hence cannot create object of it, and has multiple implementing class) with has implementing class CPxmlAC which uses beanfactory,resource internally 
		Employee employee3=(Employee) applicationContext1.getBean("emp");
		System.out.println(employee3);//se even if u want to change values of like 'nameemp' : no need to change make changes in java program,only in xml file
		//Employee [empId=101, nameemp=sameer, city=Bawada, salary=25000]
		//returns the same bean,does not create new bean?
		
		
		Curosity curosity=(Curosity) beanFactory.getBean("curo");//this is very much lossly coupled as compared to line 15(ignore property injection)
		System.out.println(curosity);//with a blank bean and properties set directly in java classes
		//Curosity [name=curosity, id=69]//but if added setters and added another value to name ; that name gets printed
		
		
	
		
	}
	

}

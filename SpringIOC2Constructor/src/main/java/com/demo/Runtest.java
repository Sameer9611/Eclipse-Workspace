package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Runtest {
	
	public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("inputfilespring.xml");
	//>>this also works>>ClassPathXmlApplicationContext applicationContext1=new ClassPathXmlApplicationContext("inputfilespring.xml");

		Employee employee1=(Employee) applicationContext.getBean("emp");
		System.out.println(employee1);
		
		/*else using bean factory*/
		
		Resource resource=new ClassPathResource("inputfilespring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee employee2 =(Employee)beanFactory.getBean("emp");
		System.out.println(employee2);
		
	}

}

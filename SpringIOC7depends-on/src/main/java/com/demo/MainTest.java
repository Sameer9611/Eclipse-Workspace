package com.demo;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTest {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring.xml");//input file
		
		BeanFactory beanFactory= new XmlBeanFactory(resource);
	                
		
		Employee employee=(Employee) beanFactory.getBean("emp");
		System.out.println(employee);

	}
	

}

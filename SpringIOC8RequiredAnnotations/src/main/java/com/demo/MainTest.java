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
	                
		
		
		 //now user will depmand a bean of employee class by using getbean
		
		Employee employee=(Employee) beanFactory.getBean("emp");
		System.out.println(employee);
		//Employee [empId=101, nameemp=sameer, city=Bawada, salary=25000]
		//by tostring
	
		/*either of both dooes the work*/
//		
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
//		
//		
//	
//		Employee employee1=(Employee) applicationContext.getBean("emp");
//		System.out.println(employee1);
		//Employee [empId=101, nameemp=sameer, city=Bawada, salary=25000]
		//returns the same bean,does not create new bean?
	}
	

}

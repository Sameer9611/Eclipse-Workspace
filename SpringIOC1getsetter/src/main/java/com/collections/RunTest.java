package com.collections;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("spring.xml");//applicationcontext is a interface(hence cannot create object of it, and has multiple implementing class) with has implementing class CPxmlAC which uses beanfactory,resource internally 
		Collections collections =(Collections) applicationContext2.getBean("collect");
		System.out.println(collections);//Collections [ids=[101, 102, 103], names=[sameer, vaibz, draupati, vivek, null], versions={1.1=spring1.1, 1.2=spring1.2, 1.3=spring1.3}, properties={password=1234, username=sameer@9611}]
		
		//we no where have defined the type of set map etc to use, it decides on its own else u can use standalone collections
		
	}

}

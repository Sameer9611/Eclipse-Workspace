package com.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRun {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/standalonecollections/spring.xml");
		Collections collections=(Collections)applicationContext.getBean("collects");
		System.out.println(collections.getIds());
		System.out.println(collections.getIds().getClass());
		System.out.println("******************************************");
		System.out.println(collections.getNames());
		System.out.println(collections.getNames().getClass());
		System.out.println("******************************************");
		System.out.println(collections.getProperties());
		System.out.println(collections.getProperties().getClass());
		System.out.println("******************************************");
		System.out.println(collections.getVersions());
		System.out.println(collections.getVersions().getClass());
		System.out.println("******************************************");
		
		
		

	}

}

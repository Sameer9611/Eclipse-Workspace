package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		/*note:instead of creating hashsets of project each employee have and adding them to each employee(have to create 8 hashset of projects
		  we will have different apporach*/
		//adding employee
		Employees employees1 = new Employees();
		employees1.setFullname("Sameer Ghogare");
		employees1.setSkillSet("Java Bckend Dev");
		
		Employees employees2 = new Employees();
		employees2.setFullname("vaibhav deokar");
		employees2.setSkillSet("python Bckend Dev");	
		
		Employees employees3 = new Employees();
		employees3.setFullname("shalu patil");
		employees3.setSkillSet("dotnet devloper");	
		
		Employees employees4 = new Employees();
		employees4.setFullname("narayan swami");
		employees4.setSkillSet("DevOps");	
		
		Employees employees5 = new Employees();
		employees5.setFullname("vivek sonar");
		employees5.setSkillSet("Data Analyst");	
		
		Employees employees6 = new Employees();
		employees6.setFullname("alahudin khilji");
		employees6.setSkillSet("full stack");	
		
		Employees employees7 = new Employees();
		employees7.setFullname("bahudhur khan");
		employees7.setSkillSet("frontend Dev");	
		
		Employees employees8 = new Employees();
		employees8.setFullname("kushal patil");
		employees8.setSkillSet("Web3 Dev");
		
		//adding projects
		/*note:instead of creating hashsets of employees each project have and adding them to each project(have to create 5 hashset of projects
		  we will have different apporach*/
		Projects projects1 = new Projects();
		projects1.setProject_Name("forex trading app");
		projects1.setDuration(500);
		
		Projects projects2 = new Projects();
		projects2.setProject_Name("Instagram reel feature");
		projects2.setDuration(500);
		
		Projects projects3 = new Projects();
		projects3.setProject_Name("shooter game");
		projects3.setDuration(500);
		
		Projects projects4 = new Projects();
		projects4.setProject_Name("wechat app");
		projects4.setDuration(500);
		
		Projects projects5 = new Projects();
		projects5.setProject_Name("wecall app");
		projects5.setDuration(500);
		
		employees1.getProjecteset().add(projects2);//getProjecteset() returns: projectset >>+.add  
		
		employees2.getProjecteset().add(projects1);
		employees2.getProjecteset().add(projects2);
		
		employees3.getProjecteset().add(projects1);
		
		employees4.getProjecteset().add(projects1);
		
		employees5.getProjecteset().add(projects3);
		employees5.getProjecteset().add(projects5);
		
		employees6.getProjecteset().add(projects4);
		
		employees7.getProjecteset().add(projects5);

		employees8.getProjecteset().add(projects5);
		
		
		
		
		projects1.getEmployeeset().add(employees2);
		projects1.getEmployeeset().add(employees3);
		projects1.getEmployeeset().add(employees4);

		
		projects2.getEmployeeset().add(employees1);
		projects2.getEmployeeset().add(employees2);

		projects3.getEmployeeset().add(employees5);
		
		projects4.getEmployeeset().add(employees6);

		projects5.getEmployeeset().add(employees5);
		projects5.getEmployeeset().add(employees7);
		projects5.getEmployeeset().add(employees8);


		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();	
		Session session=sessionFactory.openSession(); 
		Transaction transaction=session.beginTransaction();
		
		session.save(employees1);
		session.save(employees2);
		session.save(employees3);
		session.save(employees4);//no need if cascading provideed in employee class to foreignkey >>
		session.save(employees5);
		session.save(employees6);
		session.save(employees7);
		session.save(employees8);
		
		session.save(projects1);
		session.save(projects2);
		session.save(projects3);
		session.save(projects4);//only employee is saved as casading is provided here in this class>>got a wrong result removed
		session.save(projects5);
		
		transaction.commit();
		
		Employees eml=session.get(Employees.class, 3);
		System.out.println(eml.getFullname());
		
		
		session.close();


	}

}

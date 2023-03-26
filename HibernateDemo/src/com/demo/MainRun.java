package com.demo;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.Session;

public class MainRun {
	/*this main method could also work in POJO class*/
	public static void main(String[] args) {
		/*to do any operation we need a session>session is in sessionfactory
		 * >sessionfactory is in configurationfile
		 * so need to call configuration */
		Configuration configuration =new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
	    Session session =sessionFactory.openSession();
	    Transaction transaction=session.beginTransaction();
	    
	    //creating a record
	    userdata ud1 = new userdata();
	    ud1.setFirstname("sameer");
	    ud1.setLastname("Ghogare");
	    ud1.setCity("Bawada");
	    ud1.setAmount(250000);
	    
	    userdata ud2 = new userdata();
	    ud2.setFirstname("Vrushab");
	    ud2.setLastname("Dalvi");
	    ud2.setCity("Akluj");
	    ud2.setAmount(193200);
	    
	    //insert a Record:
	    session.save(ud1);//save method works as insert method
	    session.save(ud2);
	    transaction.commit();
	    System.out.println("Records inserted Successfully");
	    
	    
	}
}

package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunAddToTable 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	SessionFactory factory=configuration.buildSessionFactory();
    	
    	Session session =factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	School school1 = new School();
    	school1.setName("sameer");
    	school1.setLastname("ghogare");
    	school1.setSalary(232344);
    	school1.setCity("Akluj");
    	
    	School school2 = new School();
    	school2.setName("Vrush");
    	school2.setLastname("adss");
    	school2.setSalary(32132);
    	school2.setCity("rautnagar");
    	
    	
    	
    	session.save(school1);//save method works as insert method
	    session.save(school2);
    	transaction.commit();
    	session.close();
    	
    }
}

package com.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Transaction_Table transaction_1 =new Transaction_Table();
		transaction_1.setDate(new Date());
		transaction_1.setTotal(2000);
		//transaction_1.setTransaction_id(1);
		
		Transaction_Table transaction_2 =new Transaction_Table();
		transaction_2.setDate(new Date() );
		transaction_2.setTotal(3435);
		//transaction_2.setTransaction_id(2);
		
		Transaction_Table transaction_3 =new Transaction_Table();
		transaction_3.setDate(new Date());
		transaction_3.setTotal(1235);
		//transaction_3.setTransaction_id(3);
		
		Customer customer1 = new Customer();
		customer1.setName("Sameer");
		customer1.setEmail("sameer@gmail.com");
		customer1.setAddress("Bawada");
		customer1.setTransaction_id(transaction_2);
		
		Customer customer2 = new Customer();
		customer2.setName("Vaibhav");
		customer2.setEmail("vb@gmail.com");
		customer2.setAddress("Indapur");
		customer2.setTransaction_id(transaction_1);
		
		Customer customer3 = new Customer();
		customer3.setName("abhi");
		customer3.setEmail("ab@gmail.com");
		customer3.setAddress("Umarga");
		customer3.setTransaction_id(transaction_2);
		
		Customer customer4 = new Customer();
		customer4.setName("jabba");
		customer4.setEmail("jb@gmail.com");
		customer4.setAddress("puna");
		customer4.setTransaction_id(transaction_3);
		
		session.save(customer1);
		session.save(customer2);//check we only saved customer objects:no need to save transaction table
		session.save(customer3);//as transaction object is present in customer object:due to cascade ALL
		session.save(customer4);//now if i delete customer4 transaction id 3 row will be deleted from that table also

		
		transaction.commit();
		session.close();
		sessionFactory.close();
	
	}
}

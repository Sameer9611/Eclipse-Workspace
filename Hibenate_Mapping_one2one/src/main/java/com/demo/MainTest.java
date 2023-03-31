package com.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {
		Transaction_Table transaction_1 =new Transaction_Table();
		transaction_1.setDate(new Date());
		transaction_1.setTotal(2000);

		
		
		Transaction_Table transaction_2 =new Transaction_Table();
		transaction_2.setDate(new Date() );
		transaction_2.setTotal(3435);
		
		
		Transaction_Table transaction_3 =new Transaction_Table();
		transaction_3.setDate(new Date());
		transaction_3.setTotal(1235);
		
		
		Customer customer1 = new Customer();
		customer1.setName("Sameer");
		customer1.setEmail("sameer@gmail.com");
		customer1.setAddress("Bawada");
		customer1.setTransaction_id(transaction_1);
		
		Customer customer2 = new Customer();
		customer2.setName("Vaibhav");
		customer2.setEmail("vb@gmail.com");
		customer2.setAddress("Indapur");
		customer2.setTransaction_id(transaction_2);
		
		Customer customer3 = new Customer();
		customer3.setName("abhi");
		customer3.setEmail("ab@gmail.com");
		customer3.setAddress("Umarga");
		customer3.setTransaction_id(transaction_3);
		
		transaction_1.setCustomer(customer1);
		transaction_2.setCustomer(customer2);
		transaction_3.setCustomer(customer3);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		

		session.save(customer1);//check we only saved customer objects:no need to save transaction table
		session.save(customer2);//as transaction object is present in customer object:due to cascade ALL
		session.save(customer3);
		transaction.commit();
		
		//fetching
		Customer customer=session.get(Customer.class, 2);
		System.out.println(customer.getName());//vaibhav
		System.out.println(customer.getTransaction_id().getTransaction_id());//2//table mdhe bhale direct 1 column ahe pn asach ascces honar id
		
		session.close();
		sessionFactory.close();
	
	}
}

package com.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestRun {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
	//create user
		
		User user1 = new User();
		user1.setFirstName("sam");
		user1.setLastName("Ghogare");
		user1.setAge(25);
		//setting bankaccnlist after creating them@line55
		
		//create bank acounts
		
		BankAccounts bankaccounts1 = new BankAccounts();
		bankaccounts1.setAccNumber(2389823);
		bankaccounts1.setBankBranch("Bawada");
		bankaccounts1.setBankName("BOM");
		bankaccounts1.setUser(user1);
		
		BankAccounts bankaccounts2 = new BankAccounts();
		bankaccounts2.setAccNumber(1215451);
		bankaccounts2.setBankBranch("Akluj");
		bankaccounts2.setBankName("ICIC");
		bankaccounts2.setUser(user1);

		
		BankAccounts bankaccounts3 = new BankAccounts();
		bankaccounts3.setAccNumber(5646);
		bankaccounts3.setBankBranch("Pune");
		bankaccounts3.setBankName("SBI");
		bankaccounts3.setUser(user1);
		
		Set<BankAccounts> bankaccounts = new HashSet<BankAccounts>();
		bankaccounts.add(bankaccounts1);
		bankaccounts.add(bankaccounts2);
		bankaccounts.add(bankaccounts3);
		
		//System.out.println(bankaccounts);>>[com.demo.BankAccounts@30814f43, com.demo.BankAccounts@289fdb08, com.demo.BankAccounts@7a231dfd]

		
		user1.setBankaccounts(bankaccounts);
		
		
		session.save(user1);
//		session.save(bankaccounts1);
//		session.save(bankaccounts2); NO need to save as we have used cascade in user1 bankaccounts field
//		session.save(bankaccounts3);
//		

		
		transaction.commit();//commit requires when altering not for fetching
		
		//fetching
		User ur = session.get(User.class,1);//(session.get>id is wrong:no error:null return>>use get >not sure>>no excception) (seesion.load>>null pointer exception>>use load if sure>fast)
		System.out.println(ur.getFirstName());//sam
		
		for (BankAccounts ba:ur.getBankaccounts()) {//getBankaccounts() returns a set of BankAccounts as generic//even if it is not in table of user but it is connected but not shown
			System.out.println(ba.getAccNumber());
			System.out.println(ba.getBankBranch());
			System.out.println(ba.getBankName());


		}
		 
		session.close();
		
		sessionFactory.close();

		
		
		
		
	
		
		
	}

}

package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunGetFromTable {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session1 =factory.openSession();
		Transaction transaction1=session1.beginTransaction();
		School sc1=session1.get(School.class, 2);
		System.out.println("1st>"+sc1);
		School sc2=session1.get(School.class, 2);
		System.out.println("2st>"+sc1);
		School sc3=session1.get(School.class, 3);
		System.out.println("3rd>"+sc3);
		
	    transaction1.commit();
	    System.out.println("Records fetched successfully");
	    
//	    Hibernate: select school0_.id as id1_0_0_, school0_.city as city2_0_0_, school0_.lastname as lastname3_0_0_, school0_.name as name4_0_0_, school0_.salary as salary5_0_0_ from School school0_ where school0_.id=?
//	    1st>School [id=2, name=Vrush, lastname=adss, city=rautnagar, salary=32132]>>>as this get stored in 1st level session cache 
//		2st>School [id=2, name=Vrush, lastname=adss, city=rautnagar, salary=32132]>>>does not fire a qwery but retrives from Session cache memory
//	   
//	    Hibernate: select school0_.id as id1_0_0_, school0_.city as city2_0_0_, school0_.lastname as lastname3_0_0_, school0_.name as name4_0_0_, school0_.salary as salary5_0_0_ from School school0_ where school0_.id=?
//	    3rd>School [id=3, name=dfsf, lastname=fdfvv, city=dffvv, salary=65212]>>>new Qwery first time will fire a qwery>>then after fetches id=3 from cache

//	    Records inserted Successfully
	   
	    
/* *-*-*-*-*-Before adding 2nd level or sessionfactory cache-*-*-*-*-*-*-*-*-
	    Session session2 =factory.openSession();
		Transaction transaction2=session1.beginTransaction();
		School sc4=session2.get(School.class, 2);
		System.out.println("1st>"+sc4);
		School sc5=session2.get(School.class, 2);
		System.out.println("2st>"+sc5);
		School sc6=session2.get(School.class, 3);
		System.out.println("3rd>"+sc6);
	    transaction2.commit();
	    System.out.println("Records fetched successfully"); 
	    
	    Hibernate: select school0_.id as id1_0_0_, school0_.city as city2_0_0_, school0_.lastname as lastname3_0_0_, school0_.name as name4_0_0_, school0_.salary as salary5_0_0_ from School school0_ where school0_.id=?
	    1st>School [id=2, name=Vrush, lastname=adss, city=rautnagar, salary=32132]>>>still fires qwery
	    2st>School [id=2, name=Vrush, lastname=adss, city=rautnagar, salary=32132]

	    Hibernate: select school0_.id as id1_0_0_, school0_.city as city2_0_0_, school0_.lastname as lastname3_0_0_, school0_.name as name4_0_0_, school0_.salary as salary5_0_0_ from School school0_ where school0_.id=?
	    3rd>School [id=3, name=dfsf, lastname=fdfvv, city=dffvv, salary=65212]

	    Records fetched successfully

>>hence when session is changed it does not get help from other session cache as 1st level cache is limited to that session only*/
	    
	   /* steps-
	    
	    1. add dependencies>>in pom.xml

	        <dependency>
	        	<groupId>org.hibernate</groupId>
	  			<artifactId>hibernate-ehcache</artifactId>
	  			<version>5.6.9.Final</version>
	  		</dependency>

	  		<dependency>
	  			<groupId>net.sf.ehcache</groupId>
	  			<artifactId>ehcache-core</artifactId>
	  			<version>2.6.11</version>
	  		</dependency> 
	  		
	    2. add annotations in pojo class
	    
	      @Cacheable
	      @Cache(usage =CacheConcurrencyStrategy.READ_ONLY, region = "EmployeesData")

	    3. add configuration in configuration file

	        <property name="cache.use_second_level_cache">true</property>
	  		<property name="hibernate.cache.provider_class">
	  		org.hibernate.cache.EhCacheProvider
	  		</property>
	  		<property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.internal.EhcacheRegionFactory
	  		</property> */
	    
	    Session session2 =factory.openSession();
		Transaction transaction2=session1.beginTransaction();
		School sc4=session2.get(School.class, 2);
		System.out.println("1st>"+sc4);
		School sc5=session2.get(School.class, 2);
		System.out.println("2st>"+sc5);
		School sc6=session2.get(School.class, 3);
		System.out.println("3rd>"+sc6);
	    transaction2.commit();
	    System.out.println("Records fetched successfully"); 
	    
	   // 1st>School [id=2, name=Vrush, lastname=adss, city=rautnagar, salary=32132]
	   // 2st>School [id=2, name=Vrush, lastname=adss, city=rautnagar, salary=32132]
	   // 3rd>School [id=3, name=dfsf, lastname=fdfvv, city=dffvv, salary=65212]
	   //Records fetched successfully
	   /*so now we can see no qwery fired as previous session cache got stored in 1st as well as 2nd level cache hence
	    no qwery fired*/
	    
	    
	    
	    
	}
	

}

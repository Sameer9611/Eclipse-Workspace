package com.demo;
/*steps to achieve hibernate:
 * 1)create java project
 * 2)Add External jar files required for hibernate to project(multiples,also contain a connector jar file)
 * 2)create POJO class/Persistant class
 * 3)Create mapping file&configuration file(xml File):create them directlty into src not in package
 * 	:Xml FIle search in others
 * 4)create a main class-->main method(-->
 * 	
*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class userdata /*keep name u want to give to table or similar to table name*/ {
	/*POJO class*/
	private long serialuid;
	private String firstname;
	private String lastname;   //Fields acting as column names
	private String city;
	private int amount;
	public long getserialuid() {
		return serialuid;
	}
	public void setserialuid(long serialuid) {
		this.serialuid = serialuid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}

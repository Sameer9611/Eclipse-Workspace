package com.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id ;
	private String firstName;
	private String lastName;
	private int age;
//	>>want to show one user has many accounts<<
//	@OneToMany
//	private BankAccounts bankaccounts;
//  >>cannot use this: as i can only have 1 setter<<
	
	@OneToMany
	private Set<BankAccounts> bankaccounts = new HashSet<BankAccounts>();

	

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<BankAccounts> getBankaccounts() {
		return bankaccounts;
	}

	public void setBankaccounts(Set<BankAccounts> bankaccounts) {
		this.bankaccounts = bankaccounts;
	}
	
	
	


}



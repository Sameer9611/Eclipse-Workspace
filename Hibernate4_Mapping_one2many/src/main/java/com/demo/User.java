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
	
	//jya class mdhe vaprtoi te one asnar ani many other table cha field asnr je ki collection asnr(for many)
	@OneToMany(mappedBy="user")//because this is a set>>cannot create a column in table User>>instead ut creates another table(user_bankaccounts-->1-1,1-2,1-3 id's)>>to avoid this can use mapped by
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



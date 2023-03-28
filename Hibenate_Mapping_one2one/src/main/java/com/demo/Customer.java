package com.demo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Customer_Table")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="FullName")
	private String Name;
	private String Email;
	private String address;
	
	@OneToOne(targetEntity=Transaction_Table.class,cascade=CascadeType.ALL)//dont know about cascade also a foreignkey annotation is present?
	private Transaction_Table transaction_Table;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Transaction_Table getTransaction_id() {
		return transaction_Table;
	}
	public void setTransaction_id(Transaction_Table transaction_Table) {
		this.transaction_Table = transaction_Table;
	}

}

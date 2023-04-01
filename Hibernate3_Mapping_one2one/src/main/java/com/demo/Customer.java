package com.demo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	//now we want to add a foreignkey(ie PK of other customertable).so field with that table pojo cass is created:it uderstands automatically we just want PK as FK not whole table
	@OneToOne(targetEntity=Transaction_Table.class,cascade=CascadeType.ALL)//>>onetoone means not multiple 1pk is linked to 1pk(not multiple) //dont know about cascade also a foreignkey annotation is present?
	@JoinColumn(name="trans_id")//before table generates with "transaction_Table_transaction_id">>this column is called join column
	private Transaction_Table transaction_Table;
	//automatically understands to user primary key from transaction table in join column
	//default column name=class_+primarykey(here it would have be Transaction_Table_transaction_id)
	
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

	public Transaction_Table getTransaction_Table() {
		return transaction_Table;
	}

	public void setTransaction_Table(Transaction_Table transaction_Table) {
		this.transaction_Table = transaction_Table;
	}
	

}

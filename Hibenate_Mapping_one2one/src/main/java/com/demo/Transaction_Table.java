package com.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Transaction_Table")
public class Transaction_Table {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="Transaction_Id")
	private int transaction_id;
	@Column(name="Date")
	private Date date;
	@Column(name="Total")
	private int total;
	
	
	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

}

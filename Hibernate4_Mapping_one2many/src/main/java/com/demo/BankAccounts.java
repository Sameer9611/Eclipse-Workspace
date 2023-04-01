package com.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BankAccounts {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int acc_id;
	private int accNumber;
	private String bankName;
	private String bankBranch;
	
	//jo class(table) mdhe lehitoi tyt many rows asnr jy table mdhe add krychai to one asnr(so no need of collection) 
	@ManyToOne//>>have to give user here also oneway relationship not allowed
	@JoinColumn(name="user_id")
	private User user;

	
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}

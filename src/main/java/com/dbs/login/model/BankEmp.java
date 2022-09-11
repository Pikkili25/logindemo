package com.dbs.login.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankEmp {

	@Id
	int id;
	String userName;
	String password;
	public BankEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankEmp(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}

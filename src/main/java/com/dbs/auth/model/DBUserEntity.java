package com.dbs.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DBUserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String userName;
	String password;
	String roles;
	public DBUserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DBUserEntity(int id, String userName, String password, String roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
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
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "DBUserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", roles=" + roles
				+ "]";
	}
	
	
	
	

}

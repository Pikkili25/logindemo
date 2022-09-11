package com.dbs.login.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReceiverEntity {

	@Id
	String name;

	public ReceiverEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiverEntity(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

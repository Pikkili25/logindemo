package com.dbs.login.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransHistoryEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	
	int sender;
	String receiver;
	Date transActionDate;
	String status;
	String  remarks;
	public TransHistoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransHistoryEntity(int id, int sender, String receiver, Date transActionDate, String status,
			String remarks) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.transActionDate = transActionDate;
		this.status = status;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSender() {
		return sender;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getTransActionDate() {
		return transActionDate;
	}
	public void setTransActionDate(Date transActionDate) {
		this.transActionDate = transActionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
	
	
	
}

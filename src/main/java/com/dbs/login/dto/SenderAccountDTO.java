package com.dbs.login.dto;

public class SenderAccountDTO {
	
	int accountno;
	String name;
	double balance;
	boolean od;
	public SenderAccountDTO(int accountno, String name, double balance, boolean od) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
		this.od = od;
	}
	public SenderAccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isOd() {
		return od;
	}
	public void setOd(boolean od) {
		this.od = od;
	}
	
	
	

}

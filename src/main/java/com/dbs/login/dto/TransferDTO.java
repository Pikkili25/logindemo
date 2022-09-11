package com.dbs.login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class TransferDTO {
	
	
	
	String sAccNo;
	String sName;
	String balance;
	String od;
	String receiverAccNo;
	String amount;
	public TransferDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferDTO(String sAccNo, String sName, String balance, String od, String receiverAccNo, String amount) {
		super();
		this.sAccNo = sAccNo;
		this.sName = sName;
		this.balance = balance;
		this.od = od;
		this.receiverAccNo = receiverAccNo;
		this.amount = amount;
	}
	public String getsAccNo() {
		return sAccNo;
	}
	public void setsAccNo(String sAccNo) {
		this.sAccNo = sAccNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getOd() {
		return od;
	}
	public void setOd(String od) {
		this.od = od;
	}
	public String getReceiverAccNo() {
		return receiverAccNo;
	}
	public void setReceiverAccNo(String receiverAccNo) {
		this.receiverAccNo = receiverAccNo;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransferDTO [sAccNo=" + sAccNo + ", sName=" + sName + ", balance=" + balance + ", od=" + od
				+ ", receiverAccNo=" + receiverAccNo + ", amount=" + amount + "]";
	}
	
	
		

}

package com.mouritech.springframework.firstapp;

import org.springframework.stereotype.Service;

@Service("cusService")
public class Customer {
	
	private int cusId;
	private String cusName;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cusId, String cusName) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;


}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + "]";
	}

	
}
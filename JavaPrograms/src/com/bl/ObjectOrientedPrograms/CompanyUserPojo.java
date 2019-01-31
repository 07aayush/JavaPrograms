package com.bl.ObjectOrientedPrograms;

public class CompanyUserPojo {

	private String userName;
	private String noOfShares;
	private String price;
	
	public CompanyUserPojo() {
		// TODO Auto-generated constructor stub
	}

	public CompanyUserPojo(String userName, String noOfShares, String price) {
		super();
		this.userName = userName;
		this.noOfShares = noOfShares;
		this.price = price;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(String noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}

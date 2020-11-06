package com.learning.mvc;

public class DataModel {

	private String name;
	private String addr;
	private String mail;
	
	public DataModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataModel(String name, String addr, String mail) {
		super();
		this.name = name;
		this.addr = addr;
		this.mail = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "DataModel [name=" + name + ", addr=" + addr + ", mail=" + mail + "]";
	}
	
	
	
}

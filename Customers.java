package com.demo;

import java.util.List;

public class Customers {
	private String name;
	private String email;
	private List<String> mobno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getMobno() {
		return mobno;
	}
	public void setMobno(List<String> mobno) {
		this.mobno = mobno;
	}
	public Customers(String name, String email, List<String> mobno) {
		super();
		this.name = name;
		this.email = email;
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "Customers [name=" + name + ", email=" + email + ", mobno=" + mobno + "]";
	}
	
	
	
}

package com.core.exception;


public class Employee {
	
	private String name;
	private String address1;
	private String address2;
	
	
	
	public Employee(String name, String address1, String address2) {
		super();
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", address1=");
		builder.append(address1);
		builder.append(", address2=");
		builder.append(address2);
		builder.append("]");
		return builder.toString();
	}
	

	
	
	

}

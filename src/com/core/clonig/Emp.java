package com.core.clonig;

public class Emp implements Cloneable {

	String name;
	Dept d;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dept getD() {
		return d;
	}

	public void setD(Dept d) {
		this.d = d;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		return super.clone();
	}

	public Emp(String name, Dept d) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.d = d;
	}

}

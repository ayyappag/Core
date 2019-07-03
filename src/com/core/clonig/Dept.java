package com.core.clonig;

public class Dept {

	String name;
	String deptId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	public Dept(String name,String deptId) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.deptId=deptId;
	}
	

}

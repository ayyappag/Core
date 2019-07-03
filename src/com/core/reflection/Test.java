package com.core.reflection;

public class Test {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int add(int  i,  int j) {
		System.out.println("add method with 2 args");
		return (i + j);
	}

	public int mul(int i, int j) {
		System.out.println("mul method with 2 args");
		return (i * j);
	}

	public int add(int i, int j, int k) {
		System.out.println("add method with 2 args");
		return (i + j + k);
	}

	public int mul(int i, int j, int k) {
		System.out.println("mul method with 2 args");
		return (i * j * k);
	}

}

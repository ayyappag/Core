package com.core.doublelinkedlist;


public class TestMain {

	public static void main(String[] args) {
		DoubleLinkedListImpl<Object> doubleList = new DoubleLinkedListImpl<Object>();
		doubleList.addFirst(12);
		doubleList.addFirst(32);
	
		
		doubleList.display();
	
	}

}

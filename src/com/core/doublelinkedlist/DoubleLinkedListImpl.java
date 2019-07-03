package com.core.doublelinkedlist;

public class DoubleLinkedListImpl<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;

	public DoubleLinkedListImpl() {
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void addFirst(T obj) {
		Node<T> nd = new Node<T>();
		nd.setValue(obj);
		System.out.println("Adding: " + obj);
		/*
		 * if (head == null) { head = nd; tail = nd; } else {
		 * head.setNextRef(nd.getPreviousRef());
		 * tail.setPreviousRef(head.getNextRef()); // tail.setValue(nd); tail =
		 * nd; }
		 */

		if (head == null)
			head = nd;
		else
			head.setNextRef(nd);
		if (tail == null)
			tail = nd;

		size++;
	}

	public void display() {
		System.out.print("DOUBLE Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (head.getNextRef() == null) {
			System.out.println(head.getValue());
			return;
		}
		Node nd = head;
		System.out.print(head.getValue() + "->");
		nd = head.getNextRef();
		while (nd.getNextRef() != null) {
			System.out.print(nd.getValue() + "->");
			nd = nd.getNextRef();
			Node previous = nd.getPreviousRef();
			System.out.println("previous ref value :: " + previous.getValue());
		}
		System.out.print(nd.getValue() + "\n");
	}
}

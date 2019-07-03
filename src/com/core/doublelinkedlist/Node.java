package com.core.doublelinkedlist;

/*
 * http://java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
 */
public class Node<T> implements Comparable<T> {

	private Node<T> nextRef;
	private Node<T> previousRef;
	private T value;

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}

	public Node<T> getPreviousRef() {
		return previousRef;
	}

	public void setPreviousRef(Node<T> previousRef) {
		this.previousRef = previousRef;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	/*
	 * public Node(Node<T> previousRef, T value, Node<T> nextRef) { super();
	 * this.previousRef = previousRef; this.value = value; this.nextRef =
	 * nextRef; }
	 */
	@Override
	public int compareTo(T arg) {
		// TODO Auto-generated method stub

		if (this.value == arg)
			return 0;
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nextRef == null) ? 0 : nextRef.hashCode());
		result = prime * result
				+ ((previousRef == null) ? 0 : previousRef.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (nextRef == null) {
			if (other.nextRef != null)
				return false;
		} else if (!nextRef.equals(other.nextRef))
			return false;
		if (previousRef == null) {
			if (other.previousRef != null)
				return false;
		} else if (!previousRef.equals(other.previousRef))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}

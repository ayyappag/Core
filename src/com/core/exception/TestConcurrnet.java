package com.core.exception;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestConcurrnet {

	public static void main(String[] args) {

		Employee e1 = new Employee("a", "a1", "a2");
		Employee e2 = new Employee("b", "b1", "b2");
		Employee e3 = new Employee("c", "c1", "c2");
		

		List<Employee> list = new CopyOnWriteArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.remove(e1);

		List<Employee> list2 = Collections.unmodifiableList(list);
		System.out.println("List:" + list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getName().equals("b")) {
				employee.setAddress1("bangalore");
			}

		}

		for (Employee employee : list2) {
			if (employee.getName() == "b") {
				employee.setAddress1("bangalore");
			}

		}
		System.out.println("List:" + list);
		list2.add(e3); // java.lang.UnsupportedOperationException
		// System.out.println("List 2 :" + list2);

		// Collections.nCopies(5, e1);
	}

}

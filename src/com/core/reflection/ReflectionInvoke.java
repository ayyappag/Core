package com.core.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionInvoke {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class c = Test.class;
		System.out.println("Class Loader :" + c.getClassLoader());
		String methodName = "add";
		Method m = null;
		Method[] methodArray = c.getMethods();
		int count = 2;
		System.out.println("Method Count:" + methodArray.length);
		for (Method method : methodArray) {
			System.out.println("Method Name:>" + method.getName());
			if (methodName.equals(method.getName())) {
				System.out.println("same:" + method.getName() + ">length : "
						+ method.getParameterTypes().length);
				System.out.println("Parameter types>>"
						+ method.getParameterTypes().getClass().getFields());
				m = method;
				int i = m.getParameterTypes().length;
				if (i == count) {
					Object obj = c.newInstance();
					m = c.getMethod("add", Integer.TYPE, Integer.TYPE); // c.getMethod("add",
																		// int.class,
																		// int.class);
				/*	int returnVal = (int) m.invoke(obj, 1, 2);
					System.out.println("Return value : " + returnVal);
				*/	break;
				}
			}
		}
	}
}

package com.core.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reflection.getName();
		Reflection.getNewInstance();
		Reflection.getCanonicalName();
		 Reflection.getMethodArray(); // get Declaring Classes along with
		// Method's
		Reflection.declarationInfoDemo();

	}

	public static void getName() {
		System.out.println(Reflection.class.getName());
		System.out.println(int[].class.getName());
		System.out.println(Reflection[].class.getName());
		System.out.println(Reflection.class.getPackage());
		System.out.println(Reflection.class.getCanonicalName());
		System.out.println("getSuperclass"+Integer.class.getSuperclass());
	}

	public static void getNewInstance() {
		try {
			String test = String.class.newInstance();
			System.out.println("getNewInstance:" + test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getCanonicalName() {
		System.out
				.println("getCanonicalName:>" + Test.class.getCanonicalName());
	}

	public static void getMethodArray() {
		Method[] methods = String.class.getMethods();
		for (int idx = 0; idx < methods.length; idx++) {
			System.out.println(methods[idx] + " declared by "
					+ methods[idx].getDeclaringClass());
		}
	}

	public static void declarationInfoDemo() {
		printModifiers( Object.class);
		printModifiers(String.class);
		printModifiers(Integer.class);
	}

	public static void printModifiers(final Class dataType) {
		final int modifiers = dataType.getModifiers();
		if (Modifier.isPrivate(modifiers)) {
			System.out.print("private ");
		}
		if (Modifier.isPrivate(modifiers)) {
			System.out.print("private ");
		}
		if (Modifier.isPublic(modifiers)) {
			System.out.print("private ");
		}
		if (Modifier.isAbstract(modifiers)) {
			System.out.print("abstract ");
		}
		if (Modifier.isFinal(modifiers)) {
			System.out.print("final ");
		}
		if (Modifier.isNative(modifiers)) {
			System.out.print("native ");
		}
		if (Modifier.isInterface(modifiers)) {
			System.out.print("interface ");
		}
		if (Modifier.isStatic(modifiers)) {
			System.out.print("static ");
		}
		if (Modifier.isStrict(modifiers)) {
			System.out.print("strict ");
		}
		if (Modifier.isSynchronized(modifiers)) {
			System.out.print("synchronized ");
		}
		if (Modifier.isTransient(modifiers)) {
			System.out.print("transient ");
		}
		if (Modifier.isVolatile(modifiers)) {
			System.out.print("volatile ");
		}
		System.out.println(dataType.getName());
	}

	
	
}

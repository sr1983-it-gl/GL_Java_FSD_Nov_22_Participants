package com.gl.javafsd.leapyear;

public class MyClass {

	static MyClass2 class2 = new MyClass2();
	
	static float salary = 100;

	static void myStaticMethod() {
		
		float f = MyClass.salary;
		
		MyClass.myStaticMethod();
		
		MyClass.class2.println();
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		MyClass.myStaticMethod();
	}
}

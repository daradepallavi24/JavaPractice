package com.demo;
	class A {
	    int nonStaticVariable;
	    static int staticVariable;

	    static void staticMethod() {
	        System.out.println(staticVariable);
	    }

	    void nonStaticMethod() {
	        System.out.println(staticVariable);
	        System.out.println(nonStaticVariable);
	    }
	}

	public class Mainclass {
	    public static void main(String[] args) {
	        A.staticVariable = 10;

	        A.staticMethod();
	        A a1 = new A();
	        A a2 = new A();

	        System.out.println(a1.staticVariable);
	        System.out.println(a1.nonStaticVariable);

	        a1.nonStaticVariable = 5;
	        System.out.println(a1.nonStaticVariable);

	        a1.staticMethod();
	        a1.nonStaticMethod();

	        System.out.println(a2.staticVariable);
	        a2.staticVariable = 20;
	        System.out.println(a2.staticVariable);
	    }
	}

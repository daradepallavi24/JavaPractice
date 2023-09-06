package com.java.demo.intro;

public class Thistest {
	    int a;
	    int b;

	    Thistest() {
	        this(10, 20);
	        System.out.println("Inside the default constructor");
	    }

	    Thistest(int a, int b) {
	        this.a = a;
	        this.b = b;
	        System.out.println("Inside the Parameterized constructor");
	    }

	    public static void main(String[] args) {
	        Thistest t = new Thistest();
	    }
	}


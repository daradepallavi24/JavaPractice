package com.java.demo.intro;

public class ThisDemo2 {
	    int a;
	    int b;

	    ThisDemo2() {
	        a = 10;
	        b = 20;
	    }

	    ThisDemo2 get() {
	        return this; // return current class instance
	    }

	    void display() {
	        System.out.println("a = " + a + ", b = " + b);
	    }

	    public static void main(String[] args) {
	        ThisDemo2 object = new ThisDemo2();
	        object.get().display();
	    }
	}

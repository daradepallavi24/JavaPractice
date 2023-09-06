package com.java.demo.intro;

public class ThisTest3 {
	    int a;
	    int b;

	    ThisTest3() {
	        a = 10;
	        b = 20;
	    }

	    void display(ThisTest3 obj) {
	        System.out.println("a = " + obj.a + ", b = " + obj.b);
	    }

	    void get() {
	        display(this);
	    }

	    public static void main(String[] args) {
	        ThisTest3 object = new ThisTest3();
	        object.get();
	    }
	}


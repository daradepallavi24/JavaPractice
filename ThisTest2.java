package com.java.demo.intro;

public class ThisTest2{
    int a;
    int b;

    ThisTest2() {
        a = 10;
        b = 20;
    }

    ThisTest2 get() {
        return this; //return current class instance
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        ThisTest2 object = new ThisTest2();
        object.get().display();
    }

}

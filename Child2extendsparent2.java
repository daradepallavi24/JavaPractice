package com.java.demo.intro;

public class Child2extendsparent2 {
    class Parent2 {
        String name;

        public Parent2(String n) {
            name = n;
        }
    }

    String name;

    public Child2extendsparent2(String n1, String n2) {
        super();
        name = n2;
    }

    public void display() {
        System.out.println("name: " + name);
    }

    public static void main(String[] args) {
        Child2extendsparent2 child = new Child2extendsparent2("Parent", "Child");
        child.display();
    }
}

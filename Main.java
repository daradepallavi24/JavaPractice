package com.java.demo.intro;
class Vehicle {
    void Child() {
        System.out.println("Child");
    }

    void Parent() {
        System.out.println("Parent");
    }
}

class Family extends Vehicle {
    void Grandparent() {
        System.out.println("Grandparent");
    }
}

public class Main {
    public static void main(String[] args) {
        Family myFam = new Family();
        myFam.Child(); 
        myFam.Grandparent();  
        myFam.Parent();  
    }
}
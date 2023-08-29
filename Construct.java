package com.java.demo.intro;

public class Construct {
    
    public Construct() {
        System.out.println("default");
    }
    
    public Construct(int a, int b) {
        System.out.println(a + b);
    }
    
    public Construct(int m, int z, int k) {
        System.out.println(m + z + k);
    }
    
    public Construct(int m) {
        System.out.println(m * m);
    }
    
    public Construct(int m, float z, int k) {
        System.out.println(m * z * k);
    }

    public static void main(String[] args) {
        ConstructDemo cd = new Construct(5, 8, 10); // Using the three-argument constructor
    }
}

package com.java.demo.intro;

public class ConstructDemo {
    
    public ConstructDemo() {
        System.out.println("default");
    }
    
    public ConstructDemo(int a, int b) {
        System.out.println(a + b);
    }
    
    public ConstructDemo(int m, int z, int k) {
        System.out.println(m + z + k);
    }
    
    public ConstructDemo(int m) {
        System.out.println(m * m);
    }
    
    public ConstructDemo(int m, float z, int k) {
        System.out.println(m * z * k);
    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        ConstructDemo ef = new ConstructDemo(5, 8, 10); // Using the three-argument constructor
    }
}

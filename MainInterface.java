package com.java.demo.intro;


public class MainInterface {

	public static void main(String[] args) {
		
		Rectangle rect=new Rectangle(10,12);
		Circle cir=new Circle(4);
		Triangle tri=new Triangle(4, 3);
		
		System.out.println("Area of Rectangle " + rect.getArea());
		System.out.println("Area of Circle " + cir.getArea());
		System.out.println("Area of Triangle " + tri.getArea());
		
	}

}

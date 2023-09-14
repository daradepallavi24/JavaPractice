package com.java.demo.intro;
public class CircleimplementsShape1 {

	private double radius;
	
	public void Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		
		return Math.PI * radius * radius;
	}

}
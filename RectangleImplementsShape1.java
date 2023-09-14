package com.java.demo.intro;


public class RectangleImplementsShape1 {

	private double length;
	private double width;
	
	public void Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		
		return length * width;
	}

}
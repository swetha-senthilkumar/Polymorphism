package com.capgemini.overloading;

public class Shape {
	private static final double PI = 3.14; //declaring constant
	                                 //local variable cannot be declare iy as private
	public double area(int radius) {
		return PI * radius *radius;
	}
	
	public long area (int l, int b) {
		return l*b;
	}
	
	void area(int x, double v) {
		
	}
	
	void area(double x, int v) {
		
	}
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		
		double areaCircle = shape.area(5);
		long areaRect = shape.area(10, 5);
		
		System.out.println("Area of circle: "+areaCircle);
		System.out.println("Area of a rectangle: "+areaRect);
	}
}

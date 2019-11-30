package chapter6;

public class Circle {
	private double radius;
	final private double PI = 3.14159;
	
	public Circle() {
		radius = 0.0;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
}

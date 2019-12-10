package chapter8;

public class Geometry {
	
	public static double getAreaCircle(double radius) {
		return Math.PI * radius * radius;
	}
	
	public static double getAreaRectangle(double length, double width) {
		return length * width;
	}
	
	public static double getAreaTriangle(double base, double height) {
		return base * height * 0.5;
	}
}

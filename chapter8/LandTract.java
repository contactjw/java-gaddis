package chapter8;

public class LandTract {
	private double length;
	private double width;
	
	public LandTract() {
		length = 0;
		width = 0;
	}
	
	public LandTract(double l, double w) {
		length = l;
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public boolean equals(LandTract tract) {
		boolean isEqual;
		if (this.length == tract.length && this.width == tract.width)
			isEqual = true;
		else
			isEqual = false;
		
		return isEqual;
	}
	
	public String toString() {
		String str;
		str = "Length: " + length + "\nWidth: " + width;
		return str;
	}
}

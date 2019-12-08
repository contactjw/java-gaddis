package chapter8;

public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension() {
		length = 0;
		width = 0;
	}
	
	public RoomDimension(RoomDimension r) {
		this.length = r.length;
		this.width = r.width;
	}
	
	public RoomDimension(double l, double w) {
		length = l;
		width = w;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public String toString() {
		String str;
		str = "Length: " + this.length + "\nWidth: " + this.width;
		return str;
	}
}

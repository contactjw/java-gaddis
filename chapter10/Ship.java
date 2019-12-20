package chapter10;

public class Ship {
	private String name;
	private String yearBuilt;
	
	public Ship() {
		name = "";
		yearBuilt = "";
	}
	
	public Ship(String n, String b) {
		name = n;
		yearBuilt = b;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setYearBuilt(String b) {
		yearBuilt = b;
	}
	
	public String getName() {
		return name;
	}
	
	public String getYearBuilt() {
		return yearBuilt;
	}
	
	public String toString() {
		String info = "Ship Name: " + name + "\nYear Built: " + yearBuilt;
		
		return info;
	}
}

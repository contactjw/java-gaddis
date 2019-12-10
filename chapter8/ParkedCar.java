package chapter8;

public class ParkedCar {
	private String make;
	private String model;
	private String color;
	private String license;
	private int minutesParked;
	
	public ParkedCar() {
		make = "";
		model = "";
		color = "";
		license = "";
		minutesParked = 0;
	}
	
	public ParkedCar(String mk, String mdl, String col, String lic, int min) {
		make = mk;
		model = mdl;
		color = col;
		license = lic;
		minutesParked = min;
	}
	
	public ParkedCar(ParkedCar c) {
		this.make = c.make;
		this.model = c.model;
		this.color = c.color;
		this.license = c.license;
		this.minutesParked = c.minutesParked;
	}
	
	public void setMake(String mk) {
		make = mk;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setModel(String mod) {
		model = mod;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setLicense(String lic) {
		license = lic;
	}
	
	public String getLicense() {
		return license;
	}
	
	public void setMinutesParked(int min) {
		minutesParked = min;
	}
	
	public int getMinutesParked() {
		return minutesParked;
	}
	
	public String toString() {
		String str;
		str = "Vehicle Make: " + make + "\nVehicle Model: " + model + "\nVehicle Color: " + color +
			  "\nVehicle License: " + license;
		return str;
	}
}

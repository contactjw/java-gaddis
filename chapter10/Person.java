package chapter10;

public class Person {
	private String name;
	private String address;
	private String phone;
	
	public Person() {
		name = "";
		address = "";
		phone = "";
	}
	
	public Person(String n, String a, String p) {
		name = n;
		address = a;
		phone = p;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setPhone(String p) {
		phone = p;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		String info = ("Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phone);
		
		return info;
	}
	
}
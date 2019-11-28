package chapter6;

public class PersonalInformation {
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public PersonalInformation() {
		name = "";
		address = "";
		age = 0;
		phoneNumber = "";
	}
	
	public PersonalInformation(String n, String ad) {
		name = n;
		address = ad;
	}
	
	public PersonalInformation(String n, String ad, int ag, String p) {
		name = n;
		address = ad;
		age = ag;
		phoneNumber = p;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String ad) {
		address = ad;
	}
	
	public void setAge(int ag) {
		age = ag;
	}
	
	public void setPhoneNumber(String p) {
		phoneNumber = p;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}

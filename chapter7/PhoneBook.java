package chapter7;

public class PhoneBook {
	private String name;
	private String phoneNumber;
	
	
	public PhoneBook() {
		name = "";
		phoneNumber = "";
	}
	
	public PhoneBook(String n, String p) {
		name = n;
		phoneNumber = p;
	}
	
	public void setName(String n ) {
		name = n;
	}
	
	public void setPhoneNumber(String p) {
		phoneNumber = p;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
}

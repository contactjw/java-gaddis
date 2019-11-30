package chapter6;

public class PatientCharges {
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyPhone;
	
	public PatientCharges() {
		firstName = "";
		middleName = "";
		lastName = "";
		address = "";
		city = "";
		state = "";
		zip = 0;
		phoneNumber = "";
		emergencyName = "";
		emergencyPhone = "";
	}
	
	public PatientCharges(String fn, String mn, String ln, String a, String c, String s, int z,
						  String pn, String en, String ep) {
		firstName = fn;
		middleName = mn;
		lastName = ln;
		address = a;
		city = c;
		state = s;
		zip = z;
		phoneNumber = pn;
		emergencyName = en;
		emergencyPhone = ep;
	}
	
	public void setName(String fn, String mn, String ln) {
		firstName = fn;
		middleName = mn;
		lastName = ln;
	}
	
	public void setAddress(String a, String c, String s, int z) {
		address = a;
		city = c;
		state = s;
		zip = z;
	}
	
	public void setEmergencyInfo(String en, String ep) {
		emergencyName = en;
		emergencyPhone = ep;
	}
	
	public String getName() {
		String fullName = firstName + " " + middleName + " " + lastName;
		return fullName;
	}
	
	public String getAddress() {
		String add = address + " " + city + ", " + state +  " " + zip;
		return add;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmergencyContact() {
		String emergency = emergencyName + " " + emergencyPhone;
		return emergency;
	}
}

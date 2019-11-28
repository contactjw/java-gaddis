package chapter6;

public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	public Employee(String n, int i, String d, String p) {
		name = n;
		idNumber = i;
		department = d;
		position = p;
	}
	
	public Employee(String n, int i) {
		name = n;
		idNumber = i;
		department = "";
		position = "";
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setIdNumber(int i) {
		idNumber = i;
	}
	
	public void setDepartment(String d) {
		department = d;
	}
	
	public void setPosition(String p) {
		position = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIdNumber() {
		return idNumber;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getPosition() {
		return position;
	}
	
}

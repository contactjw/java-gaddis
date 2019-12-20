package chapter10;

public class Customer extends Person{ 
	private String customerNumber;
	private boolean onMailingList;
	
	public Customer() {
		customerNumber = "";
		onMailingList = false;
	}
	
	public Customer(String num, boolean list) {
		customerNumber = num;
		onMailingList = list;
	}
	
	public Customer(String n, String a, String p, String num, boolean list) {
		super(n, a, p);
		customerNumber = num;
		onMailingList = list;
	}
	
	public void setCustomerNumber(String num) {
		customerNumber = num;
	}
	
	public void setMialingList(boolean list) {
		onMailingList = list;
	}
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	public boolean getMailingList() {
		return onMailingList;
	}
	
	public String toString() {
		String info = super.toString() + "\nCustomer Number: " + customerNumber + "\nOn Mailing List: " + onMailingList;
		
		return info;
	}
	
	
}

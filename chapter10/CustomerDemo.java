package chapter10;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer customer1 = new Customer("John White", "3556 Image Ct.", "815-943-4234", "ABG-32", true);
		
		System.out.println(customer1);
		
		Customer customer2 = new Customer();
		customer2.setName("Brian Orr");
		customer2.setAddress("3424 Neverland Rd.");
		customer2.setPhone("423-656-2534");
		customer2.setCustomerNumber("BZC-83");
		customer2.setMialingList(false);
		
		System.out.println();
		System.out.println(customer2);
		
	}
}

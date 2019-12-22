package chapter11;

public class RetailItemDemo {

	public static void main(String[] args) {
		
		try {
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();

		item2.setDescription("Designer Jeans");
		item2.setUnits(40);
		item2.setPrice(34.95);

		item3.setDescription("Shirt");
		item3.setUnits(20);
		item3.setPrice(24.95);
		
		System.out.println("\t\tDescription\tUnits on Hand\tPrice");
		System.out.println("-------------------------------------------------------");
		System.out.println(
				"Item #1\t\t" + item1.getDescription() + "\t\t" + item1.getUnits() + "\t\t" + item1.getPrice());
		System.out
				.println("Item #2\t\t" + item2.getDescription() + "\t" + item2.getUnits() + "\t\t" + item2.getPrice());
		System.out.println(
				"Item #3\t\t" + item3.getDescription() + "\t\t" + item3.getUnits() + "\t\t" + item3.getPrice());
		
		} 
		catch(NegativePrice | NegativeUnits u) {
			System.out.println(u.getMessage());
		}



	}

}

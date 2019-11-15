package chapter2;

public class SalesPrediction {
	public static void main(String[] args) {
		final double SALES_PERC = 0.62;
		final double YEARLY_SALES = 4600000.00;
		
		double generatedSales = SALES_PERC * YEARLY_SALES;
		
		System.out.println("TOTAL SALES GENERATED: " + generatedSales);
	}
}

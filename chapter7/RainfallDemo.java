package chapter7;

public class RainfallDemo {
	public static void main(String[] args) {
		double[] rainChart = {11.2, 13.3, 15.4, 17.2, 3.6, 9.4,
							  5.0, 9.4, 1.3, 6.5, 4.3, 7.3};
		
		
		Rainfall year = new Rainfall(rainChart);
		
		System.out.printf("Total Rain This Year: %.2f\n", year.yearlyRainfall());
		System.out.printf("Average Monthly Rainfall: %.2f\n", year.averageMonthlyRain());
		System.out.println("Month With Most Rain: " + year.mostRain());
		System.out.println("Month with Least Rain: " + year.leastRain());
	}
}

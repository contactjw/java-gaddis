package chapter7;

public class Rainfall {
	private double[] rainfall;
	
	public Rainfall(double[] r) {
		rainfall = r;
	}
	
	public double yearlyRainfall() {
		double total = 0.0;
		for (int i = 0; i < rainfall.length; i++)
			total += rainfall[i];
		
		return total;
	}
	
	public double averageMonthlyRain() {
		double total = 0.0;
		
		for (int i = 0; i < rainfall.length; i++)
			total += rainfall[i];
		
		return total / rainfall.length;
	}
	
	public int mostRain() {
		int highestIndex = 0;
		
		for (int i = 0; i < rainfall.length; i++) {
			if (rainfall[i] > rainfall[highestIndex])
				highestIndex = i;
		}
		
		return highestIndex;
	}
	
	public int leastRain() {
		int lowestIndex = 0;
		
		for (int i = 0; i < rainfall.length; i++) {
			if (rainfall[i] < rainfall[lowestIndex])
				lowestIndex = i;
		}
		
		return lowestIndex;
	}
 }

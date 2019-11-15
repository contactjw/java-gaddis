package chapter2;

public class LandCalc {
	public static void main(String[] args) {
		final int ACRE = 43560;
		double tractOfLand = 389767.0;
		double totalAcres;
		
		totalAcres = tractOfLand / ACRE;
		
		System.out.println("The total number of acres on " + tractOfLand +
						   "\nfeet of land is " + totalAcres + " acres.");
	}
}

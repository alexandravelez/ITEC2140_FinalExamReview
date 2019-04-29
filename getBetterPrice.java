import java.util.Scanner;
public class getBetterPrice {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		//Package 1: enter weight & price
		System.out.println("Enter weight and price for package 1: ");
		double weightPackage1 = input.nextDouble();
		double pricePackage1 = input.nextDouble();
		
		//Package 2: enter weight & price
		System.out.println("Enter weight and price for package 2: ");
		double weightPackage2 = input.nextDouble();
		double pricePackage2 = input.nextDouble();
		
		String result = getBetterPrice(weightPackage1, pricePackage1, weightPackage2, pricePackage2);
		
		System.out.println(result);
	}
	
	public static String getBetterPrice (double weightPackage1, double pricePackage1, double weightPackage2, double pricePackage2) {
		if (weightPackage1 < weightPackage2 && pricePackage1 < pricePackage2) {
			System.out.println("Package 1 has a better price.");
		} 
		else if (weightPackage2 < weightPackage1 && pricePackage2 < pricePackage1) {
			System.out.println("Package 2 has a better price.");
		}
		return "";
	}

}

import java.util.Scanner;
public class PoundToKilogram {
	public static void main (String [] args) {
		//call method & run program
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter pounds to convert into Kilogram: ");
		
		double pound = sc.nextDouble();
		double kg = poundToKilogram(pound);
		
		System.out.printf("%8.2f pounds are %8.2f kg", pound, kg);
	}
	
	public static double poundToKilogram (double pound) {
		//1 pounds  = 0.454 kilograms
		
		double kilograms = pound * 0.454;
		return kilograms;
	}
	
}

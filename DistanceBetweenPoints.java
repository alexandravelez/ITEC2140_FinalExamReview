import java.util.Scanner;
public class DistanceBetweenPoints {
	public static void main (String [] args) {
		//prompt user to enter coordinates: x1, y1, x2, y2
		//calc min. distance & display results
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter points (x1, y1, x2, y2): ");
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double d = getDistance(x1, y1, x2, y2);
		
		System.out.printf("The minimum distance is: %4.2f", d);
	}
	
	public static double getDistance (double x1, double y1, double x2, double y2) {
		double p1 = Math.pow((x2 - x1), 2);
		double p2 = Math.pow((y2 - y1), 2);
		double distance = Math.sqrt(p1 + p2);
		return distance;
	}

}

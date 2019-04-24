
public class FindingMinimumValue {
	public static void main (String [] args) {
		double[] list = new double[10];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter 10 double numbers: ");
		for(int i = 0; i < list.length; i++) {
			list [i] = sc.nextDouble();			
		}
		System.out.println("The minimum value is " + min(list));
	}
	
	public static double min(double[] list) {
		double min = list[0];
		for(int i = 0; i < list.length; i++) {
			if(min > list[i])
				min = list[i];
		}
		return min;
	}
}

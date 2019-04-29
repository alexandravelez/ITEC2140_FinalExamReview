
public class Donuts {
	public static void main (String [] args) {
		//displays
		donuts(100, 60);
	}
	
	public static void donuts (int totalMinutes, int hourlyRate) {
		//calculate the # of donuts given the hourly rate & total minutes
		double donuts = totalMinutes * hourlyRate / 60.0;
		System.out.println(donuts);
		
	}
}

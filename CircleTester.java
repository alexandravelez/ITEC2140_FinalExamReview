
public class CircleTester {
	public static void main (String [] args) {
		//create an object - instantiation
		Circle c1 = new Circle();
		System.out.printf("%4.2f\n", c1.getArea());
		
		Circle c2 = new Circle(5.4);
		System.out.printf("%4.2f\n", c2.getArea());
		
		c1.setRadius(6.7);
		System.out.printf("%4.3f\n", c1.getRadius());
		
	}
}

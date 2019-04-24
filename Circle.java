
public class Circle {
	//data type - data field with data variable name
	private double radius;
	
	//constructors
	
	//no-arugement constructor
	public Circle() {
		radius = 1.0;
	}
	
	public Circle(double radius) {
		//this. something is to identify 
		this.radius = radius;
	}
	
	//getters and setters - to be able to access outside of classes
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		//both radius' are the same
		return this.radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

}

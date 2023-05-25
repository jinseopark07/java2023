package j0525;

public class Circle {
	private double radius;
	private final static double PI=3.14;

	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double computerArea() {
		return radius*radius*PI;
	}
	public double compurterPerimeter() {
		return 2*PI*radius;
	}
	
	public void print() {
		System.out.println("반지름 "+getRadius()+" 면적: "+computerArea()+" 원의 둘레: "+
				compurterPerimeter());
	}
	
	
}



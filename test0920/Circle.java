package test0920;

public class Circle {
	
	static final double PI = 3.14;
	double r;
	
	public Circle(Double r) {
		this.r = r;
	}
	
	protected double getArea() {
		
		return r*r*PI;
		
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
}

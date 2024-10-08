package test0920;

public class Cylinder extends Circle{
	
	double h;
	
	Cylinder(double r, double h) {
		super(r);
		this.r = r;
		this.h = h;
	}
	
	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	protected double getArea() {
		return 2*PI*r+r + 2*PI*r*h;
	}
}

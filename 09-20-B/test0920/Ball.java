package test0920;

public class Ball extends Circle {

	public Ball(Double r) {
		super(r);
		this.r = r;
		setR(this.r);
	}
	
	protected double getArea() {
		
		return 4*PI*getR()*getR();
	}
}

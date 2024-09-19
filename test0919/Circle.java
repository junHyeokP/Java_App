package test0919;

import java.util.Scanner;

public class Circle {
	
	static final double PI = 3.14;
	double r;
	
	public Circle(Double r) {
		this.r = r;
	}
	
	static void calculate_Extent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		Circle c = new Circle(sc.nextDouble());
		
	
		System.out.printf("반지름이 %.1f인 원의 넓이는 %.2f입니다.", c.r, (c.r*c.r*PI));
		
	}
	
}

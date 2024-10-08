package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		while(circle());

	}
	
	static boolean circle() {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14; 
		
		try {
		
		System.out.print("원의 반지름을 입력하세요(cm) : ");
		double r = sc.nextDouble();
		System.out.printf("원의 넓이는 %.2f%s\n", PI * r * r , "cm입니다.");
		return false;
		
		} catch (InputMismatchException e) {
			System.out.println("올바른 입력이 아닙니다, 다시 입력하세요.");
			return true;
		}
		
		
	}

}

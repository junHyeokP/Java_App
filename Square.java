package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		while(square());
	}
	
	static boolean square() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("직사각형의 가로 길이 : ");
			double width = sc.nextDouble();
			System.out.print("직사각형의 세로 길이 : ");
			double height = sc.nextDouble();
			
			System.out.printf("직사각형의 넓이는 %.1f%s\n", width * height , "cm 입니다.");
			return false;
		} catch (InputMismatchException e) {
			System.out.println("올바른 입력이 아닙니다, 다시 입력하세요.");
			return true;
		}
	
	}

}

package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		while(swapping());

	}
	
	static boolean swapping() {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("1번 숫자 입력 : ");	
		int a = sc.nextInt();
		System.out.print("2번 숫자 입력 : ");
		int b = sc.nextInt();
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		StringBuilder sb = new StringBuilder();
		sb.append("Swapping 결과 >>\n")
		  .append("변수 a의 값 = " + a + "\n")
		  .append("변수 b의 값 = " + b);
		System.out.println(sb);
		
		return false;
		
		} catch (InputMismatchException e) {
			System.out.println("올바른 입력이 아닙니다, 다시 입력하세요.");
			return true;
		}
		
		
	}
}

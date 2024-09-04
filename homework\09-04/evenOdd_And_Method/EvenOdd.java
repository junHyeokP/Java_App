package evenOdd_And_Method;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.print("숫자를 입력하세요 : ");
			
		int a = sc.nextInt();
			
		if (a % 2 == 2) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
		} while (sc.nextInt() != 0);

	}

}

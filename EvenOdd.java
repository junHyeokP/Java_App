package test;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		while(evenOdd());

	}
	
	static boolean evenOdd() {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수를 입력하세요 : ");
			
			String tmp = sc.nextLine();
			int num = 0;
			String[] strArr = new String[2];
			String str = null;
			
			if (tmp.length() != 1 && tmp.charAt(1) == ('.')) {	
			
	// split 함수 사용시 몇몇 특수 문자들은 매개변수 칸 안에 백슬래시 두번을 넣어줘야 작동한다,
	//.의 경우 메서드나 클래스를 연결할때 쓰이는 부호라서 특수한 잠금설정 같은게 걸려있는 것 같다.
				
			strArr = tmp.split("\\.");
			
			str = strArr[0] + strArr[1];
			
			
			} else {
			
				strArr[0] = tmp;
				str = strArr[0];	
			
			}
			
			num = Integer.parseInt(str); 
			
			System.out.println(num % 2 == 0 ? "짝수" : "홀수");
			
			return false;
			
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("올바른 입력이 아닙니다, 다시 입력하세요.");
		}
			return true;
	}
}

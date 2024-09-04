package stars;

import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int j = a;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < a; i++) {
			for(;j > i; j--) {
				sb.append("*");
			}
			sb.append("\n");
			j = a;
		}
		System.out.println(sb);
	}
}

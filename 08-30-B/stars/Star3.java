package stars;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int j = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < num; i++) {
			for (; j < num - i; j++) {
				sb.append(" ");
			}
			for (int o = 0; o < i+1; o++) {
			sb.append("*");
			}
			j = 0;
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

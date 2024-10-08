package stars;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j = 0;
		int t = n * 2 - 1;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++, t -= 2) {
			for (; j < i+1; j++) {
				sb.append(" ");
			}
			for (int o = 0; o < t; o++) {
				sb.append("*");
			}
			j = 0;
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

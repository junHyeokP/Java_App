package stars;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int j = 0;
		int t = 0;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++, t += 2) {
			for (; j < n - i; j++) {
				sb.append(" ");
			}
			for (int o = 0; o < t + 1; o++) {
				sb.append("*");
			}
			j = 0;
			sb.append("\n");
		}
		System.out.println(sb);
	}

}

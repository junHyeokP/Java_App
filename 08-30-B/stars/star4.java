package stars;

import java.util.Scanner;

public class star4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int o = 0;
		int j = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < num; i++) {
			
			for(; j < i; j++) {
				sb.append(" ");
			}
			
			for(; o < num - i; o++) {
				sb.append("*");
			}
			o = 0;
			j = 0;
			sb.append("\n");
		}
	System.out.println(sb);
	}

}

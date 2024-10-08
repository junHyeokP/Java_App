package stars;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	
	int a = sc.nextInt();
	int j = 0;
	
	for(int i = 0; i < a; i++) {
		for(j = 0; j < i+1; j++) {
		sb.append("*");
		}
		sb.append("\n");
		j = 0;
	}
	System.out.println(sb);
	
	}
}
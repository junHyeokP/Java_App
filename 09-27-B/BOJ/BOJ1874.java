package BOJ;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {

	public static void main(String[] args) { 
		
		// BufferedWriter로 제출 했더니 출력 초과라고 나왔다
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int c = 0;
		boolean impossible = false;
		
		for (int i = 0; i < n; i++) {
			
			int num = sc.nextInt();
			
			if (num > c) {
			
				for (int j = c + 1; j <= num; j++) {
					stack.push(j);
					sb.append("+").append("\n");
				}
				c = num;
			}
			
			else if (stack.peek() != num) {
				impossible = true;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		if (impossible) {
			System.out.println("NO");
		} else {
			System.out.println(sb);
		}
	}
}

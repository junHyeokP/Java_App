package BOJ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {

	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = sc.nextInt();
		int[] num = new int[n];
		int[] resultArr = new int[n];
		int c = 1;
		boolean wrong = false;
		
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			
			while(true) {
				
				if (stack.isEmpty()) {
					stack.push(c);
					bw.write("+\n");
					c++;
				}
				else if (num[i] > stack.peek()){
					stack.push(c);
					bw.write("+\n");
					c++;
				}
				else if (num[i] == stack.peek()) {
					resultArr[i] = stack.pop();
					bw.write("-\n");
					break;
				}
				
				else if (num[i] != stack.peek()) {
					wrong = true;
					break;
				}
				
			}
		}
		if (wrong) {
			System.out.println("NO");
		} else {
		bw.flush();
		}
	}

}

package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {

	public static void main(String[] args)throws IOException {
		
		// 전에는 이걸 for-each문으로 해결했었다, for-each문의 존재를 까먹었어서 여기선 안썼다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<>();
		
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < num; i++) {
			
			String[] ps = br.readLine().split("");
			for (int j = 0; j < ps.length; j++) {
				
				if (ps[0].equals(")") || ps[ps.length - 1].equals("(")) {
					stack.push(null);
					break;
				}
				
				stack.push(ps[j]);
				
				if (stack.size() >= 2 && ps[j].equals(")")) {
					stack.pop();
					if (stack.peek().equals("(")) {
					stack.pop();
					}
				} 
				
			}
			
			sb.append(stack.isEmpty() ? "YES" + "\n" : "NO" + "\n");
			stack.clear();
		}
		
		System.out.println(sb);
	}

}

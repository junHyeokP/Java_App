package BOJ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1158 {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			queue.add(i);
			
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(!queue.isEmpty()) {
			
			for (int i = 1; i < k ; i++) {
				queue.offer(queue.poll());
			}
			
			if (queue.size() == 1) {
				sb.append(queue.poll() + ">");	
			} else {
				sb.append(queue.poll() + ", ");
			}
		}
		
		System.out.println(sb);
	}

}

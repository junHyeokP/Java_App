package method2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Method_Practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[] arr = {1, 2, 3, 4, 5}; // Primitive Type : int / Wrapper Class : Integer
		
		getSum(arr, sc.nextInt());
	}
	static void getSum(Integer[] arr, int num) {
		
		int tmp = 0;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("배열 원본 : ");
		
		for (int i = 0; i <arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		
		sb.append("\n");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		sb.append("배열 역순 저장 결과 : ");
		
		for (int i = 0; i <arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		
		System.out.println(sb);
	}
}

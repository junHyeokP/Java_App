package method2;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = getSum(arr);
		System.out.printf("배열에 저장된 모든 숫자의 합 : %d\n", sum);
		System.out.print("숫자 입력 : ");
		getSum(arr, sc.nextInt());
		
		getMax(arr);
		
	}

	static int getSum(int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	static void getSum(int[] arr, int num) {
		
		int c = 0;
	
		for (int i = 0; i < arr.length; i++) {
			if (num < arr[i]) {
				c++;
			}
		}
		
		System.out.printf("입력된 숫자 : %d\n배열에 저장된 숫자보다 큰수의 갯수 : %d\n", num, c);
	}

	static void getMax(int[] arr) {
		
		Arrays.sort(arr);
		
		System.out.println("배열에 저장된 가장 큰 수 : " + arr[arr.length-1]);
		
	}
	
}
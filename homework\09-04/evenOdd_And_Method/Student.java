package evenOdd_And_Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {

	public static void main(String[] args) {
		
		int numStudents = getNumberKeyboard("학생 수 :");
		int scores[] = getScoresLine(numStudents);
		printSumAverage(scores);

	}

	static int getNumberKeyboard(String str) {
		
		System.out.print(str);
		
		Scanner sc = new Scanner(System.in);
		
		return sc.nextInt();
		
	}
	
	static int[] getScoresLine(int numS) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok;
		System.out.print("5명의 성적 : ");
		
		int[] arr = new int[numS]; 
		try {
		tok = new StringTokenizer(bf.readLine(), " ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tok.nextToken());
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return arr;
	}
	
	static void printSumAverage(int[] scores) {
		
		int sumScore = 0;
	
		for (int i = 0; i < scores.length; i++) {
			sumScore += scores[i];
		}
		
		System.out.printf(">> 합계 : %d\n", sumScore);
		
		System.out.printf(">> 평균 : %d\n", sumScore / scores.length);
		
	}

}

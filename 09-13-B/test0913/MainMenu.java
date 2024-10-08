package test0919;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Cicle | 2.Cat");
		
		switch(sc.nextInt()) {
			case 1 -> Circle.calculate_Extent();
			case 2 -> catObject();
		}
	}
	
	static void catObject() {
		
		Cat cat = new Cat("코숏", "노랑");
		
		System.out.println("나의 고양이는" + cat.getColor() + " " + cat.getBreed()+ "입니다.");
		cat.eat("아침");
		cat.meow();
		
		cat.eat("점심");
		cat.scratch();
		cat.meow();
	}
}

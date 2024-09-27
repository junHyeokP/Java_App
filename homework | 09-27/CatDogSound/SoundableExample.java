package kr.ac.kopo.interfaces;

public class SoundableExample  {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound()); // Cat 객체가 연결되어 있으면 "야옹", Dog 객체라면 "멍멍"을 출력한다
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}

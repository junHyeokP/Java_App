package test0919;

public class Cat {
	String breed;
	String color;
	int age;
	
	Cat(String breed, String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	Cat(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}
	
	Cat(String breed) {
		this.breed = breed;
	}
	
	public void eat(String time) {
		System.out.printf("%s에 사료를 먹습니다.\n", time);
	}
	
	public void meow() {
		System.out.println("야옹~~~~");
	}
	
	public void scratch() {
		System.out.println("스크래치를 긁습니다.");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

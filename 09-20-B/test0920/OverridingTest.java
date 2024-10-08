package test0920;

public class OverridingTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println("원 : ");
		System.out.println("반지름 : " + circle.getR());
		System.out.println("면적 : " + circle.getArea());
		
		Ball ball = new Ball(5.0);
		System.out.println("구 : ");
		System.out.println("반지름 : " + ball.getR());
		System.out.println("면적 : " + ball.getArea());
		
		Cylinder cyl = new Cylinder(5.0, 7.0);
		System.out.println("원기둥 : ");
		System.out.println("반지름 : " + cyl.getH());
		System.out.printf("면적 : %.2f", cyl.getArea());
		

	}

}

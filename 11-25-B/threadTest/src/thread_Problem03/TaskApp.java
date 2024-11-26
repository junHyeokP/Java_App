package thread_Problem03;

public class TaskApp {

	public static void main(String[] args) {
		
		Task01 t1 = new Task01(5);
		Task02 t2 = new Task02(4);
		
		t1.start();
		t2.start();
	
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("누적 값 : " + (t1.sum + t2.sum));
		
	}

}

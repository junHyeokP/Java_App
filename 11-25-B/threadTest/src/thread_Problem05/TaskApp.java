package thread_Problem05;

public class TaskApp {
	
	// 모든 스레드가 공유하는 메서드 코드 블럭을 동기화
	public synchronized void sharedThread(String t, String msg) {
		
		String[] splitMsg = msg.split(" ");
		
		for (String s : splitMsg) {
			System.out.println(t + s);
		}
		
	}
	
	public static void main(String[] args) {
		
		TaskApp ta = new TaskApp();
		
		Task01 t1 = new Task01("Time is money", ta);
		Task02 t2 = new Task02("Time is money", ta);
		
		t1.start();
		t2.start();
	}

}

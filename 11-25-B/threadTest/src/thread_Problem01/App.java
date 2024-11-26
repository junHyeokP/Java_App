package thread_Problem01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		
		Timer t = new Timer();
				
		t.run();
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnable task = () -> {
			for (int i = 1; i <= 100; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		exec.execute(task);
		
	}

}

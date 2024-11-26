package thread_도전과제;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadMain extends Thread {

	
	
	//static Thread w = new Worker();
	
	public static void main(String[] args) {
		
		String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
		
		// Runnable의 메서드가 run 하나 밖에 없어서 가능한 람다식
//		 new Thread(() -> {
//			for (int i = 0; i < 5; i++) {
//				System.out.println(i);
//			}
//		});
		
		ExecutorService exec = Executors.newCachedThreadPool();
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			exec.shutdown();
		};
		//task.run();
		exec.execute(task);
		//w.start();
		for(int i = 0; i < abc.length; i++) {
			try {
				Thread.sleep(500);
				System.out.println(abc[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

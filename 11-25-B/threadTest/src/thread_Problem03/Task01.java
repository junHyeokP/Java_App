package thread_Problem03;

import java.util.Random;

public class Task01 extends Thread{
	
	int c;
	int sum;

	public Task01(int c) {
		this.c = c;
	}



	@Override
	public void run() {
		Random r = new Random();
		 sum = 0;
		
		
		for(int i = 0; i < c ; i++) {
		
		sum += r.nextInt(10);
		
		System.out.println("Thread-1 : " + sum);
		}
	}
	
}

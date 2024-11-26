package thread_Problem03;

import java.util.Random;

public class Task02 extends Thread{
	
	int c;
	int sum;
	
	
	public Task02(int c) {
		this.c = c;
	}



	@Override
	public void run() {
		Random r = new Random();
		sum = 0;
		
		for(int i = 0; i < c ; i++) {
			sum += r.nextInt(10);
			System.out.println("Thread-2 : " + sum);
		}
	}
	
}

package thread_Problem04;

import java.util.Scanner;

public class Echo {

	public synchronized void echo(String msg) {

		try {
			for(int i = 0; i < 3; i++) {
			Thread.sleep(100);
			System.out.println(msg);
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		Echo e = new Echo();
		
		Echoer p1 = new Echoer("환영", e);
		Echoer p2 = new Echoer("자바", e);
		Echoer p3 = new Echoer("야호", e);
		
		p1.start();
		p2.start();
		p3.start();	
		
	}
	
}

package thread_Problem02;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		Thread t = new Task01();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		
	int i = sc.nextInt();
		
		if ( i == 1 ) {
// .interrupted() 메서드는 스레드가 실행대기 또는 실행상태에 있을 때 사용하면 나중에 일어날 일시정지에 반응한다
// .interrupted() 메서드는 sleep()같이 일시정지를 해야 작동한다 		
			t.interrupt();
			
		}	

	}
}

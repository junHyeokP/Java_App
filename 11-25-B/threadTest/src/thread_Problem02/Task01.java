package thread_Problem02;

public class Task01 extends Thread{
	
	int i;
	
	@Override
	public void run() {
	
		try {
		while(true) {
			
			System.out.println("작업 실행 중");
			Thread.sleep(1500);
		
		}
		} catch (InterruptedException e) {
			
		}
		System.out.println("작업 완료");
	}
	
}

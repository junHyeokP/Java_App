package thread_Problem01;

public class Timer implements Runnable {

	@Override
	public void run() {
		
		for(int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}

	

}

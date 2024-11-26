package thread_Problem05;

public class Task02 extends Thread {
	
	String msg;
	TaskApp ta;
	
	@Override
	public void run() {
		ta.sharedThread("속담 2 : ", msg);
	}

	public Task02(String msg, TaskApp ta) {
		this.msg = msg;
		this.ta = ta;
	}	
	
}

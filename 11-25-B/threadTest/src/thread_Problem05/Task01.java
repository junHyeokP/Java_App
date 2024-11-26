package thread_Problem05;

public class Task01 extends Thread{
	
	String msg;
	TaskApp ta;
	
	@Override
	public void run() {
		ta.sharedThread("속담 1 : ", msg);
	}

	public Task01(String msg, TaskApp ta) {
		super();
		this.msg = msg;
		this.ta = ta;
	}

	
	
	
}

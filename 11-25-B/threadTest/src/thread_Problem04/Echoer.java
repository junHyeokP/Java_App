package thread_Problem04;

public class Echoer extends Thread {

	String msg;
	Echo echo;
	
	@Override
	public void run() { 
		echo.echo(msg);
	}

	public Echoer(String msg, Echo echo) {	
		this.msg = msg;
		this.echo = echo;
	}
	
}
